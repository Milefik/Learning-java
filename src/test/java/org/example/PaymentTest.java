package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@Epic("Платежи")
@Feature("MTS Оплата")
public class PaymentTest {
    static WebDriver driver;
    static WebDriverWait wait;

    @BeforeEach
    @Step("Открываем браузер и переходим на mts.by")
    void setup() {
        driver = WebDriverManager.chromedriver().create();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.mts.by/");
        closeCookieBannerIfPresent();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    @Story("Проверка плейсхолдеров")
    @Description("Проверка корректности отображения плейсхолдеров во всех вкладках оплаты")
    void testPlaceholdersForAllTabs() {
        PaymentPage page = new PaymentPage(driver, wait);

        assertEquals("Номер телефона", page.openServicesTab().getPhonePlaceholder());
        assertEquals("Сумма", page.openServicesTab().getSumPlaceholder());

        assertEquals("Номер абонента", page.openInternetTab().getInternetPlaceholder());
        assertEquals("Сумма", page.openInternetTab().getSumInternetPlaceholder());

        assertEquals("Номер счета на 44", page.openInstallmentTab().getScoreInstalmentPlaceholder());
        assertEquals("Сумма", page.openInstallmentTab().getSumInstalmentPlaceholder());

        assertEquals("Номер счета на 2073", page.openDebtTab().getScoreArrearsPlaceholder());
        assertEquals("Сумма", page.openDebtTab().getSumArrearsPlaceholder());
    }

    @Test
    @Story("Оплата услуг")
    @Description("Проверка корректности данных в окне оплаты")
    void testServicesPaymentFlow() {
        PaymentPage page = new PaymentPage(driver, wait);

        CardPaymentPopup popup = page.openServicesTab()
                .enterPhone("297777777")
                .enterSum("1")
                .clickContinue();

        assertTrue(popup.getSum().contains("1"), "Сумма в окне не соответствует введённой");
        assertTrue(popup.getPayButtonText().contains("1"), "Сумма на кнопке некорректна");
        assertTrue(popup.getPhone().contains("297777777"), "Номер телефона отображается неверно");

        assertEquals("Номер карты", popup.getCardNumberText());
        assertEquals("MM / YY", popup.getExpiryDatePlaceholder());
        assertEquals("CVC", popup.getCvcText());

        assertFalse(popup.getPaymentSystemIcons().isEmpty(), "Иконки платёжных систем отсутствуют");
    }

    private void closeCookieBannerIfPresent() {
        try {
            WebElement cookieBannerCloseBtn = driver.findElement(By.className("cookie__cancel"));
            if (cookieBannerCloseBtn.isDisplayed()) {
                cookieBannerCloseBtn.click();
            }
        } catch (NoSuchElementException ignored) {}
    }
}
