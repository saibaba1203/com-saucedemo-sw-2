package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://www.saucedemo.com/";

    @Before

    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test

    public void userSholdLoginSuccessfullyWithValidCredentials() {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        String expectedMessage = "PRODUCTS";
        WebElement message = driver.findElement(By.xpath("//span[contains(text(),'Products')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Products text is not displayed", expectedMessage, actualMessage);

    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();


    }

    }
