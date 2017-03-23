package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by alexey on 22/03/17.
 */
public class MainMenuPage extends AbstractPage {

    @FindBy(id = "com.designcarta.designcarta:id/btnUserOptions")
    private WebElement logoIcon;

    @FindBy(name = "Support")
    private WebElement supportLink;

    @FindBy(name = "Terms of use")
    private WebElement termsLink;

    @FindBy(name = "Privacy Policy")
    private WebElement privacyLink;

    @FindBy(name = "Log Out")
    private WebElement logOutLink;


    @FindBy(id = "com.designcarta.designcarta:id/btnYes")
    private WebElement logOutPopUpOkButton;

    @FindBy(id = "com.designcarta.designcarta:id/btnNo")
    private WebElement logOutPopUpCancelButton;



    public void logoIconClick(){logoIcon.click();}

   public void supportLinkClick(){supportLink.click();}

   public void termsLinkClick(){termsLink.click();}

    public void privacyLinkClick(){privacyLink.click();}

    public void logOutLinkClick(){logOutLink.click();}

    public void logOutPopUpOkButtonClick(){logOutPopUpOkButton.click();}

    public void logOutPopUpCancelButtonClick(){logOutPopUpCancelButton.click();}

//    public void logOutClick() throws Exception{
//        try {
//            TouchAction ta = new TouchAction(driver);
//           // ta = ta.press(100,100).perform();
//          //  ta = ta.tap(85,1045).perform();
//         // ta = ta.press(logOutLink, 85,1045).perform();
//        //    ta.tap(logOutLink, 85,1045).perform();
//            ta = ta.tap(0, 976).release();
//
//        }catch (Exception e){
//            System.out.println("unable to click ");
//        }

    }



