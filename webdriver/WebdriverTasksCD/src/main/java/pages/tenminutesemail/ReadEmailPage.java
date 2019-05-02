package pages.tenminutesemail;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AbstractPage;

public class ReadEmailPage extends AbstractPage {

    public ReadEmailPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AbstractPage open() {
        return null;
    }

    @FindBy(xpath = "//table[@class='quote']//td[4]")
    private WebElement infoInLetter;

    public String getTotalEstimateFromLetter(){
        return new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(infoInLetter)).getText();
    }
}
