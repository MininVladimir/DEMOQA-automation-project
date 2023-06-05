package Pages.Elements;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBox extends Methods {

    public TextBox(WebDriver driver) {
        super(driver);
    }

//    TextBoxLocators
    public static final By InputName = By.id("userName");
    public static final By UserEmail = By.id("userEmail");
    public static final By CurrentAddress = By.id("currentAddress");
    public static final By PermanentAddress = By.id("permanentAddress");
    public static final By SubmitButton = By.xpath("//button[@class = 'btn btn-primary']");

//    AssertLocators
    public static final By AssertName = By.xpath("(//p[@class='mb-1'])[1]");
    public static final By AssertEmail = By.xpath("(//p[@class='mb-1'])[2]");
    public static final By AssertCurrentAddress = By.xpath("(//p[@class='mb-1'])[3]");
    public static final By AssertPermanentAddress = By.xpath("(//p[@class='mb-1'])[4]");

    public void inputName(String value, By locator) {
        waitElementIsVisible(locator);
        sendKeys(value, locator);
    }

    public void userEmail(String value, By locator) {
        waitElementIsVisible(locator);
        sendKeys(value, locator);
    }

    public void currentAddress(String value, By locator) {
        waitElementIsVisible(locator);
        sendKeys(value, locator);
    }

    public void permanentAddress(String value, By locator) {
        waitElementIsVisible(locator);
        sendKeys(value, locator);
    }

    public void submitButton(By locator) {
        visibleElementClick(locator);
    }

    public void assertTextBoxName(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertTextBoxEmail(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertTextBoxCurrentAddress(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertPermanentAddress(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }
}
