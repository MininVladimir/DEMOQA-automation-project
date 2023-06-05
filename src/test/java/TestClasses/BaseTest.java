package TestClasses;

import Interfaces.Retry;
import MainPage.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.*;

import java.time.Duration;

import static Properties.BrowserProperties.*;

public class BaseTest{

    protected static WebDriver driver;
    protected MainPage mainPage;

    @BeforeSuite(alwaysRun = true)
    public void setup (ITestContext context){
        for(ITestNGMethod method: context.getAllTestMethods()){
            method.setRetryAnalyzerClass(Retry.class);
        }
    }

    @BeforeMethod(alwaysRun = true)
    @Parameters("browser")
    public void openBrowserAndStartApplication(@Optional("firefox") String browser) {
        setupBrowser(browser);
        driver.get(URL);
        Allure.step("Открытие https://demoqa.com/");
        mainPage = new MainPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    public void setupBrowser(String browser) {
        switch(browser.toLowerCase()){
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--headless");
                driver = new FirefoxDriver(firefoxOptions);
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--headless");
                driver = new EdgeDriver(edgeOptions);
                break;
            default:
                System.out.println("Неверное название браузера!!!");
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Page_Load_Timeout));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Implicitly_Wait));
    }
}
