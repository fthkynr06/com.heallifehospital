package com.heallifehospital.step_definitions;

import com.heallifehospital.pages.HomePage;
import io.cucumber.java.en.Given;

public class TopBarElementsDefinitions {
    HomePage homePage= new HomePage();
    @Given("Verify visibility of Latest News")
    public void verify_visibility_of_latest_news() {
        String verifyLatestNewsText = homePage.verifyLatestNews.getText();
        homePage.verifyLatestNews.isDisplayed();
        System.out.println("Verifying the Visibility of Latest News is successful=" + verifyLatestNewsText );

       }
    @Given("Verify visibility of Home Title")
    public void verify_visibility_of_home_title() {
        String verifyHomeTitleText = homePage.verifyHomeTitle.getText();
        homePage.verifyHomeTitle.isDisplayed();
        System.out.println("Verifying visibility of Home Title is successful" +verifyHomeTitleText);
        //Deneme
    }

}
