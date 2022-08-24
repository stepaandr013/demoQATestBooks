package com.example.demoqatestbooks.BookApi;

import com.example.demoqatestbooks.readConfig.ConfigProvider;
import org.junit.Test;

public class BookApiTest {
    private final static String URL = ConfigProvider.URL;

    @Test
    public void checkBooks(){
        Specifications.installSpecification(Specifications.requestSpecification(URL), Specifications.responseSpecification(200));
    }

}
