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
    private WebElement submit;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnClose")
    private WebElement close;

    @FindBy(id = "com.designcarta.designcarta.dev:id/txtTitle")
    private WebElement requestTitle;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnOk")
    private WebElement okButton;

    public void fillingCompanyNameField(String companyName){companyNameField.sendKeys(companyName);}

    public void fillingCompanyEmailField(String companyEmail){companyEmailField.sendKeys(companyEmail);}

    public void fillingCompanyPhoneField(String companyEmail){companyPhoneField.sendKeys(companyEmail);}

    public void fillingCompanyContactNameField(String companyContact){companyContactNameField.sendKeys(companyContact);}

    public void submitClick(){submit.click();}

    public void closeClick(){close.click();}

    public void okButtonClick(){okButton.click();}

    public Boolean isTitlePresents(){return requestTitle.isDisplayed();}

    public void requestAnAccountFunction(){
        companyNameField.sendKeys(randomCompany());
        companyEmailField.sendKeys(randomEmail());
        companyPhoneField.sendKeys(randomPhone());
        companyContactNameField.sendKeys(randomName());
        submit.click();

    }



}
