package pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by alexey on 22/03/17.
 */
public class AbstractPage {
//    protected AppiumDriver driver;
//
//    protected AppiumDriver getDriver() {
//        return driver;
//    }

    protected static AndroidDriver driver;


//    public AbstractPage(AndroidDriver driver) {
//        this.driver = driver;
//    }

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
        String number = Integer.toString(random.nextInt(10000000));
        String phone = "38066" + number;
        return phone;
    }

    public String randomCompany(){
        Random random = new Random();
        String number = Integer.toString(random.nextInt(Integer.MAX_VALUE) + 1);
        String company = "Company" + number;
        return company;
    }

    public String randomName(){
        Random random = new Random();
        String number = Integer.toString(random.nextInt(Integer.MAX_VALUE) + 1);
        String name = "Name" + number;
        return name;
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


    protected void waitForVisibilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    protected void waitForClickabilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void scrollPageUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, Double> swipeObject = new HashMap<String, Double>();
        swipeObject.put("startX", 0.50);
        swipeObject.put("startY", 0.95);
        swipeObject.put("endX", 0.50);
        swipeObject.put("endY", 0.01);
        swipeObject.put("duration", 3.0);
        js.executeScript("mobile: swipe", swipeObject);
    }
    public void swipeLeftToRight() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, Double> swipeObject = new HashMap<String, Double>();
        swipeObject.put("startX", 0.01);
        swipeObject.put("startY", 0.5);
        swipeObject.put("endX", 0.9);
        swipeObject.put("endY", 0.6);
        swipeObject.put("duration", 3.0);
        js.executeScript("mobile: swipe", swipeObject);
    }
    public void swipeRightToLeft() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, Double> swipeObject = new HashMap<String, Double>();
        swipeObject.put("startX", 0.9);
        swipeObject.put("startY", 0.5);
        swipeObject.put("endX", 0.01);
        swipeObject.put("endY", 0.5);
        swipeObject.put("duration", 3.0);
        js.executeScript("mobile: swipe", swipeObject);
    }
    public void swipeFirstCarouselFromRightToLeft() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, Double> swipeObject = new HashMap<String, Double>();
        swipeObject.put("startX", 0.9);
        swipeObject.put("startY", 0.2);
        swipeObject.put("endX", 0.01);
        swipeObject.put("endY", 0.2);
        swipeObject.put("duration", 3.0);
        js.executeScript("mobile: swipe", swipeObject);
    }
    public void performTapAction(WebElement elementToTap) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, Double> tapObject = new HashMap<String, Double>();
        tapObject.put("x", (double) 360); // in pixels from left
        tapObject.put("y", (double) 170); // in pixels from top
        tapObject.put("element", Double.valueOf(((RemoteWebElement) elementToTap).getId()));
        js.executeScript("mobile: tap", tapObject);
    }
    // Accepts only numbers (key codes 7-16) and lower and upper case letters (key codes 29-54)
    // Key code 66 is <Enter>
    public void enterTextInPasswordField(String strTextToEnter) {
        int intCounter, intKey;
        for (intCounter = 0; intCounter < strTextToEnter.length(); intCounter++) {
            intKey = (int) strTextToEnter.charAt(intCounter);
            if (intKey > 47 && intKey < 58) {
                intKey = intKey - 41;
                driver.pressKeyCode(intKey);
            }
            else if (intKey > 64 && intKey < 91) {
                intKey = intKey - 36;
                driver.pressKeyCode(intKey, 1);
            }
            else if (intKey > 96 && intKey < 123) {
                intKey = intKey - 68;
                driver.pressKeyCode(intKey);
            }
        }
        driver.pressKeyCode(66);
    }

}
