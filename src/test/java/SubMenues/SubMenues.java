package SubMenues;

import Methods.Methods;
import Pages.AlertsFrameAndWindows.*;
import Pages.BookStoreApplication.BookStoreApplication;
import Pages.Elements.*;
import Pages.Forms.PractiseForm;
import Pages.Interactions.*;
import Pages.Widgets.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubMenues extends Methods {

    public SubMenues(WebDriver driver) {
        super(driver);
    }

//    ElementsMenuLocators
    public static final By TextBox = By.xpath("(//li[@id='item-0'])[1]");
    public static final By CheckBox = By.xpath("(//li[@id='item-1'])[1]");
    public static final By RadioButton = By.xpath("(//li[@id='item-2'])[1]");
    public static final By WebTables = By.xpath("(//li[@id='item-3'])[1]");
    public static final By Buttons = By.xpath("(//li[@id='item-4'])[1]");
    public static final By Links = By.xpath("(//li[@id='item-5'])[1]");
    public static final By BrokenLinksImages = By.xpath("(//li[@id='item-6'])[1]");
    public static final By UploadAndDownload = By.xpath("(//li[@id='item-7'])[1]");
    public static final By DynamicProperties = By.xpath("(//li[@id='item-8'])[1]");

//    PractiseFormLocators
    public static final By PractiseForm = By.xpath("(//li[@id='item-0'])[2]");

//    AlertsFrameAndWindowsLocators
    public static final By BrowserWindows = By.xpath("(//li[@id='item-0'])[3]");
    public static final By Alerts = By.xpath("(//li[@id='item-1'])[2]");
    public static final By Frames = By.xpath("(//li[@id='item-2'])[2]");
    public static final By NestedFrames = By.xpath("(//li[@id='item-3'])[2]");
    public static final By ModalDialogs = By.xpath("(//li[@id='item-4'])[2]");

//    WidgetsLocators
    public static final By Accordian = By.xpath("(//li[@id='item-0'])[4]");
    public static final By Autocomplete = By.xpath("(//li[@id='item-1'])[3]");
    public static final By DatePicker = By.xpath("(//li[@id='item-2'])[3]");
    public static final By Slider = By.xpath("(//li[@id='item-3'])[3]");
    public static final By ProgressBar = By.xpath("(//li[@id='item-4'])[3]");
    public static final By Tabs = By.xpath("(//li[@id='item-5'])[2]");
    public static final By Tooltips = By.xpath("(//li[@id='item-6'])[2]");
    public static final By Menu = By.xpath("(//li[@id='item-7'])[2]");
    public static final By SelectMenu = By.xpath("(//li[@id='item-8'])[2]");

//    InteractionsLocators
    public static final By Sortable = By.xpath("(//li[@id='item-0'])[5]");
    public static final By Selectable = By.xpath("(//li[@id='item-1'])[4]");
    public static final By Resizable = By.xpath("(//li[@id='item-2'])[4]");
    public static final By Droppable = By.xpath("(//li[@id='item-3'])[4]");
    public static final By Draggable = By.xpath("(//li[@id='item-4'])[4]");

//    BookStoreApplication
    public static final By Login = By.xpath("//div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/ul[1]/li[1]");
    public static final By BookStore = By.xpath("(//li[@id='item-2'])[5]");
    public static final By Profile = By.xpath("(//li[@id='item-3'])[5]");

//    ElementsMenu
    public TextBox elementsMenu1(By locator) {
        visibleElementClick(locator);
        return new TextBox(driver);
    }

    public CheckBox elementsMenu2(By locator) {
        visibleElementClick(locator);
        return new CheckBox(driver);
    }

    public RadioButton elementsMenu3(By locator) {
        visibleElementClick(locator);
        return new RadioButton(driver);
    }

    public WebTables elementsMenu4(By locator) {
        visibleElementClick(locator);
        return new WebTables(driver);
    }

    public Buttons elementsMenu5(By locator) {
        visibleElementClick(locator);
        return new Buttons(driver);
    }

    public Links elementsMenu6(By locator) {
        visibleElementClick(locator);
        return new Links(driver);
    }

    public BrokenLinksImages elementsMenu7(By locator) {
        visibleElementClick(locator);
        return new BrokenLinksImages(driver);
    }

    public void ElementsMenu8(By locator) {
        visibleElementClick(locator);
    }

    public DynamicProperties elementsMenu9(By locator) {
        visibleElementClick(locator);
        return new DynamicProperties(driver);
    }

//    FormMenu
    public PractiseForm practiseFormMenu1(By locator) {
        visibleElementClick(locator);
        return new PractiseForm(driver);
    }

//    AlertsFrameAndWindowsMenu
    public BrowserWindows alertsFrameAndWindowsMenu1(By locator) {
        visibleElementClick(locator);
        return new BrowserWindows(driver);
    }

    public Alerts alertsFrameAndWindowsMenu2(By locator) {
        visibleElementClick(locator);
        return new Alerts(driver);
    }

    public Frames alertsFrameAndWindowsMenu3(By locator) {
        visibleElementClick(locator);
        return new Frames(driver);
    }

    public NestedFrames alertsFrameAndWindowsMenu4(By locator) {
        visibleElementClick(locator);
        return new NestedFrames(driver);
    }

    public ModalDialogs alertsFrameAndWindowsMenu5(By locator) {
        visibleElementClick(locator);
        return new ModalDialogs(driver);
    }

//    Widgets
    public Accordian widgetsMenu1(By locator) {
        visibleElementClick(locator);
        return new Accordian(driver);
    }

    public AutoComplete widgetsMenu2(By locator) {
        visibleElementClick(locator);
        return  new AutoComplete(driver);
    }

    public DatePicker widgetsMenu3(By locator) {
        visibleElementClick(locator);
        return new DatePicker(driver);
    }

    public Slider widgetsMenu4(By locator) {
        visibleElementClick(locator);
        return new Slider(driver);
    }

    public ProgressBar widgetsMenu5(By locator) {
        visibleElementClick(locator);
        return new ProgressBar(driver);
    }

    public Tabs widgetsMenu6(By locator) {
        visibleElementClick(locator);
        return new Tabs(driver);
    }

    public ToolTips widgetsMenu7(By locator) {
        visibleElementClick(locator);
        return new ToolTips(driver);
    }

    public Menu widgetsMenu8(By locator) {
        visibleElementClick(locator);
        return new Menu(driver);
    }

    public SelectMenu widgetsMenu9(By locator) {
        visibleElementClick(locator);
        return new SelectMenu(driver);
    }

//    Interactions
    public Sortable interactionsMenu1(By locator) {
        visibleElementClick(locator);
        return new Sortable(driver);
}

    public Selectable interactionsMenu2(By locator) {
        visibleElementClick(locator);
        return new Selectable(driver);
    }

    public Resizable interactionsMenu3(By locator) {
        visibleElementClick(locator);
        return new Resizable(driver);
    }

    public Droppable interactionsMenu4(By locator) {
        visibleElementClick(locator);
        return new Droppable(driver);
    }

    public Draggable interactionsMenu5(By locator) {
        visibleElementClick(locator);
        return new Draggable(driver);
    }

//    BookStoreApplication
    public BookStoreApplication bookStoreApplicationMenu1(By locator) {
        visibleElementClick(locator);
        return new BookStoreApplication(driver);
    }

    public BookStoreApplication bookStoreApplicationMenu2(By locator) {
        visibleElementClick(locator);
        return new BookStoreApplication(driver);
    }

    public BookStoreApplication bookStoreApplicationMenu3(By locator) {
        visibleElementClick(locator);
        return  new BookStoreApplication(driver);
    }
}
