package pages.googlecloud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AbstractPage;

public class SeePricingPage extends AbstractPage {

    private final static String PAGE_URL = "https://cloud.google.com/pricing/";

    @FindBy(xpath = "//a[@track-name='pricingNav/calculators']")
    private WebElement calculatorsButton;

    public SeePricingPage(WebDriver driver){
        super(driver);
    }

    @Override
    public AbstractPage open() {
        driver.navigate().to(PAGE_URL);
        return this;
    }

    public CalculatorPage clickCaltulatorsButton(){
        new WebDriverWait(driver,10).until(ExpectedConditions.
                visibilityOfElementLocated(By.xpath("//a[@track-name='pricingNav/calculators']")));
        calculatorsButton.click();
        return new CalculatorPage(driver);
    }
}
