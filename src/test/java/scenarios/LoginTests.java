package scenarios;

import org.junit.Test;
import utility.Constants;

import static junit.framework.TestCase.assertTrue;
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
        login.FillingPasswordTextField(Constants.CORRECT_PASSWORD);
        login.loginButtonClick();
        landing.sleep();
        assertThat("Dealer logs in successfully", landing.isLogoDisplayed(), is(true));
        landing.menuIconclick();
        mainMenu.logoIconClick();
        mainMenu.sleep();
        mainMenu.logOutLinkClick();
        mainMenu.sleep();
        mainMenu.logOutPopUpOkButtonClick();
        assertThat("Landing page is opened and user can log in again", landing.isLogoDisplayed(), is(true));

        //login as a Designer with correct data
        landing.sleep();
        landing.loginButtonClick();
        login.FillingEmailTextField(Constants.CORRECT_DESIGNER_NAME);
        login.FillingPasswordTextField(Constants.CORRECT_PASSWORD);
        login.loginButtonClick();
        landing.sleep();
        assertThat("Designer logs in successfully", landing.isLogoDisplayed(), is(true));
        landing.menuIconclick();
        mainMenu.logoIconClick();
        mainMenu.sleep();
        mainMenu.logOutLinkClick();
        mainMenu.sleep();
        mainMenu.logOutPopUpOkButtonClick();
        assertThat("Landing page is opened and user can log in again", landing.isLogoDisplayed(), is(true));

        //login as a Artist with correct data
        landing.sleep();
        landing.loginButtonClick();
        login.FillingEmailTextField(Constants.CORRECT_ARTIST_NAME);
        login.FillingPasswordTextField(Constants.CORRECT_PASSWORD);
        login.loginButtonClick();
        landing.sleep();
        assertThat("Artist logs in successfully", landing.isLogoDisplayed(), is(true));
        landing.menuIconclick();
        mainMenu.logoIconClick();
        mainMenu.sleep();
        mainMenu.logOutLinkClick();
        mainMenu.sleep();
        mainMenu.logOutPopUpOkButtonClick();
        assertThat("Landing page is opened and user can log in again", landing.isLogoDisplayed(), is(true));

        //login as a Art Consultant with correct data
        landing.sleep();
        landing.loginButtonClick();
        login.FillingEmailTextField(Constants.CORRECT_ART_CONSULTACT_NAME);
        login.FillingPasswordTextField(Constants.CORRECT_PASSWORD);
        login.loginButtonClick();
        landing.sleep();
        assertThat("Art Consultant logs in successfully", landing.isLogoDisplayed(), is(true));
        landing.menuIconclick();
        mainMenu.logoIconClick();
        mainMenu.sleep();
        mainMenu.logOutLinkClick();
        mainMenu.sleep();
        mainMenu.logOutPopUpOkButtonClick();
        assertThat("Landing page is opened and user can log in again", landing.isLogoDisplayed(), is(true));

    }

    @Test
    public void logInWithInvalidEmail() throws Exception {
        // Trying to log in with incorrect username
        landing.sleep();
        landing.loginButtonClick();
        login.FillingEmailTextField(Constants.INCORRECT_NAME);
        login.FillingPasswordTextField(Constants.CORRECT_PASSWORD);
        login.loginButtonClick();
        landing.sleep();
        assertTrue("Error message appears", Constants.LOGIN_ERROR_MESSAGE_TEXT.contains("Please try again and use your phone number as your user name if your email was not accepted."));
        login.invalidPopUpOKButtonClick();

    }




}
