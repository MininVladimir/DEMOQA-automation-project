package Pages.Widgets;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Slider extends Methods {

    public Slider(WebDriver driver) {
        super(driver);
    }

//    SliderLocators
    public static final By Slider = By.xpath("//input[@class='range-slider range-slider--primary']");

//    AssertSlider
    public static final By SliderValue = By.xpath("//div[@class='col-3']//input[1]");

    public void dragAndDropSlider(By locator, int xOffsetSlider, int yOffsetSlider){
        scrollToElement(locator);
        dragAndDropBy(locator, xOffsetSlider, yOffsetSlider);
    }

    public void assertSlider(By locator, String Attribute, String AttributeValue){
        assertTrueFindElementGetAttributeContains(locator, Attribute, AttributeValue);
    }
}
