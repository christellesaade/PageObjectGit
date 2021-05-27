import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FirstNintendoItemPage {
    WebDriver driver;


    public FirstNintendoItemPage(WebDriver driver) {
        this.driver = driver;
    }
    public boolean isTitleNintendoSwitchDisplayed() {

        By nomArticleSelector = By.id("productTitle");
        String nomArticleLabel = driver.findElement(nomArticleSelector).getText();
        String chaineAttendue = "Nintendo Switch";
        return nomArticleLabel.contains(chaineAttendue);
    }
}

