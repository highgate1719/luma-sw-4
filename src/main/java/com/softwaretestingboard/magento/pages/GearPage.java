package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility2;
import org.openqa.selenium.By;

public class GearPage extends Utility2 {

   // gear text
    By gearMenu = By.xpath("//a[@id='ui-id-6']//span[contains(text(),'Gear')]");

    // bag text
    By bags = By.xpath("//a[@id='ui-id-25']");
   // overnight duffle
    By overNightDuffle = By.xpath("//a[contains(text(),'Overnight Duffle')]");
    // Bags text
    By overNightDuffleText = By.xpath("//span[@class='base']");

    By changeQtyTo3 = By.xpath("//input[@id='qty']");
    By addToCart = By.xpath("//span[contains(text(),'Add to Cart')]");
    By addedOvernightDuffleText = By.xpath("//div[@class='message-success success message']");
    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");
    By productNameDuffle = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");


    By qty3Text = By.xpath("//span[@class='counter-number']");
    By price$135 = By.xpath("(//span[@class='cart-price']//span)[2]");
    By changeQtyTo5 = By.xpath("(//input[@class='input-text qty'])[1]");
    By updatedShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By price$225Text = By.xpath("(//span[@class='cart-price']//span)[2]");



// mouse hover on gear Menu method
    public void mouseHoverOnGearMenu(){
        mouseHoverToElement(gearMenu);
    }
    // click on bags method
    public void clickOnBags(){
        clickOnElement(bags);
    }

    // click on product name overnight duffle method
    public void ClickOnProductNameOvernightDuffle(){
        clickOnElement(overNightDuffle);
    }
    //get overnight duffle text method

    public String getOvernightDuffleText(){
        return getTextFromElement(overNightDuffleText);
    }
    //change quantity to 3 method
    public void changeQuantityTo3(){
       clearValueFromTextBox(changeQtyTo3);
        sendTextToElement(changeQtyTo3,"3");
    }
    // click on add to cart button method
    public void clickOnAddToCartButton(){
        clickOnElement(addToCart);
    }

    // overnight duffle to shopping cart method
    public String getOvernightDuffelToShoppingCart(){
        return getTextFromElement(addedOvernightDuffleText);
    }

    //click on shopping cart link method
    public void clickOnShoppingCartLink(){
        clickOnElement(shoppingCartLink);
    }

    // product name method
    public String getProductNameOvernightDuffle(){
        return getTextFromElement( productNameDuffle);
    }
    // to get quantity 3 method
    public String getQuantity3(){
       return getTextFromElement(qty3Text);
    }

    public String getQuantity3(String value){
    return getAttributeValue(qty3Text,value);
    }

    // to get product prize $135
    public String getProductPrize$135(){
        return getTextFromElement( price$135 );
    }

    // to change quantity 5 method
    public void changeQuantityTo5(){
        clearValueFromTextBox(changeQtyTo5);
        sendTextToElement(changeQtyTo5,"5");
    }

    // to click on update shopping cart button
    public void clickOnUpdatedShoppingCartButton(){
        clickOnElement(updatedShoppingCart);
    }
    // to get product price $225

    public String getProductPrice$225(){
        return getTextFromElement(price$225Text);
    }
}
