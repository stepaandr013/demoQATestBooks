package com.example.demoqatestbooks.BookStoreApplication;

import com.example.demoqatestbooks.core.BaseSeleniumPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookStorePage extends BaseSeleniumPage {

    @FindBy(id = "searchBox")
    private WebElement searchLine;

    public BookStorePage() {
        PageFactory.initElements(driver, this);
    }

    public BookStorePageAfterSearch searchBook(){
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchLine.sendKeys("java", Keys.ENTER);
        return new BookStorePageAfterSearch();
    }

}
