package com.heallifehospital.step_definitions;

import com.heallifehospital.pages.AccessPage;
import io.cucumber.java.en.*;

public class AccessStepDefinitions {

    AccessPage accessPage = new AccessPage();
    @Given("Verify access to URL is successful")
    public void verify_access_to_url_is_successful() {
    String verifyAccessText = accessPage.verifyAccess.getText();
    accessPage.verifyAccess.isDisplayed();
        System.out.println("Verifying of access to URL is successful=" + verifyAccessText);
    }
}
