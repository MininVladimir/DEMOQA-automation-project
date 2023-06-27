package TestClasses.UI;

import Pages.MainPage.MainPage;
import Pages.SubMenues.SubMenues;
import io.qameta.allure.Allure;
import org.testng.annotations.Test;

import static Properties.DataProperties.*;

public class BookStoreApplication extends BaseTest {

    private SubMenues subMenu;
    private Pages.BookStoreApplication.BookStoreApplication bookStoreApplication;

    @Test(description = "Registration and delete account", enabled = false)
    public void registrationAndDeleteAccount() {
        subMenu = mainPage.mainPageMenu6(MainPage.BookStoreApplication);
        Allure.step("Клик по Book Store Application");
        bookStoreApplication = subMenu.bookStoreApplicationMenu1(SubMenues.Login);
        Allure.step("Клик по вкладке Login");
        bookStoreApplication.newUser(Pages.BookStoreApplication.BookStoreApplication.NewUser);
        Allure.step("Скрол до кнопки New User и клик по ней");
        bookStoreApplication.firstName(RegistrationFirstName, Pages.BookStoreApplication.BookStoreApplication.FirstName);
        Allure.step("Заполнение поля FirstName");
        bookStoreApplication.lastName(RegistrationLastName, Pages.BookStoreApplication.BookStoreApplication.LastName);
        Allure.step("Заполнение поля LastName");
        bookStoreApplication.userName(RegistrationUserName, Pages.BookStoreApplication.BookStoreApplication.UserName);
        Allure.step("Заполнение поля UserName");
        bookStoreApplication.password(RegistrationPassword, Pages.BookStoreApplication.BookStoreApplication.Password);
        Allure.step("Заполнение поля Password");
        bookStoreApplication.switchToCaptchaFrame(Pages.BookStoreApplication.BookStoreApplication.CaptchaFrame);
        Allure.step("Переключение драйвера на фрейм капчи");
        bookStoreApplication.iAmNotARobot(Pages.BookStoreApplication.BookStoreApplication.IAmNotARobot);
        Allure.step("Клик по чекбоксу I'm not a robot и 30 секундное ожидаение разгадывания пользователем капчи");
        bookStoreApplication.registerClick(Pages.BookStoreApplication.BookStoreApplication.Register);
        Allure.step("Клик по кнопке Register");
        bookStoreApplication.assertSuccessfullyRegister(SuccessfulRegister);
        Allure.step("Проверка результата регистрации нового аккаунта и клик по кнопке ОК алерта");
        subMenu.bookStoreApplicationMenu1(SubMenues.Login);
        Allure.step("Клик по вкладке Login");
        bookStoreApplication.userNameFieldFill(RegistrationUserName, Pages.BookStoreApplication.BookStoreApplication.UserNameField);
        Allure.step("Заполнение поля UserName");
        bookStoreApplication.passwordFieldFill(RegistrationPassword, Pages.BookStoreApplication.BookStoreApplication.PasswordField);
        Allure.step("Заполнение поля Password");
        bookStoreApplication.loginClick(Pages.BookStoreApplication.BookStoreApplication.Login);
        Allure.step("Клик по кнопке Login");
        bookStoreApplication.searchIsVisible(Pages.BookStoreApplication.BookStoreApplication.Search);
        Allure.step("Скрол до элемента Search");
        bookStoreApplication.deleteAccountClick(Pages.BookStoreApplication.BookStoreApplication.DeleteAccount);
        Allure.step("Клик по кнопке Delete Account");
        bookStoreApplication.confirmDeleteAccount(Pages.BookStoreApplication.BookStoreApplication.ConfirmDeleteAccount);
        Allure.step("Подтверждение удаления аккаунта(в модальном окне клик по кнопке ОК)");
        bookStoreApplication.assertDeleteAccount(SuccessfulDeleteUser);
        Allure.step("Проверка результата удаления аккаунта и клик по кнопке ОК алерта");
    }

