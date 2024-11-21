package com.heallifehospital.utilities;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.URL;

public class Driver {

    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();
    private Driver() {

    }

    public static WebDriver getDriver() {
        //if this thread doesn't have a web driver yet - create it and add to pool
        if (driverPool.get() == null) {
            System.out.println("TRYING TO CREATE DRIVER");
            // this line will tell which browser should open based on the value from properties file

            String browserParamFromEnv = System.getProperty("browser");
            String browser = browserParamFromEnv == null ? ConfigReader.getProperty("browser") : browserParamFromEnv;
            switch (browser) {

                case "chrome":
                    ChromeOptions opt = new ChromeOptions();
                    opt.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
                    opt.addArguments("--disable-extensions");
                    opt.addArguments("disable-notifications");
                    opt.addArguments("no-sandbox");
                    opt.addArguments("--remote-allow-origins=*");
                    //opt.addArguments("--user-data-dir=/path/to/your/custom/profile");
                    opt.addArguments("--disable-password-manager-reauthentication");
                    opt.addArguments("--disable-save-password-bubble");
                    opt.setAcceptInsecureCerts(true);
                    driverPool.set(new ChromeDriver(opt));
                    break;

                case "firefox":
                    // WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    break;

                case "ie":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows")) {
                        throw new WebDriverException("Your OS doesn't support Internet Explorer");
                    }
                    driverPool.set(new InternetExplorerDriver());
                    break;
                case "edge":
                    if (!System.getProperty("os.name").toLowerCase().contains("windows")) {
                        throw new WebDriverException("Your OS doesn't support Edge");
                    }
                    driverPool.set(new EdgeDriver());
                    break;
                case "headless-edge":
                    EdgeOptions headlessEdgeOptions = new EdgeOptions();
                    headlessEdgeOptions.addArguments("--headless");
                    headlessEdgeOptions.addArguments("--window-size=1920,1080");
                    driverPool.set(new EdgeDriver(headlessEdgeOptions));
                    break;
                case "safari":
                    if (!System.getProperty("os.name").toLowerCase().contains("mac")) {
                        throw new WebDriverException("Your OS doesn't support Safari");
                    }
                    driverPool.set(new SafariDriver());
                    break;

                case "remote_chrome":
                    try {
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setBrowserName("chrome");
                        desiredCapabilities.setCapability("platform", Platform.ANY);
                        driverPool.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), desiredCapabilities));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "remote_firefox":
                    try {
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setBrowserName("firefox");
                        desiredCapabilities.setCapability("platform", Platform.ANY);
                        driverPool.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), desiredCapabilities));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }

        return driverPool.get();
    }
    public static void closeDriver() {
        try {
            driverPool.get().quit();
            driverPool.remove();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driverPool.get() != null) {
                driverPool.get().quit();
                driverPool.remove();
            }
        }

    }
}
