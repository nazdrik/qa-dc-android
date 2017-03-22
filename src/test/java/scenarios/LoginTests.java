package scenarios;

import org.junit.Test;
import utility.Constants;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by alexey on 22/03/17.
 */
public class LoginTests extends TestBase {

    @Test
    public void logInWithValidEmail() throws Exception{
        //login as a Dealer with correct data
        landing.sleep();
        landing.loginButtonClick();
        login.FillingEmailTextField(Constants.CORRECT_DEALER_NAME);
        login.FillingPasswordTextField(Constants.CORRECT_DEALER_PASSWORD);
        login.loginButtonClick();
        landing.sleep();
        assertThat("Dealer logs in successfully", landing.isLogoDisplayed(), is(true));
        landing.menuIconclick();
        mainMenu.logoIconClick();
        mainMenu.sleep();
        mainMenu.logOutClick();

//        mainMenu.logOutLinkClick();
//        mainMenu.sleep();
//        mainMenu.logOutPopUpOkButtonClick();
//        assertThat("Landing page is opened and user can log in again", landing.isLogoDisplayed(), is(true));


    }
}
