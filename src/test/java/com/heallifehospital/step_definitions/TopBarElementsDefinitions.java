package com.heallifehospital.step_definitions;

import com.heallifehospital.pages.HomePage;
import io.cucumber.java.en.*;

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
        System.out.println("Verifying visibility of Home Title is successful =" +verifyHomeTitleText);

    }
    @Given("Verify the visibility of Site Logo")
    public void verify_the_visibility_of_site_logo() {
        String verifyLogo = homePage.verifySiteLogo.getText();
        homePage.verifySiteLogo.isDisplayed();
        System.out.println("Verify the visibility of Site Logo is successful =" +verifyLogo );
    }
    @Then("Verify visibility of Appointment Title")
    public void verify_visibility_of_appointment_title() {
        String verifyAppointmentTitleText = homePage.verifyAppointmentTitle.getText();
        homePage.verifyAppointmentTitle.isDisplayed();
        System.out.println("Verify visibility of Appointment Title is successful=" +verifyAppointmentTitleText);

    }
    @Then("Verify visibility of About Us Title")
    public void verify_visibility_of_about_us_title() {
        String verifyAboutUsTitleText = homePage.verifyAboutUsTitle.getText();
        homePage.verifyAboutUsTitle.isDisplayed();
        System.out.println("Verify visibility of About Us Title is successful =" + verifyAboutUsTitleText);

    }
    @Then("Verify visibility of Gallery Title")
    public void verify_visibility_of_gallery_title() {
        String verifyGalleryTitleText = homePage.verifyGalleryTitle.getText();
        homePage.verifyGalleryTitle.isDisplayed();
        System.out.println("Verify visibility of Gallery Title is successful=" + verifyGalleryTitleText);

    }
    @Then("Verify visibility of Contact Us Title")
    public void verify_visibility_of_contact_us_title() {
        String verifyContactUsTitleText = homePage.verifyContactUsTitle.getText();
        homePage.verifyContactUsTitle.isDisplayed();
        System.out.println("Verify visibility of Contact Us Title is successful =" + verifyContactUsTitleText);
    }
    @Given("Verify clickability of the Site Logo")
    public void verify_clickability_of_the_site_logo() {
        String verifyClickabilityofSiteLogoText = homePage.verifySiteLogo.getText();
        homePage.verifySiteLogo.isEnabled();
        System.out.println("Verifying clickability of the Site Logo is successful =" + verifyClickabilityofSiteLogoText);
    }
    @Given("Verify clickability of Home Title")
    public void verify_clickability_of_home_title() {
        String verifyClickabilityOfHomeTitleText = homePage.verifyHomeTitle.getText();
        homePage.verifyHomeTitle.isEnabled();
        System.out.println("Verifying clickability of Home Title is successful =" + verifyClickabilityOfHomeTitleText);

    }
    @Then("Verify clickability of Appointment Title")
    public void verify_clickability_of_appointment_title() {
        String verifyClickabilityOfAppointmentTitleText = homePage.verifyAppointmentTitle.getText();
        homePage.verifyAppointmentTitle.isEnabled();
        System.out.println("Verifying clickability of Appointment Title is successful =" + verifyClickabilityOfAppointmentTitleText);
    }
    @Then("Verify clickability of About Us Title")
    public void verify_clickability_of_about_us_title() {
        String verifyClickabilityOfAboutUsTitleText = homePage.verifyAboutUsTitle.getText();
        homePage.verifyAboutUsTitle.isEnabled();
        System.out.println("Verifying clickability of About Us Title is successful =" + verifyClickabilityOfAboutUsTitleText);
    }
    @Then("Verify clickability of Gallery Title")
    public void verify_clickability_of_gallery_title() {
        String verifyClickabilityOfGalleryTitleText = homePage.verifyGalleryTitle.getText();
        homePage.verifyGalleryTitle.isEnabled();
        System.out.println("Verifying clickability of Gallery Title is successful =" + verifyClickabilityOfGalleryTitleText);
    }
    @Then("Verify clickability of Contact Us Title")
    public void verify_clickability_of_contact_us_title() {
        String verifyClickabilityOfContactUsTitleText = homePage.verifyContactUsTitle.getText();
        homePage.verifyGalleryTitle.isDisplayed();
        System.out.println("Verifying clickability of Gallery Title is successful =" + verifyClickabilityOfContactUsTitleText);
    }
}
