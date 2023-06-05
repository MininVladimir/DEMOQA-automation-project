package Pages.Widgets;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutoComplete extends Methods {

    public AutoComplete(WebDriver driver) {
        super(driver);
    }

//    AutoCompleteLocators
    public static final By MultipleColorNamesField = By.xpath("//div[contains(@class,'auto-complete__value-container auto-complete__value-container--is-multi')]");
    public static final By MultipleColorNameInput = By.xpath("//input[@id='autoCompleteMultipleInput']");
    public static final By White = By.xpath("//div[text()='White']");
    public static final By Blue = By.xpath("//div[text()='Blue']");
    public static final By Red = By.xpath("//div[text()='Red']");
    public static final By SingleColorNameField = By.xpath("//div[@class='auto-complete__value-container css-1hwfws3']");
    public static final By SingleColorNameInput = By.xpath("//input[@id='autoCompleteSingleInput']");
    public static final By Black = By.xpath("//div[text()='Black']");

//    AssertLocators
    public static final By AssertWhite = By.xpath("(//div[@class='css-1rhbuit-multiValue auto-complete__multi-value']//div)[1]");
    public static final By AssertBlue = By.xpath("(//div[@class='css-1rhbuit-multiValue auto-complete__multi-value']//div)[3]");
    public static final By AssertRed = By.xpath("(//div[@class='css-1rhbuit-multiValue auto-complete__multi-value']//div)[5]");
    public static final By AssertBlack = By.xpath("//div[@class='auto-complete__single-value css-1uccc91-singleValue']");

    public void multipleColorNamesField(By locator){
        visibleElementClick(locator);
    }

    public void multipleColorNameInputClick(By locator){
        visibleElementClick(locator);
    }

    public void multipleColorNameInputWhite(String value, By locator){
        sendKeys(value, locator);
    }

    public void elementWhite(By locator){
        visibleElementClick(locator);
    }

    public void multipleColorNameInputBlue(String value, By locator){
        sendKeys(value, locator);
    }

    public void elementBlue(By locator){
        visibleElementClick(locator);
    }

    public void multipleColorNameInputRed(String value, By locator){
        sendKeys(value, locator);
    }

    public void elementRed(By locator){
        visibleElementClick(locator);
    }

    public void singleColorNameField(By locator){
        visibleElementClick(locator);
    }

    public void singleColorNameInputClick(By locator){
        visibleElementClick(locator);
    }

    public void singleColorNameBlack(String value, By locator){
        sendKeys(value, locator);
    }

    public void elementBlack(By locator){
        visibleElementClick(locator);
    }

    public void assertWhite(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertBlue(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertRed(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertBlack(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
    }
}
