package TestClasses;

import MainPage.MainPage;
import Pages.Widgets.*;
import SubMenues.SubMenues;
import io.qameta.allure.Allure;
import org.testng.annotations.Test;

import static Properties.DataProperties.*;

public class Widgets extends BaseTest {

    private SubMenues subMenu;
    private Accordian accordian;
    private AutoComplete autoComplete;
    private DatePicker datePicker;
    private Slider slider;
    private ProgressBar progressBar;
    private Tabs tabs;
    private ToolTips toolTips;
    private Menu menu;
    private SelectMenu selectMenu;

    @Test(description = "Блок What is Lorem Ipsum", priority = 30)
    public void accordian1() {
        subMenu = mainPage.mainPageMenu4(MainPage.Widgets);
        Allure.step("Клик по Widgets");
        accordian = subMenu.widgetsMenu1(SubMenues.Accordian);
        Allure.step("Клик по Accordian");
        accordian.accordian1(Accordian.Accordian1);
        Allure.step("Скрол на блок What is Lorem Ipsum?");
        accordian.assertAccordian1Name(AssertAccordian1Name, Accordian.Accordian1);
        Allure.step("Проверка названия блока What is Lorem Ipsum?");
        accordian.assertAccordian1Text(AssertAccordian1Text, Accordian.Text1);
        Allure.step("Проверка содержимого блока What is Lorem Ipsum?");
    }

    @Test(description = "Блок Where does it come from?", priority = 31)
    public void accordian2() {
        subMenu = mainPage.mainPageMenu4(MainPage.Widgets);
        Allure.step("Клик по Widgets");
        accordian = subMenu.widgetsMenu1(SubMenues.Accordian);
        Allure.step("Клик по Accordian");
        accordian.accordian2(Accordian.Accordian2);
        Allure.step("Клик по блоку Where does it come from? и его раскрытие");
        accordian.assertAccordian2Name(AssertAccordian2Name, Accordian.Accordian2);
        Allure.step("Проверка названия блока Where does it come from?");
        accordian.assertAccordian2_1Text(AssertAccordian2_1Text, Accordian.Text2_1);
        Allure.step("Проверка содержимого блока Where does it come from?");
        accordian.assertAccordian2_2Text(AssertAccordian2_2Text, Accordian.Text2_2);
        Allure.step("Проверка содержимого блока Where does it come from?");
    }

    @Test(description = "Блок Why do we use it?", priority = 32)
    public void accordian3() {
        subMenu = mainPage.mainPageMenu4(MainPage.Widgets);
        Allure.step("Клик по Widgets");
        accordian = subMenu.widgetsMenu1(SubMenues.Accordian);
        Allure.step("Клик по Accordian");
        accordian.accordian3(Accordian.Accordian3);
        Allure.step("Клик по блоку Why do we use it? и его раскрытие");
        accordian.assertAccordian3Name(AssertAccordian3Name, Accordian.Accordian3);
        Allure.step("Проверка названия блока Why do we use it?");
        accordian.assertAccordian3Text(AssertAccordian3Text, Accordian.Text3);
        Allure.step("Проверка содержимого блока Why do we use it?");
    }

