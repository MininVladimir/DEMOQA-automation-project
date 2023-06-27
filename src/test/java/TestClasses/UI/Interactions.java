package TestClasses.UI;

import Pages.Interactions.*;
import Pages.MainPage.MainPage;
import Pages.SubMenues.SubMenues;
import io.qameta.allure.Allure;
import org.testng.annotations.Test;

import static Properties.DataProperties.*;

public class Interactions extends BaseTest {
    private SubMenues subMenu;
    private Sortable sortable;
    private Selectable selectable;
    private Resizable resizable;
    private Droppable droppable;
    private Draggable draggable;

    @Test(description = "Sortable", priority = 51)
    public void sortable() {
        subMenu = mainPage.mainPageMenu5(MainPage.Interactions);
        Allure.step("Клик Interactions");
        sortable = subMenu.interactionsMenu1(SubMenues.Sortable);
        Allure.step("Клик Sortable");
        sortable.list(Sortable.List);
        Allure.step("Скрол до вкладки List");
        sortable.listDragAndDrop(Sortable.ListOne, Sortable.ListThree);
        Allure.step("Перетаскивание элемента One на элемент Three");
    }

    @Test(description = "List", priority = 52)
    public void selectable1() {
        subMenu = mainPage.mainPageMenu5(MainPage.Interactions);
        Allure.step("Клик Interactions");
        selectable = subMenu.interactionsMenu2(SubMenues.Selectable);
        Allure.step("Клик Selectable");
        selectable.list(Selectable.List);
        Allure.step("Скрол до вкладки List");
        selectable.listOneClick(Selectable.ListOne);
        Allure.step("Клик по элементу Cras justo odio");
        selectable.listThreeClick(Selectable.ListThree);
        Allure.step("Клик по элементу Morbi leo risus");
        selectable.assertListOneClick(Selectable.ListOne, AssertListAttribute, AssertListAttributeValue);
        Allure.step("Проверка элемента Cras justo odio на то, что он выбран");
        selectable.assertListThreeClick(Selectable.ListThree, AssertListAttribute, AssertListAttributeValue);
        Allure.step("Проверка элемента Morbi leo risus на то, что он выбран");
    }

    @Test(description = "Grid", priority = 53)
    public void selectable2() {
        subMenu = mainPage.mainPageMenu5(MainPage.Interactions);
        Allure.step("Клик Interactions");
        selectable = subMenu.interactionsMenu2(SubMenues.Selectable);
        Allure.step("Клик Selectable");
        selectable.grid(Selectable.Grid);
        Allure.step("Скрол до вкладки Grid и клик по ней");
        selectable.gridOneClick(Selectable.GridOne);
        Allure.step("Клик по элементу One");
        selectable.gridThreeClick(Selectable.GridThree);
        Allure.step("Клик по элементу Three");
        selectable.gridFiveClick(Selectable.GridFive);
        Allure.step("Клик по элементу Five");
        selectable.gridSevenClick(Selectable.GridSeven);
        Allure.step("Клик по элементу Seven");
        selectable.gridNineClick(Selectable.GridNine);
        Allure.step("Клик по элементу Nine");
        selectable.assertGridOneClick(Selectable.GridOne, AssertGridAttribute, AssertGridAttributeValue);
        Allure.step("Проверка элемента One на то, что он выбран");
        selectable.assertGridThreeClick(Selectable.GridThree, AssertGridAttribute, AssertGridAttributeValue);
        Allure.step("Проверка элемента Three на то, что он выбран");
        selectable.assertGridFiveClick(Selectable.GridFive, AssertGridAttribute, AssertGridAttributeValue);
        Allure.step("Проверка элемента Five на то, что он выбран");
        selectable.assertGridSevenClick(Selectable.GridSeven, AssertGridAttribute, AssertGridAttributeValue);
        Allure.step("Проверка элемента Seven на то, что он выбран");
        selectable.assertGridNineClick(Selectable.GridNine, AssertGridAttribute, AssertGridAttributeValue);
        Allure.step("Проверка элемента Nine на то, что он выбран");
    }

