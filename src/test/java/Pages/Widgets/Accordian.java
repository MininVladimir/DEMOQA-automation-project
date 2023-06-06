package Pages.Widgets;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Accordian extends Methods {

    public Accordian(WebDriver driver) {
        super(driver);
    }

//    AccordianLocators
    public static final By Accordian1 = By.xpath("(//div[@class='card-header'])[1]");
    public static final By Accordian2 = By.xpath("(//div[@class='card-header'])[2]");
    public static final By Accordian3 = By.xpath("(//div[@class='card-header'])[3]");

//    AssertAccordianTextLocators
    public static final By Text1 = By.xpath("//div[@id='section1Content']//p[1]");
    public static final By Text2_1 = By.xpath("//div[@id='section2Content']//p[1]");
    public static final By Text2_2 = By.xpath("(//div[@id='section2Content']//p)[2]");
    public static final By Text3 = By.xpath("//div[@id='section3Content']/p[1]");

    public void accordian1(By locator) {
        scrollToElement(locator);
        waitElementIsVisible(locator);
    }

    public void assertAccordian1Name(String value, By locator) {
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertAccordian1Text(String value, By locator) {
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void closeAccordian1(By locator) {
        visibleElementClick(locator);
    }

    public void accordian2(By locator){
        visibleElementClick(locator);
    }

    public void assertAccordian2Name(String value, By locator) {
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertAccordian2_1Text(String value, By locator) {
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertAccordian2_2Text(String value, By locator) {
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void closeAccordian2(By locator) {
        visibleElementClick(locator);
    }

    public void accordian3(By locator){
        visibleElementClick(locator);
    }

    public void assertAccordian3Name(String value, By locator) {
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertAccordian3Text(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
        }

    public void closeAccordian3(By locator) {
        visibleElementClick(locator);
    }
}
