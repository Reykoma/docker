import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SelenoidTestExample {
//docker start selenoid

    private RemoteWebDriver driver;

    @BeforeTest
    public void openDriver() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
    }

    @Test
    public void browserTest() {
        driver.get("https://google.com/");
        System.out.println("Current Url: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
    }

    @AfterTest
    public void closeDriver() {
        driver.quit();
    }
}