    @Test(description = "150х150", priority = 54)
    public void resizable1() {
        subMenu = mainPage.mainPageMenu5(MainPage.Interactions);
        Allure.step("Клик Interactions");
        resizable = subMenu.interactionsMenu3(SubMenues.Resizable);
        Allure.step("Клик Resizable");
        resizable.scroll(Resizable.Text);
        Allure.step("Скрол до фрейма с окном");
        resizable.x150150(Resizable.Resizable, xOffsetResizable1, yOffsetResizable1);
        Allure.step("Изменение размеров окна до 150х150");
    }

    @Test(description = "500х300", priority = 55)
    public void resizable2() {
        subMenu = mainPage.mainPageMenu5(MainPage.Interactions);
        Allure.step("Клик Interactions");
        resizable = subMenu.interactionsMenu3(SubMenues.Resizable);
        Allure.step("Клик Resizable");
        resizable.scroll(Resizable.Text);
        Allure.step("Скрол до фрейма с окном");
        resizable.x500300(Resizable.Resizable, xOffsetResizable2, yOffsetResizable2);
        Allure.step("Изменение размеров окна до 500х300");
    }

    @Test(description = "Simple", priority = 56)
    public void droppable1() {
        subMenu = mainPage.mainPageMenu5(MainPage.Interactions);
        Allure.step("Клик Interactions");
        droppable = subMenu.interactionsMenu4(SubMenues.Droppable);
        Allure.step("Клик Droppable");
        droppable.simple(Droppable.Simple);
        Allure.step("Скрол до вкладки Simple");
        droppable.simpleDragAndDrop(Droppable.Draggable, Droppable.Droppable);
        Allure.step("Перетаскивание элемента Drag me на элемент Drop here");
        droppable.assertSimpleDragAndDrop(AssertSimpleDragAndDrop, Droppable.AssertDroppable);
        Allure.step("Проверка на перетаскивание");
    }

    @Test(description = "NotAcceptable", priority = 57)
    public void droppable2() {
        subMenu = mainPage.mainPageMenu5(MainPage.Interactions);
        Allure.step("Клик Interactions");
        droppable = subMenu.interactionsMenu4(SubMenues.Droppable);
        Allure.step("Клик Droppable");
        droppable.accept(Droppable.Accept);
        Allure.step("Скрол до вкладки Accept и клик по ней");
        droppable.notAcceptableDragAndDrop(Droppable.NotAcceptable, Droppable.AcceptDroppable);
        Allure.step("Перетаскивание элемента NotAcceptable на элемент Drop here");
        droppable.assertNotAcceptableDragAndDrop(AssertNotAcceptableDragAndDrop, Droppable.AssertAcceptDroppable);
        Allure.step("Проверка на перетаскивание");
    }

    @Test(description = "Acceptable", priority = 58)
    public void droppable3() {
        subMenu = mainPage.mainPageMenu5(MainPage.Interactions);
        Allure.step("Клик Interactions");
        droppable = subMenu.interactionsMenu4(SubMenues.Droppable);
        Allure.step("Клик Droppable");
        droppable.accept(Droppable.Accept);
        Allure.step("Скрол до вкладки Accept и клик по ней");
        droppable.acceptableDragAndDrop(Droppable.Acceptable, Droppable.AcceptDroppable);
        Allure.step("Перетаскивание элемента Acceptable на элемент Drop here");
        droppable.assertAcceptableDragAndDrop(AssertAcceptableDragAndDrop, Droppable.AssertAcceptDroppable);
        Allure.step("Проверка на перетаскивание");
    }

    @Test(description = "OuterDroppable1", priority = 59)
    public void droppable4() {
        subMenu = mainPage.mainPageMenu5(MainPage.Interactions);
        Allure.step("Клик Interactions");
        droppable = subMenu.interactionsMenu4(SubMenues.Droppable);
        Allure.step("Клик Droppable");
        droppable.preventPropogation(Droppable.PreventPropogation);
        Allure.step("Скрол до вкладки PreventPropogation и клик по ней");
        droppable.outerDroppable1DragAndDrop(Droppable.Dragbox, Droppable.OuterDroppable1);
        Allure.step("Перетаскивание элемента Drag Me на элемент OuterDroppable1");
        droppable.assertOuterDroppable1DragAndDrop(AssertOuterDroppable1DragAndDrop, Droppable.OuterDroppable1);
        Allure.step("Проверка на перетаскивание");
    }

