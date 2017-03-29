package scenarios;

import org.testng.annotations.Test;
import utility.Constants;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.testng.AssertJUnit.assertTrue;


/**
 * Created by alexey on 29/03/17.
 */
public class ForgotPasswordTests extends TestBase {

    @Test(priority = 3, alwaysRun = true)
    public void logInWithInvalidEmail() throws Exception {
        // Check forgot password functionality

        landing.sleep();
        landing.loginButtonClick();
        login.forgotPasswordClick();
        assertTrue("Forgot password pop up opens", Constants.LOGIN_FORGOT_PASSWORD_TEXT.contains("Forgot Password?"));
        // Click 'send' with empty field
        login.clickOkButton();
        assertTrue("Please enter cellphone or email", Constants.LOGIN_TEXT_FOR_EMPTY_FIELD.contains("Please enter cellphone or email"));
        login.clickOkButton();
        // Send incorrect email that doesn't exist in the base
        login.fillingForgotPasswordTextField(Constants.INCORRECT_NAME);
        login.clickOkButton();
        assertTrue("We didn't find that email in the system", Constants.LOGIN_WE_DIDNT_FIND_TEST.contains("We didn't find that email in the system. Please register or Contact Us for help."));
        assertThat("Send button is presented", login.isContactButtonPresent(), is(true));
        login.cancelButtonClick();
       //Send correct email, that exist in the DB
        login.forgotPasswordClick();
        login.fillingForgotPasswordTextField(Constants.CORRECT_DEALER_NAME);
        login.clickOkButton();
        assertTrue("Please check your email or text message", Constants.LOGIN_CHECK_EMAIL_TEXT.contains("Please check your email or text message for password reset information"));
        login.clickOkButton();


    }

}
