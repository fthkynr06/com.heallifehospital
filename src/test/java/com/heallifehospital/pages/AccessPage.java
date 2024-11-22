package com.heallifehospital.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccessPage extends BasePage {
    @FindBy(css="a.navbar-brand.logo")
    public WebElement verifyAccess;
}
