package Pages.Widgets;

import Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectMenu extends Methods {

    public SelectMenu(WebDriver driver) {
        super(driver);
    }

//    SelectMenuLocators
    public static final By SelectValueField = By.xpath("(//div[@class=' css-1hwfws3'])[1]");
    public static final By SelectValueField_ARootOption = By.xpath("//div[text()='A root option']");

    public static final By SelectOneField = By.xpath("(//div[@class=' css-1hwfws3'])[2]");
    public static final By SelectOneField_MrOption = By.xpath("//div[text()='Mr.']");

    public static final By OldStyleSelectMenuField = By.xpath("//select[@id='oldSelectMenu']");
    public static final By OldStyleSelectMenu_AquaOption = By.xpath("//option[text()='Aqua']");

    public static final By MultiSelectDropDownField = By.xpath("(//div[@class=' css-1hwfws3'])[3]");
    public static final By MultiSelectDropDown_BlueOption = By.xpath("//div[text()='Blue']");
    public static final By MultiSelectDropDown_BlackOption = By.xpath("//div[text()='Black']");
    public static final By MultiSelectDropDown_BlackOptionDelete = By.xpath("(//div[@class='css-xb97g8'])[2]");

    public static final By StandartMultiSelect_Volvo = By.xpath("//option[@value='volvo']");
    public static final By StandartMultiSelect_Saab = By.xpath("//option[@value='saab']");
    public static final By StandartMultiSelect_Audi = By.xpath("//option[@value='audi']");

    public void selectValueField(By locator){
        visibleElementClick(locator);
    }

    public void selectValueField_ARootOption(By locator){
        visibleElementClick(locator);
    }

    public void assertSelectValueField(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void selectOneField(By locator){
        visibleElementClick(locator);
    }

    public void selectOneField_MrOption(By locator){
        visibleElementClick(locator);
    }

    public void assertSelectOneField(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void oldStyleSelectMenuField(By locator){
        visibleElementClick(locator);
    }

    public void oldStyleSelectMenu_AquaOption(By locator){
        visibleElementClick(locator);
    }

    public void assertOldStyleSelectMenuField(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void multiSelectDropDownField(By locator){
        visibleElementClick(locator);
    }

    public void multiSelectDropDown_BlueOption(By locator){
        visibleElementClick(locator);
    }

    public void multiSelectDropDown_BlackOption(By locator){
        visibleElementClick(locator);
    }

    public void multiSelectDropDown_BlackOptionDelete(By locator){
        visibleElementClick(locator);
    }

    public void assertMultiSelectDropDownField(String value, By locator){
        assertTrueFindElementGetTextContains(value, locator);
    }

    public void standartMultiSelect_VolvoClickAndHold(By locator){
        clickAndHold(locator);
    }

    public void moveToStandartMultiSelect_SaabAndRelease(By locator){
        moveToElementAndRelease(locator);
    }

    public void standartMultiSelect_AudiClickWithCtrl(By locator) {
        clickToElementWithCtrl(locator);
    }

    public void assertStandartMultiSelect_Volvo(By locator){
        assertTrueElementIsSelected(locator);
    }

    public void assertStandartMultiSelect_Saab(By locator){
        assertTrueElementIsSelected(locator);
    }

    public void assertStandartMultiSelect_Audi(By locator){
        assertTrueElementIsSelected(locator);
    }
}

