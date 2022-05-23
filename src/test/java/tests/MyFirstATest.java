package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.codeborne.selenide.Browsers.FIREFOX;

public class MyFirstATest {
    @Test
    public void openPage() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Acer\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.close();
    }

    @Test
    public void openPage2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.close();
    }

    @Test
    public void openPage3() {
        Selenide.open("http://automationpractice.com/index.php");
    }

    @Test
    public void openPage4() {
        Configuration.browser = FIREFOX;
        Selenide.open("http://automationpractice.com/index.php");
    }


}