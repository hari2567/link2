import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

public class LoginPageTest {
    public WebDriver driver;

    @Test
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qaappstore.ccbp.tech/");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test(priority = 1)
    public void imageheading() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement heading = driver.findElement(By.className("heading"));
        System.out.println(heading.getText());
        WebElement searchelement = driver.findElement(By.className("search-input"));
        System.out.println(searchelement.isDisplayed());
        WebElement tablist = driver.findElement(By.className("tabs-list"));
        System.out.println(tablist.isDisplayed());


    }

    @Test(priority = 2)
    public void bottomsection() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement applist = driver.findElement(By.className("apps-list"));
        System.out.println(applist.isDisplayed());
        WebElement buttonlink = driver.findElement(By.xpath("//button[text()='Social']"));
        buttonlink.click();
        List<WebElement> items = driver.findElements(By.className("app-item"));
        if (items.size() == 10) {
            System.out.println(
                    "images are displayed" + items.size()

            );
        } else {
            System.out.println("images are not displayed");
        }
        WebElement buttonlink2 = driver.findElement(By.xpath("//button[text()='Games']"));
        buttonlink2.click();
        List<WebElement> items2 = driver.findElements(By.className("app-item"));
        if (items2.size() == 10) {
            System.out.println(
                    "images are displayed" + items.size()

            );
        } else {
            System.out.println("images are not displayed");
        }
        WebElement buttonlink3 = driver.findElement(By.xpath("//button[text()='News']"));
        buttonlink.click();
        List<WebElement> items3 = driver.findElements(By.className("app-item"));
        if (items3.size() == 10) {
            System.out.println(
                    "images are displayed" + items.size()

            );
        } else {
            System.out.println("images are not displayed");
        }
        WebElement buttonlink4 = driver.findElement(By.xpath("//button[text()='Social']"));
        buttonlink4.click();
        List<WebElement> items4 = driver.findElements(By.className("app-item"));
        if (items4.size() == 10) {
            System.out.println(
                    "images are displayed" + items.size()

            );
        } else {
            System.out.println("images are not displayed");
        }

    }
    @Test(priority = 3)
    public void serchfunctionality(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement buttonlink4 = driver.findElement(By.xpath("//button[text()='News']"));
        buttonlink4.click();
        WebElement searchfunction=driver.findElement(By.className("search-input"));
        searchfunction.sendKeys("news");
        List<WebElement>jeycode=driver.findElements(By.className("app-item"));
        if(jeycode.size()==7){
            System.out.println("apps are displayed"+jeycode.size());
        }else{
            System.out.println("not dispalyed");
        }

    }


}