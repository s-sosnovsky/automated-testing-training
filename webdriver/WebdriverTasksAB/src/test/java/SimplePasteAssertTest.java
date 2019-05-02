import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.pastebin.PastebinHomePage;
        import pages.pastebin.PastebinPastePage;

public class SimplePasteAssertTest {

    private WebDriver driver;
    private final static String PASTE_TEST_TEXT =
            "git config --global user.name  \"New Sheriff in Town\"\n" +
                    "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                    "git push origin master --force";
    private final static String PASTE_TITLE = "how to gain dominance among developers";

    @Test
    public void createNewPasteTest(){

        driver = new ChromeDriver();

        PastebinHomePage pastebinHomePage = new PastebinHomePage(driver);
        pastebinHomePage.open();
        pastebinHomePage.setNewPasteText(PASTE_TEST_TEXT);
        pastebinHomePage.setPasteSyntax("Bash");
        pastebinHomePage.setPasteExpirationTime("10 Minutes");
        pastebinHomePage.setPasteTextTitle(PASTE_TITLE);
        pastebinHomePage.clickCreateNewPasteButton();
        PastebinPastePage pastebinPostePage = new PastebinPastePage(driver);

        Assert.assertTrue("Titles do not match", driver.getTitle().contains(PASTE_TITLE));
        Assert.assertEquals("Code sapmles do not match", PASTE_TEST_TEXT, pastebinPostePage.getTextFromTextArea());
        Assert.assertTrue("Bash syntax style does not present om the page", pastebinPostePage.isBashStylePresent());

        driver.quit();
    }

}


