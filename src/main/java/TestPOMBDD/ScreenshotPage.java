package TestPOMBDD;

import com.sun.org.apache.regexp.internal.RETest;
import org.openqa.selenium.By;

public class ScreenshotPage extends Utills{

    LoadProp loadProp=new LoadProp();
    private By _appleIcamAddToCartButton= By.xpath("//div[@class='item-grid']/child::div[2]/child::div/child::div[2]/child::div[3]/child::div[2]/input[@value='Add to cart']");
    private By _productAddedToCartConfirmationMessage= By.xpath("//div[@id='bar-notification']/p");
    private By _shoppingCartLink= By.xpath("//div[@id='bar-notification']/p/a");
    private RETest Assert;


    public void addAppleIcamToCart()
    {
        clickOnElement(_appleIcamAddToCartButton);
        //clicks on add to cart for Apple Icam
    }

    public void clickOnShoppingCartInNotificationBar()
    {
        clickOnElement(_shoppingCartLink);//clicks on the shopping cart iin the green bar
    }

}
