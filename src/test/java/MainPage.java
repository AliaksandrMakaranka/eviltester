import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import runner.BaseTest;

public class MainPage extends BaseTest {
    
    @Test
    void mainPageTest() {
        WebElement headText = driver.findElement(By.xpath("//h1[text()=\"Practice Applications and Pages For Automating and Testing\"]"));

        Assertions.assertEquals("Practice Applications and Pages For Automating and Testing", headText.getText());
    }

    @Test
    void basicWebPageExampleTest() {
        driver.findElement(By.xpath("//*[@id=\"basicpagetest\"]")).click();

        Assertions.assertEquals("A paragraph of text", driver.findElement(By.id("para1")).getText());
    }
}
