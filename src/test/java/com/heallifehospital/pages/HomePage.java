package com.heallifehospital.pages;

import com.heallifehospital.utilities.Driver;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HomePage extends BasePage {

        @FindBy(xpath = "//*[text()='Latest News']")
        public WebElement verifyLatestNews;

        @FindBy(xpath ="(//a[text()='Home'])[1]")
        public WebElement verifyHomeTitle;

    }


