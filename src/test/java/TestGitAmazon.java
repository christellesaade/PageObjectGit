import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestGitAmazon {
    WebDriver driver;

    @BeforeMethod
    public void ouvrirChrome() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.fr/");
        driver.manage().window().maximize();

        By cookiesSelector = By.name("accept");
        driver.findElement(cookiesSelector).click();
    }

    @AfterMethod
    public void fermerChrome() {
        driver.quit();
    }

    @Test
    public void testAmazon() {
        // Arrange

        // Act
        HomePage amazonHomePage = new HomePage(driver);
        boolean isTitleNintendoSwitchDisplayed = amazonHomePage
                .enterSearchRequest()
                .sendSearchRequest()
                .openFirstNintendoItem()
                .isTitleNintendoSwitchDisplayed();

        // Asserts
        Assert.assertTrue(isTitleNintendoSwitchDisplayed, "La chaine Nintendo Switch n'est pas visible");
    }

}
