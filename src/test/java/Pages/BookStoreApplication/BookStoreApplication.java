package Pages.BookStoreApplication;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookStoreApplication extends Methods {

    public BookStoreApplication(WebDriver driver) {
        super(driver);
    }

//    LoginLocators
    public static final By Login = By.xpath("(//button[@class='btn btn-primary'])[1]");
    public static final By UserNameField = By.xpath("(//input[@class='mr-sm-2 form-control'])[1]");
    public static final By PasswordField = By.xpath("(//input[@class='mr-sm-2 form-control'])[2]");

//    RegistrationLocators
    public static final By NewUser = By.xpath("(//button[@class='btn btn-primary'])[2]");
    public static final By FirstName = By.xpath("(//input[@class='mr-sm-2 form-control'])[1]");
    public static final By LastName = By.xpath("(//input[@class='mr-sm-2 form-control'])[2]");
    public static final By UserName = By.xpath("(//input[@class='mr-sm-2 form-control'])[3]");
    public static final By Password = By.xpath("(//input[@class='mr-sm-2 form-control'])[4]");
    public static final By CaptchaFrame = By.xpath("//iframe[@title = 'reCAPTCHA']");
    public static final By IAmNotARobot = By.xpath("//div[@class = 'recaptcha-checkbox-border']");
    public static final By Register = By.id("register");

//    ProfileLocators
    public static final By Profile = By.xpath("(//li[@id='item-3'])[5]");
    public static final By Search = By.xpath("//input[@placeholder='Type to search']");
    public static final By DeleteAccount = By.xpath("(//button[@class='btn btn-primary'])[3]");
    public static final By ConfirmDeleteAccount = By.xpath("//div[@class='modal-footer']//button[1]");
    public static final By LogOut = By.xpath("(//button[@class='btn btn-primary'])[1]");
    public static final By GoToBookStore = By.xpath("(//button[@class='btn btn-primary'])[2]");
    public static final By DeleteBook = By.xpath("//span[@id = 'delete-record-undefined']");
    public static final By ConfirmDeleteBook = By.xpath("//div[@class='modal-footer']//button[1]");
    public static final By DeleteAllBooks = By.xpath("(//button[@class='btn btn-primary'])[4]");
    public static final By ConfirmDeleteAllBooks = By.xpath("//div[@class='modal-footer']//button[1]");


//    SearchBookLocators
    public static final By SearchBook1 = By.xpath("//a[@href='/books?book=9781449331818']");
    public static final By SearchBook2 = By.xpath("//a[@href='/books?book=9781449365035']");
    public static final By SearchBook3 = By.xpath("//a[@href='/books?book=9781491950296']");
    public static final By SearchBook4 = By.xpath("//a[@href='/books?book=9781593275846']");
    public static final By AddToYourCollection = By.xpath("(//button[@class='btn btn-primary'])[3]");
    public static final By BackToBookstore = By.xpath("(//button[@class='btn btn-primary'])[2]");

//RegistrationNewAccount
    public void newUser(By locator){
        clickableElementClick(locator);
    }

    public void firstName(String value, By locator){
        sendKeys(value, locator);
    }

    public void lastName(String value, By locator){
        sendKeys(value, locator);
    }

    public void userName(String value, By locator){
        sendKeys(value, locator);
    }

    public void password(String value, By locator){
        sendKeys(value, locator);
    }

    public void switchToCaptchaFrame(By locator) {
        switchToFrame(locator);
    }

    public void iAmNotARobot(By locator){
        clickableElementClick(locator);
        switchToDefaultContent();
    }

    public void registerClick(By locator){

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        clickableElementClick(locator);
    }

    public void assertSuccessfullyRegister(String value){
        waitAlertIsPresent();
        assertTrueAlertGetTextContains(value);
        switchToAlertAccept();
    }

//    LoginAndLogOut
    public void userNameFieldFill(String value, By locator){
        sendKeys(value, locator);
    }

    public void passwordFieldFill(String value, By locator){
        sendKeys(value, locator);
    }
    public void loginClick(By locator){
        clickableElementClick(locator);
    }

    public void logOutClick(By locator){
       visibleElementClick(locator);
    }

    public void assertLogout(String value){
        assertTrueGetCurrentUrlContains(value);
    }

//    Search
    public void searchInput(String value, By locator){
        sendKeys(value, locator);
    }

    public void searchIsVisible(By locator){
        scrollToElement(locator);
        waitElementIsVisible(locator);
    }

//    DeleteAccount
    public void deleteAccountClick(By locator){
        clickableElementClick(locator);
    }

    public void confirmDeleteAccount(By locator){
       clickableElementClick(locator);
    }

    public void assertDeleteAccount(String value){
        waitAlertIsPresent();
        assertTrueAlertGetTextContains(value);
        switchToAlertAccept();
    }

//    GoToBookStore
    public void goToBookStoreClick(By locator){
        visibleElementClick(locator);
    }

    public void assertGoBookStore(String value){
        assertTrueGetCurrentUrlContains(value);
    }

    public void assertSearchBook1(By locator){
        waitElementIsVisible(locator);
        assertTrueElementIsDisplayed(locator);
    }

    public void assertSearchBook2(By locator){
        waitElementIsVisible(locator);
        assertTrueElementIsDisplayed(locator);
    }

    public void assertSearchBook3(By locator){
        waitElementIsVisible(locator);
        assertTrueElementIsDisplayed(locator);
    }

    public void assertSearchBook4(By locator){
        waitElementIsVisible(locator);
        assertTrueElementIsDisplayed(locator);
    }

    public void speakingJavaScriptClick(By locator){
        visibleElementClick(locator);
    }

    public void addBook(By locator){
        visibleElementClick(locator);
    }

    public void bookAlert(){
        waitAlertIsPresent();
        switchToAlertAccept();
    }

    public void profileClick(By locator){
        visibleElementClick(locator);
    }

//    DeleteBook
    public void deleteBook(By locator) {
        visibleElementClick(locator);
    }

    public void confirmDeleteBook(By locator) {
        visibleElementClick(locator);
    }

    public void assertBookDeleted(String value){
        waitAlertIsPresent();
        assertTrueAlertGetTextContains(value);
        switchToAlertAccept();
    }

//    DeleteAllBooks
    public void deleteAllBooks(By locator) {
        visibleElementClick(locator);
    }

    public void confirmDeleteAllBooks(By locator) {
        visibleElementClick(locator);
    }

    public void assertAllBooksDeleted(String value){
        waitAlertIsPresent();
        assertTrueAlertGetTextContains(value);
        switchToAlertAccept();
    }


}
