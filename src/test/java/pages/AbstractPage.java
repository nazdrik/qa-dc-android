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
        String number = Integer.toString(random.nextInt(1000));
        return number;
    }

    public String randomEmail(){
        Random random = new Random();
        String number = Integer.toString(random.nextInt(Integer.MAX_VALUE) + 1);
        String email = "nazdrik"+ number + "@gmail.com" ;
        return email;
    }

    public String randomPhone(){
        Random random = new Random();
        String number = Integer.toString(random.nextInt(1000000));
        String phone = "38066" + number;
        return phone;
    }

    public void dateSet() {

        //Set Date = 25.
      //  driver.findElement(By.xpath("//android.widget.NumberPicker[@index='0']")).sendKeys("25");
        //Set Month = Aug.
     //   driver.findElement(By.xpath("//android.widget.NumberPicker[@index='1']")).sendKeys("Aug");
        //Set Year = 2009.
     //   driver.findElement(By.xpath("//android.widget.NumberPicker[@index='2']")).sendKeys("2009");
        //Click on Done button.
     //   driver.findElement(By.id("android:id/button1")).click();
      //  driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.DatePicker[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.NumberPicker[1]/android.widget.EditText[1]")).click();
      //  (JavascriptExecutor)driver.executeScript("mobile: swipe", new HashMap<>() {{ put("touchCount", 1); put("startX", 190); put("startY", 572); put("endX",190); put("endY", 319); put("duration", 1); }});

        driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.DatePicker[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.NumberPicker[1]/android.widget.Button[2]")).click();
        driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.DatePicker[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.NumberPicker[2]/android.widget.Button[2]")).click();
        driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.DatePicker[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.NumberPicker[3]/android.widget.Button[1]")).click();


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
