package com.qa.demo.testCases;

import com.qa.demo.base.TestBase;
import com.qa.demo.pages.homePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;
/**
 * @author raj
 *
 */
public class homePageTest extends TestBase {
    static homePage home;
    public homePageTest() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }
    @BeforeMethod
    public static void Setup() throws IOException, InterruptedException {
        initialization();
        Thread.sleep(1000);
    }
    @Test
    public static void homePageTitleTest(){
    String title = home.verifyHomePageTitle();
        Assert.assertEquals(title,"Index");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
