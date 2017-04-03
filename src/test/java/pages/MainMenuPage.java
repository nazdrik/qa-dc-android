package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by alexey on 22/03/17.
 */
public class MainMenuPage extends AbstractPage {

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnUserOptions")
    private WebElement logoIcon;

    @FindBy(name = "Support")
    private WebElement supportLink;

    @FindBy(name = "Terms of use")
    private WebElement termsLink;

    @FindBy(name = "Privacy Policy")
    private WebElement privacyLink;

    @FindBy(name = "Log Out")
    private WebElement logOutLink;


    @FindBy(id = "com.designcarta.designcarta.dev:id/btnYes")
    private WebElement logOutPopUpOkButton;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnNo")
    private WebElement logOutPopUpCancelButton;

    @FindBy(id = "com.designcarta.designcarta.dev:id/txtAccountAdmin")
    private WebElement accountAdmin;

 //   @FindBy(id = "com.designcarta.designcarta.dev:id/btnPostAFind")
    @FindBy(name = "Post an Item")
    private WebElement postAnItem;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnMyPostedFinds")

    private WebElement myPostedItems;

    //@FindBy(id = "com.designcarta.designcarta.dev:id/btnViewStoreFront")
    @FindBy(name = "View Storefront")
    private WebElement viewStoreFront;

  //  @FindBy(id = "com.designcarta.designcarta.dev:id/btnEditStoreInfo")
    @FindBy(name = "Profile info")
    private WebElement profileInfo;

  //  @FindBy(id = "com.designcarta.designcarta.dev:id/btnNewArrivalsSchedule")
    @FindBy(name = "Enter Arrivals Schedule")
    private WebElement enterArrivalsSchedule;




    public void logoIconClick(){logoIcon.click();}

    public void supportLinkClick(){supportLink.click();}

    public Boolean isSupportLinkDisplayed(){return supportLink.isDisplayed();}

    public void termsLinkClick(){termsLink.click();}

    public Boolean isTermsLinkDisplayed(){return termsLink.isDisplayed();}

    public void privacyLinkClick(){privacyLink.click();}

    public Boolean isPrivacyLinkDisplayed(){return privacyLink.isDisplayed();}

    public void logOutLinkClick(){logOutLink.click();}

    public void logOutPopUpOkButtonClick(){logOutPopUpOkButton.click();}

    public void logOutPopUpCancelButtonClick(){logOutPopUpCancelButton.click();}

    public void accountAdminClick(){accountAdmin.click();}

    public void postAnItemClick(){postAnItem.click();}

    public void myPostedItemsClick(){myPostedItems.click();}

    public void viewStoreFrontClick(){viewStoreFront.click();}

    public void profileInfoClick(){profileInfo.click();}

    public void enterArrivalsScheduleClick(){enterArrivalsSchedule.click();}



}



