package com.demo.project.TestNGSeleniumDemo.test;

import com.demo.project.TestNGSeleniumDemo.page.google.GooglePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {


    private final GooglePage googlePage = new GooglePage();

    @Test
    public void googleTest()  {
        this.googlePage.goTo();
        this.googlePage.getSearchComponent().search("selenium");
        Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 5);
        this.googlePage.close();
    }

}
