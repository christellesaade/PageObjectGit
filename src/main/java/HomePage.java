import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage enterSearchRequest() {
        String recherche = "Nintendo switch";
        By barreRechercheSelector = By.id("twotabsearchtextbox");
        driver.findElement(barreRechercheSelector).sendKeys(recherche);
        return this;
    }

        public NintendoSwitchPage sendSearchRequest () {
            By loopSearchSelector = By.id("nav-search-submit-button");
            driver.findElement(loopSearchSelector).click();
            return new NintendoSwitchPage(driver);
        }


}
