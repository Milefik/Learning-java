package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {
    static WebDriver driver;
    static WebDriverWait wait;

    @BeforeEach
    void setup(){
        driver = WebDriverManager.chromedriver().create();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.mts.by/");
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    void testTitleBlock(){
        WebElement titleBlock = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id=\"pay-section\"]//h2")));
        assertEquals("Онлайн пополнение\nбез комиссии", titleBlock.getText());
    }

    @Test
    public void testPaymentSystemLogos() {
        List<WebElement> logos = driver.findElements(By.xpath("//*[@id=\"pay-section\"]//ul/li/img"));
        assertFalse(logos.isEmpty(), "Логотипы платежных систем не найдены");
        for (WebElement logo : logos) {
            String src = logo.getAttribute("src");
            assertFalse(src == null || src.isEmpty(), "Пустой src у логотипа");
        };
    }

    @Test
    public void testMoreDetailsLink() {
        WebElement cookieBannerCloseBtn = driver.findElement(By.className("cookie__cancel"));
        if (cookieBannerCloseBtn.isDisplayed()) {
            cookieBannerCloseBtn.click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("cookie")));
        }
        driver.findElement(By.linkText("Подробнее о сервисе")).click();
        assertTrue(driver.getCurrentUrl().contains("help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"), "Ссылка ведет на неверный URL");
    }

    @Test
    public void testFillFormAndContinue() {
        WebElement cookieBannerCloseBtn = driver.findElement(By.className("cookie__cancel"));
        if (cookieBannerCloseBtn.isDisplayed()) {
            cookieBannerCloseBtn.click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("cookie")));
        }
        driver.findElement(By.id("connection-phone")).sendKeys("297777777");
        driver.findElement(By.id("connection-sum")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button")).click();

        WebElement cardField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bepaid-iframe")));
        assertTrue(cardField.isDisplayed(), "Форма ввода карты не отображается");
    }
}
