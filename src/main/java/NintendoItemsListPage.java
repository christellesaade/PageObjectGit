import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NintendoItemsListPage {
    WebDriver driver;
    By nintendoItemSelector = By.cssSelector("[data-asin='B07WKNQ8JT']");

    public NintendoItemsListPage(WebDriver driver) {
        this.driver = driver;
    }

    public FirstNintendoItemPage openFirstNintendoItem() {
        driver.findElement(nintendoItemSelector).click();
        return new FirstNintendoItemPage(driver);
    }
}