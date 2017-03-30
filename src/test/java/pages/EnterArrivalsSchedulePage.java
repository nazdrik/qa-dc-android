package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by alexey on 30/03/17.
 */
public class EnterArrivalsSchedulePage extends AbstractPage {

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnActionLeft")
    private WebElement menuButton;

    @FindBy(id = "com.designcarta.designcarta.dev:id/txtTitle")
    private WebElement arrivalsScheduleTitle;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnAddShipment")
    private WebElement addShipmentButton;

    @FindBy(id = "com.designcarta.designcarta.dev:id/etApproxInStoreItemsNow")
    private WebElement approxInStoreItems;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnEditItemCount")
    private WebElement editButton;





    public void menuButtonClick(){menuButton.click();}

    public Boolean isTitleDisplayed(){return arrivalsScheduleTitle.isDisplayed();}

    public void addShipmentButtonClick(){addShipmentButton.click();}

    public void approxInStoreItemsFillingIn(String num){approxInStoreItems.sendKeys(num);}

    public void editButtonClick(){editButton.click();}


}
