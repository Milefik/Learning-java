package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentForm {
    private WebDriver driver;
    private WebDriverWait wait;

    private By phoneField = By.id("connection-phone");
    private By sumField = By.id("connection-sum");
    private By continueBtn = By.xpath("//*[@id='pay-connection']/button");

    public PaymentForm(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public String getPhonePlaceholder() {
        return driver.findElement(phoneField).getAttribute("placeholder");
    }

    public String getInternetPlaceholder() {
        return driver.findElement(By.id("internet-phone")).getAttribute("placeholder");
    }

    public String getScoreInstalmentPlaceholder() {
        return driver.findElement(By.id("score-instalment")).getAttribute("placeholder");
    }

    public String getScoreArrearsPlaceholder() {
        return driver.findElement(By.id("score-arrears")).getAttribute("placeholder");
    }

    public String getSumPlaceholder() {
        return driver.findElement(sumField).getAttribute("placeholder");
    }

    public String getSumInternetPlaceholder() {
        return driver.findElement(By.id("internet-sum")).getAttribute("placeholder");
    }

    public String getSumInstalmentPlaceholder() {
        return driver.findElement(By.id("instalment-sum")).getAttribute("placeholder");
    }

    public String getSumArrearsPlaceholder() {
        return driver.findElement(By.id("arrears-sum")).getAttribute("placeholder");
    }


    public PaymentForm enterPhone(String phone) {
        driver.findElement(phoneField).clear();
        driver.findElement(phoneField).sendKeys(phone);
        return this;
    }

    public PaymentForm enterSum(String sum) {
        driver.findElement(sumField).clear();
        driver.findElement(sumField).sendKeys(sum);
        return this;
    }

    public CardPaymentPopup clickContinue() {
        driver.findElement(continueBtn).click();
        return new CardPaymentPopup(driver, wait);
    }
}
