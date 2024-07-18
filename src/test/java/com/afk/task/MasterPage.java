package com.afk.task;

import com.afk.utils.I1;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class MasterPage extends I1 {

    WebDriver driver;
    Boolean status;

    @BeforeTest
    @Step("Setting up the browser and loading the URL")
    void load_Url() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(base_url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        Allure.step("URL loaded successfully");
    }

    @AfterTest
    @Step("Teardown")
    void load_Teardown() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.quit();
        Allure.step("Browser closed and resources cleaned up");
    }

    @Test
    @Feature("Page Status Check")
    @Story("Check if the page contains 'Returns'")
    @Step("Checking page status for 'Returns'")
    void checkStatus() {
        status = driver.getPageSource().contains("Returns");
        Allure.step("Page contains 'Returns': " + status);
        System.out.println("status = " + status);
        if (status) {
            driver.findElement(signIn).click();
            Allure.step("Clicked on Sign In");
        }
    }

    @Test
    @Feature("Sign In Page")
    @Story("Create a new account")
    @Step("Navigating to Sign In page and creating a new account")
    void SignInPage() {
        SignInPage obj = new SignInPage(driver);
        obj.createAccount();
        Allure.step("Navigated to Sign In page and attempted to create a new account");
    }
}