    @Test(description = "Type multiple color names", priority = 33)
    public void autoComplete1() {
        subMenu = mainPage.mainPageMenu4(MainPage.Widgets);
        Allure.step("Клик по Widgets");
        autoComplete = subMenu.widgetsMenu2(SubMenues.Autocomplete);
        Allure.step("Клик по AutoComplete");
        autoComplete.multipleColorNamesField(AutoComplete.MultipleColorNamesField);
        Allure.step("Скрол к текстовому полю Type multiple color names");
        autoComplete.multipleColorNameInputClick(AutoComplete.MultipleColorNameInput);
        Allure.step("Клик по текстовому полю Type multiple color names");
        autoComplete.multipleColorNameInputWhite(AutoCompleteWhite, AutoComplete.MultipleColorNameInput);
        Allure.step("Ввод в текстовое поле Type multiple color names значения w");
        autoComplete.elementWhite(AutoComplete.White);
        Allure.step("Клик по элементу White");
        autoComplete.multipleColorNameInputBlue(AutoCompleteBlue, AutoComplete.MultipleColorNameInput);
        Allure.step("Ввод в текстовое поле Type multiple color names значения b");
        autoComplete.elementBlue(AutoComplete.Blue);
        Allure.step("Клик по элементу Blue");
        autoComplete.multipleColorNameInputRed(AutoCompleteRed, AutoComplete.MultipleColorNameInput);
        Allure.step("Ввод в текстовое поле Type multiple color names значения r");
        autoComplete.elementRed(AutoComplete.Red);
        Allure.step("Клик по элементу Red");
        autoComplete.assertWhite(AssertWhite, AutoComplete.AssertWhite);
        Allure.step("Проверка текстового поля Type multiple color names на наличие элемента White");
        autoComplete.assertBlue(AssertBlue, AutoComplete.AssertBlue);
        Allure.step("Проверка текстового поля Type multiple color names на наличие элемента Blue");
        autoComplete.assertRed(AssertRed, AutoComplete.AssertRed);
        Allure.step("Проверка текстового поля Type multiple color names на наличие элемента Red");
    }

    @Test(description = "Type single color name", priority = 34)
    public void autoComplete2() {
        subMenu = mainPage.mainPageMenu4(MainPage.Widgets);
        Allure.step("Клик по Widgets");
        autoComplete = subMenu.widgetsMenu2(SubMenues.Autocomplete);
        Allure.step("Клик по AutoComplete");
        autoComplete.singleColorNameField(AutoComplete.SingleColorNameField);
        Allure.step("Скрол к текстовому полю Type single color name");
        autoComplete.singleColorNameInputClick(AutoComplete.SingleColorNameInput);
        Allure.step("Клик по текстовому полю Type single color name");
        autoComplete.singleColorNameBlack(AutoCompleteBlack, AutoComplete.SingleColorNameInput);
        Allure.step("Ввод в текстовое поле Type single color name значения b");
        autoComplete.elementBlack(AutoComplete.Black);
        Allure.step("Клик по элементу Black");
        autoComplete.assertBlack(AssertBlack, AutoComplete.AssertBlack);
        Allure.step("Проверка текстового поля Type single color name на наличие элемента Black");
    }

    @Test(description = "DatePicker", priority = 35)
    public void datePicker() {
        subMenu = mainPage.mainPageMenu4(MainPage.Widgets);
        Allure.step("Клик по Widgets");
        datePicker = subMenu.widgetsMenu3(SubMenues.DatePicker);
        Allure.step("Клик по DatePicker");
        datePicker.dateAndTimeField(DatePicker.DateAndTimeField);
        Allure.step("Скрол к текстовому полю Date And Time и его очистка");
        datePicker.monthDropDown(DatePicker.MonthDropDown);
        Allure.step("Клик по элементу MonthDropDown");
        datePicker.september(DatePicker.September);
        Allure.step("Клик по элементу September");
        datePicker.yearDropDown(DatePicker.YearDropDown);
        Allure.step("Клик по элементу YearDropDown");
        datePicker.find2007(DatePicker.YearDropDownButtonDown, DatePicker.Year2007, Find2007);
        Allure.step("Поиск элемента 2007 и клик по нему");
        datePicker.day11(DatePicker.Day11);
        Allure.step("Клик по элементу 11");
        datePicker.time1715(DatePicker.Time1715);
        Allure.step("Клик по элементу 17:15");
        datePicker.assertDate(DatePicker.DateAndTimeField, AssertDatePickerAttribute, AssertDatePickerAttributeValue);
        Allure.step("Проверка содержимого текстового поля Date And Time");
    }

    @Test(description = "Slider", priority = 36)
    public void slider() {
        subMenu = mainPage.mainPageMenu4(MainPage.Widgets);
        Allure.step("Клик по Widgets");
        slider = subMenu.widgetsMenu4(SubMenues.Slider);
        Allure.step("Клик по Slider");
        slider.dragAndDropSlider(Slider.Slider, xOffsetSlider, yOffsetSlider);
        Allure.step("Скрол к Slider и перетаскивание ползунка на значение 0");
        slider.assertSlider(Slider.Slider, AssertSliderAttribute, AssertSliderAttributeValue);
        Allure.step("Проверка значения поля положения ползунка");
    }

