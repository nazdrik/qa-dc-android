package scenarios;

import org.testng.annotations.Test;
import utility.Constants;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by alexey on 30/03/17.
 */
public class EnterArrivalsScheduleTests extends TestBase {


    @Test(priority = 6, alwaysRun = true)
    public void logInWithValidEmail() throws Exception {
        //check whether Enter Arrivals schedule page presented for Dealers
        landing.sleep();
        landing.loginButtonClick();
        login.loginDealerFunctionality();
        landing.sleep();
        assertThat("Dealer logs in successfully", landing.isLogoDisplayed(), is(true));
        landing.menuIconClick();
        mainMenu.accountAdminClick();
        mainMenu.enterArrivalsScheduleClick();
        enterSchedule.sleep();
        assertThat("Enter Shipment page opens", enterSchedule.isTitleDisplayed(), is(true));
        // Check add new Shipment functionality
        enterSchedule.addShipmentButtonClick();
        addShipment.sleep();
        assertThat("Add shipment page opens", Constants.ADD_SHIPMENT_TITLE.contains("Add Shipment"));
        // Check if it's possible to add shipment with empty fields
        addShipment.doneButtonClick();
        assertThat("An error pop up opens", Constants.FILL_IN_ALL_FIELDS_TEXT.contains("Please fill in all necessary fields"));
        // Check add shipment functionality with filling in all fields
        addShipment.oKButtonClick();
        addShipment.approxNumOfItemsFieldFillingIn(addShipment.randomNumber());
        addShipment.inStoreExclusiveUntilClick();
        addShipment.sleep();
        enterSchedule.calendarFillIn();

    }

}
