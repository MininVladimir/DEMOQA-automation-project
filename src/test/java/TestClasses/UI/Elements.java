package TestClasses.UI;

import Pages.Elements.*;
import Pages.MainPage.MainPage;
import Pages.SubMenues.SubMenues;
import io.qameta.allure.Allure;
import org.testng.annotations.Test;

import static Properties.DataProperties.*;

public class Elements extends BaseTest {

    private SubMenues subMenu;
    private TextBox textBox;
    private CheckBox checkBox;
    private RadioButton radioButton;
    private WebTables webTables;
    private Buttons buttons;
    private Links links;
    private BrokenLinksImages brokenLinksImages;
    private DynamicProperties dynamicProperties;

    @Test(description = "TextBox", priority = 1)
    public void textBox() {
        subMenu = mainPage.mainPageMenu1(MainPage.Elements);
        Allure.step("Клик по Elements");
        textBox = subMenu.elementsMenu1(SubMenues.TextBox);
        Allure.step("Клик по Text Box");
        textBox.inputName(TextBoxName, TextBox.InputName);
        Allure.step("Заполнение поля Full Name");
        textBox.userEmail(TextBoxEmail, TextBox.UserEmail);
        Allure.step("Заполнение поля Email");
        textBox.currentAddress(TextBoxCurrentAddress, TextBox.CurrentAddress);
        Allure.step("Заполнение поля Current Address");
        textBox.permanentAddress(TextBoxPermanentAddress, TextBox.PermanentAddress);
        Allure.step("Заполнение поля Permanent Address");
        textBox.submitButton(TextBox.SubmitButton);
        Allure.step("Нажатие кнопки Submit");
        textBox.assertTextBoxName(AssertTextBoxName, TextBox.AssertName);
        Allure.step("Проверка поля Full Name");
        textBox.assertTextBoxEmail(AssertTextBoxEmail, TextBox.AssertEmail);
        Allure.step("Проверка поля Email");
        textBox.assertTextBoxCurrentAddress(AssertTextBoxCurrentAddress, TextBox.AssertCurrentAddress);
        Allure.step("Проверка поля Current Address");
        textBox.assertPermanentAddress(AssertTextBoxPermanentAddress, TextBox.AssertPermanentAddress);
        Allure.step("Проверка поля Permanent Address");
    }

