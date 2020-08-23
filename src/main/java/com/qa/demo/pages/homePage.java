package com.qa.demo.pages;

import com.qa.demo.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

/**
 * @author raj
 *
 */
public class homePage extends TestBase {
    public homePage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    /**
     *  This section of the Home page contains all the object/Locators of the Home screen
     *  All the Locators is static in nature, can access in entire project any where
     *  For locating elements here using @findBy for page object creation
     */

    @FindBy(xpath = "//input[@id='email']")
    static WebElement homePageEmailInput;







    /**
     *  This section fo the home page contains all the possible homepage scenario's for test
     *  all the methods are public in nature and return the actual results
     */

    public static String verifyHomePageTitle(){
        String title =driver.getTitle();
        return title;
    }



}
