package Pages.AlertsFrameAndWindows;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalDialogs extends Methods {

    public ModalDialogs(WebDriver driver) {
        super(driver);
    }

//    ModalDialogsLocators
    public static final By SmallModalButton = By.xpath("//button[contains(@class,'mr-4 mt-2')]");
    public static final By SmallModalCloseButton = By.xpath("//button[@class='btn btn-primary']");
    public static final By LargeModalButton = By.xpath("(//button[contains(@class,'mt-2 btn')])[2]");
    public static final By LargeModalCloseButton = By.xpath("//button[@class='btn btn-primary']");

//    AssertsLocators
    public static final By ModalHeadAssert = By.xpath("(//div[@class='modal-content']//div)[1]");
    public static final By ModalBodyAssert = By.xpath("(//div[@class='modal-content']//div)[3]");

    public void smallModal(By locator) {
        visibleElementClick(locator);
    }

    public void assertSmallModalHead(String value, By locator) {
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertSmallModalBody(String value, By locator) {
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void closeSmallModal(By locator) {
        visibleElementClick(locator);
    }

    public void largeModal(By locator) {
        visibleElementClick(locator);
    }

    public void assertLargeModalHead(String value, By locator) {
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertLargeModalBody(String value, By locator) {
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void closeLargeModal(By locator) {
        visibleElementClick(locator);
    }
}
