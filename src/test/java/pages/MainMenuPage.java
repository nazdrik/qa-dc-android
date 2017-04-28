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

    @FindBy(name = "FEATURED ITEMS")
    private WebElement featuredItems;

    @FindBy(name = "Art")
    private WebElement featuredArt;

    @FindBy(name = "Design")
    private WebElement featuredDesign;

    //   @FindBy(name = "Timeline Feeds")
    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ExpandableListView[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]")
    private WebElement timelineFeeds;

    //    @FindBy(name = "Favorites")
    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ExpandableListView[1]/android.widget.LinearLayout[3]/android.widget.TextView[1]")
    private WebElement timelineFavorites;

    //   @FindBy(name = "Artists")
    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ExpandableListView[1]/android.widget.LinearLayout[4]/android.widget.TextView[1]")
    private WebElement timelineArtists;

    //   @FindBy(name = "Dealers")
    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ExpandableListView[1]/android.widget.LinearLayout[5]/android.widget.TextView[1]")
    private WebElement timelineDealers;

    @FindBy(name = "My Private market")
    private WebElement myPrivateMarket;

    @FindBy(name = "Saved Items")
    private WebElement savedItems;

    @FindBy(name = "Dealer Directory")
    private WebElement dealerDirectory;

    @FindBy(name = "Favorite Dealers List")
    private WebElement favoriteDealersList;


    @FindBy(name = "Categories")
    private WebElement categories;

    public void logoIconClick() {
        logoIcon.click();
    }

    public void supportLinkClick() {
        supportLink.click();
    }

    public Boolean isSupportLinkDisplayed() {
        return supportLink.isDisplayed();
    }

    public void termsLinkClick() {
        termsLink.click();
    }

    public Boolean isTermsLinkDisplayed() {
        return termsLink.isDisplayed();
    }

    public void privacyLinkClick() {
        privacyLink.click();
    }

    public Boolean isPrivacyLinkDisplayed() {
        return privacyLink.isDisplayed();
    }

    public void logOutLinkClick() {
        logOutLink.click();
    }

    public void logOutPopUpOkButtonClick() {
        logOutPopUpOkButton.click();
    }

    public void logOutPopUpCancelButtonClick() {
        logOutPopUpCancelButton.click();
    }

    public void accountAdminClick() {
        accountAdmin.click();
    }

    public void postAnItemClick() {
        postAnItem.click();
    }

    public void myPostedItemsClick() {
        myPostedItems.click();
    }

    public void viewStoreFrontClick() {
        viewStoreFront.click();
    }

    public void profileInfoClick() {
        profileInfo.click();
    }

    public void enterArrivalsScheduleClick() {
        enterArrivalsSchedule.click();
    }

    public void featuredItemsClick() {
        featuredItems.click();
    }

    public void featuredArtClick() {
        featuredArt.click();
    }

    public void featuredDesignClick() {
        featuredDesign.click();
    }

    public void timelineFeedsClick() {
        timelineFeeds.click();
    }

    public void timelineFavoritesClick() {
        timelineFavorites.click();
    }

    public void timelineArtistsClick() {
        timelineArtists.click();
    }

    public void timelineDealersClick() {
        timelineDealers.click();
    }

    public void myPrivateMarketClick() {
        myPrivateMarket.click();
    }

    public void savedItemsClick() {
        savedItems.click();
    }

    public void dealerDirectoryClick() {
        dealerDirectory.click();
    }

    public void favoriteDealersListClick() {
        favoriteDealersList.click();
    }

    public void categoriesClick() {
        categories.click();
    }


}