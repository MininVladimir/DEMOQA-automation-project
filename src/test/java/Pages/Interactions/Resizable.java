package Pages.Interactions;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Resizable extends Methods {

    public Resizable(WebDriver driver) {
        super(driver);
    }

//    ResizableLocators
    public static final By Resizable = By.xpath("(//div[@class='box react-resizable']//span)[1]");
    public static final By Text = By.xpath("(//div[@class='text'])[1]");

    public void scroll(By locator){
        scrollToElement(locator);
        waitElementIsVisible(locator);
    }

    public void x150150(By locator, int xOffsetResizable1, int yOffsetResizable1){
        waitElementToBeClickable(locator);
        dragAndDropBy(locator, xOffsetResizable1, yOffsetResizable1);
    }

    public void x500300(By locator,int xOffsetResizable2, int yOffsetResizable2){
        waitElementToBeClickable(locator);
        dragAndDropBy(locator, xOffsetResizable2, yOffsetResizable2);
    }
}
