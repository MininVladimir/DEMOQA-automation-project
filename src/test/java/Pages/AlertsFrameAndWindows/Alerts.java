package Pages.AlertsFrameAndWindows;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alerts extends Methods {

    public Alerts(WebDriver driver) {
        super(driver);
    }

//    AlertsLocators
    public static final By Alert = By.xpath("(//button[@class='btn btn-primary'])[1]");
    public static final By Alert5sec = By.xpath("(//button[@class='btn btn-primary'])[2]");
    public static final By Dismiss = By.xpath("(//button[@class='btn btn-primary'])[3]");
    public static final By Prompt = By.xpath("(//button[@class='btn btn-primary'])[4]");

//    AssertsLocators
    public static final By Cancel = By.xpath("(//span[@class='text-success'])[1]");
    public static final By Oleg = By.xpath("(//div[@class='col-md-6']//span)[5]");


    public void alert(By locator) {
        visibleElementClick(locator);
    }

    public void assertAlert(String value) {
        assertTrueAlertGetTextContains(value);
        alertAccept();
    }

    public void alert5sec(By locator) {
        visibleElementClick(locator);
        waitAlertIsPresent();
    }

    public void assertAlert5sec(String value) {
        assertTrueAlertGetTextContains(value);
        alertAccept();
    }

    public void dismiss(By locator) {
        visibleElementClick(locator);
        alertDismiss();
    }

    public void assertDismiss(String value, By locator) {
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void prompt(String value, By locator){
        visibleElementClick(locator);
        alertSendKeys(value);
        alertAccept();
    }

    public void assertPrompt(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
    }
}
