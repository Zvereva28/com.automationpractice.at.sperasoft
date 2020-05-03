package com.automationpractice.at.sperasoft.pages.base;
import com.automationpractice.at.sperasoft.BasePageObject;
import com.automationpractice.at.sperasoft.blocks.HeaderBlock;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;


public abstract class BasePage extends BasePageObject {

     protected HeaderBlock headerBlock;

    public BasePage(WebDriver driver) {
        super(driver);
        this.headerBlock = new HeaderBlock(driver);
        PageFactory.initElements(driver, this);
    }

   // public LeftNavigation getLeftNavigation() {return leftNavigation;}

  public HeaderBlock getHeaderBlock(){return headerBlock;}



}
