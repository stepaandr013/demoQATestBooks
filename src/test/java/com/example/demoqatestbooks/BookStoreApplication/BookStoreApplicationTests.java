package com.example.demoqatestbooks.BookStoreApplication;

import com.example.demoqatestbooks.core.BaseSeleniumTest;
import org.junit.Test;

public class BookStoreApplicationTests extends BaseSeleniumTest {

    @Test
    public void Test(){
        Book book = new MainPage().chooseBookPage()
                .openBookStorePage()
                .searchBook()
                .checkTitle()
                .checkBookTitle();
    }

}
