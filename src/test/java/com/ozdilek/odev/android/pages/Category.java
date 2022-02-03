package com.ozdilek.odev.android.pages;

import com.ozdilek.odev.android.BaseTest;
import com.ozdilek.odev.android.Selector;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class Category extends BaseTest {

    @Step("Kategoriler Bloğunu Açıyoruz")
    public void openCategoryPage() throws InterruptedException {
        Thread.sleep(1500);
        appiumDriver.findElement(Selector.OPEN_CATEGORY_PAGE).click();
        logger.info("Kategoriler Bloğu Açıldı");
    }

    @Step("Kategoriler Bloğunun Açıldığını Kontrol Ediyoruz")
    public void checkCategoryPage() throws InterruptedException {
        Thread.sleep(1500);
        String checkText = appiumDriver.findElement(Selector.CHECK_CATEGORY_PAGE).getText();
        Assert.assertEquals("Kategoriler", checkText);
        logger.info("Kategoriler Bloğunun Açıldığı Doğrulandı");
    }

    @Step("Kategorilerden Kadını Seçiyoruz")
    public void clickKadin() throws InterruptedException {
        Thread.sleep(1500);
        appiumDriver.findElement(Selector.CLICK_KADIN).click();
        logger.info("Kategorilerden Kadin Seçildi...");
    }

    @Step("Kadının Altında Pantolon Kategorisini Seçiyoruz")
    public void clickPantolon() throws InterruptedException {
        Thread.sleep(1500);
        appiumDriver.findElement(Selector.CLICK_PANTS).click();
        logger.info("Pantolon Kategorisini Seçtik");
    }
}
