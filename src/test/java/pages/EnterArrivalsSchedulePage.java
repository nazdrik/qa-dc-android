package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by alexey on 30/03/17.
 */
public class EnterArrivalsSchedulePage extends AbstractPage {

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnActionLeft")
    private WebElement menuButton;

    @FindBy(id = "com.designcarta.designcarta.dev:id/txtTitle")
    private WebElement arrivalsScheduleTitle;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnAddShipment")
    private WebElement addShipmentButton;

    @FindBy(id = "com.designcarta.designcarta.dev:id/etApproxInStoreItemsNow")
    private WebElement approxInStoreItems;

    @FindBy(id = "com.designcarta.designcarta.dev:id/btnEditItemCount")
    private WebElement editButton;

    @FindBy(id = "android:id/numberpicker_input[@index='0']")
    private WebElement yearCalendar;

    @FindBy(id = "android:id/numberpicker_input[@index='1']")
    private WebElement dayCalendar;

    @FindBy(id = "android:id/button1")
    private WebElement doneCalendar;



    public void menuButtonClick(){menuButton.click();}

    public Boolean isTitleDisplayed(){return arrivalsScheduleTitle.isDisplayed();}

    public void addShipmentButtonClick(){addShipmentButton.click();}

    public void approxInStoreItemsFillingIn(String num){approxInStoreItems.sendKeys(num);}

    public void editButtonClick(){editButton.click();}

    public void calendarFillIn() throws InterruptedException{
      //  (JavascriptExecutor)driver.executeScript("mobile: swipe", new HashMap<String, Double>() {{ put("touchCount", (double)1); put("startX",(double) 188); put("startY", (double)684); put("endX", (double)188); put("endY",(double) 585); put("duration",(double) 2); }});
//        TouchAction myAction = new TouchAction(driver);
//        //mention the X,Y offset and start and end points
//        myAction.press(128, 683).moveTo(128, 455).release().perform();
//        myAction.press(288, 683).moveTo(288, 455).release().perform();
//        myAction.press(448, 683).moveTo(448, 455).release().perform();

        //Get the size of screen.
//        Dimension size = driver.manage().window().getSize();
//        int startx = (int) (size.width * 0.70);
//        int endx = (int) (size.width * 0.30);
//        int starty = size.height / 2;
//        int endy = (int) (size.height * 0.20);
//
//        driver.swipe(startx, starty, startx, endy, 3000);
//        Thread.sleep(2000);

        //Set Date = 25.
      //  driver.findElement(By.xpath("//android.widget.NumberPicker[@index='0']")).sendKeys("25");
        //Set Month = Aug.
      //  driver.findElement(By.xpath("//android.widget.NumberPicker[@index='1']")).sendKeys("Aug");
        //Set Year = 2009.
     //   driver.findElement(By.xpath("//android.widget.NumberPicker[@index='2']")).sendKeys("2009");
        //Click on Done button.
      //  driver.findElement(By.id("android:id/button1")).click();

//        WebElement startDate = driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.DatePicker[1]/android.widget.LinearLayout[1]/android.widget.ViewAnimator[1]/android.widget.ListView[1]/android.view.View[1]/android.view.View[27]"));
//        WebElement lastDate = driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.DatePicker[1]/android.widget.LinearLayout[1]/android.widget.ViewAnimator[1]/android.widget.ListView[1]/android.view.View[1]/android.view.View[29]"));
//        WebElement calendarOk = driver.findElement(By.id("android:id/button1"));

 //       (JavascriptExecutor)driver.executeScript("mobile: tap", new HashMap<String, Double>() {{ put("tapCount", 1.); put("touchCount", 1.); put("duration", 0.5); put("x", 459.); put("y", 869.); }});


    }


}
