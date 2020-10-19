package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearch {

    WebDriver driver = null;

    @BeforeTest
    public void Setup() {


        WebDriverManager.chromedriver().setup();
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors", "--silent");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void googleSearch() {

        driver.get("https://www.google.com/");
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }


    @AfterTest
    public void closeBrowser() {
        driver.close();
    }


}
