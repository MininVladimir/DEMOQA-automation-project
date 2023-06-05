package Pages.Widgets;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatePicker extends Methods {

    public DatePicker(WebDriver driver) {
        super(driver);
    }

//    DatePickerLocators
    public static final By DateAndTimeField = By.xpath("(//div[@class='react-datepicker__input-container']//input)[2]");
    public static final By MonthDropDown = By.xpath("//div[@class='react-datepicker__month-dropdown-container react-datepicker__month-dropdown-container--scroll']//div[1]");
    public static final By September = By.xpath("//div[@id='dateAndTimePicker']/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[9]");
    public static final By YearDropDown = By.xpath("//div[@class='react-datepicker__year-dropdown-container react-datepicker__year-dropdown-container--scroll']//div[1]");
    public static final By YearDropDownButtonDown = By.xpath("//div[@id='dateAndTimePicker']/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[13]");
    public static final By Year2007 = By.xpath("//div[@id='dateAndTimePicker']/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[12]");
    public static final By Day11 = By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--011')]");
    public static final By Time1715 = By.xpath("//li[text()='17:15']");

    public void dateAndTimeField(By locator){
        visibleElementClick(locator);
        findElement(locator).clear();
    }
    public void monthDropDown(By locator){
        visibleElementClick(locator);
    }

    public void september(By locator){
        visibleElementClick(locator);
    }

    public void yearDropDown(By locator){
        visibleElementClick(locator);
    }

    public void find2007(By locator1, By locator2, String value){
        waitElementIsVisible(locator1);
        while (!driver.findElement(locator2).getText().contains(value)){
            findElement(locator1).click();
        }
        waitElementIsVisible(locator2);
        clickElement(locator2);
    }

    public void day11(By locator){
        visibleElementClick(locator);
    }

    public void time1715(By locator){
        click(locator);
    }

    public void assertDate(By locator, String Attribute, String AttributeValue){
        waitElementIsVisible(locator);
        assertTrueFindElementGetAttributeContains(locator, Attribute, AttributeValue);
    }
}
