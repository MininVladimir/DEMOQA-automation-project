package Pages.Interactions;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Droppable extends Methods {

    public Droppable(WebDriver driver) {
        super(driver);
    }

//    DroppableLocators
//    Simple
    public static final By Simple = By.linkText("Simple");
    public static final By Draggable = By.id("draggable");
    public static final By Droppable = By.xpath("(//div[@id='droppable'])[1]");
    public static final By AssertDroppable = By.xpath("(//div[@id='droppable']//p)[1]");
//    Accept
    public static final By Accept = By.linkText("Accept");
    public static final By Acceptable = By.id("acceptable");
    public static final By NotAcceptable = By.id("notAcceptable");
    public static final By AcceptDroppable = By.xpath("(//div[@id='droppable'])[2]");
    public static final By AssertAcceptDroppable = By.xpath("(//div[@id='droppable']//p)[2]");

//    PreventPropogation
    public static final By PreventPropogation = By.linkText("Prevent Propogation");
    public static final By Dragbox = By.id("dragBox");
    public static final By OuterDroppable1 = By.xpath("(//div[@id='notGreedyDropBox']//p)[1]");
    public static final By InnerDroppable1 = By.xpath("//div[@id='notGreedyInnerDropBox']//p[1]");
    public static final By OuterDroppable2 = By.xpath("(//div[@id='greedyDropBox']//p)[1]");
    public static final By InnerDroppable2 = By.xpath("//div[@id='greedyDropBoxInner']//p[1]");

    public void simple(By locator){
        scrollToElement(locator);
    }

    public void simpleDragAndDrop(By locator1, By locator2){
        waitElementToBeClickable(locator1);
        waitElementIsVisible(locator2);
        dragAndDrop(locator1, locator2);
    }

    public void assertSimpleDragAndDrop(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void accept(By locator){
        visibleElementClick(locator);
    }

    public void notAcceptableDragAndDrop(By locator1, By locator2){
        waitElementToBeClickable(locator1);
        waitElementIsVisible(locator2);
        dragAndDrop(locator1, locator2);
    }

    public void assertNotAcceptableDragAndDrop(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void acceptableDragAndDrop(By locator1, By locator2){
        waitElementToBeClickable(locator1);
        waitElementIsVisible(locator2);
        dragAndDrop(locator1, locator2);
    }

    public void assertAcceptableDragAndDrop(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void preventPropogation(By locator){
        clickableElementClick(locator);
    }

    public void outerDroppable1DragAndDrop(By locator1, By locator2){
        waitElementToBeClickable(locator1);
        waitElementIsVisible(locator2);
        dragAndDrop(locator1, locator2);
    }

    public void assertOuterDroppable1DragAndDrop(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void innerDroppable1DragAndDrop(By locator1, By locator2){
        waitElementToBeClickable(locator1);
        waitElementIsVisible(locator2);
        dragAndDrop(locator1, locator2);
    }

    public void assertInnerDroppable1DragAndDrop(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void outerDroppable2DragAndDrop(By locator1, By locator2){
        waitElementToBeClickable(locator1);
        waitElementIsVisible(locator2);
        dragAndDrop(locator1, locator2);
    }

    public void assertOuterDroppable2DragAndDrop(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void innerDroppable2DragAndDrop(By locator1, By locator2){
        waitElementToBeClickable(locator1);
        waitElementIsVisible(locator2);
        dragAndDrop(locator1, locator2);
    }

    public void assertInnerDroppable2DragAndDrop(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
    }
}
