package Pages.Elements;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTables extends Methods {

    public WebTables(WebDriver driver) {
        super(driver);
    }

//    WebTablesLocators
    public static final By AddButton = By.xpath("//button[@id = 'addNewRecordButton']");
    public static final By RegistrationFormFirstName = By.xpath("//input[@id = 'firstName']");
    public static final By RegistrationFormLastName = By.xpath("//input[@id = 'lastName']");
    public static final By RegistrationFormEmail = By.xpath("//input[@id = 'userEmail']");
    public static final By RegistrationFormAge = By.xpath("//input[@id = 'age']");
    public static final By RegistrationFormSalary = By.xpath("//input[@id = 'salary']");
    public static final By RegistrationFormDepartment = By.xpath("//input[@id = 'department']");
    public static final By SubmitButton = By.xpath("//button[@id = 'submit']");
    public static final By DeleteRecord3 = By.xpath("//span[@id = 'delete-record-3']");
    public static final By DeleteRecord2 = By.xpath("//span[@id = 'delete-record-2']");
    public static final By EditRecord2 = By.xpath("//span[@id = 'edit-record-1']");
    public static final By Search = By.xpath("//input[@id = 'searchBox']");

//    AssertLocators
    public static final By SearchTextInput = By.xpath("//div[@class = 'rt-td'][4]");

    public void addButton(By locator) {
        visibleElementClick(locator);
    }

    public void registrationFormFirstName(String value, By locator) {
        waitElementIsVisible(locator);
        sendKeys(value, locator);
    }

    public void registrationFormLastName(String value, By locator) {
        waitElementIsVisible(locator);
        sendKeys(value, locator);
    }

    public void registrationFormEmail(String value, By locator) {
        waitElementIsVisible(locator);
        sendKeys(value, locator);
    }

    public void registrationFormAge(String value, By locator) {
        waitElementIsVisible(locator);
        sendKeys(value, locator);
    }

    public void registrationFormSalary(String value, By locator) {
        waitElementIsVisible(locator);
        sendKeys(value, locator);
    }

    public void registrationFormDepartment(String value, By locator) {
        waitElementIsVisible(locator);
        sendKeys(value, locator);
    }

    public void deleteRecord3(By locator) {
        visibleElementClick(locator);
    }

    public void deleteRecord2(By locator) {
        visibleElementClick(locator);
    }

    public void editRecord2(By locator) {
        visibleElementClick(locator);
    }

    public void editRegistrationFormAge(String value, By locator) {
        waitElementIsVisible(locator).clear();
        sendKeys(value, locator);
    }

    public void submitButton(By locator) {
        visibleElementClick(locator);
    }

    public void search(String value, By locator) {
        waitElementIsVisible(locator);
        sendKeys(value, locator);
    }

    public void searchTextInput(By locator) {
        waitElementIsVisible(locator);
    }

    public void Assert(String value, By locator) {
        assertTrueFindElementGetTextContains(value, locator);
    }
}
