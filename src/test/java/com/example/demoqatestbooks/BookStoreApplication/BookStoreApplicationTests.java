package com.example.demoqatestbooks.BookStoreApplication;

import com.example.demoqatestbooks.core.BaseSeleniumTest;
import org.junit.Test;

public class BookStoreApplicationTests extends BaseSeleniumTest {

    @Test
    public void Test(){
        new MainPage().chooseBookPage()
                .openBookStorePage()
                .searchBook()
                .checkSearch();
    }

}
