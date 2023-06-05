package Methods;

import Properties.DataProperties;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static Properties.BrowserProperties.Implicitly_Wait;

public class Methods extends DataProperties {

    protected WebDriver driver;

    public Methods(WebDriver driver){
        this.driver = driver;
    }

    public WebElement findElement (By locator){
        WebElement element = driver.findElement(locator);
        return element;
    }

    public void scrollToElement(By locator){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", findElement(locator));
    }

    public WebElement waitElementIsVisible(By locator) {
        new WebDriverWait(driver, Duration.ofSeconds(Implicitly_Wait)).until(ExpectedConditions.visibilityOf(findElement(locator)));
        return findElement(locator);
    }

    public WebElement waitElementToBeClickable(By locator) {
        new WebDriverWait(driver, Duration.ofSeconds(Implicitly_Wait)).until(ExpectedConditions.elementToBeClickable(findElement(locator)));
        return findElement(locator);
    }

    public void visibleElementClick(By locator){
        scrollToElement(locator);
        waitElementIsVisible(locator).click();
    }

    public void clickableElementClick(By locator){
        waitElementToBeClickable(locator).click();
    }

    public void click(By locator){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", findElement(locator));
    }

    public void alertAccept(){
        driver.switchTo().alert().accept();
    }

    public void alertDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public void alertSendKeys(String value){
        driver.switchTo().alert().sendKeys(value);
    }

    public void switchToChildWindow(String childWindow){
        driver.switchTo().window(childWindow);
    }

    public void switchToParentWindow(String parentWindow){
        driver.switchTo().window(parentWindow);
    }

    public void driverClose(){
        driver.close();
    }

    public void switchToFrame(By locator){
        scrollToElement(locator);
        driver.switchTo().frame(findElement(locator));
    }

    public void sendKeys(String value, By locator){
        waitElementIsVisible(locator).sendKeys(value);
    }

    public void leftButtonDoubleClick(By locator){
        new Actions(driver).doubleClick(findElement(locator)).perform();
    }

    public void contextClick(By locator){
        new Actions(driver).contextClick(findElement(locator)).perform();
    }

    public void waitPresenceOfElementLocated(By locator) {
        new WebDriverWait(driver, Duration.ofSeconds(Implicitly_Wait)).until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void dragAndDropBy(By locator, int xOffset, int yOffset){
        new Actions(driver).dragAndDropBy(findElement(locator), xOffset, yOffset).perform();
    }

    public void dragAndDrop(By locator1, By locator2){
        new Actions(driver).dragAndDrop(findElement(locator1), findElement(locator2)).perform();
    }

    public void waitAlertIsPresent(){
        new WebDriverWait(driver, Duration.ofSeconds(Implicitly_Wait)).until(ExpectedConditions.alertIsPresent());
    }

    public void switchToAlertAccept(){
        driver.switchTo().alert().accept();
    }

    public void switchToDefaultContent(){
        driver.switchTo().defaultContent();
    }

    public void webDriverWait(){
        new WebDriverWait(driver, Duration.ofSeconds(Implicitly_Wait));
    }
    public void clickElement(By locator){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", findElement(locator));
    }

    public void moveToElement(By locator){
        new Actions(driver).moveToElement(findElement(locator)).perform();
    }

    public void clickAndHold(By locator){
        scrollToElement(locator);
        waitElementToBeClickable(locator);
        new Actions(driver).clickAndHold(findElement(locator)).perform();
    }

    public void moveToElementAndRelease(By locator){
        waitElementIsVisible(locator);
        new Actions(driver).moveToElement(findElement(locator)).release().perform();
    }

    public void clickToElementWithCtrl(By locator){
        waitElementIsVisible(locator);
        new Actions(driver).keyDown(Keys.LEFT_CONTROL).click(findElement(locator)).keyUp(Keys.LEFT_CONTROL).perform();
    }

//    Asserts
    public void assertTrueAlertGetTextContains(String value){
        Assert.assertTrue(driver.switchTo().alert().getText().contains(value));
    }

    public void assertTrueFindElementGetTextContains(String value, By locator){
        Assert.assertTrue(findElement(locator).getText().contains(value));
    }

    public void assertTrueGetCurrentUrlContains(String value){
        Assert.assertTrue(driver.getCurrentUrl().contains(value));
    }

    public void assertTrueElementIsDisplayed(By locator){
        Assert.assertTrue(findElement(locator).isDisplayed());
    }

    public void assertTrueElementIsEnabled(By locator){
        Assert.assertTrue(findElement(locator).isEnabled());
    }

    public void assertTrueElementIsSelected(By locator){
        Assert.assertTrue(findElement(locator).isSelected());
    }

    public void assertTrueFindElementGetTextIsEmpty(By locator){
        Assert.assertTrue(findElement(locator).getText().isEmpty());
    }

    public void assertTrueFindElementGetAttributeContains(By locator, String Attribute, String AttributeValue){
        Assert.assertTrue(findElement(locator).getAttribute(Attribute).contains(AttributeValue));
    }
}
