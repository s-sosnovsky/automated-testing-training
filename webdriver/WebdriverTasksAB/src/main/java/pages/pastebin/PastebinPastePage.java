package pages.pastebin;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.AbstractPage;

public class PastebinPastePage extends AbstractPage{

    @FindBy (id = "selectable")
    private WebElement pasteTextArea;

    @FindBy (xpath = "//a[@class='buttonsm' and text()='Bash']")
    private WebElement pasteBashStyle;

    @Override
    public AbstractPage open() {
        throw new WebDriverException();
    }

    public PastebinPastePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getTextFromTextArea(){
        return pasteTextArea.getText();

    }

    public boolean isBashStylePresent(){
        boolean isBashStylePresent;
        try {
            isBashStylePresent = pasteBashStyle.isDisplayed();
        } catch (NoSuchElementException ex){
            isBashStylePresent = false;
        }
        return isBashStylePresent;
    }
}
