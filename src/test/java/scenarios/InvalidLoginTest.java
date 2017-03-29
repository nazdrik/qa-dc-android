package scenarios;

import org.testng.annotations.Test;
import utility.Constants;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by alexey on 29/03/17.
 */
public class InvalidLoginTest extends TestBase {

    @Test(priority = 2, alwaysRun = true)
    public void logInWithInvalidEmail() throws Exception {
        // Trying to log in with incorrect username
        landing.sleep();
        landing.loginButtonClick();
        login.fillingEmailTextField(Constants.INCORRECT_NAME);
        login.fillingPasswordTextField(Constants.CORRECT_PASSWORD);
        login.loginButtonClick();
        assertTrue("Error message appears", Constants.LOGIN_ERROR_MESSAGE_TEXT.contains("Please try again and use your phone number as your user name if your email was not accepted."));
        login.invalidPopUpOKButtonClick();

        // Trying to log in with incorrect password

        login.clearEmailTextField();
        login.clearPasswordTextField();
        login.fillingEmailTextField(Constants.CORRECT_DEALER_NAME);
        login.fillingPasswordTextField(Constants.INCORRECT_PASSWORD);
        login.loginButtonClick();
        assertTrue("Error message appears", Constants.LOGIN_ERROR_MESSAGE_TEXT.contains("Please try again and use your phone number as your user name if your email was not accepted."));
        login.invalidPopUpOKButtonClick();


    }

}
