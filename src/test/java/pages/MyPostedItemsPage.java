package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by alexey on 03/04/17.
 */
public class MyPostedItemsPage extends AbstractPage {


    @FindBy(id = "com.designcarta.designcarta.dev:id/txtName")
    private WebElement myItemsTitle;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnTopMenu")
    private WebElement myPostedItemsTitle;



    @FindBy(xpath = ("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
    private WebElement onlineItemsLink;

    @FindBy(xpath = ("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]"))
    private WebElement neverBeforeLink;

    @FindBy(xpath = ("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]"))
    private WebElement previouslyOnlineLink;

    @FindBy(xpath = ("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[5]/android.widget.LinearLayout[1]"))
    private WebElement nonExlusiveLink;

    @FindBy(xpath = ("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[6]/android.widget.LinearLayout[1]"))
    private WebElement reorderStorefrontLink;

    @FindBy(xpath = ("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[7]/android.widget.LinearLayout[1]"))
    private WebElement pendingReviewLink;

    @FindBy(xpath = ("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[8]/android.widget.LinearLayout[1]"))
    private WebElement wipLink;

    @FindBy(xpath = ("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[9]/android.widget.LinearLayout[1]"))
    private WebElement offlineItemsLink;



    public void allItemsClick(){myPostedItemsTitle.click();}

    public Boolean isMyItemsTitleIsDisplayed(){return myItemsTitle.isDisplayed();}

    public void onlineItemsLinkClick(){onlineItemsLink.click();}

    public void neverBeforeLinkClick(){neverBeforeLink.click();}

    public void previouslyOnlineLinkClick(){previouslyOnlineLink.click();}

    public void nonExlusiveLinkClick(){nonExlusiveLink.click();}

    public void reorderStorefrontLinkClick(){reorderStorefrontLink.click();}

    public void pendingReviewLinkClick(){pendingReviewLink.click();}

    public void wipLinkClick(){wipLink.click();}

    public void offlineItemsLinkClick(){offlineItemsLink.click();}

    public String pageTitle(){return myPostedItemsTitle.getText();}



}
