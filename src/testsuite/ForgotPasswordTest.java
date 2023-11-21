// File: src/test/java/testsuite/ForgotPasswordTest.java
package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class ForgotPasswordTest extends BaseTest {

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
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        // Navigate to the base URL
        driver.get(BASE_URL);

        // Click on the 'Forgot your password' link
        WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot your password?"));
        forgotPasswordLink.click();

        // Verify the text 'Reset Password'
        WebElement resetPasswordText = driver.findElement(By.xpath("//h1[text()='Reset Password']"));
        assertTrue("Reset Password text is not displayed", resetPasswordText.isDisplayed());
    }
}
