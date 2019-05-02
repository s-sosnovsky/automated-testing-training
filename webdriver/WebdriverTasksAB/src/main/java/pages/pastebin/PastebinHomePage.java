package pages.pastebin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AbstractPage;

import java.util.List;

public class PastebinHomePage extends AbstractPage {
    private static final String HOME_PAGE_URL = "https://pastebin.com";

    @FindBy(className = "paste_textarea")
    private WebElement newPasteTextArea;

    @FindBy(xpath = "//span[contains(@id,'select2-paste_format')]")
    private WebElement syntaxDropDown;

    @FindBy(xpath = "//ul[contains(@id,'select2-paste_format')]/li")
    private  List<WebElement> syntaxOptionsList;

    @FindBy(xpath = "//span[@title='Never']")
    private WebElement pasteExpirationDropDown;

    @FindBy(xpath = "//ul[contains(@id,'select2-paste_expire_date')]/li")
    private List<WebElement> pasteExpirationOptionsList;

    @FindBy(name = "paste_name")
    private WebElement pasteNameTitleInput;

    @FindBy(xpath = "//input[@id='submit']")
    private WebElement createNewPasteButton;

    public PastebinHomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public PastebinHomePage open() {
        driver.get(HOME_PAGE_URL);
        new WebDriverWait(driver,10).until(jQueryAJAXCompleted());
        return this;
    }

    public void setNewPasteText(String pasteTextValue){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(newPasteTextArea)).clear();
        newPasteTextArea.sendKeys(pasteTextValue);
    }

    public void setPasteTextTitle(String pasteTitleValue){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(pasteNameTitleInput)).
                sendKeys(pasteTitleValue);
    }

    public void setPasteExpirationTime(String expirationTimeValue){
        dropDownWaitForElementAndChooseOption(pasteExpirationDropDown, pasteExpirationOptionsList, expirationTimeValue);
    }

    public void setPasteSyntax(String pasteSyntaxValue){
        dropDownWaitForElementAndChooseOption(syntaxDropDown, syntaxOptionsList, pasteSyntaxValue);
    }

    private void dropDownWaitForElementAndChooseOption(WebElement dropDown, List<WebElement> dropDownOptions, String text){
        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(dropDown)).click();
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfAllElements(dropDownOptions));
        for (WebElement option : dropDownOptions) {
            if (option.getText().contains(text)) {
                option.click();
                return;
            }
        }
    }

    public void clickCreateNewPasteButton(){
        new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(createNewPasteButton)).click();
    }

}
