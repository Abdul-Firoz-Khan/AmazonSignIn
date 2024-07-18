package com.afk.task;

import com.afk.utils.I1;
import io.qameta.allure.Allure;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;

public class SignInPage extends I1 {
    WebDriver driver;

    SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Creating a new account")
    void createAccount() {
        driver.findElement(createAccount).click();
        Allure.step("Clicked on Create Account");
    }
}
