package Pages.AlertsFrameAndWindows;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class BrowserWindows extends Methods {
    public BrowserWindows(WebDriver driver) {
        super(driver);
    }

//    BrowserWindowsLocators
    public static final By NewTab = By.xpath("(//button[@class='btn btn-primary'])[1]");
    public static final By NewWindow = By.xpath("//button[contains(@class,'mt-4 btn')]");
    public static final By NewWindowMessage = By.xpath("(//button[@class='btn btn-primary'])[2]");

//    AssertsLocators
    public static final By NewTabAssert = By.xpath("//h1[@id = 'sampleHeading']");
    public static final By NewWindowAssert = By.xpath("//h1[@id = 'sampleHeading']");
    public static final By NewWindowMessageAssert = By.xpath("//Body");

    public void newTab(By locator) {
        visibleElementClick(locator);
    }

    public void closeNewTab(By locator) {
        String ParentWindow = driver.getWindowHandle();

        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!ParentWindow.equals(ChildWindow)) {
                switchToChildWindow(ChildWindow);
                driverClose();
            }
        }
        switchToParentWindow(ParentWindow);
    }

    public void newWindow(By locator) {
        visibleElementClick(locator);
    }

    public void closeNewWindow(By locator) {
        String ParentWindow = driver.getWindowHandle();

        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!ParentWindow.equals(ChildWindow)) {
                switchToChildWindow(ChildWindow);
                driverClose();
            }
        }
        switchToParentWindow(ParentWindow);
    }

    public void newWindowMessage(By locator) {
        visibleElementClick(locator);
    }

    public void closeNewWindowMessage(By locator){
        String ParentWindow = driver.getWindowHandle();

        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        while (iterator.hasNext()){
            String ChildWindow = iterator.next();
            if (!ParentWindow.equals(ChildWindow)){
                switchToChildWindow(ChildWindow);
                driverClose();
            }
        }
        switchToParentWindow(ParentWindow);
    }
}