    @Test(description = "ProgressBar", priority = 37)
    public void progressBar() {
        subMenu = mainPage.mainPageMenu4(MainPage.Widgets);
        Allure.step("Клик по Widgets");
        progressBar = subMenu.widgetsMenu5(SubMenues.ProgressBar);
        Allure.step("Клик по ProgressBar");
        progressBar.pressStart(ProgressBar.StartStopButton);
        Allure.step("Скрол к ProgressBar и нажатие кнопки Start");
        progressBar.pressStop(ProgressBarAttribute, ProgressBarStatus, ProgressBar.ProgressBar, ProgressBar.StartStopButton);
        Allure.step("Нажатие кнопки Stop");
        progressBar.assertProgressBar(ProgressBar.ProgressBar, ProgressBarAttribute, ProgressBarStatus);
        Allure.step("Проверка значения ProgressBar");
    }

    @Test(description = "What", priority = 38)
    public void tabs1() {
        subMenu = mainPage.mainPageMenu4(MainPage.Widgets);
        Allure.step("Клик по Widgets");
        tabs = subMenu.widgetsMenu6(SubMenues.Tabs);
        Allure.step("Клик по Tabs");
        tabs.tabWhat(Tabs.TabWhat);
        Allure.step("Скрол к вкладке What");
        tabs.assertTabWhat(AssertTabWhat, Tabs.AssertTabWhat);
        Allure.step("Проверка содержимого вкладки What");
    }

    @Test(description = "Origin", priority = 39)
    public void tab2() {
        subMenu = mainPage.mainPageMenu4(MainPage.Widgets);
        Allure.step("Клик по Widgets");
        tabs = subMenu.widgetsMenu6(SubMenues.Tabs);
        Allure.step("Клик по Tabs");
        tabs.tabOrigin(Tabs.TabOrigin);
        Allure.step("Скрол к вкладке Origin и клик по ней");
        tabs.assertTabOrigin_1(AssertTabOrigin_1, Tabs.AssertTabOrigin_1);
        Allure.step("Проверка содержимого вкладки Origin");
        tabs.assertTabOrigin_2(AssertTabOrigin_2, Tabs.AssertTabOrigin_2);
        Allure.step("Проверка содержимого вкладки Origin");
    }

    @Test(description = "Use", priority = 40)
    public void tabs3() {
        subMenu = mainPage.mainPageMenu4(MainPage.Widgets);
        Allure.step("Клик по Widgets");
        tabs = subMenu.widgetsMenu6(SubMenues.Tabs);
        Allure.step("Клик по Tabs");
        tabs.tabUse(Tabs.TabUse);
        Allure.step("Скрол к вкладке Use и клик по ней");
        tabs.assertTabUse(AssertTabUse, Tabs.AssertTabUse);
        Allure.step("Проверка содержимого вкладки Use");
    }

    @Test(description = "ToolTips1", priority = 41)
    public void toolTips1() {
        subMenu = mainPage.mainPageMenu4(MainPage.Widgets);
        Allure.step("Клик по Widgets");
        toolTips = subMenu.widgetsMenu7(SubMenues.Tooltips);
        Allure.step("Клик по ToolTips");
        toolTips.buttonHover(ToolTips.Button);
        Allure.step("Скрол к кнопке Hover me to see и наведение на нее курсора");
        toolTips.assertButtonTooltip(AssertButtonTooltip, ToolTips.ButtonTooltip);
        Allure.step("Проверка содержимого всплывающей подсказки");
    }

