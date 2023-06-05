package Pages.Elements;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class BrokenLinksImages extends Methods {

    public BrokenLinksImages(WebDriver driver) {
        super(driver);
    }

//    LinksLocators
    public static final By BrokenLink = By.xpath("//a[@href = 'http://the-internet.herokuapp.com/status_codes/500']");

//    AssertLocators
    public static final By ErrorHead = By.xpath("//h3[text()='Status Codes']");
    public static final By ErrorDescription = By.xpath("//div[@class='example']//p[1]");

    public void brokenLink(By locator) {
        visibleElementClick(locator);
    }

    public void assertErrorHead(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertErrorDescription(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertURL(String value){
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, value);
    }
}
