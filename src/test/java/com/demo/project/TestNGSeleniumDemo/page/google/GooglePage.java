package com.demo.project.TestNGSeleniumDemo.page.google;

import com.centralframework.springboot.supportselenium.annotation.Page;
import com.centralframework.springboot.testngselenium.service.WebDriverManagerUtil;
import org.openqa.selenium.WebDriver;

@Page
public class GooglePage {

    WebDriver driver = new WebDriverManagerUtil().getWebDriver();
    private final SearchComponent searchComponent = new SearchComponent(driver);
    private final SearchResult searchResult= new SearchResult(driver);


    public void goTo(){
        String url = "https://www.google.com";
        driver.get(url);
    }

    public SearchComponent getSearchComponent() {
        return searchComponent;
    }

    public SearchResult getSearchResult() {
        return searchResult;
    }

    public void close(){
        driver.quit();
    }

}