    @Test(description = "ToolTips2", priority = 42)
    public void toolTips2() {
        subMenu = mainPage.mainPageMenu4(MainPage.Widgets);
        Allure.step("Клик по Widgets");
        toolTips = subMenu.widgetsMenu7(SubMenues.Tooltips);
        Allure.step("Клик по ToolTips");
        toolTips.textFieldHover(ToolTips.TextField);
        Allure.step("Скрол к текстовому полю и наведение на него курсора");
        toolTips.assertTextFieldTooltip(AssertTextFieldTooltip, ToolTips.TextFieldTooltip);
        Allure.step("Проверка содержимого всплывающей подсказки");
    }

    @Test(description = "ToolTips3", priority = 43)
    public void toolTips3() {
        subMenu = mainPage.mainPageMenu4(MainPage.Widgets);
        Allure.step("Клик по Widgets");
        toolTips = subMenu.widgetsMenu7(SubMenues.Tooltips);
        Allure.step("Клик по ToolTips");
        toolTips.linkContraryHover(ToolTips.LinkContrary);
        Allure.step("Скрол к ссылке Contrary и наведение на нее курсора");
        toolTips.assertLinkContraryTooltip(AssertLinkContraryTooltip, ToolTips.LinkContraryTooltip);
        Allure.step("Проверка содержимого всплывающей подсказки");
    }

    @Test(description = "ToolTips4", priority = 44)
    public void toolTips4() {
        subMenu = mainPage.mainPageMenu4(MainPage.Widgets);
        Allure.step("Клик по Widgets");
        toolTips = subMenu.widgetsMenu7(SubMenues.Tooltips);
        Allure.step("Клик по ToolTips");
        toolTips.link1_30_32Hover(ToolTips.Link1_30_32);
        Allure.step("Скрол к ссылке 1.30.32 и наведение на нее курсора");
        toolTips.assertLink1_30_32Tooltip(AssertLink1_30_32Tooltip, ToolTips.Link1_30_32Tooltip);
        Allure.step("Проверка содержимого всплывающей подсказки");
    }

    @Test(description = "Menu", priority = 45)
    public void menu() {
        subMenu = mainPage.mainPageMenu4(MainPage.Widgets);
        Allure.step("Клик по Widgets");
        menu = subMenu.widgetsMenu8(SubMenues.Menu);
        Allure.step("Клик по Menu");
        menu.mainItem2Hover(Menu.MainItem2);
        Allure.step("Скрол к панели меню и наведение на MainItem2 курсора");
        menu.subSubListHover(Menu.SubSubList);
        Allure.step("Наведение на SubSubList курсора");
        menu.subSubItem2Hover(Menu.SubSubItem2);
        Allure.step("Наведение на SubSubItem2 курсора");
        menu.assertSubSubItem2(Menu.SubSubItem2);
        Allure.step("Проверка отображения SubSubItem2");
    }

    @Test(description = "SelectMenu1", priority = 46)
    public void selectMenu1() {
        subMenu = mainPage.mainPageMenu4(MainPage.Widgets);
        Allure.step("Клик по Widgets");
        selectMenu = subMenu.widgetsMenu9(SubMenues.SelectMenu);
        Allure.step("Клик по SelectMenu");
        selectMenu.selectValueField(SelectMenu.SelectValueField);
        Allure.step("Скрол к полю SelectValue и клик по нему");
        selectMenu.selectValueField_ARootOption(SelectMenu.SelectValueField_ARootOption);
        Allure.step("Клик по ARootOption");
        selectMenu.assertSelectValueField(AssertSelectValueField, SelectMenu.SelectValueField);
        Allure.step("Проверка содержимого поля SelectValue");
    }

    @Test(description = "SelectMenu2", priority = 47)
    public void selectMenu2() {
        subMenu = mainPage.mainPageMenu4(MainPage.Widgets);
        Allure.step("Клик по Widgets");
        selectMenu = subMenu.widgetsMenu9(SubMenues.SelectMenu);
        Allure.step("Клик по SelectMenu");
        selectMenu.selectOneField(SelectMenu.SelectOneField);
        Allure.step("Скрол к полю SelectOne и клик по нему");
        selectMenu.selectOneField_MrOption(SelectMenu.SelectOneField_MrOption);
        Allure.step("Клик по Mr.");
        selectMenu.assertSelectOneField(AssertSelectOneField, SelectMenu.SelectOneField);
        Allure.step("Проверка содержимого поля SelectOne");
    }

