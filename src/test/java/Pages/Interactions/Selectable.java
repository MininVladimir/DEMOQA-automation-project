package Pages.Interactions;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Selectable extends Methods {

    public Selectable(WebDriver driver) {
        super(driver);
    }

//    SelectableLocators
    public static final By List = By.linkText("List");
    public static final By ListOne = By.xpath("//li[text()='Cras justo odio']");
    public static final By ListThree = By.xpath("//li[text()='Morbi leo risus']");
    public static final By Grid = By.linkText("Grid");
    public static final By GridOne = By.xpath("//li[text()='One']");
    public static final By GridThree = By.xpath("//li[text()='Three']");
    public static final By GridFive = By.xpath("//li[text()='Five']");
    public static final By GridSeven = By.xpath("//li[text()='Seven']");
    public static final By GridNine = By.xpath("//li[text()='Nine']");

    public void list(By locator){
        scrollToElement(locator);
    }

    public void listOneClick(By locator){
        clickableElementClick(locator);
    }

    public void listThreeClick(By locator){
        clickableElementClick(locator);
    }

    public void assertListOneClick(By locator, String Attribute, String AttributeValue){
        assertTrueFindElementGetAttributeContains(locator, Attribute, AttributeValue);
    }

    public void assertListThreeClick(By locator, String Attribute, String AttributeValue){
        assertTrueFindElementGetAttributeContains(locator, Attribute, AttributeValue);
    }

    public void grid(By locator){
        clickableElementClick(locator);
    }

    public void gridOneClick(By locator){
        clickableElementClick(locator);
    }

    public void gridThreeClick(By locator){
        clickableElementClick(locator);
    }

    public void gridFiveClick(By locator){
        clickableElementClick(locator);
    }

    public void gridSevenClick(By locator){
        clickableElementClick(locator);
    }

    public void gridNineClick(By locator){
        clickableElementClick(locator);
    }

    public void assertGridOneClick(By locator, String Attribute, String AttributeValue){
        assertTrueFindElementGetAttributeContains(locator, Attribute, AttributeValue);
    }

    public void assertGridThreeClick(By locator, String Attribute, String AttributeValue){
        assertTrueFindElementGetAttributeContains(locator, Attribute, AttributeValue);
    }

    public void assertGridFiveClick(By locator, String Attribute, String AttributeValue){
        assertTrueFindElementGetAttributeContains(locator, Attribute, AttributeValue);
    }

    public void assertGridSevenClick(By locator, String Attribute, String AttributeValue){
        assertTrueFindElementGetAttributeContains(locator, Attribute, AttributeValue);
    }

    public void assertGridNineClick(By locator, String Attribute, String AttributeValue){
        assertTrueFindElementGetAttributeContains(locator, Attribute, AttributeValue);
    }
}
