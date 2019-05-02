package pages.googlecloud;

import model.Order;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AbstractPage;
import service.OrderCreator;

import java.util.List;

public class CalculatorPage extends AbstractPage {

    private final static String PAGE_URL="https://cloud.google.com/products/calculator/";

    @FindBy(id = "idIframe")
    private WebElement orderFormIframe;

    @FindBy(xpath = "//input[@id='input_49']")
    private WebElement numberOfInstances;

    @FindBy(xpath = "//md-select[@id='select_61']")
    private WebElement operationSystemTypeDropDown;

    @FindBy(xpath = "//div[@id='select_container_62']/md-select-menu/md-content/md-option")
    private List<WebElement> operationSystemOptionsList;

    @FindBy (xpath = "//md-select[@id='select_65']")
    private WebElement vmClassDropDown;

    @FindBy(xpath = "//div[@id='select_container_66']/md-select-menu/md-content/md-option")
    private List<WebElement> vmClassOptionsList;

    @FindBy(xpath = "//div[@ng-class='{estimated: listingCtrl.CartData[tab.estimatedLabel]}']")
    private List<WebElement> sectionsEnginesList;

    @FindBy (xpath ="//md-select[@id='select_96']")
    private WebElement instanceTypeDropDown;

    @FindBy(xpath = "//md-optgroup[@label='Standard']/md-option")
    private List<WebElement> instanceTypeOptionsList;

    @FindBy(xpath = "//md-checkbox[contains(@ng-model,'addGPUs')]/div[@md-ink-ripple-checkbox]")
    private WebElement addGpuCheckbox;

    @FindBy(xpath = "//md-select[@id='select_334']")
    private WebElement gpuTypeDropDown;

    @FindBy(xpath = "//div[@id='select_container_335']/md-select-menu/md-content/md-option")
    private List<WebElement> gpuTypeOptionsList;

    @FindBy(xpath = "//md-select[@id='select_332']")
    private WebElement numberOfGpuDropDown;

    @FindBy(xpath = "//div[@id='select_container_333']/md-select-menu/md-content/md-option")
    private List<WebElement> numberOfGpuOptionsList;

    @FindBy(xpath = "//md-select[@id='select_98']")
    private WebElement localSsdTypeDropDown;

    @FindBy(xpath = "//div[@id='select_container_99']/md-select-menu/md-content/md-option")
    private List<WebElement> localSsdOptionsList;

    @FindBy(xpath = "//md-select[@id='select_100']")
    private WebElement datacenterLocationDropDown;

    @FindBy(xpath = "//div[@id='select_container_101']/md-select-menu/md-content/md-option")
    private List<WebElement> datacenterLocationOptionsList;

    @FindBy(xpath = "//md-select[@id='select_105']")
    private WebElement committmentUsageDropDown;

    @FindBy(xpath = "//div[@id='select_container_106']/md-select-menu/md-content/md-option")
    private List<WebElement> commitmentUsageOptionsList;

    @FindBy(xpath = "//button[@aria-label='Add to Estimate'][1]")
    private WebElement addToEstimateButton;

    @FindBy (xpath = "//div[contains(text(),'VM class')]")
    private WebElement vmClassText;

    @FindBy (xpath ="//div[contains(text(),'Instance type:')]")
    private WebElement instanceTypeText;

    @FindBy (xpath = "//div[contains(text(),'Total available local SSD space')]")
    private WebElement localSsdCapacityText;

    @FindBy (xpath = "//div[contains(text(),'Commitment term:')]")
    private WebElement commitmentTermText;

    @FindBy (xpath = "//div[contains(text(), 'Region:')]")
    private WebElement fatacenterLocationText;

    @FindBy (xpath = "//b[contains(text(),'Total Estimated Cost')]")
    private WebElement totalEstimateValue;

    @FindBy (xpath = "//button[@id = 'email_quote']")
    private WebElement emailEstimateButton;

    @FindBy (xpath = "//form[@name = 'emailForm']/descendant::input[@type ='email']")
    WebElement emailValueField;

    @FindBy (xpath = "//button[@aria-label='Send Email']")
    WebElement sendEmailButton;

    @Override
    public CalculatorPage open() {
        driver.navigate().to(PAGE_URL);
        return this;
    }

    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    public CalculatorPage switchToOrderIFrame() {
       (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(orderFormIframe));
        driver.switchTo().frame(orderFormIframe);
        return this;
    }