    @Test (description = "CheckBox", priority = 2)
    public void checkBox() {
        subMenu = mainPage.mainPageMenu1(MainPage.Elements);
        Allure.step("Клик по Elements");
        checkBox = subMenu.elementsMenu2(SubMenues.CheckBox);
        Allure.step("Клик по CheckBox");
        checkBox.toggleHome(CheckBox.ToggleHome);
        Allure.step("Раскрытие вкладки Home");
        checkBox.toggleDesktop(CheckBox.ToggleDesktop);
        Allure.step("Раскрытие вкладки Desktop");
        checkBox.notes(CheckBox.Notes);
        Allure.step("Чекбокс Notes");
        checkBox.commands(CheckBox.Commands);
        Allure.step("Чекбокс Commands");
        checkBox.toggleDocuments(CheckBox.ToggleDocuments);
        Allure.step("Раскрытие вкладки Documents");
        checkBox.toggleWorkspace(CheckBox.ToggleWorkspace);
        Allure.step("Раскрытие вкладки Workspace");
        checkBox.react(CheckBox.React);
        Allure.step("Чекбокс React");
        checkBox.angular(CheckBox.Angular);
        Allure.step("Чекбокс Angular");
        checkBox.veu(CheckBox.Veu);
        Allure.step("Чекбокс Veu");
        checkBox.toggleOffice(CheckBox.ToggleOffice);
        Allure.step("Раскрытие вкладки Office");
        checkBox.Public(CheckBox.Public);
        Allure.step("Чекбокс Public");
        checkBox.Private(CheckBox.Private);
        Allure.step("Чекбокс Private");
        checkBox.classified(CheckBox.Classified);
        Allure.step("Чекбокс Classified");
        checkBox.general(CheckBox.General);
        Allure.step("Чекбокс General");
        checkBox.toggleDownloads(CheckBox.ToggleDownloads);
        Allure.step("Раскрытие вкладки Downloads");
        checkBox.word(CheckBox.Word);
        Allure.step("Чекбокс Word");
        checkBox.excel(CheckBox.Excel);
        Allure.step("Чекбокс Excel");
        checkBox.resultField(ResultField, CheckBox.ResultField);
        checkBox.assertHome(AssertHome, CheckBox.AssertHome);
        Allure.step("Проверка выбранного элемента Home");
        checkBox.assertDesktop(AssertDesktop, CheckBox.AssertDesktop);
        Allure.step("Проверка выбранного элемента Desktop");
        checkBox.assertNotes(AssertNotes, CheckBox.AssertNotes);
        Allure.step("Проверка выбранного элемента Notes");
        checkBox.assertCommands(AssertCommands, CheckBox.AssertCommands);
        Allure.step("Проверка выбранного элемента Commands");
        checkBox.assertDocuments(AssertDocuments, CheckBox.AssertDocuments);
        Allure.step("Проверка выбранного элемента Documents");
        checkBox.assertWorkspace(AssertWorkspace, CheckBox.AssertWorkspace);
        Allure.step("Проверка выбранного элемента Workspace");
        checkBox.assertReact(AssertReact, CheckBox.AssertReact);
        Allure.step("Проверка выбранного элемента React");
        checkBox.assertAngular(AssertAngular, CheckBox.AssertAngular);
        Allure.step("Проверка выбранного элемента Angular");
        checkBox.assertVeu(AssertVeu, CheckBox.AssertVeu);
        Allure.step("Проверка выбранного элемента Veu");
        checkBox.assertOffice(AssertOffice, CheckBox.AssertOffice);
        Allure.step("Проверка выбранного элемента Office");
        checkBox.assertPUBLIC(AssertPublic, CheckBox.AssertPUBLIC);
        Allure.step("Проверка выбранного элемента PUBLIC");
        checkBox.assertPRIVATE(AssertPrivate, CheckBox.AssertPRIVATE);
        Allure.step("Проверка выбранного элемента PRIVATE");
        checkBox.assertClassified(AssertClassified, CheckBox.AssertClassified);
        Allure.step("Проверка выбранного элемента Classified");
        checkBox.assertGeneral(AssertGeneral, CheckBox.AssertGeneral);
        Allure.step("Проверка выбранного элемента General");
        checkBox.assertDownloads(AssertDownloads, CheckBox.AssertDownloads);
        Allure.step("Проверка выбранного элемента Downloads");
        checkBox.assertWordFile(AssertWordFile, CheckBox.AssertWordFile);
        Allure.step("Проверка выбранного элемента WordFile");
        checkBox.assertExcelFile(AssertExcelFile, CheckBox.AssertExcelFile);
        Allure.step("Проверка выбранного элемента ExcelFile");
    }

    @Test (description = "YesRadioButton", priority = 3)
    public void radioButton1() {
        subMenu = mainPage.mainPageMenu1(MainPage.Elements);
        Allure.step("Клик по Elements");
        radioButton = subMenu.elementsMenu3(SubMenues.RadioButton);
        Allure.step("Клик по Radio Button");
        radioButton.yesButton(RadioButton.YesButton);
        Allure.step("Выбор радиобатона Yes");
        radioButton.assertButton(AssertYesButton, RadioButton.AssertResult);
        Allure.step("Проверка выбора радиобатона Yes");
    }

    @Test (description = "ImpressiveRadioButton", priority = 4)
    public void radioButton2() {
        subMenu = mainPage.mainPageMenu1(MainPage.Elements);
        Allure.step("Клик по Elements");
        radioButton = subMenu.elementsMenu3(SubMenues.RadioButton);
        Allure.step("Клик по Radio Button");
        radioButton.impressiveButton(RadioButton.ImpressiveButton);
        Allure.step("Выбор радиобатона Impressive");
        radioButton.assertButton(AssertImpressiveButton, RadioButton.AssertResult);
        Allure.step("Проверка выбор радиобатона Impressive");
    }

