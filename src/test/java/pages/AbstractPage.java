package pages;

import io.appium.java_client.AppiumDriver;

import java.util.Random;

/**
 * Created by alexey on 22/03/17.
 */
public class AbstractPage {
    protected AppiumDriver driver;

    protected AppiumDriver getDriver() {
        return driver;
    }

    public void sleep() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void refreshPage() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.navigate().refresh();
    }


    public void back(){
        driver.navigate().back();
    }

    public String random(){
        Random random = new Random();
        // String number = Integer.toString(random.nextInt(Integer.MAX_VALUE)+1);
        String number = Integer.toString(random.nextInt(1000));
        return number;

    }


    public String pageURL(){
        return driver.getCurrentUrl();
    }

//    public static void Tap(this AppiumDriver driver, Location location)
//    {
//        if (driver == null)
//        {
//            throw new ArgumentNullException("driver");
//        }
//
//        if (location == null)
//        {
//            throw new ArgumentNullException("location");
//        }
//
//        ITouchAction action = new TouchAction(driver).Tap(location.X, location.Y);
//        action.Perform();
//    }



}
