package com.example.ecommerce;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
class El3atarApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(
             "-------------------" +   DateTime.parse("2021-11-30T13:03:15.268+02:00").toString()  + "-------------------"
        );
    }


    @Test
    void checkFilePath() {
        System.out.println(new File("../../../images/categories/category1.jpg").getPath());
    }

}
