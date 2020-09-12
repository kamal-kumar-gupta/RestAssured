package JavaConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.awt.windows.ThemeReader;

import java.util.concurrent.TimeUnit;

public class SeleniumGuru99 {

//    String url = " http://demo.guru99.com/popup.php";
    public static String url = "http://demo.guru99.com/test/delete_customer.php";

    public static void main(String[] args) throws InterruptedException {

        String driverPath = System.getProperty("user.dir")+ "/src/main/resources/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);
        driver.findElement(By.name("cusid")).sendKeys("kamal");
        driver.findElement(By.name("submit")).click();

        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        System.out.println(alertMessage);

        alert.accept();

        String nextHandle = driver.getWindowHandle();
        System.out.println(nextHandle);
        Thread.sleep(5000);
        alert.accept();
        System.out.println(driver.getCurrentUrl());
    }


}
