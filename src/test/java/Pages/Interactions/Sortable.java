package Pages.Interactions;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sortable extends Methods {

    public Sortable(WebDriver driver) {
        super(driver);
    }

//    SortableLocators
    public static final By List = By.xpath("(//a[@role='tab'])[1]");
    public static final By ListOne = By.xpath("(//div[text()='One'])");
    public static final By ListThree = By.xpath("(//div[text()='Three'])");

    public void list(By locator){
        scrollToElement(locator);
    }

    public void listDragAndDrop(By locator1, By locator2){
        waitElementIsVisible(locator1);
        waitElementIsVisible(locator2);
        dragAndDrop(locator1, locator2);
    }
}
