package com.ozdilek.odev.android.pages;

import com.ozdilek.odev.android.BaseTest;
import com.ozdilek.odev.android.Selector;
import com.thoughtworks.gauge.Logger;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class ProductDetail extends BaseTest {

    @Step("Sayfayı Aşağı Kaydırıyoruz")
    public void scrollDown() throws InterruptedException {
        Dimension dimension = appiumDriver.manage().window().getSize();
        int start_x = (int) (dimension.width * 0.5);
        int start_y = (int) (dimension.height * 0.5);

        int end_x = (int) (dimension.width * 0.3);
        int end_y = (int) (dimension.height * 0.3);

        TouchAction touch = new TouchAction(appiumDriver);
        touch.press(PointOption.point(start_x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x, end_y)).release().perform();
        Thread.sleep(1000);
        logger.info("Sayfa Aşağı Kaydırıldı");
    }

    @Step("Sayfayı İkinci Kez Kaydırıyoruz")
    public void secondScrollDown() {
        Dimension dimension = appiumDriver.manage().window().getSize();
        int start_x = (int) (dimension.width * 0.5);
        int start_y = (int) (dimension.height * 0.5);

        int end_x = (int) (dimension.width * 0.3);
        int end_y = (int) (dimension.height * 0.3);

        TouchAction touch = new TouchAction(appiumDriver);
        touch.press(PointOption.point(start_x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x, end_y)).release().perform();
        logger.info("Sayfa 2.kez Kaydırıldı");
    }

    @Step("<Key> Rastgele Ürün Seçtiriyoruz")
    public void findAllProducts(String Key) {
        List<MobileElement> productList = appiumDriver.findElementsByXPath(Key);
        int size = productList.size();
        Random rnd = new Random();
        int randomNum = rnd.nextInt(size);
        productList.get(randomNum).click();
    }

    @Step("Ürün Detaylarını Kontrol Ettiriyoruz")
    public void checkProductDetail() throws InterruptedException {
        Thread.sleep(3000);
        String checkText = appiumDriver.findElement(Selector.CHECK_PRODUCT_DETAILS).getText();
        Assert.assertEquals("Renk:", checkText);
        logger.info("Detaylara Bakıldı");
    }

    @Step("Favorilere Ekliyoruz")
    public void addFav() throws InterruptedException {
        Thread.sleep(3000);
        appiumDriver.findElement(Selector.ADD_FAV).click();
        logger.info("Favorilere Eklendi");
    }

    @Step("<Key> Beden Seçimi Yaptırıyoruz")
    public void clickElementByxpath(String Key) {
        appiumDriver.findElement(By.xpath(Key)).click();
        Logger.info("Beden Seçimi Yapıldı");
    }

    @Step("Sepete Ekliyoruz")
    public void addToBasket() throws InterruptedException {
        Thread.sleep(5000);
        appiumDriver.findElement(Selector.ADD_BASKET).click();
        logger.info("Sepete Eklendi");
    }

}
