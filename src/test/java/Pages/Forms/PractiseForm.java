package Pages.Forms;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PractiseForm extends Methods {

    public PractiseForm(WebDriver driver) {
        super(driver);
    }

//    PractiseFormLocators
    public static final By FirstName = By.xpath("(//input[@class=' mr-sm-2 form-control'])[1]");
    public static final By LastName = By.xpath("(//input[@class=' mr-sm-2 form-control'])[2]");
    public static final By Email = By.xpath("//input[@class='mr-sm-2 form-control']");
    public static final By Male = By.xpath("(//div[@class='col-md-9 col-sm-12']//div)[1]");
    public static final By Mobile = By.xpath("(//input[@class=' mr-sm-2 form-control'])[3]");
    public static final By SubjectsField = By.xpath("(//div[@class=' css-2b097c-container'])[1]");
    public static final By Subjects = By.xpath("(//label[text()='Subjects']/following::input)[1]");
    public static final By Maths = By.xpath("//div[contains(@class,'subjects-auto-complete__option subjects-auto-complete__option--is-focused')]");
    public static final By Sports = By.xpath("(//div[contains(@class,'custom-control custom-checkbox')])[1]");
    public static final By Reading = By.xpath("(//div[contains(@class,'custom-control custom-checkbox')])[2]");
    public static final By Music = By.xpath("(//div[contains(@class,'custom-control custom-checkbox')])[3]");
    public static final By CurrentAddress = By.xpath("//textarea[@id = 'currentAddress']");
    public static final By State = By.xpath("//div[text()='Select State']");
    public static final By NCR = By.xpath("//div[text()='NCR']");
    public static final By City = By.xpath("//div[text()='Select City']");
    public static final By Delhi = By.xpath("//div[text()='Delhi']");
    public static final By Submit = By.xpath("//button[@class='btn btn-primary']");

//    CalendarLocators
    public static final By DateOfBirthField = By.xpath("//input[@id = 'dateOfBirthInput']");
    public static final By MonthDropDown = By.xpath("//div[@class='react-datepicker__month-dropdown-container react-datepicker__month-dropdown-container--select']//select[1]");
    public static final By MonthJuneOpt = By.xpath("//option[text()='June']");
    public static final By YearDropDown = By.xpath("//div[@class='react-datepicker__year-dropdown-container react-datepicker__year-dropdown-container--select']//select[1]");
    public static final By Year1996 = By.xpath("//option[@value='1996']");
    public static final By Day6 = By.xpath("(//div[text()='6'])[1]");

//    AssertLocators
    public static final By StudentNameLabel = By.xpath("(//table[contains(@class,'table table-dark')]//td)[1]");
    public static final By StudentNameValue = By.xpath("(//table[contains(@class,'table table-dark')]//td)[2]");

    public static final By StudentEmailLabel = By.xpath("(//table[contains(@class,'table table-dark')]//td)[3]");
    public static final By StudentEmailValue = By.xpath("(//table[contains(@class,'table table-dark')]//td)[4]");

    public static final By GenderLabel = By.xpath("(//table[contains(@class,'table table-dark')]//td)[5]");
    public static final By GenderValue = By.xpath("(//table[contains(@class,'table table-dark')]//td)[6]");

    public static final By MobileLabel = By.xpath("(//table[contains(@class,'table table-dark')]//td)[7]");
    public static final By MobileValue = By.xpath("(//table[contains(@class,'table table-dark')]//td)[8]");

    public static final By DateOfBirthLabel = By.xpath("(//table[contains(@class,'table table-dark')]//td)[9]");
    public static final By DateOfBirthValue = By.xpath("(//table[contains(@class,'table table-dark')]//td)[10]");

    public static final By SubjectsLabel = By.xpath("(//table[contains(@class,'table table-dark')]//td)[11]");
    public static final By SubjectsValue = By.xpath("(//table[contains(@class,'table table-dark')]//td)[12]");

    public static final By HobbiesLabel = By.xpath("(//table[contains(@class,'table table-dark')]//td)[13]");
    public static final By HobbiesValue = By.xpath("(//table[contains(@class,'table table-dark')]//td)[14]");

    public static final By PictureLabel = By.xpath("(//table[contains(@class,'table table-dark')]//td)[15]");
    public static final By PictureValue = By.xpath("(//table[contains(@class,'table table-dark')]//td)[16]");

    public static final By AddressLabel = By.xpath("(//table[contains(@class,'table table-dark')]//td)[17]");
    public static final By AddressValue = By.xpath("(//table[contains(@class,'table table-dark')]//td)[18]");

    public static final By StateAndCityLabel = By.xpath("(//table[contains(@class,'table table-dark')]//td)[19]");
    public static final By StateAndCityValue = By.xpath("(//table[contains(@class,'table table-dark')]//td)[20]");

    public void firstName(String value, By locator) {
        scrollToElement(locator);
        sendKeys(value, locator);
    }

    public void lastName(String value, By locator) {
        waitElementIsVisible(locator);
        sendKeys(value, locator);
    }

    public void email(String value, By locator) {
        waitElementIsVisible(locator);
        sendKeys(value, locator);
    }

    public void male(By locator) {
        visibleElementClick(locator);
    }

    public void mobile(String value, By locator) {
        waitElementIsVisible(locator);
        sendKeys(value, locator);
    }

    public void dateOfBirthField(By locator) {
        visibleElementClick(locator);
    }

    public void MonthDropDown(By locator) {
        visibleElementClick(locator);
    }

    public void monthJuneOpt(By locator) {
        visibleElementClick(locator);
    }

    public void yearDropDown(By locator) {
        visibleElementClick(locator);
    }

    public void year1996(By locator) {
        visibleElementClick(locator);
    }

    public void day6(By locator) {
        visibleElementClick(locator);
    }

    public void subjectsField(By locator) {
        visibleElementClick(locator);
    }

    public void subjects(String value, By locator) {
        waitElementIsVisible(locator);
        sendKeys(value, locator);
    }

    public void maths(By locator) {
        visibleElementClick(locator);
    }

    public void sports(By locator) {
        visibleElementClick(locator);
    }

    public void reading(By locator) {
        visibleElementClick(locator);
    }

    public void music(By locator) {
        visibleElementClick(locator);
    }

    public void currentAddress(String value, By locator) {
        waitElementIsVisible(locator);
        sendKeys(value, locator);
    }

    public void state(By locator) {
        visibleElementClick(locator);
    }

    public void NCR(By locator) {
        visibleElementClick(locator);
    }

    public void city(By locator) {
        visibleElementClick(locator);
    }

    public void delhi(By locator) {
        visibleElementClick(locator);
    }

    public void submit(By locator) {
        click(locator);
    }

    public void assertStudentNameLabel(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertStudentNameValue(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertStudentEmailLabel(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertStudentEmailValue(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertGenderLabel(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertGenderValue(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertMobileLabel(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertMobileValue(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertDateOfBirthLabel(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertDateOfBirthValue(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertSubjectsLabel(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertSubjectsValue(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertHobbiesLabel(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertHobbiesValue(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertPictureLabel(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertPictureValue(By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextIsEmpty(locator);
    }

    public void assertAddressLabel(String value, By locator){
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertAddressValue(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertStateAndCityLabel(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertStateAndCityValue(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }
}
