package TestClasses.UI;

import Interfaces.Retry;
import Pages.MainPage.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static Properties.BrowserProperties.*;

public class BaseTest{

    protected WebDriver driver;
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
    public void tearDown(ITestResult result){
        if (driver != null) {
            if (!result.isSuccess()) {
                takeScreenshot(result);
            }
            driver.manage().deleteAllCookies();
            driver.quit();
            driver = null;
        }
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

    public void takeScreenshot(ITestResult result){
        String testName = result.getName();
        LocalDate currentDate = LocalDate.now();
        LocalTime time = LocalTime.now();
        DateTimeFormatter currentTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        Allure.getLifecycle().addAttachment(testName + "_" + currentDate + "_" + time.format(currentTime), "image/png", "png", ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
    }
}
