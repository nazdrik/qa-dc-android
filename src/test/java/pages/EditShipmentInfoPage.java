package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by alexey on 30/03/17.
 */
public class EditShipmentInfoPage extends AbstractPage {


    @FindBy(id = "com.designcarta.designcarta.dev:id/btnActionLeft")
    private WebElement backButton;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnActionRight")
    private WebElement updateButton;

    @FindBy(id = "com.designcarta.designcarta.dev:id/txtNextShipmentDate")
    private WebElement editNextShipmentDate;

    @FindBy(id = "com.designcarta.designcarta.dev:id/edtNextShipmentQty")
    private WebElement editApproxNumOfItemsField;

    @FindBy(id = "com.designcarta.designcarta.dev:id/txtExclusiveInStore")
    private WebElement editInStoreExclusiveUntilField;

    @FindBy(id = "com.designcarta.designcarta.dev:id/txtExclusiveInStore")
    private WebElement editShipmentNotesField;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnDelete")
    private WebElement deleteButton;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnYes")
    private WebElement OkButton;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnNo")
    private WebElement noButton;



    public void menuButtonClick(){backButton.click();}

    public void updateButtonClick(){updateButton.click();}

    public void deleteButtonClick(){deleteButton.click();}

    public void OkButtonClick(){OkButton.click();}

    public void noButtonClick(){noButton.click();}

    public void nextShipmentDateClear(){editNextShipmentDate.clear();}

    public void editApproxNumOfItemsFieldClear(){editApproxNumOfItemsField.clear();}

    public void editInStoreExclusiveUntilFieldClear(){editInStoreExclusiveUntilField.clear();}

    public void editShipmentNotesFieldClear(){editShipmentNotesField.clear();}




    public void nextShipmentDateFillingIn(String nextDate){editNextShipmentDate.sendKeys(nextDate);}

    public void approxNumOfItemsFieldFillingIn(String approx){editApproxNumOfItemsField.sendKeys(approx);}

    public void inStoreExclusiveUntilFieldFillingIn(String inStoreExcl){editInStoreExclusiveUntilField.sendKeys(inStoreExcl);}

    public void shipmentNotesFieldFillingIn(String nextDate){editShipmentNotesField.sendKeys(nextDate);}



}
