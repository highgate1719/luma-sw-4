package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility1;
import org.openqa.selenium.By;

public class BagsPage extends Utility1 {
    // * *	Click on Product Name ‘Overnight Duffle’
    By overnightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");

    public void mouseHoverOnOverNightDuffleProductName() {
        mouseHoverToElementAndClick(overnightDuffle);
    }

}
