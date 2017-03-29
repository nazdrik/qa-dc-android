package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

    public String randomNumber(){
        Random random = new Random();
        // String number = Integer.toString(random.nextInt(Integer.MAX_VALUE)+1);
        String number = Integer.toString(random.nextInt(1000000000));
        return number;
    }

    public String randomEmail(){
        Random random = new Random();
        int number = random.nextInt(1000);
        String randoms = String.format("%03d", number);
        return randoms;
    }

    public String pageURL(){
        return driver.getCurrentUrl();
    }

    public int tapOnLogOut(String className) throws InterruptedException{
        WebElement element = driver.findElement(By.className("android.widget.LinearLayout"));
        org.openqa.selenium.Point point = element.getLocation();
        //capturing height & length of the element

        int length = element.getSize().getWidth();
        int height = element.getSize().getHeight();

        //capturing the stating Y co-ordinate

        int getY = point.getY();

        //moving to the middle of the suggestion from the Y co-ordinate
        int middleY = (int) (getY + height * 1.5);
        TouchAction ta = new TouchAction(driver);
        Thread.sleep(1000);
        ta.tap(length / 2, middleY).perform();
        return middleY;
    }



}
