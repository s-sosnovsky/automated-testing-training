package pages.googlecloud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AbstractPage;

public class AllProductsPage extends AbstractPage {

    private final static String PAGE_URL = "https://cloud.google.com/products/";

    @FindBy (xpath = "//a[@track-name='seePricing']")
    private WebElement seePricingButton;

    @Override
    public AllProductsPage open() {
        driver.navigate().to(PAGE_URL);
        return this;
    }

    public AllProductsPage(WebDriver driver){
        super(driver);
        }

    public SeePricingPage clickSeePricingButton(){
        new WebDriverWait(driver,10).until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//a[@track-name='seePricing']")));
        seePricingButton.click();
        return new SeePricingPage(driver);
    }
}
