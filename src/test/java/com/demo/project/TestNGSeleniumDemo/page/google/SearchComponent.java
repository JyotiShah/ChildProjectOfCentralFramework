package com.demo.project.TestNGSeleniumDemo.page.google;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchComponent {


    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private List<WebElement> searchBtns;

    public SearchComponent(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void search(final String keyword) {
        this.searchBox.sendKeys(keyword);
        this.searchBox.sendKeys(Keys.TAB);
        this.searchBtns
                .stream()
                .filter(e -> e.isDisplayed() && e.isEnabled())
                .findFirst()
                .ifPresent(WebElement::click);
    }

}
