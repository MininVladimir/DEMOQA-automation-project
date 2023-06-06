package Pages.Elements;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Buttons extends Methods {

    public Buttons(WebDriver driver) {
        super(driver);
    }

//    ButtonsLocators
    public static final By doubleClick = By.xpath("(//button[@class='btn btn-primary'])[1]");
    public static final By RightClick = By.xpath("//button[@id = 'rightClickBtn']");
    public static final By Click = By.xpath("(//button[@class='btn btn-primary'])[3]");

//    AssertLocators
    public static final By AssertLeftButtonDoubleClick = By.xpath("//p[@id = 'doubleClickMessage']");
    public static final By AssertRightClick = By.xpath("//p[@id = 'rightClickMessage']");
    public static final By AssertClick = By.xpath("//p[@id = 'dynamicClickMessage']");

    public void doubleClick(By locator) {
        scrollToElement(locator);
        waitElementIsVisible(locator);
        leftButtonDoubleClick(locator);
    }

    public void rightClick(By locator) {
        scrollToElement(locator);
        waitElementIsVisible(locator);
        contextClick(locator);
    }

    public void click(By locator) {
        visibleElementClick(locator);
    }

    public void assertDoubleClick(String value, By locator) {
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertRightClick(String value, By locator) {
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertClick(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
    }
}
