package com.example.demoqatestbooks.BookStoreApplication;

import com.codeborne.selenide.ElementsCollection;
import com.example.demoqatestbooks.core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;

public class BookStorePageAfterSearch extends BaseSeleniumPage {

    @FindBy(xpath = "//span//a[@href]")
    private List<WebElement> href;


    public BookStorePageAfterSearch() {
        PageFactory.initElements(driver, this);
    }

    public BookStorePageAfterSearch checkSearch(){
        System.out.println("fghfgggggg" + href.get(2).getText());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        hrefs.forEach(x->links.add(x.getAttribute("href")));
        int i = 9;
        return this;
    }

}
