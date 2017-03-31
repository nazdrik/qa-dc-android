package scenarios;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by nazdrik on 29.03.2017.
 */
public class RequestAnAccountTests extends TestBase {

    @Test(priority = 4, alwaysRun = true)
    public void RequestAnAccountTest() throws Exception {
        // Check request an account functionality
        landing.sleep();
        landing.requestAnAсcountButtonClick();
        assertThat("Request an account page opens", requestAnAccount.isTitlePresents(), is(true));
        requestAnAccount.fillingCompanyContactNameField(requestAnAccount.randomCompany());
        requestAnAccount.fillingCompanyEmailField(requestAnAccount.randomEmail());
        requestAnAccount.fillingCompanyPhoneField(requestAnAccount.randomPhone());
        requestAnAccount.fillingCompanyContactNameField(requestAnAccount.randomName());
        requestAnAccount.submitClick();

    }

}
