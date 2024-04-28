package org.example;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppTest {

    @Test
    public void Login() throws InterruptedException, MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("vivo 1906");
        options.autoGrantPermissions();
        options.setCapability("platformName", "Android");
        options.setCapability("platformVersion", "11");
        options.setCapability("automationName", "UiAutomator2");
        options.setApp("C:\\Users\\Abdullah Tariq\\IdeaProjects\\Class8TestNG\\src\\test\\java\\Resource\\Android-MyDemoAppRN.1.3.0.build-244.apk");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);

        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]/android.widget.ImageView")).click();
        Thread.sleep(1000);
        WebElement element5=driver.findElement(new AppiumBy.ByAndroidUIAutomator("text(\"Log In\")"));
        element5.click();

        driver.findElement(new AppiumBy.ByAccessibilityId("Username input field")).sendKeys("bob@example.com");
        driver.findElement(new AppiumBy.ByAccessibilityId("Password input field")).sendKeys("10203040");
        driver.findElement(new AppiumBy.ByAccessibilityId("Login button")).click();
    }

}