    @Test (description = "WebTables", priority = 5)
    public void webTables() {
        subMenu = mainPage.mainPageMenu1(MainPage.Elements);
        Allure.step("Клик по Elements");
        webTables = subMenu.elementsMenu4(SubMenues.WebTables);
        Allure.step("Клик по Web Tables");
        webTables.addButton(WebTables.AddButton);
        Allure.step("Нажатие кнопки Add");
        webTables.registrationFormFirstName(WebTablesFirstName, WebTables.RegistrationFormFirstName);
        Allure.step("Заполнение поля FirstName");
        webTables.registrationFormLastName(WebTablesLastName, WebTables.RegistrationFormLastName);
        Allure.step("Заполнение поля LastName");
        webTables.registrationFormEmail(WebTablesEmail, WebTables.RegistrationFormEmail);
        Allure.step("Заполнение поля Email");
        webTables.registrationFormAge(WebTablesAge, WebTables.RegistrationFormAge);
        Allure.step("Заполнение поля Age");
        webTables.registrationFormSalary(WebTablesSalary, WebTables.RegistrationFormSalary);
        Allure.step("Заполнение поля Salary");
        webTables.registrationFormDepartment(WebTablesDepartment, WebTables.RegistrationFormDepartment);
        Allure.step("Заполнение поля Department");
        webTables.submitButton(WebTables.SubmitButton);
        Allure.step("Нажатие кнопки Submit");
        webTables.deleteRecord3(WebTables.DeleteRecord3);
        Allure.step("Удаление 3 записи таблицы");
        webTables.deleteRecord2(WebTables.DeleteRecord2);
        Allure.step("Удаление 2 записи таблицы");
        webTables.editRecord2(WebTables.EditRecord2);
        Allure.step("Изменение данных 2 записи таблицы");
        webTables.editRegistrationFormAge(EditRegistrationFormAge, WebTables.RegistrationFormAge);
        Allure.step("Изменение данных поля Age");
        webTables.submitButton(WebTables.SubmitButton);
        Allure.step("Нажатие кнопки Submit");
        webTables.search(WebTablesSearch, WebTables.Search);
        Allure.step("Нахождение инструмента таблицы Поиск");
        webTables.searchTextInput(WebTables.SearchTextInput);
        Allure.step("Нахождение текстового поля Поиск");
        webTables.Assert(AssertWebTables, WebTables.SearchTextInput);
        Allure.step("Проверка заданного результата поиска");
    }

    @Test (description = "DoubleClick", priority = 6)
    public void buttons1() {
        subMenu = mainPage.mainPageMenu1(MainPage.Elements);
        Allure.step("Клик по Elements");
        buttons = subMenu.elementsMenu5(SubMenues.Buttons);
        Allure.step("Клик по Buttons");
        buttons.doubleClick(Buttons.doubleClick);
        Allure.step("Двойной клик по кнопке Double Click Me");
        buttons.assertDoubleClick(AssertDoubleClick, Buttons.AssertLeftButtonDoubleClick);
        Allure.step("Проверка результата двойного клика");
    }

    @Test (description = "RightClick", priority = 7)
    public void buttons2() {
        subMenu = mainPage.mainPageMenu1(MainPage.Elements);
        Allure.step("Клик по Elements");
        buttons = subMenu.elementsMenu5(SubMenues.Buttons);
        Allure.step("Клик по Buttons");
        buttons.rightClick(Buttons.RightClick);
        Allure.step("ПКМ клик по кнопке Right Click Me");
        buttons.assertRightClick(AssertRightClick, Buttons.AssertRightClick);
        Allure.step("Проверка результата ПКМ клика");
    }

    @Test (description = "Click", priority = 8)
    public void buttons3() {
        subMenu = mainPage.mainPageMenu1(MainPage.Elements);
        Allure.step("Клик по Elements");
        buttons = subMenu.elementsMenu5(SubMenues.Buttons);
        Allure.step("Клик по Buttons");
        buttons.simpleClick(Buttons.Click);
        Allure.step("ЛКМ клик по кнопке Click Me");
        buttons.assertClick(AssertClick, Buttons.AssertClick);
        Allure.step("Проверка результата ЛКМ клика");
    }

    @Test (description = "NewTabsLinks", priority = 9)
    public void links1() {
        subMenu = mainPage.mainPageMenu1(MainPage.Elements);
        Allure.step("Клик по Elements");
        links = subMenu.elementsMenu6(SubMenues.Links);
        Allure.step("Клик по Links");
        links.homeLink(Links.HomeLink);
        Allure.step("Клик по ссылке HomeLink");
        links.dynamicNameLink(Links.DynamicNameLink);
        Allure.step("Клик по ссылке с динамичным именем");
        links.closeChildTabs();
        Allure.step("Закрытие всех вкладок");
    }

