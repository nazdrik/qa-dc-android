package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by alexey on 22/03/17.
 */
public class LoginPage extends AbstractPage {

    @FindBy(id = "com.designcarta.designcarta:id/imgAppLogoTitle")
    private WebElement appLogo;

    @FindBy(id = "com.designcarta.designcarta:id/btnOk")
    private WebElement oKButton;

    @FindBy(id = "com.designcarta.designcarta:id/edtLogin")
    private WebElement emailTextField;

    @FindBy(id = "com.designcarta.designcarta:id/edtPassword")
    private WebElement passwordTextField;

    @FindBy(id = "com.designcarta.designcarta:id/btnPasswordVisibilityChange")
    private WebElement passwordVisibilityButton;

    @FindBy(id = "com.designcarta.designcarta:id/cbRememberPassword")
    private WebElement rememberPasswordSwitcher;

    @FindBy(id = "com.designcarta.designcarta:id/btnLogin")
    private WebElement logInButton;

    @FindBy(id = "com.designcarta.designcarta:id/btnForgotPassword")
    private WebElement forgotPasswordButton;

    @FindBy(id = "com.designcarta.designcarta:id/btnContactDC")
    private WebElement requestAnAccountButton;

    @FindBy(id = "com.designcarta.designcarta:id/btnActionLeftImage")
    private WebElement closeButton;

    @FindBy(id = "com.designcarta.designcarta:id/txtEmail")
    private WebElement forgotPasswordTextField;

    @FindBy(id = "com.designcarta.designcarta:id/btnLeft")
    private WebElement cancelButton;

    @FindBy(id = "com.designcarta.designcarta:id/btnRight")
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

}
