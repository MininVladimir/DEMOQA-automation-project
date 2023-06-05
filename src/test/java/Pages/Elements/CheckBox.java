package Pages.Elements;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox extends Methods {

    public CheckBox(WebDriver driver) {
        super(driver);
    }

//    CheckBoxLocators
    public static final By ExpandAll = By.xpath("//button[@title = 'Expand all']");
    public static final By CollapseAll = By.xpath("//button[@title = 'Collapse all']");

//    Home
    public static final By ToggleHome = By.xpath("(//button[@title='Toggle'])[1]");

//    Desktop
    public static final By ToggleDesktop = By.xpath("(//button[@title='Toggle'])[2]");
    public static final By Notes = By.xpath("//label[@for = 'tree-node-notes']");
    public static final By Commands = By.xpath("//label[@for = 'tree-node-commands']");

//    Documents
    public static final By ToggleDocuments = By.xpath("(//button[@title='Toggle'])[3]");

//    Workspace
    public static final By ToggleWorkspace = By.xpath("(//button[@title='Toggle'])[4]");
    public static final By React = By.xpath("//label[@for = 'tree-node-react']");
    public static final By Angular = By.xpath("//label[@for = 'tree-node-angular']");
    public static final By Veu = By.xpath("//label[@for = 'tree-node-veu']");

//    Office
    public static final By ToggleOffice = By.xpath("(//button[@title='Toggle'])[5]");
    public static final By Public = By.xpath("//label[@for = 'tree-node-public']");
    public static final By Private = By.xpath("//label[@for = 'tree-node-private']");
    public static final By Classified = By.xpath("//label[@for = 'tree-node-classified']");
    public static final By General = By.xpath("//label[@for = 'tree-node-general']");

//    Download
    public static final By ToggleDownloads = By.xpath("(//button[@title='Toggle'])[6]");
    public static final By Word = By.xpath("//label[@for = 'tree-node-wordFile']");
    public static final By Excel = By.xpath("//label[@for = 'tree-node-excelFile']");
    public static final By ResultField = By.id("result");

//    AssertLocators
    public static final By AssertHome = By.xpath("//span[@class = 'text-success'][1]");
    public static final By AssertDesktop = By.xpath("//span[@class = 'text-success'][2]");
    public static final By AssertNotes = By.xpath("//span[@class = 'text-success'][3]");
    public static final By AssertCommands = By.xpath("//span[@class = 'text-success'][4]");
    public static final By AssertDocuments = By.xpath("//span[@class = 'text-success'][5]");
    public static final By AssertWorkspace = By.xpath("//span[@class = 'text-success'][6]");
    public static final By AssertReact = By.xpath("//span[@class = 'text-success'][7]");
    public static final By AssertAngular = By.xpath("//span[@class = 'text-success'][8]");
    public static final By AssertVeu = By.xpath("//span[@class = 'text-success'][9]");
    public static final By AssertOffice = By.xpath("//span[@class = 'text-success'][10]");
    public static final By AssertPUBLIC = By.xpath("//span[@class = 'text-success'][11]");
    public static final By AssertPRIVATE = By.xpath("//span[@class = 'text-success'][12]");
    public static final By AssertClassified = By.xpath("//span[@class = 'text-success'][13]");
    public static final By AssertGeneral = By.xpath("//span[@class = 'text-success'][14]");
    public static final By AssertDownloads = By.xpath("//span[@class = 'text-success'][15]");
    public static final By AssertWordFile = By.xpath("//span[@class = 'text-success'][16]");
    public static final By AssertExcelFile = By.xpath("//span[@class = 'text-success'][17]");

    public void expandAll(By locator) {
        visibleElementClick(locator);
    }

    public void collapseAll(By locator) {
        visibleElementClick(locator);
    }

    public void toggleHome(By locator) {
        visibleElementClick(locator);
    }

    public void toggleDesktop(By locator) {
        visibleElementClick(locator);
    }

    public void notes(By locator) {
        visibleElementClick(locator);
    }

    public void commands(By locator) {
        visibleElementClick(locator);
    }

    public void toggleDocuments(By locator) {
        visibleElementClick(locator);
    }

    public void toggleWorkspace(By locator) {
        visibleElementClick(locator);
    }

    public void react(By locator) {
        visibleElementClick(locator);
    }

    public void angular(By locator) {
        visibleElementClick(locator);
    }

    public void veu(By locator) {
        visibleElementClick(locator);
    }

    public void toggleOffice(By locator) {
        visibleElementClick(locator);
    }

    public void Public(By locator) {
        visibleElementClick(locator);
    }

    public void Private(By locator) {
        visibleElementClick(locator);
    }

    public void classified(By locator) {
        visibleElementClick(locator);
    }

    public void general(By locator) {
        visibleElementClick(locator);
    }

    public void toggleDownloads(By locator) {
        visibleElementClick(locator);
    }

    public void word(By locator) {
        visibleElementClick(locator);
    }

    public void excel(By locator) {
        visibleElementClick(locator);
    }

    public void resultField(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertHome(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertDesktop(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertNotes(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertCommands(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertDocuments(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertWorkspace(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertReact(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertAngular(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertVeu(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertOffice(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertPUBLIC(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertPRIVATE(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertClassified(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertGeneral(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertDownloads(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertWordFile(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void assertExcelFile(String value, By locator) {
        waitElementIsVisible(locator);
        assertTrueFindElementGetTextContains(value, locator);
    }
}
