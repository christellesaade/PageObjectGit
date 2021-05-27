import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NintendoSwitchPage {
    WebDriver driver;

    public NintendoSwitchPage(WebDriver driver) {
        this.driver = driver;
    }

    public FirstNintendoItemPage openFirstNintendoItem() {
        By nintendoItemSelector = By.cssSelector("[data-asin='B07WKNQ8JT']");
        driver.findElement(nintendoItemSelector).click();
        return new FirstNintendoItemPage(driver);
    }
}