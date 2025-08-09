package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By servicesTab = By.xpath("//*[contains(@class, \"select__list\")]/li[1]");
    private By internetTab = By.xpath("//*[contains(@class, \"select__list\")]/li[2]");
    private By installmentTab = By.xpath("//*[contains(@class, \"select__list\")]/li[3]");
    private By debtTab = By.xpath("//*[contains(@class, \"select__list\")]/li[4]");

    public PaymentPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public PaymentForm openServicesTab() {
        driver.findElement(By.xpath("//*[contains(@class, \"select__header\")]")).click();
        driver.findElement(servicesTab).click();
        return new PaymentForm(driver, wait);
    }

    public PaymentForm openInternetTab() {
        driver.findElement(By.xpath("//*[contains(@class, \"select__header\")]")).click();
        driver.findElement(internetTab).click();
        return new PaymentForm(driver, wait);
    }

    public PaymentForm openInstallmentTab() {
        driver.findElement(By.xpath("//*[contains(@class, \"select__header\")]")).click();
        driver.findElement(installmentTab).click();
        return new PaymentForm(driver, wait);
    }

    public PaymentForm openDebtTab() {
        driver.findElement(By.xpath("//*[contains(@class, \"select__header\")]")).click();
        driver.findElement(debtTab).click();
        return new PaymentForm(driver, wait);
    }
}
