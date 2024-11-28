@E2E

  Feature: US_002 Visibility of Top Bar Elements

    Scenario: TC_00201 (Latest News should be visible)
      Given Verify visibility of Latest News
    Scenario: TC_00202 (Logo and Top Bar Titles should be visible)
      Given Verify the visibility of Site Logo
      Then Verify visibility of Home Title
      And Verify visibility of Appointment Title
      And Verify visibility of About Us Title
      And Verify visibility of Gallery Title
      And Verify visibility of Contact Us Title
    Scenario: TC_00203 (Homepage should be refreshed when the Site Logo is clicked)
      Given Verify clickability of the Site Logo
    Scenario: TC_00204 (Top Bar Titles should be clickable)
      Given Verify clickability of Home Title
      Then Verify clickability of Appointment Title
      And Verify clickability of About Us Title
      And Verify clickability of Gallery Title
      And Verify clickability of Contact Us Title



