package TestClasses.UI;

import Pages.MainPage.MainPage;
import Pages.SubMenues.SubMenues;
import io.qameta.allure.Allure;
import org.testng.annotations.Test;

import static Properties.DataProperties.*;

public class PractiseForm extends BaseTest {

    private SubMenues subMenu;
    private Pages.Forms.PractiseForm practiseForm;

    @Test(description = "PractiseForm", priority = 16)
    public void practiseForm() {
        subMenu = mainPage.mainPageMenu2(MainPage.Forms);
        Allure.step("Клик по Forms");
        practiseForm = subMenu.practiseFormMenu1(SubMenues.PractiseForm);
        Allure.step("Клик по Practise Form");
        practiseForm.firstName(PractiseFormFirstName, Pages.Forms.PractiseForm.FirstName);
        Allure.step("Заполнение поля FirstName");
        practiseForm.lastName(PractiseFormLastName, Pages.Forms.PractiseForm.LastName);
        Allure.step("Заполнение поля LastName");
        practiseForm.email(PractiseFormEmail, Pages.Forms.PractiseForm.Email);
        Allure.step("Заполнение поля Email");
        practiseForm.male(Pages.Forms.PractiseForm.Male);
        Allure.step("Выбор радиобатона Male");
        practiseForm.mobile(PractiseFormMobile, Pages.Forms.PractiseForm.Mobile);
        Allure.step("Заполнение поля Mobile");
        practiseForm.dateOfBirthField(Pages.Forms.PractiseForm.DateOfBirthField);
        Allure.step("Клик по полю Date Of Birth");
        practiseForm.MonthDropDown(Pages.Forms.PractiseForm.MonthDropDown);
        Allure.step("Клик по полю дропдауна выбора месяца");
        practiseForm.monthJuneOpt(Pages.Forms.PractiseForm.MonthJuneOpt);
        Allure.step("Клик по июню");
        practiseForm.yearDropDown(Pages.Forms.PractiseForm.YearDropDown);
        Allure.step("Клик по полю дропдауна выбора года");
        practiseForm.year1996(Pages.Forms.PractiseForm.Year1996);
        Allure.step("Клик по 1996 году");
        practiseForm.day6(Pages.Forms.PractiseForm.Day6);
        Allure.step("Клик по 6 числу");
        practiseForm.subjectsField(Pages.Forms.PractiseForm.SubjectsField);
        Allure.step("Клик по полю Subjects");
        practiseForm.subjects(PractiseFormSubjects, Pages.Forms.PractiseForm.Subjects);
        Allure.step("Ввод буквы m в поле Subjects");
        practiseForm.maths(Pages.Forms.PractiseForm.Maths);
        Allure.step("Клик по варианту Maths");
        practiseForm.sports(Pages.Forms.PractiseForm.Sports);
        Allure.step("Клик чекбокс Sports");
        practiseForm.reading(Pages.Forms.PractiseForm.Reading);
        Allure.step("Клик чекбокс Reading");
        practiseForm.music(Pages.Forms.PractiseForm.Music);
        Allure.step("Клик чекбокс Music");
        practiseForm.currentAddress(PractiseFormCurrentAddress, Pages.Forms.PractiseForm.CurrentAddress);
        Allure.step("Заполнение поля CurrentAddress");
        practiseForm.state(Pages.Forms.PractiseForm.State);
        Allure.step("Клик по полю дропдауна Select State");
        practiseForm.NCR(Pages.Forms.PractiseForm.NCR);
        Allure.step("Клик по варианту NCR");
        practiseForm.city(Pages.Forms.PractiseForm.City);
        Allure.step("Клик по полю дропдауна Select City");
        practiseForm.delhi(Pages.Forms.PractiseForm.Delhi);
        Allure.step("Клик по варианту Delhi");
        practiseForm.submit(Pages.Forms.PractiseForm.Submit);
        Allure.step("Клик по кнопке Submit");
        practiseForm.assertStudentNameLabel(AssertStudentNameLabel, Pages.Forms.PractiseForm.StudentNameLabel);
        Allure.step("Проверка названия строки StudentName");
        practiseForm.assertStudentNameValue(AssertStudentNameValue, Pages.Forms.PractiseForm.StudentNameValue);
        Allure.step("Проверка значения строки StudentName");
        practiseForm.assertStudentEmailLabel(AssertStudentEmailLabel, Pages.Forms.PractiseForm.StudentEmailLabel);
        Allure.step("Проверка названия строки StudentEmail");
        practiseForm.assertStudentEmailValue(AssertStudentEmailValue, Pages.Forms.PractiseForm.StudentEmailValue);
        Allure.step("Проверка значения строки StudentEmail");
        practiseForm.assertGenderLabel(AssertGenderLabel, Pages.Forms.PractiseForm.GenderLabel);
        Allure.step("Проверка названия строки Gender");
        practiseForm.assertGenderValue(AssertGenderValue, Pages.Forms.PractiseForm.GenderValue);
        Allure.step("Проверка значения строки Gender");
        practiseForm.assertMobileLabel(AssertMobileLabel, Pages.Forms.PractiseForm.MobileLabel);
        Allure.step("Проверка названия строки Mobile");
        practiseForm.assertMobileValue(AssertMobileValue, Pages.Forms.PractiseForm.MobileValue);
        Allure.step("Проверка значения строки Mobile");
        practiseForm.assertDateOfBirthLabel(AssertDateOfBirthLabel, Pages.Forms.PractiseForm.DateOfBirthLabel);
        Allure.step("Проверка названия строки DateOfBirth");
        practiseForm.assertDateOfBirthValue(AssertDateOfBirthValue, Pages.Forms.PractiseForm.DateOfBirthValue);
        Allure.step("Проверка значение строки DateOfBirth");
        practiseForm.assertSubjectsLabel(AssertSubjectsLabel, Pages.Forms.PractiseForm.SubjectsLabel);
        Allure.step("Проверка названия строки Subjects");
        practiseForm.assertSubjectsValue(AssertSubjectsValue, Pages.Forms.PractiseForm.SubjectsValue);
        Allure.step("Проверка значения строки Subjects");
        practiseForm.assertHobbiesLabel(AssertHobbiesLabel, Pages.Forms.PractiseForm.HobbiesLabel);
        Allure.step("Проверка названия строки Hobbies");
        practiseForm.assertHobbiesValue(AssertHobbiesValue, Pages.Forms.PractiseForm.HobbiesValue);
        Allure.step("Проверка значения строки Hobbies");
        practiseForm.assertPictureLabel(AssertPictureLabel, Pages.Forms.PractiseForm.PictureLabel);
        Allure.step("Проверка названия строки Picture");
        practiseForm.assertPictureValue(Pages.Forms.PractiseForm.PictureValue);
        Allure.step("Проверка пустого значения строки Picture");
        practiseForm.assertAddressLabel(AssertAddressLabel, Pages.Forms.PractiseForm.AddressLabel);
        Allure.step("Проверка названия строки Address");
        practiseForm.assertAddressValue(AssertAddressValue, Pages.Forms.PractiseForm.AddressValue);
        Allure.step("Проверка значения строки Address");
        practiseForm.assertStateAndCityLabel(AssertStateAndCityLabel, Pages.Forms.PractiseForm.StateAndCityLabel);
        Allure.step("Проверка названия строки StateAndCity");
        practiseForm.assertStateAndCityValue(AssertStateAndCityValue, Pages.Forms.PractiseForm.StateAndCityValue);
        Allure.step("Проверка значения строки StateAndCity");
    }
}
