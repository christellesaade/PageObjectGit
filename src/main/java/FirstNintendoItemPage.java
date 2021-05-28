import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FirstNintendoItemPage {
    WebDriver driver;
    By articleNameSelector = By.id("productTitle");


    public FirstNintendoItemPage(WebDriver driver) {
        this.driver = driver;
    }
    public String articleTitle() {
        String articleNameLabel = driver.findElement(articleNameSelector).getText();
        return articleNameLabel;
    }
}

