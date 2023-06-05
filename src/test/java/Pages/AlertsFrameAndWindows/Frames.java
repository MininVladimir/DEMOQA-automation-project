package Pages.AlertsFrameAndWindows;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Frames extends Methods {

    public Frames(WebDriver driver) {
        super(driver);
    }

//    FramesLocators
    public static final By Frame1 = By.id("frame1");
    public static final By Frame2 = By.id("frame2");

//    AssertsLocators
    public static final By Head = By.id("sampleHeading");

    public void frame1(By locator) {
        scrollToElement(locator);
        switchToFrame(locator);
    }

    public void assertFrame1(String value, By locator) {
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void frame2(By locator) {
        scrollToElement(locator);
        switchToFrame(locator);
    }

    public void assertFrame2(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
    }
}
