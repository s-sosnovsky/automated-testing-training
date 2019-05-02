import org.testng.Assert;
import org.testng.annotations.Test;
import pages.googlecloud.GoogleCloudHomePage;
import pages.googlecloud.CalculatorPage;
import pages.googlecloud.SeePricingPage;
import pages.googlecloud.AllProductsPage;
import service.OrderCreator;


public class CreateNewInstanceOrderTest extends MainConditions{

    private final static String TOTAL_ESTIMATE_PRICE_PER_MONTH = "1,187.77";
    private final static String INSTANCE_TYPE_N8 = "n1-standard-8";
    private final static String DATACENTER_LOCATION_FRANKFURT = "Frankfurt";


    @Test
    public void estimateSimpleInstanceOrderPricePerMonth() throws InterruptedException {

        GoogleCloudHomePage googleCloudHomePage = new GoogleCloudHomePage(driver);
        AllProductsPage productsPage = googleCloudHomePage.open().clickExploreNewProductsButton();
        SeePricingPage pricingPage = productsPage.clickSeePricingButton();
        CalculatorPage calculatorPage = pricingPage.clickCaltulatorsButton();
        calculatorPage.createSimpleInstanceGoogleCloudOrder();

        Assert.assertTrue(calculatorPage.getVMClassText().
                contains(OrderCreator.getSimpleInstanceOrder()
                        .getVmClassType()
                        .toLowerCase()),
                "VM class values do not match");
        Assert.assertTrue(calculatorPage.getInstanceTypeText()
                .contains(INSTANCE_TYPE_N8),
                "Instance Type values do not match");
        Assert.assertTrue(
                calculatorPage.getLocalSsdCapacityText()
                        .contains(OrderCreator.getSimpleInstanceOrder().getLocalSsdType()),
                "Local SSD values do not match");
        Assert.assertTrue(
                calculatorPage.getCommitmentTermText()
                        .contains(OrderCreator.getSimpleInstanceOrder().getCommitmentTerm()),
                "Commitment Term values do not match");
        Assert.assertTrue(calculatorPage.getDatacenterLocationText()
                .contains(DATACENTER_LOCATION_FRANKFURT),
                "Region values do not match");
        Assert.assertTrue(calculatorPage.
                        getTotalCostText().
                contains(TOTAL_ESTIMATE_PRICE_PER_MONTH),
                "Total estimate values do not match");

        }
    }