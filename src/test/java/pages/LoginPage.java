package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.Constants;

/**
 * Created by alexey on 22/03/17.
 */
public class LoginPage extends AbstractPage {

    @FindBy(id = "com.designcarta.designcarta.dev:id/imgAppLogoTitle")
    private WebElement appLogo;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnOk")
    private WebElement oKButton;

    @FindBy(id = "com.designcarta.designcarta.dev:id/edtLogin")
    private WebElement emailTextField;

    @FindBy(id = "com.designcarta.designcarta.dev:id/edtPassword")
    private WebElement passwordTextField;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnPasswordVisibilityChange")
    private WebElement passwordVisibilityButton;

    @FindBy(id = "com.designcarta.designcarta.dev:id/cbRememberPassword")
    private WebElement rememberPasswordSwitcher;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnLogin")
    private WebElement logInButton;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnForgotPassword")
    private WebElement forgotPasswordButton;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnContactDC")
    private WebElement requestAnAccountButton;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnActionLeftImage")
    private WebElement closeButton;

    @FindBy(id = "com.designcarta.designcarta.dev:id/txtEmail")
    private WebElement forgotPasswordTextField;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnLeft")
    private WebElement cancelButton;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnRight")
    private WebElement contactUsButton;



    public void fillingEmailTextField(String email){emailTextField.sendKeys(email);}

    public void clearEmailTextField(){emailTextField.clear();}

    public void fillingPasswordTextField(String email){passwordTextField.sendKeys(email);}

    public void clearPasswordTextField(){passwordTextField.clear();}

    public void loginButtonClick(){logInButton.click();}

    public void invalidPopUpOKButtonClick(){oKButton.click();}

    public void forgotPasswordClick(){forgotPasswordButton.click();}

    public void fillingForgotPasswordTextField(String email){forgotPasswordTextField.sendKeys(email);}

    public void clickOkButton(){oKButton.click();}

    public void cancelButtonClick(){cancelButton.click();}

    public void contactUsButtonClick(){contactUsButton.click();}

    public Boolean isContactButtonPresent(){return contactUsButton.isDisplayed();}

    public void loginDealerFunctionality(){
        loginButtonClick();
        fillingEmailTextField(Constants.CORRECT_DEALER_NAME);
        fillingPasswordTextField(Constants.CORRECT_PASSWORD);
        loginButtonClick();
    }

    public void loginDesignerFunctionality(){
        loginButtonClick();
        fillingEmailTextField(Constants.CORRECT_DESIGNER_NAME);
        fillingPasswordTextField(Constants.CORRECT_PASSWORD);
        loginButtonClick();
    }

    public void loginArtistFunctionality(){
        loginButtonClick();
        fillingEmailTextField(Constants.CORRECT_ARTIST_NAME);
        fillingPasswordTextField(Constants.CORRECT_PASSWORD);
        loginButtonClick();
    }

    public void loginConsultantFunctionality(){
        loginButtonClick();
        fillingEmailTextField(Constants.CORRECT_ART_CONSULTACT_NAME);
        fillingPasswordTextField(Constants.CORRECT_PASSWORD);
        loginButtonClick();
    }

}
