package com.example.demoqatestbooks.BookStoreApplication;

import com.example.demoqatestbooks.core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class BookStorePageAfterSearch extends BaseSeleniumPage {

    @FindBy(xpath = "//span//a[@href]")
    private List<WebElement> href;


    public BookStorePageAfterSearch() {
        PageFactory.initElements(driver, this);
    }

    public BookPage checkTitle(){
        int randomPage = new Random().nextInt(href.size());
        href.get(0).click();
        return new BookPage();
    }

}
