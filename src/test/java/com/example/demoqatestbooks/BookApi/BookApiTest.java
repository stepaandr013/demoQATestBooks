package com.example.demoqatestbooks.BookApi;

import com.example.demoqatestbooks.readConfig.ConfigProvider;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class BookApiTest {
    private final static String URL = ConfigProvider.URL;

    @Test
    public void checkBooks(){
        Specifications.installSpecification(Specifications.requestSpecification(URL), Specifications.responseSpecification(200));
        List<Books> books = given()
                .when()
                .get("BookStore/v1/Books")
                .then().log().all()
                .extract().body().jsonPath().getList("books", Books.class);

        books.forEach(x-> Assert.assertFalse(x.getTitle().isEmpty()));
        books.forEach(x-> Assert.assertTrue(x.getPages() > 200));
    }

}