    public void setOrderCloudEngine(String engineName) {
        for (WebElement engine : sectionsEnginesList) {
            if (engine.getText().equals(engineName.toUpperCase())) {
                engine.click();
                return;
            }
        }
    }

    public void setNumberOfInstances(String number){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(numberOfInstances)).click();
        numberOfInstances.sendKeys(number);
    }

    public void setOperationSystem(String operationSystemValue){
        dropDownWaitForElementAndChooseOption(operationSystemTypeDropDown, operationSystemOptionsList, operationSystemValue);
    }

    public void setVmClass(String vmClassValue){
        dropDownWaitForElementAndChooseOption(vmClassDropDown, vmClassOptionsList, vmClassValue);
    }

    public void setInstanceType(String instanceTypeValue){
        dropDownWaitForElementAndChooseOption(instanceTypeDropDown, instanceTypeOptionsList, instanceTypeValue);
    }

    public void selectAddGpuCheckbox(){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(addGpuCheckbox)).click();
    }

    public void selectGpuType(String gpuTypeValue){
        dropDownWaitForElementAndChooseOption(gpuTypeDropDown, gpuTypeOptionsList, gpuTypeValue);
    }

    public void setNumberOfGpu(String numberOfGpuValue){
        dropDownWaitForElementAndChooseOption(numberOfGpuDropDown, numberOfGpuOptionsList, numberOfGpuValue);
    }

    public void setLocalSsdType(String ssdValue) throws InterruptedException {
        scrollToElement(localSsdTypeDropDown);
        dropDownWaitForElementAndChooseOption(localSsdTypeDropDown, localSsdOptionsList, ssdValue);
    }

    public void setDatacenterLocation(String locationValue) {
        dropDownWaitForElementAndChooseOption(datacenterLocationDropDown, datacenterLocationOptionsList, locationValue);
    }

    public void setCommitmentTerm(String committedUsageValue){
        dropDownWaitForElementAndChooseOption(committmentUsageDropDown, commitmentUsageOptionsList,committedUsageValue);
    }

    public void clickAddToEstimateButton(){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(addToEstimateButton)).click();
    }

    public String getVMClassText(){
        return vmClassText.getText();

    }

    private void dropDownWaitForElementAndChooseOption(WebElement dropDown, List<WebElement> dropDownOptions, String text){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(dropDown)).click();
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfAllElements(dropDownOptions));
        for (WebElement option : dropDownOptions) {
            if (option.getText().contains(text)) {
                option.click();
                return;
            }
        }
    }

    public CalculatorPage createSimpleInstanceGoogleCloudOrder() throws InterruptedException {
        Order order = OrderCreator.getSimpleInstanceOrder();
        switchToOrderIFrame();
        setOrderCloudEngine(order.getCloudEngine());
        setNumberOfInstances(order.getNumberOfInstances());
        setOperationSystem(order.getOperationSystemType());
        setVmClass(order.getVmClassType());
        setInstanceType(order.getInstanceType());
        selectAddGpuCheckbox();
        setNumberOfGpu(order.getNumberOfGpu());
        selectGpuType(order.getGpuType());
        setLocalSsdType(order.getLocalSsdType());
        setDatacenterLocation(order.getDatacenterLocation());
        setCommitmentTerm(order.getCommitmentTerm());
        clickAddToEstimateButton();
        return this;
    }

    public String getInstanceTypeText(){
        return new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(instanceTypeText)).getText();
    }

    public String getLocalSsdCapacityText(){
        return new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(localSsdCapacityText)).getText();
    }

    public String getCommitmentTermText(){
        return new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(commitmentTermText)).getText();
    }

    public String getDatacenterLocationText(){
        return new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(fatacenterLocationText)).getText();
    }

    public String getTotalCostText(){
        return new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(totalEstimateValue)).getText();
    }

    public void clickEmailEstimateButton(){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(emailEstimateButton)).click();
    }

    public void setTenMinutesEmail(String email) throws InterruptedException {

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(emailValueField));
        emailValueField.sendKeys(email);
    }

    public void clickSendEmailAddressButton() throws InterruptedException {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(sendEmailButton));
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,150)");
        sendEmailButton.click();
    }
}
