package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CardPaymentPopup {
    private WebDriver driver;
    private WebDriverWait wait;

    private By iframe = By.className("bepaid-iframe");
    private By sumText = By.xpath("//*[contains(@class, \"pay-description__cost\")]/span");
    private By payButton = By.className("colored");
    private By phoneText = By.xpath("//*[contains(@class, \"pay-description__text\")]/span");
    private By cardNumberText = By.xpath("//*[@id=\"cc-number\"]/following-sibling::*");
    private By expiryDatePlaceholder = By.xpath("//input[@placeholder='MM / YY']");
    private By cvcText = By.xpath("//*[contains(@class, \"cvc-input\")]//input/following-sibling::*");
    private By paymentSystemIcons = By.xpath("//*[contains(@class, \"icons-container\")]//img");

    public CardPaymentPopup(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        wait.until(ExpectedConditions.visibilityOfElementLocated(iframe));
        driver.switchTo().frame(driver.findElement(iframe));
    }

    public String getSum() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(sumText)).getText();
    }

    public String getPhone() {
        return driver.findElement(phoneText).getText();
    }

    public String getPayButtonText() {
        return driver.findElement(payButton).getText();
    }

    public String getCardNumberText() {
        return driver.findElement(cardNumberText).getText();
    }

    public String getExpiryDatePlaceholder() {
        return driver.findElement(expiryDatePlaceholder).getAttribute("placeholder");
    }

    public String getCvcText() {
        return driver.findElement(cvcText).getText();
    }

    public List<WebElement> getPaymentSystemIcons() {
        return driver.findElements(paymentSystemIcons);
    }
}
