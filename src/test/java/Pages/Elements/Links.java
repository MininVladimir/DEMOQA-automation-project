package Pages.Elements;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class Links extends Methods {

    public Links(WebDriver driver) {
        super(driver);
    }

//    LinksLocators
    public static final By HomeLink = By.xpath("//a[@id = 'simpleLink']");
    public static final By DynamicNameLink = By.xpath("//a[@id = 'dynamicLink']");
    public static final By CreatedLink = By.xpath("//a[@id = 'created']");
    public static final By NoContentLink = By.xpath("//a[@id = 'no-content']");
    public static final By MovedLink = By.xpath("//a[@id = 'moved']");
    public static final By BadRequestLink = By.xpath("//a[@id = 'bad-request']");
    public static final By UnauthorizedLink = By.xpath("//a[@id = 'unauthorized']");
    public static final By ForbiddenLink = By.xpath("//a[@id = 'forbidden']");
    public static final By NotFoundLink = By.xpath("//a[@id = 'invalid-url']");

//    AssertLocators
    public static final By ResponseResult = By.id("linkResponse");

    public void homeLink(By locator) {
        visibleElementClick(locator);
    }

    public void dynamicNameLink(By locator) {
        visibleElementClick(locator);
    }

    public void closeChildTabs() {
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

    public void createdLink(By locator) {
        visibleElementClick(locator);
    }

    public void noContentLink(By locator) {
        visibleElementClick(locator);
    }

    public void movedLink(By locator) {
        visibleElementClick(locator);
    }

    public void badRequestLink(By locator) {
        visibleElementClick(locator);
    }

    public void unauthorizedLink(By locator) {
        visibleElementClick(locator);
    }

    public void forbiddenLink(By locator) {
        visibleElementClick(locator);
    }

    public void notFoundLink(By locator) {
        visibleElementClick(locator);
    }

    public void assertNotFoundLink(String value, By locator){
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }
}
