package Pages.Widgets;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tabs extends Methods {

    public Tabs(WebDriver driver) {
        super(driver);
    }

//    TabsLocators
    public static final By TabWhat = By.xpath("(//a[contains(@class,'nav-item nav-link')])[1]");
    public static final By TabOrigin = By.xpath("(//a[@class='nav-item nav-link'])[1]");
    public static final By TabUse = By.xpath("(//a[@class='nav-item nav-link'])[2]");

//    AssertsTabs
    public static final By AssertTabWhat = By.xpath("(//p[@class='mt-3'])[1]");
    public static final By AssertTabOrigin_1 = By.xpath("(//p[@class='mt-3'])[2]");
    public static final By AssertTabOrigin_2 = By.xpath("(//div[contains(@class,'fade tab-pane')]//p)[3]");
    public static final By AssertTabUse = By.xpath("(//p[@class='mt-3'])[3]");

    public void tabWhat(By locator){
        scrollToElement(locator);
        waitElementIsVisible(locator);
    }

    public void assertTabWhat(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void tabOrigin(By locator){
        visibleElementClick(locator);
    }

    public void assertTabOrigin_1(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertTabOrigin_2(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void tabUse(By locator){
        visibleElementClick(locator);
    }

    public void assertTabUse(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
    }
}
