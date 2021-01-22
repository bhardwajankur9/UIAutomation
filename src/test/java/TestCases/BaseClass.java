package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    WebDriver driver;

    @BeforeClass
    public void setBrowser(){
        System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Automation Project\\UIAutomation-main\\chromedriver.exe"); //System.getProperty("user.dir" )
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html"); // will pass from property file. As of now we dont have much cases so passing it directly.
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
