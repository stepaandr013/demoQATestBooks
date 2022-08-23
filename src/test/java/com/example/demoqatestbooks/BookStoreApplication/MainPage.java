package com.example.demoqatestbooks.BookStoreApplication;

import com.example.demoqatestbooks.core.BaseSeleniumPage;
import com.example.demoqatestbooks.readConfig.ConfigProvider;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseSeleniumPage {

    @FindBy(xpath = "//html")
    private WebElement page;

    @FindBy(xpath = "//div[@class='avatar mx-auto white']/following::div[21]/following::div[2]")
    private WebElement bookStoreApplication;

    public MainPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public MainPage chooseBookPage(){
        page.sendKeys(Keys.PAGE_DOWN);
        return this;
    }

    public BookStorePage openBookStorePage(){
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bookStoreApplication.click();
        return new BookStorePage();
    }

}
