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
        login.FillingEmailTextField(Constants.INCORRECT_NAME);
        login.FillingPasswordTextField(Constants.CORRECT_PASSWORD);
        login.loginButtonClick();
        landing.sleep();
        assertTrue("Error message appears", Constants.LOGIN_ERROR_MESSAGE_TEXT.contains("Please try again and use your phone number as your user name if your email was not accepted."));
        login.invalidPopUpOKButtonClick();

        // Trying to log in with incorrect password

        login.ClearEmailTextField();
        login.ClearPasswordTextField();
        login.FillingEmailTextField(Constants.CORRECT_DEALER_NAME);
        login.FillingPasswordTextField(Constants.INCORRECT_PASSWORD);
        login.loginButtonClick();
        landing.sleep();
        assertTrue("Error message appears", Constants.LOGIN_ERROR_MESSAGE_TEXT.contains("Please try again and use your phone number as your user name if your email was not accepted."));
        login.invalidPopUpOKButtonClick();


    }

}
