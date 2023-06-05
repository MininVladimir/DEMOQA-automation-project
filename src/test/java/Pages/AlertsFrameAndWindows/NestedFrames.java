package Pages.AlertsFrameAndWindows;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFrames extends Methods {

    public NestedFrames(WebDriver driver) {
        super(driver);
    }

//    FramesLocators
    public static final By ParentFrame = By.id("frame1");
    public static final By ChildFrame = By.tagName("iframe");

//    AssertsLocators
    public static final By ParentFrameAssert = By.tagName("body");
    public static final By ChildFrameAssert = By.tagName("p");

    public void switchToParentFrame(By locator) {
        scrollToElement(locator);
        switchToFrame(locator);
    }

    public void assertParentFrame(String value, By locator) {
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void switchToChildFrame(By locator) {
        scrollToElement(locator);
        switchToFrame(locator);
    }

    public void assertChildFrame(String value, By locator) {
        assertTrueFindElementGetTextContains(value, locator);
    }
}
