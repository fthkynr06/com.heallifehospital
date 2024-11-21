package com.heallifehospital.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

    @FindBy(xpath = "(//a[normalize-space()='Login'])[1]")
    public WebElement loginButton;


}
