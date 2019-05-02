import org.testng.Assert;
import org.testng.annotations.Test;
import pages.googlecloud.*;
import pages.tenminutesemail.ReadEmailPage;
import pages.tenminutesemail.TenMinutesEmailHomePage;

public class EmailWithEstimatePriceTest extends MainConditions {

    @Test
    public void sendTotalEstimateEmailNotification() throws InterruptedException {

        TenMinutesEmailHomePage tenMinutesEmailHomePage = new TenMinutesEmailHomePage(driver);
        tenMinutesEmailHomePage.open();
        String tenMinutesEmail = tenMinutesEmailHomePage.getTenMinutesEmail();
        tenMinutesEmailHomePage.switchToSecondTab();
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.open();
        calculatorPage.createSimpleInstanceGoogleCloudOrder();
        String totalEstimateFromGoogleCalculator = calculatorPage.getTotalCostText();
        calculatorPage.clickEmailEstimateButton();
        calculatorPage.setTenMinutesEmail(tenMinutesEmail);
        calculatorPage.clickSendEmailAddressButton();
        calculatorPage.switchToFirstTab();
        ReadEmailPage readEmailPage = tenMinutesEmailHomePage.clickLetterInList();
        String totalEstimateFromLetter = readEmailPage.getTotalEstimateFromLetter();

        Assert.assertTrue(totalEstimateFromGoogleCalculator.contains(totalEstimateFromLetter),
                "Total estimate values in the letter and in the googlecloud calculator do not match");
    }
}
