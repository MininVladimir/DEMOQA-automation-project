package Pages.Elements;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButton extends Methods {

    public RadioButton(WebDriver driver) {
        super(driver);
    }

//    ButtonLocators
    public static final By YesButton = By.xpath("(//label[@class='custom-control-label'])[1]");
    public static final By ImpressiveButton = By.xpath("(//label[@class='custom-control-label'])[2]");
    public static final By NoButton = By.xpath("//label[@class='custom-control-label disabled']");

//    AssertLocators
    public static final By AssertResult = By.xpath("//p[@class = 'mt-3']");

    public void yesButton(By locator) {
        visibleElementClick(locator);
    }

    public void impressiveButton(By locator) {
        visibleElementClick(locator);
    }

    public void noButton(By locator) {
        visibleElementClick(locator);
    }

    public void assertButton(String value, By locator){
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }
}
