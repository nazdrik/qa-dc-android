package scenarios;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;



/**
 * Created by alexey on 03/04/17.
 */
public class MyPostedItemsTests extends TestBase {

    @Test(priority = 7, alwaysRun = true)
    public void myPostedItem() throws Exception {
        //check whether My Posted Items page presented for Dealers
        landing.sleep();
        landing.loginButtonClick();
        login.loginDealerFunctionality();
        landing.sleep();
        assertThat("Dealer logs in successfully", landing.isLogoDisplayed(), is(true));
        landing.menuIconClick();
        mainMenu.accountAdminClick();
        mainMenu.myPostedItemsClick();
        myItems.sleep();
        assertThat("My Posted Items page opens", myItems.isMyItemsTitleIsDisplayed(), is(true));
        //check whether the user is able to switch the list
        myItems.onlineItemsLinkClick();
        myItems.sleep();
  //      assertTrue("Online Items opens", myItems.pageTitle().contains("Online Items"));
        myItems.allItemsClick();
        myItems.neverBeforeLinkClick();
        myItems.sleep();
        myItems.allItemsClick();
        myItems.previouslyOnlineLinkClick();
        myItems.sleep();
        myItems.allItemsClick();
        myItems.nonExlusiveLinkClick();
        myItems.sleep();
        myItems.allItemsClick();
        myItems.reorderStorefrontLinkClick();
        myItems.sleep();
        myItems.allItemsClick();
        myItems.pendingReviewLinkClick();
        myItems.sleep();
        myItems.allItemsClick();
        myItems.wipLinkClick();
        myItems.sleep();
        myItems.allItemsClick();
        myItems.offlineItemsLinkClick();
        myItems.sleep();

    }
}
