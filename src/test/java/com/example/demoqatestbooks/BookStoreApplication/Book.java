package com.example.demoqatestbooks.BookStoreApplication;

import com.example.demoqatestbooks.core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book extends BaseSeleniumPage {

    @FindBy(xpath = "/html/body/div/header/div/div/nav/ul/li")
    private WebElement bookTitle;

    public Book() {
        PageFactory.initElements(driver, this);
    }

    public String getBookTitle(){
        try {
            Thread.sleep(5200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(bookTitle);
        return "0";
    }

}
