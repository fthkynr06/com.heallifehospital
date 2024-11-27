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

        @FindBy(xpath = "//a[@class='navbar-brand logo']")
        public WebElement verifySiteLogo;

        @FindBy(xpath = "//a[@href='../form/appointment']")
        public WebElement verifyAppointmentTitle;

        @FindBy(xpath = "//a[@class='dropdown-toggle']")
        public WebElement verifyAboutUsTitle;

        @FindBy(xpath = "(//a[@href='https://qa.heallifehospital.com/page/gallery'])[1]")
        public WebElement verifyGalleryTitle;

        @FindBy(xpath = "(//a[@href='https://qa.heallifehospital.com/page/contact-us'])[1]")
        public WebElement verifyContactUsTitle;

    }


