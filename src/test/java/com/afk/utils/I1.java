package com.afk.utils;

import org.openqa.selenium.By;

public class I1 {
    protected String base_url = "https://www.amazon.in/";
    protected By signIn = By.xpath("//span[@id='nav-link-accountList-nav-line-1']");
    protected By createAccount = By.xpath("//a[@id='createAccountSubmit']");
    protected By conditionsOfUse = By.xpath("//a[contains(text(),'Conditions of Use')]");
}
