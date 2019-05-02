import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class MainConditions {
    protected WebDriver driver;

    @BeforeMethod()
    public void setBrowser(){
        driver= DriverManager.getDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void quitBrowser(){
        DriverManager.closeDriver();
        }
}
