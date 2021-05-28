import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    By researchBarSelector = By.id("twotabsearchtextbox");
    By loopSearchSelector = By.id("nav-search-submit-button");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage enterSearchRequest(String research) {
        driver.findElement(researchBarSelector).sendKeys(research);
        return this;
    }

        public NintendoItemsListPage sendSearchRequest () {
            driver.findElement(loopSearchSelector).click();
            return new NintendoItemsListPage(driver);
        }


}
