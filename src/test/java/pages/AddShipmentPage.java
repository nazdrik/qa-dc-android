package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by alexey on 30/03/17.
 */
public class AddShipmentPage extends AbstractPage {

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnActionRight")
    private WebElement doneButton;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnActionLeft")
    private WebElement backButton;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnOk")
    private WebElement oKButton;

    @FindBy(id = "com.designcarta.designcarta.dev:id/edtNextShipmentQty")
    private WebElement approxNumOfItemsField;

    @FindBy(id = "com.designcarta.designcarta.dev:id/txtExclusiveInStore")
    private WebElement inStoreExclusiveUntilField;

    @FindBy(id = "com.designcarta.designcarta.dev:id/etDescription")
    private WebElement shipmentNotesField;




    public void doneButtonClick(){doneButton.click();}

    public void backButtonClick(){backButton.click();}

    public void oKButtonClick(){oKButton.click();}

    public void approxNumOfItemsFieldFillingIn(String approxNum){approxNumOfItemsField.sendKeys(approxNum);}

    public void inStoreExclusiveUntilFieldFillingIn(String inStoreExcl){inStoreExclusiveUntilField.sendKeys(inStoreExcl);}

    public void shipmentNotesFieldFillingIn(String notes){shipmentNotesField.sendKeys(notes);}



}

