package com.heallifehospital.step_definitions;


import com.heallifehospital.utilities.ConfigReader;
import com.heallifehospital.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {

    @Before
    public void setUp(){

        //ChromeDriver driver = new ChromeDriver(options);
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Driver.getDriver().manage().deleteAllCookies();

//        ReusableMethods.waitFor(2);
//        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//*[contains(@id,'jetlinkWidgetFrame')]")));
//        ReusableMethods.waitFor(2);
//        ReusableMethods.clickWithJS(Driver.getDriver().findElement(By.xpath("//div[@class='boxclose']")));
//        ReusableMethods.waitFor(1);
//        Driver.getDriver().switchTo().defaultContent();

       // Driver.getDriver().findElement(By.xpath("//button[@class='_hj-ONMkJ__MinimizedWidgetMessage__close _hj-dk3Fb__styles__iconX _hj-L5SMl__styles__icon']")).click();
       // ReusableMethods.closeCerez1();
//        ReusableMethods.clickWithJS(Driver.getDriver().findElement(By.xpath("//span[normalize-space()='X']")));
//        ReusableMethods.waitFor(2);
//        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//*[contains(@id,'jetlinkWidgetFrame')]")));
       // ReusableMethods.waitFor(2);
        //ReusableMethods.clickWithJS(Driver.getDriver().findElement(By.xpath("//div[@class='boxclose']")));
//        ReusableMethods.waitFor(1);
//        Driver.getDriver().switchTo().defaultContent();





    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){

            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }

       Driver.closeDriver();

    }



}