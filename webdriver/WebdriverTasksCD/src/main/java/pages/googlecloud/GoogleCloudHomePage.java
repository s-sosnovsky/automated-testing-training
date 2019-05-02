package pages.googlecloud;

import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import pages.AbstractPage;

public class GoogleCloudHomePage extends AbstractPage {

    private final static String PAGE_URL = "https://cloud.google.com/";

    public GoogleCloudHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='home-products__button']/a")
    private WebElement exploreAllProductsButton;

    @Override
    public GoogleCloudHomePage open() {
        driver.navigate().to(PAGE_URL);
        return this;
    }

    public AllProductsPage clickExploreNewProductsButton() {
        new WebDriverWait(driver,10).until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//div[@class='home-products__button']/a")));
        exploreAllProductsButton.click();
        return new AllProductsPage(driver);
    }
}
