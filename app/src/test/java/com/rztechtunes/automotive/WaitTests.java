package com.rztechtunes.automotive;
import java.net.MalformedURLException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;




public class WaitTests {

    WebDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "vivo vivo 1906");
        capabilities.setCapability(CapabilityType.VERSION, "11");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.imo.android.imoim");
        capabilities.setCapability("appActivity", "com.imo.android.imoim.activities.Home");
        driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
    }

    @Test
    public void testIMOLogin() {

        // Click on number 2 button.
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
        driver.findElement(By.id("com.imo.android.imoim:id/phone")).sendKeys("1924250146");
        driver.findElement(By.id("com.imo.android.imoim:id/get_started_button")).click();
        driver.findElement(By.id("com.imo.android.imoim:id/btn_positive")).click();
        driver.findElement(By.id("com.imo.android.imoim:id/btn_positive")).click();
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.MINUTES);
    }
    @After
    public void End() {
     //   driver.quit();
    }
}