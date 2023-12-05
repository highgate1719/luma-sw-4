package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 6.Write down the following test into ‘GearTest’ class
 * 1. userShouldAddProductSuccessFullyTo
 * ShoppinCart()
 * * Mouse Hover on Gear Menu
 * * Click on Bags
 * * Click on Product Name ‘Overnight Duffle’
 * * Verify the text ‘Overnight Duffle’
 * * Change Qty 3
 * * Click on ‘Add to Cart’ Button.
 * * Verify the text
 * <p>
 * ‘You added Overnight Duffle to your shopping cart.’
 * * Click on ‘shopping cart’ Link
 * * Verify the product name ‘Cronus Yoga Pant’
 * * Verify the Qty is ‘3’
 * * Verify the product price ‘$135.00’
 * * Change Qty to ‘5’
 * * Click on ‘Update Shopping Cart’ button
 * * Verify the product price ‘$225.00’
 */


public class GearTest extends BaseTest {
    GearPage gearpage = new GearPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {

        gearpage.mouseHoverOnGearMenu();
        gearpage.clickOnBags();
        gearpage.ClickOnProductNameOvernightDuffle();

        // verify the text ‘Overnight Duffle’
        String expectedText = "Overnight Duffle";
        String actualText = gearpage.getOvernightDuffleText();
        Assert.assertEquals(expectedText, actualText, "Error message");
        gearpage.changeQuantityTo3();
        gearpage.clickOnAddToCartButton();

        //Verify the text ‘You added Overnight Duffle to your shopping cart.’
        String expectedText1 = "You added Overnight Duffle to your shopping cart.";
        String actualText1 = gearpage.getOvernightDuffelToShoppingCart();
        Assert.assertEquals(expectedText1, actualText1, "Error message");
        gearpage.clickOnShoppingCartLink();

        // Verify the product ‘Overnight Duffle’
        String expectedProduct = "Overnight Duffle";
        String actualProduct = gearpage.getProductNameOvernightDuffle();
        Assert.assertEquals(expectedProduct, actualProduct, "Error message");

        // Verify the product name ‘Cronus Yoga Pant’



        //Verify the Qty is ‘3’
        Thread.sleep(3000);
        String expectedQuantity = "3";
        String actualQuantity = gearpage.getQuantity3();
        Assert.assertEquals(actualQuantity, expectedQuantity, "Error message");

        // Verify the product price ‘$135.00’
        String expectedPrice = "$135.00";
        String actualPrice = gearpage.getProductPrize$135();
        Assert.assertEquals(expectedPrice, actualPrice, "Error message");

        gearpage.changeQuantityTo5();
        gearpage.clickOnUpdatedShoppingCartButton();
        Thread.sleep(2000);

        // Verify the product price ‘$225.00’
        String expectedProductPrice = "$225.00";
        String actualProductPrice = gearpage.getProductPrice$225();
        Assert.assertEquals(expectedProductPrice, actualProductPrice, "Error message");
    }

}
