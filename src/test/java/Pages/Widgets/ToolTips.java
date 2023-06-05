package Pages.Widgets;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ToolTips extends Methods {

    public ToolTips(WebDriver driver) {
        super(driver);
    }
//    ToolTipsLocators
    public static final By Button = By.xpath("//button[@class='btn btn-success']");
    public static final By TextField = By.xpath("//input[@class=' mr-sm-2 form-control']");
    public static final By LinkContrary = By.xpath("//div[@class='mt-4']//a[1]");
    public static final By Link1_30_32 = By.xpath("(//div[@class='mt-4']//a)[2]");
    public static final By ButtonTooltip = By.xpath("(//div[@id='buttonToolTip']//div)[2]");
    public static final By TextFieldTooltip = By.xpath("(//div[@id='textFieldToolTip']//div)[2]");
    public static final By LinkContraryTooltip = By.xpath("(//div[@id='contraryTexToolTip']//div)[2]");
    public static final By Link1_30_32Tooltip = By.xpath("(//div[@id='sectionToolTip']//div)[2]");

    public void buttonHover(By locator){
        scrollToElement(locator);
        waitElementIsVisible(locator);
        moveToElement(locator);
    }

    public void assertButtonTooltip(String value, By locator){
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void textFieldHover(By locator){
        scrollToElement(locator);
        waitElementIsVisible(locator);
        moveToElement(locator);
    }

    public void assertTextFieldTooltip(String value, By locator){
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void linkContraryHover(By locator){
        scrollToElement(locator);
        waitElementIsVisible(locator);
        moveToElement(locator);
    }

    public void assertLinkContraryTooltip(String value, By locator){
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void link1_30_32Hover(By locator){
        scrollToElement(locator);
        waitElementIsVisible(locator);
        moveToElement(locator);
    }

    public void assertLink1_30_32Tooltip(String value, By locator){
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }
}
