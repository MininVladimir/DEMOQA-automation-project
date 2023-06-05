package Pages.Widgets;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Menu extends Methods {

    public Menu(WebDriver driver) {
        super(driver);
    }

//    MenuLocators
    public static final By MainItem2 = By.linkText("Main Item 2");
    public static final By SubSubList = By.linkText("SUB SUB LIST »");
    public static final By SubSubItem2 = By.linkText("Sub Sub Item 2");

    public void mainItem2Hover(By locator){
        scrollToElement(locator);
        waitElementIsVisible(locator);
        moveToElement(locator);
    }

    public void subSubListHover(By locator){
        waitElementIsVisible(locator);
        moveToElement(locator);
    }

    public void subSubItem2Hover(By locator){
        waitElementIsVisible(locator);
        moveToElement(locator);
    }

    public void assertSubSubItem2(By locator){
        assertTrueElementIsDisplayed(locator);
    }
}
