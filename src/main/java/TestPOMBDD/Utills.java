package TestPOMBDD;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utills extends BasePage{


    //reusable method to click on the elements on webpage
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();//finds the elements and clicks on it
    }
    //reusable method to enter text
    public static void enterText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);//finds elements and enters text in it
    }
    //method to select from drop down menu by text
    public static void selectByVisibleText(By by,String str)
    {
        Select day=new Select(driver.findElement(by));//finds and stores the element in a variable
        day.selectByVisibleText(str);//selects the data by visible text
    }
    //method to select from drop down menu by index
    public static void selectByIndex(By by, int a)
    {
        Select month=new Select(driver.findElement(by));//finds and stores the element in a variable
        month.selectByIndex(a);//selects the data by index
    }
    //method to select from drop down menu by index
    public static void selectByValue(By by, String str)
    {
        Select month=new Select(driver.findElement(by));//finds and stores the element in a variable
        month.selectByValue(str);//selects the data by value
    }
    //method to create timestamp for use in email
//    public static void email(By by, String str)
//    {
//        Date date=new Date();//get the current date and time from the system
//        SimpleDateFormat sdf=new SimpleDateFormat("ddMMyyHHmmss");//give the format for the date
//        String formatteddate=sdf.format(date);//converts the dte in the format we require
//        Timestamp time = new Timestamp(System.currentTimeMillis());
//        driver.findElement(by).sendKeys(str + "firstautomationtest+"date"+"@"yahoo.com");//using concanitation for autogeneration of mail
//    }
    // wait for element to be clickable
    public static void waitForElementToBeClickable(By by, int time)
    {

        WebDriverWait wait=new WebDriverWait(driver,time);//variable assigned
        wait.until(ExpectedConditions.elementToBeClickable(by));//expected condition for the wait
    }



    }


