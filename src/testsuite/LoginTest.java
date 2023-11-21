// File: src/test/java/testsuite/LoginTest.java
package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class LoginTest extends BaseTest {

    private static final String BASE_URL = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void beforeTest() {
        // Setup the WebDriver before each test
        setup();
    }

    @After
    public void afterTest() {
        // Tear down the WebDriver after each test
        tearDown();
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Navigate to the base URL
        driver.get(BASE_URL);

        // Enter "Admin" username
        WebElement usernameInput = driver.findElement(By.id("txtUsername"));
        usernameInput.sendKeys("Admin");

        // Enter "admin123" password
        WebElement passwordInput = driver.findElement(By.id("txtPassword"));
        passwordInput.sendKeys("admin123");

        // Click on 'LOGIN' button
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        // Verify the 'Dashboard' text is displayed
        WebElement dashboardText = driver.findElement(By.xpath("//h1[text()='Dashboard']"));
        assertTrue("Dashboard text is not displayed", dashboardText.isDisplayed());
    }
}
