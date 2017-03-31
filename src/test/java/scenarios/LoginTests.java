package scenarios;

import org.testng.annotations.Test;
import utility.Constants;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by alexey on 22/03/17.
 */
public class LoginTests extends TestBase {

    @Test(priority = 1, alwaysRun = true)
    public void logInWithValidEmail() throws Exception{
        //login as a Dealer with correct data
        landing.sleep();
        landing.loginButtonClick();
        login.fillingEmailTextField(Constants.CORRECT_DEALER_NAME);
        login.fillingPasswordTextField(Constants.CORRECT_PASSWORD);
        login.loginButtonClick();
        landing.sleep();
        assertThat("Dealer logs in successfully", landing.isLogoDisplayed(), is(true));
        landing.menuIconClick();
        mainMenu.logoIconClick();
        mainMenu.sleep();
        mainMenu.logOutLinkClick();
        mainMenu.sleep();
        assertThat("LogOut pop up opens", Constants.LOG_OUT_POP_UP_TEXT.contains("Log out"));
        mainMenu.logOutPopUpOkButtonClick();
        assertThat("Landing page is opened and user can log in again", landing.isLogoDisplayed(), is(true));

        //login as a Designer with correct data
        landing.sleep();
        landing.loginButtonClick();
        login.fillingEmailTextField(Constants.CORRECT_DESIGNER_NAME);
        login.fillingPasswordTextField(Constants.CORRECT_PASSWORD);
        login.loginButtonClick();
        landing.sleep();
        assertThat("Designer logs in successfully", landing.isLogoDisplayed(), is(true));
        landing.menuIconClick();
        mainMenu.logoIconClick();
        mainMenu.sleep();
        assertThat("LogOut pop up opens", Constants.LOG_OUT_POP_UP_TEXT.contains("Log out"));
        mainMenu.logOutLinkClick();
        mainMenu.sleep();
        mainMenu.logOutPopUpOkButtonClick();
        assertThat("Landing page is opened and user can log in again", landing.isLogoDisplayed(), is(true));

        //login as a Artist with correct data
        landing.sleep();
        landing.loginButtonClick();
        login.fillingEmailTextField(Constants.CORRECT_ARTIST_NAME);
        login.fillingPasswordTextField(Constants.CORRECT_PASSWORD);
        login.loginButtonClick();
        landing.sleep();
        assertThat("Artist logs in successfully", landing.isLogoDisplayed(), is(true));
        landing.menuIconClick();
        mainMenu.logoIconClick();
        mainMenu.sleep();
        assertThat("LogOut pop up opens", Constants.LOG_OUT_POP_UP_TEXT.contains("Log out"));
        mainMenu.logOutLinkClick();
        mainMenu.sleep();
        mainMenu.logOutPopUpOkButtonClick();
        assertThat("Landing page is opened and user can log in again", landing.isLogoDisplayed(), is(true));

        //login as a Art Consultant with correct data
        landing.sleep();
        landing.loginButtonClick();
        login.fillingEmailTextField(Constants.CORRECT_ART_CONSULTACT_NAME);
        login.fillingPasswordTextField(Constants.CORRECT_PASSWORD);
        login.loginButtonClick();
        landing.sleep();
        assertThat("Art Consultant logs in successfully", landing.isLogoDisplayed(), is(true));
        landing.menuIconClick();
        mainMenu.logoIconClick();
        mainMenu.sleep();
        assertThat("LogOut pop up opens", Constants.LOG_OUT_POP_UP_TEXT.contains("Log out"));
        mainMenu.logOutLinkClick();
        mainMenu.sleep();
        mainMenu.logOutPopUpOkButtonClick();
        assertThat("Landing page is opened and user can log in again", landing.isLogoDisplayed(), is(true));

    }




}
