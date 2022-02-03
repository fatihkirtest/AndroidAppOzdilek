package com.ozdilek.odev.android.pages;

import com.ozdilek.odev.android.BaseTest;
import com.ozdilek.odev.android.Selector;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;


public class FirstPage extends BaseTest {
    @Step("Uygulamayı Ayağa Kaldırdık")
    public void checkOpen() throws InterruptedException {
        Thread.sleep(1500);
        String checkText = appiumDriver.findElement(Selector.CHECK_APPLICATION_WORK).getText();
        Assert.assertEquals("TESLİMAT BÖLGESİ SEÇ", checkText);
        logger.info("Uygulamayı Ayağa Kaldırdık");
    }

    @Step("Alışverişe Başla Butonuna Bastık")
    public void clickStartShopping() throws InterruptedException {
        Thread.sleep(1500);
        appiumDriver.findElement(Selector.CLICK_START_SHOPPING).click();
        logger.info("Alışverişe Başla Butonuna Tıkladık");
    }

    @Step("Alışveriş Sayfasının Açıldığına Bakıyoruz")
    public void checkMainPageText() throws InterruptedException {
        Thread.sleep(1500);
        String checkText = appiumDriver.findElement(Selector.CHECK_MAIN_PAGE).getText();
        Assert.assertEquals("Market", checkText);
        logger.info("Alışveriş Sayfasının Açıldığını Kontrol Ettik");
    }
}
