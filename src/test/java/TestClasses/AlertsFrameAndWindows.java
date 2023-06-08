package TestClasses;

import MainPage.MainPage;
import Pages.AlertsFrameAndWindows.*;
import SubMenues.SubMenues;
import io.qameta.allure.Allure;
import org.testng.annotations.Test;

import static Properties.DataProperties.*;

public class AlertsFrameAndWindows extends BaseTest {

    private SubMenues subMenu;
    private BrowserWindows browserWindows;
    private Alerts alerts;
    private Frames frames;
    private NestedFrames nestedFrames;
    private ModalDialogs modalDialogs;

    @Test(description = "NewTab", priority = 17)
    public void browserWindows1() {
        subMenu = mainPage.mainPageMenu3(MainPage.AlertsFrameAndWindows);
        Allure.step("Клик по Alerts, Frame & Windows");
        browserWindows = subMenu.alertsFrameAndWindowsMenu1(SubMenues.BrowserWindows);
        Allure.step("Клик по Browser Windows");
        browserWindows.newTab(BrowserWindows.NewTab);
        Allure.step("Клик по кнопке New Tab");
        browserWindows.closeNewTab(BrowserWindows.NewTabAssert);
        Allure.step("Проверка содержимого новой вкладки и закрытие новой вкладки");
    }

    @Test(description = "NewWindow", priority = 18)
    public void browserWindows2() {
        subMenu = mainPage.mainPageMenu3(MainPage.AlertsFrameAndWindows);
        Allure.step("Клик по Alerts, Frame & Windows");
        browserWindows = subMenu.alertsFrameAndWindowsMenu1(SubMenues.BrowserWindows);
        Allure.step("Клик по Browser Windows");
        browserWindows.newWindow(BrowserWindows.NewWindow);
        Allure.step("Клик по кнопке New Window");
        browserWindows.closeNewWindow(BrowserWindows.NewWindowAssert);
        Allure.step("Проверка содержимого нового окна и его закрытие");
    }

    @Test(description = "NewWindowMessage", priority = 19)
    public void browserWindows3() {
        subMenu = mainPage.mainPageMenu3(MainPage.AlertsFrameAndWindows);
        Allure.step("Клик по Alerts, Frame & Windows");
        browserWindows = subMenu.alertsFrameAndWindowsMenu1(SubMenues.BrowserWindows);
        Allure.step("Клик по Browser Windows");
        browserWindows.newWindowMessage(BrowserWindows.NewWindowMessage);
        Allure.step("Клик по кнопке New Window");
        browserWindows.closeNewWindowMessage(BrowserWindows.NewWindowMessageAssert);
        Allure.step("Проверка содержимого нового информационного окна и его закрытие");
    }

    @Test(description = "Alert", priority = 20)
    public void alerts1() {
        subMenu = mainPage.mainPageMenu3(MainPage.AlertsFrameAndWindows);
        Allure.step("Клик по Alerts, Frame & Windows");
        alerts = subMenu.alertsFrameAndWindowsMenu2(SubMenues.Alerts);
        Allure.step("Клик по Alerts");
        alerts.alert(Alerts.Alert);
        Allure.step("Click Button to see alert");
        alerts.assertAlert(AssertAlert);
        Allure.step("Проверка содержимого алерта и его подтверждение");
    }

    @Test(description = "On button click, alert will appear after 5 seconds", priority = 21)
    public void alerts2() {
        subMenu = mainPage.mainPageMenu3(MainPage.AlertsFrameAndWindows);
        Allure.step("Клик по Alerts, Frame & Windows");
        alerts = subMenu.alertsFrameAndWindowsMenu2(SubMenues.Alerts);
        Allure.step("Клик по Alerts");
        alerts.alert5sec(Alerts.Alert5sec);
        Allure.step("On button click, alert will appear after 5 seconds");
        alerts.assertAlert5sec(AssertAlert5sec);
        Allure.step("Проверка содержимого алерта и его подтверждение спустя 5 секунд после клика по кнопке");
    }

    @Test(description = "On button click, confirm box will appear", priority = 22)
    public void alerts3() {
        subMenu = mainPage.mainPageMenu3(MainPage.AlertsFrameAndWindows);
        Allure.step("Клик по Alerts, Frame & Windows");
        alerts = subMenu.alertsFrameAndWindowsMenu2(SubMenues.Alerts);
        Allure.step("Клик по Alerts");
        alerts.dismiss(Alerts.Dismiss);
        Allure.step("On button click, confirm box will appear");
        alerts.assertDismiss(AssertDismiss, Alerts.Cancel);
        Allure.step("Нажатие кнопки Отмена и проверка результата");
    }

    @Test(description = "On button click, prompt box will appear", priority = 23)
    public void alerts4() {
        subMenu = mainPage.mainPageMenu3(MainPage.AlertsFrameAndWindows);
        Allure.step("Клик по Alerts, Frame & Windows");
        alerts = subMenu.alertsFrameAndWindowsMenu2(SubMenues.Alerts);
        Allure.step("Клик по Alerts");
        alerts.prompt(PromptValue, Alerts.Prompt);
        Allure.step("On button click, prompt box will appear");
        alerts.assertPrompt(AssertPromptValue, Alerts.Oleg);
        Allure.step("Ввод значения в поле промт и проверка результата");
    }

