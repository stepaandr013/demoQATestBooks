package com.example.demoqatestbooks.BookStoreApplication;

import com.example.demoqatestbooks.core.BaseSeleniumPage;
import com.example.demoqatestbooks.readConfig.ConfigProvider;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Locale;

public class BookPage extends BaseSeleniumPage {

    @FindBy(xpath = "//*[@id=\"userName-value\"]/following::div[6]//label")
    private WebElement title;

    @FindBy(xpath = "//*[@id=\"userName-value\"]/following::div[21]//label")
    private WebElement book;

    public BookPage() {
        PageFactory.initElements(driver, this);
    }

    public Book checkBookTitle(){

        book.click();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Book();
    }

}
