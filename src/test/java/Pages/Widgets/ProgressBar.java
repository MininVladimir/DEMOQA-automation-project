package Pages.Widgets;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProgressBar extends Methods {

    public ProgressBar(WebDriver driver) {
        super(driver);
    }

//    ProgressBarLocators
    public static final By ProgressBar = By.xpath("//div[@class='progress-bar bg-info']");
    public static final By StartStopButton = By.xpath("//button[contains(@class,'mt-3 btn')]");

    public void pressStart(By locator){
        clickableElementClick(locator);
    }

    public void pressStop(String attribute, String attributeValue, By locator1, By locator2){
        scrollToElement(locator1);
        waitElementIsVisible(locator1);

        while(!findElement(locator1).getAttribute(attribute).contains(attributeValue)){
            webDriverWait();
        }

        if(findElement(locator1).getAttribute(attribute).contains(attributeValue)) {
            visibleElementClick(locator2);
        }
    }

    public void assertProgressBar(By locator, String attribute, String attributeValue){
        scrollToElement(locator);
        assertTrueFindElementGetAttributeContains(locator, attribute, attributeValue);
    }
}