    @Test(description = "InnerDroppable1", priority = 60)
    public void droppable5() {
        subMenu = mainPage.mainPageMenu5(MainPage.Interactions);
        Allure.step("Клик Interactions");
        droppable = subMenu.interactionsMenu4(SubMenues.Droppable);
        Allure.step("Клик Droppable");
        droppable.preventPropogation(Droppable.PreventPropogation);
        Allure.step("Скрол до вкладки PreventPropogation и клик по ней");
        droppable.innerDroppable1DragAndDrop(Droppable.Dragbox, Droppable.InnerDroppable1);
        Allure.step("Перетаскивание элемента Drag Me на элемент InnerDroppable1");
        droppable.assertInnerDroppable1DragAndDrop(AssertInnerDroppable1DragAndDrop, Droppable.InnerDroppable1);
        Allure.step("Проверка на перетаскивание");
    }

    @Test(description = "OuterDroppable2", priority = 61)
    public void droppable6() {
        subMenu = mainPage.mainPageMenu5(MainPage.Interactions);
        Allure.step("Клик Interactions");
        droppable = subMenu.interactionsMenu4(SubMenues.Droppable);
        Allure.step("Клик Droppable");
        droppable.preventPropogation(Droppable.PreventPropogation);
        Allure.step("Скрол до вкладки PreventPropogation и клик по ней");
        droppable.outerDroppable2DragAndDrop(Droppable.Dragbox, Droppable.OuterDroppable2);
        Allure.step("Перетаскивание элемента Drag Me на элемент OuterDroppable2");
        droppable.assertOuterDroppable2DragAndDrop(AssertOuterDroppable2DragAndDrop, Droppable.OuterDroppable2);
        Allure.step("Проверка на перетаскивание");
    }

    @Test(description = "InnerDroppable2", priority = 62)
    public void droppable7() {
        subMenu = mainPage.mainPageMenu5(MainPage.Interactions);
        Allure.step("Клик Interactions");
        droppable = subMenu.interactionsMenu4(SubMenues.Droppable);
        Allure.step("Клик Droppable");
        droppable.preventPropogation(Droppable.PreventPropogation);
        Allure.step("Скрол до вкладки PreventPropogation и клик по ней");
        droppable.innerDroppable2DragAndDrop(Droppable.Dragbox, Droppable.InnerDroppable2);
        Allure.step("Перетаскивание элемента Drag Me на элемент InnerDroppable2");
        droppable.assertInnerDroppable2DragAndDrop(AssertInnerDroppable2DragAndDrop, Droppable.InnerDroppable2);
        Allure.step("Проверка на перетаскивание");
    }

    @Test(description = "Simple", priority = 63)
    public void draggable1() {
        subMenu = mainPage.mainPageMenu5(MainPage.Interactions);
        Allure.step("Клик Interactions");
        draggable = subMenu.interactionsMenu5(SubMenues.Draggable);
        Allure.step("Клик Draggable");
        draggable.simple(Draggable.Simple);
        Allure.step("Скрол до вкладки Simple");
        draggable.simpleDragBox(Draggable.DragBox, xOffsetSimple, yOffsetSimple);
        Allure.step("Перетаскивание элемента Drag me");
    }

    @Test(description = "AxisRestricted", priority = 64)
    public void draggable2() {
        subMenu = mainPage.mainPageMenu5(MainPage.Interactions);
        Allure.step("Клик Interactions");
        draggable = subMenu.interactionsMenu5(SubMenues.Draggable);
        Allure.step("Клик Draggable");
        draggable.axisRestricted(Draggable.AxisRestricted);
        Allure.step("Скрол до вкладки AxisRestricted и клик по ней");
        draggable.restrictedX(Draggable.RestrictedX, RestrictedX1, RestrictedY1);
        Allure.step("Перетаскивание элемента OnlyX");
        draggable.restrictedY(Draggable.RestrictedY, RestrictedX2, RestrictedY2);
        Allure.step("Перетаскивание элемента OnlyY");
    }
}
