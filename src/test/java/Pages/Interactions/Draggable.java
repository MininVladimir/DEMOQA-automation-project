package Pages.Interactions;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Draggable extends Methods {

    public Draggable(WebDriver driver) {
        super(driver);
    }

//    DraggableLocators
//    Simple
    public static final By Simple = By.id("draggableExample-tab-simple");
    public static final By DragBox = By.id("dragBox");
//    AxisRestricted
    public static final By AxisRestricted = By.id("draggableExample-tab-axisRestriction");
    public static final By RestrictedX = By.id("restrictedX");
    public static final By RestrictedY = By.id("restrictedY");

    public void simple(By locator){
        scrollToElement(Simple);
    }

    public void simpleDragBox(By locator, int xOffsetSimple, int yOffsetSimple){
        waitElementToBeClickable(locator);
        dragAndDropBy(locator, xOffsetSimple, yOffsetSimple);
    }

    public void axisRestricted(By locator){
        visibleElementClick(locator);
    }

    public void restrictedX(By locator, int xOffsetSimple, int yOffsetSimple){
        waitElementToBeClickable(locator);
        dragAndDropBy(locator, xOffsetSimple, yOffsetSimple);
    }

    public void restrictedY(By locator, int xOffsetSimple, int yOffsetSimple){
        waitElementToBeClickable(locator);
        dragAndDropBy(locator, xOffsetSimple, yOffsetSimple);
    }
}