    @Test(description = "LogOut", priority = 66)
    public void logout() {
        subMenu = mainPage.mainPageMenu6(MainPage.BookStoreApplication);
        Allure.step("Клик по Book Store Application");
        bookStoreApplication = subMenu.bookStoreApplicationMenu1(SubMenues.Login);
        Allure.step("Клик по вкладке Login");
        bookStoreApplication.userNameFieldFill(UserName, Pages.BookStoreApplication.BookStoreApplication.UserNameField);
        Allure.step("Заполнение поля UserName");
        bookStoreApplication.passwordFieldFill(Password, Pages.BookStoreApplication.BookStoreApplication.PasswordField);
        Allure.step("Заполнение поля Password");
        bookStoreApplication.loginClick(Pages.BookStoreApplication.BookStoreApplication.Login);
        Allure.step("Клик по кнопке Login");
        bookStoreApplication.logOutClick(Pages.BookStoreApplication.BookStoreApplication.LogOut);
        Allure.step("Клик по кнопке LogOut");
        bookStoreApplication.assertLogout(AssertLogOut);
        Allure.step("Проверка результата LogOut");
    }

    @Test(description = "Go To Book Store", priority = 67)
    public void goToBookStore(){
        subMenu = mainPage.mainPageMenu6(MainPage.BookStoreApplication);
        Allure.step("Клик по Book Store Application");
        bookStoreApplication = subMenu.bookStoreApplicationMenu1(SubMenues.Login);
        Allure.step("Клик по вкладке Login");
        bookStoreApplication.userNameFieldFill(UserName, Pages.BookStoreApplication.BookStoreApplication.UserNameField);
        Allure.step("Заполнение поля UserName");
        bookStoreApplication.passwordFieldFill(Password, Pages.BookStoreApplication.BookStoreApplication.PasswordField);
        Allure.step("Заполнение поля Password");
        bookStoreApplication.loginClick(Pages.BookStoreApplication.BookStoreApplication.Login);
        Allure.step("Клик по кнопке Login");
        bookStoreApplication.goToBookStoreClick(Pages.BookStoreApplication.BookStoreApplication.GoToBookStore);
        Allure.step("Клик по кнопке GoToBookStore");
        bookStoreApplication.assertGoBookStore(AssertGotoBookStore);
        Allure.step("Проверка результата GoBookStore");
    }

    @Test(description = "SearchBooks", priority = 68)
    public void searchBooks() {
        subMenu = mainPage.mainPageMenu6(MainPage.BookStoreApplication);
        Allure.step("Клик по Book Store Application");
        bookStoreApplication = subMenu.bookStoreApplicationMenu1(SubMenues.Login);
        Allure.step("Клик по вкладке Login");
        bookStoreApplication.userNameFieldFill(UserName, Pages.BookStoreApplication.BookStoreApplication.UserNameField);
        Allure.step("Заполнение поля UserName");
        bookStoreApplication.passwordFieldFill(Password, Pages.BookStoreApplication.BookStoreApplication.PasswordField);
        Allure.step("Заполнение поля Password");
        bookStoreApplication.loginClick(Pages.BookStoreApplication.BookStoreApplication.Login);
        Allure.step("Клик по кнопке Login");
        bookStoreApplication.goToBookStoreClick(Pages.BookStoreApplication.BookStoreApplication.GoToBookStore);
        Allure.step("Клик по кнопке GoToBookStore");
        bookStoreApplication.searchInput(SearchBooks, Pages.BookStoreApplication.BookStoreApplication.Search);
        Allure.step("Поиск книг по заданному значению");
        bookStoreApplication.assertSearchBook1(Pages.BookStoreApplication.BookStoreApplication.SearchBook1);
        Allure.step("Проверка первой найденной книги");
        bookStoreApplication.assertSearchBook2(Pages.BookStoreApplication.BookStoreApplication.SearchBook2);
        Allure.step("Проверка второй найденной книги");
        bookStoreApplication.assertSearchBook3(Pages.BookStoreApplication.BookStoreApplication.SearchBook3);
        Allure.step("Проверка третьей найденной книги");
        bookStoreApplication.assertSearchBook4(Pages.BookStoreApplication.BookStoreApplication.SearchBook4);
        Allure.step("Проверка четвертой найденной книги");
    }

