package JavaConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RobotClass {

    public static String url = "https://spreadsheetpage.com/accounting/rental-property-income-expenses/";

    public static void main(String[] args) throws InterruptedException {

        String driverPath = System.getProperty("user.dir") + "/src/main/resources/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='s']"));
        WebElement postComment = driver.findElement(By.xpath("//input[@id='submit']"));
        WebElement linkedIn = driver.findElement(By.xpath("//a[@class='linkedin']"));

        List<WebElement> postShare = driver.findElements(By.cssSelector(".post-share"));
        for (WebElement element : postShare){
            System.out.println(element.getText());
        }


        JavascriptExecutor js = (JavascriptExecutor) driver;


        js.executeScript("arguments[0].scrollIntoView();", postComment);



        postComment.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,100)");
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(linkedIn));
        System.out.println(11);
        js.executeScript("arguments[0].scrollIntoView();", linkedIn);
        System.out.println(22);
        driver.quit();


    }
}