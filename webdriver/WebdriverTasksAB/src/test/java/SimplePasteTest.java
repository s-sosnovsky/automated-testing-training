import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.pastebin.PastebinHomePage;

public class SimplePasteTest {
    private WebDriver driver;

    @Test
    public void createSimplePaste() {
        driver = new ChromeDriver();
        PastebinHomePage pastebinHomePage = new PastebinHomePage(driver);
        pastebinHomePage.open();
        pastebinHomePage.setNewPasteText("Hello from WevDriver");
        pastebinHomePage.setPasteTextTitle("helloweb");
        pastebinHomePage.setPasteExpirationTime("10 Minutes");
        pastebinHomePage.clickCreateNewPasteButton();
        driver.quit();
        driver = null;
    }

}