    @Test (description = "Links", priority = 10)
    public void links2() {
        subMenu = mainPage.mainPageMenu1(MainPage.Elements);
        Allure.step("Клик по Elements");
        links = subMenu.elementsMenu6(SubMenues.Links);
        Allure.step("Клик по Links");
        links.createdLink(Links.CreatedLink);
        Allure.step("Клик по ссылке Created");
        links.noContentLink(Links.NoContentLink);
        Allure.step("Клик по ссылке NoContent");
        links.movedLink(Links.MovedLink);
        Allure.step("Клик по ссылке Moved");
        links.badRequestLink(Links.BadRequestLink);
        Allure.step("Клик по ссылке BadRequest");
        links.unauthorizedLink(Links.UnauthorizedLink);
        Allure.step("Клик по ссылке Unauthorized");
        links.forbiddenLink(Links.ForbiddenLink);
        Allure.step("Клик по ссылке Forbidden");
        links.notFoundLink(Links.NotFoundLink);
        Allure.step("Клик по ссылке NotFound");
        links.assertNotFoundLink(AssertNotFoundLink, Links.ResponseResult);
        Allure.step("Проверка результата клика по ссылке NotFound");
    }

    @Test (description = "Click Here for Broken Link", priority = 11)
    public void brokenLinksImages() {
        subMenu = mainPage.mainPageMenu1(MainPage.Elements);
        Allure.step("Клик по Elements");
        brokenLinksImages = subMenu.elementsMenu7(SubMenues.BrokenLinksImages);
        Allure.step("Клик по Broken Links Images");
        brokenLinksImages.brokenLink(BrokenLinksImages.BrokenLink);
        Allure.step("Клик по ссылке Click Here for Broken Link");
        brokenLinksImages.assertErrorHead(AssertErrorHead, BrokenLinksImages.ErrorHead);
        Allure.step("Проверка заголовка открывшейся вкладки");
        brokenLinksImages.assertErrorDescription(AssertErrorDescription, BrokenLinksImages.ErrorDescription);
        Allure.step("Проверка тела открывшейся вкладки");
        brokenLinksImages.assertURL(AssertURL);
        Allure.step("Проверка URL открывшейся вкладки");
    }

    @Test (description = "This text has random Id", priority = 12)
    public void dynamicProperties1() {
        subMenu = mainPage.mainPageMenu1(MainPage.Elements);
        Allure.step("Клик по Elements");
        dynamicProperties = subMenu.elementsMenu9(SubMenues.DynamicProperties);
        Allure.step("Клик по DynamicProperties");
        dynamicProperties.randomTextField(DynamicProperties.RandomTextField);
        Allure.step("Нахождение элемента, содержащего текст This text has random Id");
        dynamicProperties.assertRandomTextField(AssertRandomTextField, DynamicProperties.RandomTextField);
        Allure.step("Проверка элемента, содержащего текст This text has random Id");
    }

    @Test (description = "Will Enable 5 sec", priority = 13)
    public void dynamicProperties2() {
        subMenu = mainPage.mainPageMenu1(MainPage.Elements);
        Allure.step("Клик по Elements");
        dynamicProperties = subMenu.elementsMenu9(SubMenues.DynamicProperties);
        Allure.step("Клик по DynamicProperties");
        dynamicProperties.buttonEnableAfter(DynamicProperties.ButtonEnableAfter);
        Allure.step("Ожидание пока кнопка Will Enable 5 sec станет кликабельной");
        dynamicProperties.assertButtonEnableAfter(DynamicProperties.ButtonEnableAfter);
        Allure.step("Проверка кнопки Will Enable 5 sec на кликабельность");
    }

    @Test (description = "Color Change", priority = 14)
    public void dynamicProperties3() {
        subMenu = mainPage.mainPageMenu1(MainPage.Elements);
        Allure.step("Клик по Elements");
        dynamicProperties = subMenu.elementsMenu9(SubMenues.DynamicProperties);
        Allure.step("Клик по DynamicProperties");
        dynamicProperties.buttonColorChange(DynamicProperties.ButtonColorChange);
        Allure.step("Ожидание пока кнопка Color Change поменяет цвет надписи");
        dynamicProperties.assertButtonColorChange(DynamicProperties.ButtonColorChangeResult);
        Allure.step("Проверка кнопки Color Change на смену цвета надписи");
    }

    @Test (description = "Visible After 5 sec", priority = 15)
    public void dynamicProperties4() {
        subMenu = mainPage.mainPageMenu1(MainPage.Elements);
        Allure.step("Клик по Elements");
        dynamicProperties = subMenu.elementsMenu9(SubMenues.DynamicProperties);
        Allure.step("Клик по DynamicProperties");
        dynamicProperties.buttonVisibleAfter(DynamicProperties.ButtonVisibleAfter);
        Allure.step("Ожидание пока кнопка Visible After 5 sec станет видимой");
        dynamicProperties.assertButtonVisibleAfter(DynamicProperties.ButtonVisibleAfter);
        Allure.step("Проверка кнопки Visible After 5 sec на видимость");
    }
}
