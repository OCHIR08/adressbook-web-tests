import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

import static org.testng.Assert.*;

public class UntitledTestCase {
    private WebDriver driver;


    @BeforeClass(alwaysRun = true)
    public void setUp()  {
        driver = new FirefoxDriver();

        // открывет браузер на весь экран
        driver.manage().window().maximize();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

    @BeforeMethod
    public void checkLogin() {

    }

    @AfterMethod
    public void screenShot() throws IOException {
        TakesScreenshot scr = ((TakesScreenshot) driver);
        File file1 = scr.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file1, new File("\\Users\\a183338429\\Desktop"));
    }

    @Test
    public void testUntitledTestCase() throws Exception {
        driver.get("https://vk.com");
        String currentUrl1 = driver.getCurrentUrl();
        System.out.println(currentUrl1);

        driver.findElement(By.id("index_email")).click();
        driver.findElement(By.id("index_email")).clear();
        driver.findElement(By.id("index_email")).sendKeys("79268101242");
        driver.findElement(By.id("index_pass")).click();
        driver.findElement(By.id("index_pass")).clear();
        driver.findElement(By.id("index_pass")).sendKeys("3#^8KPovcXXwsznQnNXb");
        driver.findElement(By.id("index_login_button")).click();
        Thread.sleep(5 * 1000);

        //  провера коректного url
        String currentUrl = driver.getCurrentUrl();
        assertEquals(currentUrl, "https://vk.com/feed");
    }
    @Test
    public void test1() throws Exception {
        driver.get("https://vk.com");
        driver.findElement(By.id("index_email")).click();
        driver.findElement(By.id("index_email")).clear();
        driver.findElement(By.id("index_email")).sendKeys("79268101242");
        driver.findElement(By.id("index_pass")).click();
        driver.findElement(By.id("index_pass")).clear();
        driver.findElement(By.id("index_pass")).sendKeys("3#^8KPovcXXwsznQnNXb");
        driver.findElement(By.id("index_login_button")).click();
        Thread.sleep(5 * 1000);
    }


}
