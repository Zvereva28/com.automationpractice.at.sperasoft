package com.automationpractice.at.sperasoft.pages.base;

import com.automationpractice.at.sperasoft.blocks.HeaderBlock;
import com.automationpractice.at.sperasoft.pages.LeftNavigation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class BasePage {
    protected WebDriver driver;
    protected LeftNavigation leftNavigation;
    protected HeaderBlock headerBlock;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.leftNavigation = new LeftNavigation();
        this.headerBlock = new HeaderBlock();
        PageFactory.initElements(driver, this);
    }
//??? нежен ли? сделать проще???
    protected WebElement findElement(List<WebElement> list, String expectedText) {
        List<Object> arrayList = new ArrayList<>();
        for (WebElement webElement : list) {
            String actualText = webElement.getText();
            arrayList.add(actualText);
            if (actualText.toLowerCase().trim().equals(expectedText.toLowerCase().trim())) {
                return webElement;
            }
        }
        throw new RuntimeException("В коллекции элементов: " + arrayList + "\nНе найден элемент с тектом: " + expectedText);
    }
    //__________________________

    public LeftNavigation getLeftNavigation() {return leftNavigation;}

    public HeaderBlock getHeaderBlock(){return headerBlock;}



}
