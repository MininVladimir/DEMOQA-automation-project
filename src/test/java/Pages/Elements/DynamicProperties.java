package Pages.Elements;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicProperties extends Methods {

    public DynamicProperties(WebDriver driver) {
        super(driver);
    }

//    LinksLocators
    public static final By RandomTextField = By.xpath("//p[1]");
    public static final By ButtonEnableAfter = By.xpath("//button[@id = 'enableAfter']");
    public static final By ButtonColorChange = By.xpath("//button[@id = 'colorChange']");
    public static final By ButtonColorChangeResult = By.xpath("//button[contains(@class,'mt-4 text-danger')]");
    public static final By ButtonVisibleAfter = By.xpath("//button[@id = 'visibleAfter']");

    public void randomTextField(By locator) {
        scrollToElement(locator);
        waitElementIsVisible(locator);
    }

    public void buttonEnableAfter(By locator) {
        scrollToElement(locator);
        waitElementToBeClickable(locator);
    }

    public void buttonColorChange(By locator) {
        scrollToElement(locator);
        waitPresenceOfElementLocated(locator);
    }

    public void buttonVisibleAfter(By locator) {
        waitElementIsVisible(locator);
    }

    public void assertRandomTextField(String value, By locator) {
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertButtonEnableAfter(By locator) {
        assertTrueElementIsEnabled(locator);
    }

    public void assertButtonColorChange(By locator) {
        assertTrueElementIsDisplayed(locator);
    }

    public void assertButtonVisibleAfter(By locator){
        assertTrueElementIsDisplayed(locator);
    }
}
