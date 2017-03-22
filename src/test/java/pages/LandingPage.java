package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by alexey on 22/03/17.
 */
public class LandingPage  extends AbstractPage {

    @FindBy(id = "com.designcarta.designcarta:id/btnLogin")
    private WebElement logInButton;

    @FindBy(id = "com.designcarta.designcarta:id/btnRequestAccount")
    private WebElement requestAnAсoount;

    // @FindBy(id = "com.designcarta.designcarta:id/imageViewLogoTitle")
    // private WebElement logoTitle = (new WebDriverWait(driver, 60)).until(ExpectedConditions.presenceOfElementLocated(By.id("com.designcarta.designcarta:id/imageViewLogoTitle")));

    @FindBy(id = "com.designcarta.designcarta:id/imageViewLogoTitle")
    private WebElement logoTitle;


    @FindBy(id = "com.designcarta.designcarta:id/btnArt")
    private WebElement artMenuItem;

    @FindBy(id = "com.designcarta.designcarta:id/btnDesign")
    private WebElement designMenuItem;

    @FindBy(id = "com.designcarta.designcarta:id/btnTimeline")
    private WebElement timileneMenuItem;

    @FindBy(id = "com.designcarta.designcarta:id/btnFeaturedItems")
    private WebElement featuredMenuItem;

    @FindBy(id = "com.designcarta.designcarta:id/txtViewAllArtists")
    private WebElement viewAllArtistsLink;

    @FindBy(id = "com.designcarta.designcarta:id/txtViewAllExclusives")
    private WebElement viewAllExclusiveLink;

    @FindBy(id = "com.designcarta.designcarta:id/txtViewCollections")
    private WebElement viewCollectionLink;

    @FindBy(id = "com.designcarta.designcarta:id/imgCollection")
    private WebElement collectionImage;

    @FindBy(id = "com.designcarta.designcarta:id/txtViewAllFavorites")
    private WebElement viewAllFavoriteDealersLink;

    @FindBy(id = "com.designcarta.designcarta:id/txtViewAllFavoritesArt")
    private WebElement viewAllFavoriteArtistsLink;

    @FindBy(id = "com.designcarta.designcarta:id/btnActionMenu")
    private WebElement menuIcon;







    public void loginButtonClick(){logInButton.click();}

    public void menuIconclick(){menuIcon.click();}

    public Boolean isLogoDisplayed(){return logoTitle.isDisplayed();}
}
