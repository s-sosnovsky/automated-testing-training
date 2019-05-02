package pages.tenminutesemail;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AbstractPage;

public class TenMinutesEmailHomePage extends AbstractPage{
    private final static String PAGE_URL = "https://10minutemail.net/";

    public TenMinutesEmailHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//input[@id = 'fe_text']")
    private  WebElement tenMinutesEmailInput;

    @FindBy(xpath = "//a[text() = 'Google Cloud Platform Price Estimate']")
    private WebElement googlEmailLink;

    @Override
    public AbstractPage open() {
        driver.navigate().to(PAGE_URL);
        return this;
    }

    public String getTenMinutesEmail(){
       return new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(tenMinutesEmailInput))
               .getAttribute("value");
    }

    public ReadEmailPage clickLetterInList() throws InterruptedException {
      ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)");
       new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOf(googlEmailLink)).click();
        return new ReadEmailPage(driver);
    }
}
