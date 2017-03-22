package pages;

import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by alexey on 22/03/17.
 */
public class MainMenuPage extends AbstractPage {

    @FindBy(id = "com.designcarta.designcarta:id/btnUserOptions")
    private WebElement logoIcon;

//    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
//    private WebElement supportLink;
//
//    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
//    private WebElement termsLink;
//
//    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[3]")
//    private WebElement privacyLink;
//
//    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
//    private WebElement logOutLink;


    @FindBy(id = "com.designcarta.designcarta:id/btnYes")
    private WebElement logOutPopUpOkButton;

    @FindBy(id = "com.designcarta.designcarta:id/btnNo")
    private WebElement logOutPopUpCancelButton;



    public void logoIconClick(){logoIcon.click();}

//    public void supportLinkClick(){supportLink.click();}
//
//    public void termsLinkClick(){termsLink.click();}
//
//    public void privacyLinkClick(){privacyLink.click();}
//
//    public void logOutLinkClick(){logOutLink.click();}

    public void logOutPopUpOkButtonClick(){logOutPopUpOkButton.click();}

    public void logOutPopUpCancelButtonClick(){logOutPopUpCancelButton.click();}

    public void logOutClick() throws Exception{
        try {
            TouchAction ta = new TouchAction(driver);
            ta = ta.press(100,100).perform();
        }catch (Exception e){

        }

    }


}
