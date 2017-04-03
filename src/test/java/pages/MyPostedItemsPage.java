package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by alexey on 03/04/17.
 */
public class MyPostedItemsPage extends AbstractPage {


    @FindBy(id = "com.designcarta.designcarta.dev:id/txtName")
    private WebElement myItemsTitle;



    public void allItemsClick(){myItemsTitle.click();}


    public Boolean isMyItemsTitleIsDisplayed(){return myItemsTitle.isDisplayed();}

}
