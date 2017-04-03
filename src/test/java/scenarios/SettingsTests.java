package scenarios;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by alexey on 30/03/17.
 */
public class SettingsTests extends TestBase{

    @Test(priority = 5, alwaysRun = true)
    public void logInWithInvalidEmail() throws Exception {
        // Check Settings
        landing.sleep();
        landing.loginButtonClick();
        login.loginDealerFunctionality();
        landing.sleep();
        assertThat("Dealer logs in successfully", landing.isLogoDisplayed(), is(true));
        landing.menuIconClick();
        mainMenu.logoIconClick();
        mainMenu.sleep();
        // Check Support link
        assertThat("Support link is displayed", mainMenu.isSupportLinkDisplayed(), is(true));
        //Check Term of use link
        assertThat("Support link is displayed", mainMenu.isTermsLinkDisplayed(), is(true));
        //Check Privacy and Policy of use link
        assertThat("Support link is displayed", mainMenu.isPrivacyLinkDisplayed(), is(true));

    }
}
