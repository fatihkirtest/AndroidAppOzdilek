package com.ozdilek.odev.android.pages;

import com.ozdilek.odev.android.BaseTest;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

import static com.ozdilek.odev.android.Selector.*;
import static com.ozdilek.odev.android.Selector.PASSWORD;

public class LoginPage extends BaseTest {
    @Step("Login Olma Kontrolü Yapıyoruz")
    public void checkLoginPage() throws InterruptedException {
        Thread.sleep(1000);
        String checkText = appiumDriver.findElement(CHECK_LOGIN_PAGE).getText();
        Assert.assertEquals("Giriş Yap", checkText);
        logger.info("Login Verilerine Gidiyoruz");
    }

    @Step("Login Olduk")
    public void writeLoginBoxes() {
        appiumDriver.findElement(EMAIL_BOX).sendKeys(EMAIL);
        appiumDriver.findElement(PASSWORD_BOX).sendKeys(PASSWORD);
        logger.info("Login Olduk");
    }

    @Step("Önceki Sayfaya Gidiyoruz")
    public void backToPage() {
        appiumDriver.findElement(BACK_TO_PAGE).click();
        logger.info("Önceki Sayfaya Gidildi");
    }
}