    @Test(description = "Delete book", enabled = false)
    public void deleteBook() {
        subMenu = mainPage.mainPageMenu6(MainPage.BookStoreApplication);
        Allure.step("Клик по Book Store Application");
        bookStoreApplication = subMenu.bookStoreApplicationMenu1(SubMenues.Login);
        Allure.step("Клик по вкладке Login");
        bookStoreApplication.userNameFieldFill(UserName, Pages.BookStoreApplication.BookStoreApplication.UserNameField);
        Allure.step("Заполнение поля UserName");
        bookStoreApplication.passwordFieldFill(Password, Pages.BookStoreApplication.BookStoreApplication.PasswordField);
        Allure.step("Заполнение поля Password");
        bookStoreApplication.loginClick(Pages.BookStoreApplication.BookStoreApplication.Login);
        Allure.step("Клик по кнопке Login");
        bookStoreApplication.goToBookStoreClick(Pages.BookStoreApplication.BookStoreApplication.GoToBookStore);
        Allure.step("Клик по кнопке GoToBookStore");
        bookStoreApplication.searchInput(SearchBooks, Pages.BookStoreApplication.BookStoreApplication.Search);
        Allure.step("Поиск книг по заданному значению");
        bookStoreApplication.speakingJavaScriptClick(Pages.BookStoreApplication.BookStoreApplication.SearchBook2);
        Allure.step("Клик по книге Speaking JavaScript");
        bookStoreApplication.addBook(Pages.BookStoreApplication.BookStoreApplication.AddToYourCollection);
        Allure.step("Клик по кнопке Add To Your Collection");
        bookStoreApplication.bookAlert();
        Allure.step("Клик по кнопке ОК алерта");
        bookStoreApplication.profileClick(Pages.BookStoreApplication.BookStoreApplication.Profile);
        Allure.step("Клик по вкладке Profile");
        bookStoreApplication.searchIsVisible(Pages.BookStoreApplication.BookStoreApplication.Search);
        Allure.step("Скрол к элементу поиска");
        bookStoreApplication.deleteBook(Pages.BookStoreApplication.BookStoreApplication.DeleteBook);
        Allure.step("Клик по значку корзины (кнопка Delete)");
        bookStoreApplication.confirmDeleteBook(Pages.BookStoreApplication.BookStoreApplication.ConfirmDeleteBook);
        Allure.step("Подтверждение удаления книги(в модальном окне клик по кнопке ОК)");
        bookStoreApplication.assertBookDeleted(BookDeleted);
        Allure.step("Проверка удаления книги");
    }

    @Test(description = "Delete All Books", enabled = false)
    public void deleteAllBooks() {
        subMenu = mainPage.mainPageMenu6(MainPage.BookStoreApplication);
        Allure.step("Клик по Book Store Application");
        bookStoreApplication = subMenu.bookStoreApplicationMenu1(SubMenues.Login);
        Allure.step("Клик по вкладке Login");
        bookStoreApplication.userNameFieldFill(UserName, Pages.BookStoreApplication.BookStoreApplication.UserNameField);
        Allure.step("Заполнение поля UserName");
        bookStoreApplication.passwordFieldFill(Password, Pages.BookStoreApplication.BookStoreApplication.PasswordField);
        Allure.step("Заполнение поля Password");
        bookStoreApplication.loginClick(Pages.BookStoreApplication.BookStoreApplication.Login);
        Allure.step("Клик по кнопке Login");
        bookStoreApplication.goToBookStoreClick(Pages.BookStoreApplication.BookStoreApplication.GoToBookStore);
        Allure.step("Клик по кнопке GoToBookStore");
        bookStoreApplication.searchInput(SearchBooks, Pages.BookStoreApplication.BookStoreApplication.Search);
        Allure.step("Поиск книг по заданному значению");
        bookStoreApplication.speakingJavaScriptClick(Pages.BookStoreApplication.BookStoreApplication.SearchBook2);
        Allure.step("Клик по книге Speaking JavaScript");
        bookStoreApplication.addBook(Pages.BookStoreApplication.BookStoreApplication.AddToYourCollection);
        Allure.step("Клик по кнопке Add To Your Collection");
        bookStoreApplication.bookAlert();
        Allure.step("Клик по кнопке ОК алерта");
        bookStoreApplication.profileClick(Pages.BookStoreApplication.BookStoreApplication.Profile);
        Allure.step("Клик по вкладке Profile");
        bookStoreApplication.searchIsVisible(Pages.BookStoreApplication.BookStoreApplication.Search);
        Allure.step("Скрол к элементу поиска");
        bookStoreApplication.deleteAllBooks(Pages.BookStoreApplication.BookStoreApplication.DeleteAllBooks);
        Allure.step("Клик по кнопке Delete All Books");
        bookStoreApplication.confirmDeleteAllBooks(Pages.BookStoreApplication.BookStoreApplication.ConfirmDeleteAllBooks);
        Allure.step("Подтверждение удаления всех книг(в модальном окне клик по кнопке ОК)");
        bookStoreApplication.assertAllBooksDeleted(AllBooksDeleted);
        Allure.step("Проверка удаления всех книг");
    }
}
