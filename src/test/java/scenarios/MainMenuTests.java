package scenarios;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by alexey on 27/04/17.
 */
public class MainMenuTests extends TestBase {

    @Test(priority = 8, alwaysRun = true)
    public void navigateThroughTheMainMenu() throws Exception {

        landing.sleep();
        landing.loginButtonClick();
        login.loginDealerFunctionality();
        landing.sleep();
        assertThat("Dealer logs in successfully", landing.isLogoDisplayed(), is(true));
        landing.menuIconClick();
//        // verify Featured Art
//        mainMenu.featuredItemsClick();
//        mainMenu.featuredArtClick();
//        featuredArt.sleep();
//        // verify Featured Design
//        landing.menuIconClick();
//        mainMenu.featuredItemsClick();
//        mainMenu.featuredDesignClick();

//        //verify Timeline Feeds Favorites
//        mainMenu.timelineFeedsClick();
//        mainMenu.timelineFavoritesClick();
//        timelineFavorites.sleep();
//
//        //verify Timeline Feeds Artists
//         landing.menuIconClick();
//         mainMenu.timelineArtistsClick();
//         timelineArtists.sleep();
//
//        //verify Timeline Feeds Dealers
//        landing.menuIconClick();
//        mainMenu.timelineDealersClick();
//        timelineDealers.sleep();

        // verify Timeline Feeds
        driver.findElement(By.xpath(" //android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ExpandableListView[1]/android.widget.LinearLayout[2]/android.widget.TextView[1]")).click();
        driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ExpandableListView[1]/android.widget.LinearLayout[3]/android.widget.TextView[1]")).click();
        timelineFavorites.sleep();





    }

}
