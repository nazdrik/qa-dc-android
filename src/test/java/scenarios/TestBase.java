package scenarios;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LandingPage;
import pages.LoginPage;
import pages.MainMenuPage;
import pages.RequestAnAccountPage;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by alexey on 22/03/17.
 */
public class TestBase {

    public AppiumDriver driver;
    public LoginPage login;
    public LandingPage landing;
    public MainMenuPage mainMenu;
    public RequestAnAccountPage RequestAnAccount;




    @BeforeMethod
    public void beforeAllTests() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability("noReset","true");
      //  capabilities.setCapability("fullReset","false");
        capabilities.setCapability("deviceName", "AndroidTestDevice");
        capabilities.setCapability("unicodeKeyboard", true);
        capabilities.setCapability("resetKeyboard", true);

        AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        landing = PageFactory.initElements(driver, LandingPage.class);
        login = PageFactory.initElements(driver, LoginPage.class);
        mainMenu = PageFactory.initElements(driver, MainMenuPage.class);
        RequestAnAccount = PageFactory.initElements(driver, RequestAnAccountPage.class);

    }


    @AfterMethod
    public void teardown() {
        if (driver != null)
            driver.quit();
    }

}
