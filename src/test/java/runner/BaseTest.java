package runner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public abstract class BaseTest {

    protected WebDriver driver;
    private static final String URL = "https://testpages.eviltester.com/styled/index.html";

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get(URL);
        driver.manage().window().setSize(new Dimension(1920, 1080));
    }

    @AfterEach
    void teardown() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
//            driver.quit();
        }
    }
}
