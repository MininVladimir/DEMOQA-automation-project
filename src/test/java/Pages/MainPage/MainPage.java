package Pages.MainPage;

import Methods.Methods;
import Pages.SubMenues.SubMenues;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends Methods {

    public MainPage(WebDriver driver) {
        super(driver);
    }

//    MenuLocators
    public static final By Elements = By.xpath("//div[@class = 'card mt-4 top-card'][1]");
    public static final By Forms = By.xpath("//div[@class = 'card mt-4 top-card'][2]");
    public static final By AlertsFrameAndWindows = By.xpath("//div[@class = 'card mt-4 top-card'][3]");
    public static final By Widgets = By.xpath("//div[@class = 'card mt-4 top-card'][4]");
    public static final By Interactions = By.xpath("//div[@class = 'card mt-4 top-card'][5]");
    public static final By BookStoreApplication = By.xpath("//div[@class = 'card mt-4 top-card'][6]");

    public SubMenues mainPageMenu1(By locator) {
        visibleElementClick(locator);
        return new SubMenues(driver);
    }

    public SubMenues mainPageMenu2(By locator) {
        visibleElementClick(locator);
        return new SubMenues(driver);
    }

    public SubMenues mainPageMenu3(By locator) {
        visibleElementClick(locator);
        return new SubMenues(driver);
    }

    public SubMenues mainPageMenu4(By locator) {
        visibleElementClick(locator);
        return new SubMenues(driver);
    }

    public SubMenues mainPageMenu5(By locator) {
        visibleElementClick(locator);
        return new SubMenues(driver);
    }

    public SubMenues mainPageMenu6(By locator) {
        visibleElementClick(locator);
        return new SubMenues(driver);
    }
}
