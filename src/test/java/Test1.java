import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test1 {
    WebDriver driver;
    ChromeOptions option = new ChromeOptions();

    @BeforeTest
    void before() {
        System.out.println("start driver");
        option.addArguments("headless");

        driver = new ChromeDriver(option);

    }

    @AfterTest
    void after() {
        System.out.println("quit driver");
        driver.quit();
    }

    @Test
    void openGoogle() {
        System.out.println("Test run");
        driver.get("https://www.google.com/");
        System.out.println("get current url: " + driver.getCurrentUrl());
    }
}
