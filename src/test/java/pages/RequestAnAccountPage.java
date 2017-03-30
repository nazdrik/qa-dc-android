package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by alexey on 30/03/17.
 */
public class RequestAnAccountPage extends AbstractPage{

    @FindBy(id = "com.designcarta.designcarta.dev:id/etCompanyName")
    private WebElement companyNameField;

    @FindBy(id = "com.designcarta.designcarta.dev:id/etEmail")
    private WebElement companyEmailField;

    @FindBy(id = "com.designcarta.designcarta.dev:id/etPhone")
    private WebElement companyPhoneField;

    @FindBy(id = "com.designcarta.designcarta.dev:id/etContactName")
    private WebElement companyContactNameField;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnSubmit")
    private WebElement submitButton;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnClose")
    private WebElement closeButton;

}