    @Test(description = "SelectMenu3", priority = 48)
    public void selectMenu3() {
        subMenu = mainPage.mainPageMenu4(MainPage.Widgets);
        Allure.step("Клик по Widgets");
        selectMenu = subMenu.widgetsMenu9(SubMenues.SelectMenu);
        Allure.step("Клик по SelectMenu");
        selectMenu.oldStyleSelectMenuField(SelectMenu.OldStyleSelectMenuField);
        Allure.step("Скрол к полю OldStyleSelectMenu и клик по нему");
        selectMenu.oldStyleSelectMenu_AquaOption(SelectMenu.OldStyleSelectMenu_AquaOption);
        Allure.step("Клик по Aqua");
        selectMenu.assertOldStyleSelectMenuField(AssertOldStyleSelectMenuField, SelectMenu.OldStyleSelectMenuField);
        Allure.step("Проверка содержимого поля OldStyleSelectMenu");
    }

    @Test(description = "SelectMenu4", priority = 49)
    public void selectMenu4() {
        subMenu = mainPage.mainPageMenu4(MainPage.Widgets);
        Allure.step("Клик по Widgets");
        selectMenu = subMenu.widgetsMenu9(SubMenues.SelectMenu);
        Allure.step("Клик по SelectMenu");
        selectMenu.multiSelectDropDownField(SelectMenu.MultiSelectDropDownField);
        Allure.step("Скрол к полю MultiSelectDropDown и клик по нему");
        selectMenu.multiSelectDropDown_BlueOption(SelectMenu.MultiSelectDropDown_BlueOption);
        Allure.step("Клик по Blue");
        selectMenu.multiSelectDropDown_BlackOption(SelectMenu.MultiSelectDropDown_BlackOption);
        Allure.step("Клик по Black");
        selectMenu.multiSelectDropDown_BlackOptionDelete(SelectMenu.MultiSelectDropDown_BlackOptionDelete);
        Allure.step("Удаление Black");
        selectMenu.multiSelectDropDownField(SelectMenu.MultiSelectDropDownField);
        Allure.step("Клик по полю MultiSelectDropDown");
        selectMenu.assertMultiSelectDropDownField(AssertMultiSelectDropDown_BlueOption, SelectMenu.MultiSelectDropDownField);
        Allure.step("Проверка содержимого поля MultiSelectDropDown");
    }

    @Test(description = "SelectMenu5", priority = 50)
    public void selectMenu5() {
        subMenu = mainPage.mainPageMenu4(MainPage.Widgets);
        Allure.step("Клик по Widgets");
        selectMenu = subMenu.widgetsMenu9(SubMenues.SelectMenu);
        Allure.step("Клик по SelectMenu");
        selectMenu.standardMultiSelect(SelectMenu.StandartMultiSelect);
        Allure.step("Скрол к полю StandartMultiSelect");
        selectMenu.standartMultiSelect_VolvoClickAndHoldMoveToSaabAndRelease(SelectMenu.StandartMultiSelect_Volvo, SelectMenu.StandartMultiSelect_Saab);
        Allure.step("Выбор Volvo и Saab(зажимание ЛКМ мыши)");
        selectMenu.standartMultiSelect_AudiClickWithCtrl(SelectMenu.StandartMultiSelect_Audi);
        Allure.step("Клик по Audi с зажатым Ctrl");
        selectMenu.assertStandartMultiSelect_Volvo(SelectMenu.StandartMultiSelect_Volvo);
        Allure.step("Проверка на то, что выбран Volvo");
        selectMenu.assertStandartMultiSelect_Saab(SelectMenu.StandartMultiSelect_Saab);
        Allure.step("Проверка на то, что выбран Saab");
        selectMenu.assertStandartMultiSelect_Audi(SelectMenu.StandartMultiSelect_Audi);
        Allure.step("Проверка на то, что выбран Audi");
    }
}