    @Test(description = "Large Frames", priority = 24)
    public void frames1() {
        subMenu = mainPage.mainPageMenu3(MainPage.AlertsFrameAndWindows);
        Allure.step("Клик по Alerts, Frame & Windows");
        frames = subMenu.alertsFrameAndWindowsMenu3(SubMenues.Frames);
        Allure.step("Клик по Frames");
        frames.frame1(Frames.Frame1);
        Allure.step("Переключение драйвера на большой фрейм");
        frames.assertFrame1(AssertFrame1, Frames.Head);
        Allure.step("Проверка содержимого большого фрейма");
    }

    @Test(description = "Small Frames", priority = 25)
    public void frames2() {
        subMenu = mainPage.mainPageMenu3(MainPage.AlertsFrameAndWindows);
        Allure.step("Клик по Alerts, Frame & Windows");
        frames = subMenu.alertsFrameAndWindowsMenu3(SubMenues.Frames);
        Allure.step("Клик по Frames");
        frames.frame2(Frames.Frame2);
        Allure.step("Переключение драйвера на меленький фрейм");
        frames.assertFrame2(AssertFrame2, Frames.Head);
        Allure.step("Проверка содержимого маленького фрейма");
    }

    @Test(description = "ParentFrame", priority = 26)
    public void nestedFrames1() {
        subMenu = mainPage.mainPageMenu3(MainPage.AlertsFrameAndWindows);
        Allure.step("Клик по Alerts, Frame & Windows");
        nestedFrames = subMenu.alertsFrameAndWindowsMenu4(SubMenues.NestedFrames);
        Allure.step("Клик по Nested Frames");
        nestedFrames.switchToParentFrame(NestedFrames.ParentFrame);
        Allure.step("Переключение драйвера на родительский фрейм");
        nestedFrames.assertParentFrame(AssertParentFrame, NestedFrames.ParentFrameAssert);
        Allure.step("Проверка содержимого родительского фрейма");
    }

    @Test(description = "ChildFrame", priority = 27)
    public void nestedFrames2() {
        subMenu = mainPage.mainPageMenu3(MainPage.AlertsFrameAndWindows);
        Allure.step("Клик по Alerts, Frame & Windows");
        nestedFrames = subMenu.alertsFrameAndWindowsMenu4(SubMenues.NestedFrames);
        Allure.step("Клик по Nested Frames");
        nestedFrames.switchToParentFrame(NestedFrames.ParentFrame);
        Allure.step("Переключение драйвера на родительский фрейм");
        nestedFrames.switchToChildFrame(NestedFrames.ChildFrame);
        Allure.step("Переключение драйвера на дочерний фрейм");
        nestedFrames.assertChildFrame(AssertChildFrame, NestedFrames.ChildFrameAssert);
        Allure.step("Проверка содержимого дочернего фрейма");
    }

    @Test(description = "Small Modal", priority = 28)
    public void modalDialogs1() {
        subMenu = mainPage.mainPageMenu3(MainPage.AlertsFrameAndWindows);
        Allure.step("Клик по Alerts, Frame & Windows");
        modalDialogs = subMenu.alertsFrameAndWindowsMenu5(SubMenues.ModalDialogs);
        Allure.step("Клик по Modal Dialogs");
        modalDialogs.smallModal(ModalDialogs.SmallModalButton);
        Allure.step("Small Modal");
        modalDialogs.assertSmallModalHead(AssertSmallModalHead, ModalDialogs.ModalHeadAssert);
        Allure.step("Проверка содержимого заголовка маленького модального окна");
        modalDialogs.assertSmallModalBody(AssertSmallModalBody, ModalDialogs.ModalBodyAssert);
        Allure.step("Проверка содержимого тела маленького модального окна");
        modalDialogs.closeSmallModal(ModalDialogs.SmallModalCloseButton);
        Allure.step("Закрытие маленького модального окна");
    }

    @Test(description = "Large Modal", priority = 29)
    public void modalDialogs2() {
        subMenu = mainPage.mainPageMenu3(MainPage.AlertsFrameAndWindows);
        Allure.step("Клик по Alerts, Frame & Windows");
        modalDialogs = subMenu.alertsFrameAndWindowsMenu5(SubMenues.ModalDialogs);
        Allure.step("Клик по Modal Dialogs");
        modalDialogs.largeModal(ModalDialogs.LargeModalButton);
        Allure.step("Large Modal");
        modalDialogs.assertLargeModalHead(AssertLargeModalHead, ModalDialogs.ModalHeadAssert);
        Allure.step("Проверка содержимого заголовка большого модального окна");
        modalDialogs.assertLargeModalBody(AssertLargeModalBody, ModalDialogs.ModalBodyAssert);
        Allure.step("Проверка содержимого тела большого модального окна");
        modalDialogs.closeLargeModal(ModalDialogs.LargeModalCloseButton);
        Allure.step("Закрытие большого модального окна");
    }
}
