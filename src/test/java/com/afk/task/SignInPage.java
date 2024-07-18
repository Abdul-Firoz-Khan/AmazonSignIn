package com.afk.task;

import com.afk.utils.I1;
import io.qameta.allure.Allure;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;

public class SignInPage extends I1 {
    WebDriver driver;
    boolean status;

    SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Creating a new account")
    void createAccount() {
        status = driver.getPageSource().contains("Create your Amazon account");

        Allure.step("Page contains 'Create your Amazon account': " + status);
        System.out.println("Create your Amazon account status = " + status);

        if (status) {
            driver.findElement(createAccount).click();
            Allure.step("Clicked on Create Account");

        } else {
            driver.findElement(conditionsOfUse).click();
            Allure.step("Clicked on Conditions of Use");
        }
    }
}
