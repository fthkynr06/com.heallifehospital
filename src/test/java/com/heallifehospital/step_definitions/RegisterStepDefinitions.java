package com.heallifehospital.step_definitions;

import com.heallifehospital.pages.RegisterPage;

import io.cucumber.java.en.*;


public class RegisterStepDefinitions {

    RegisterPage registerPage = new RegisterPage();

    @Given("Click on the login button on the homepage")
    public void click_on_the_login_button_on_the_homepage() {
        registerPage.loginButton.click();
    }


}
