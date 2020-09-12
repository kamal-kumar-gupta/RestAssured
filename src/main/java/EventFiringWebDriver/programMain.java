package EventFiringWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class programMain {

    public static void main(String[] args) throws InterruptedException {

        String driverPath= System.getProperty("user.dir")+"/src/Drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver driver = new ChromeDriver();

        IAmTheEventListener eventListener = new IAmTheEventListener();
        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
        eventFiringWebDriver.register(eventListener);

        eventFiringWebDriver.get("https://toolsqa.com/automation-practice-switch-windows/");
        eventFiringWebDriver.manage().window().maximize();
        eventFiringWebDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement element1 = eventFiringWebDriver.findElement(By.linkText("HOME"));
        element1.click();
        Thread.sleep(3000);
        System.out.println(eventFiringWebDriver.getWindowHandle());
        eventFiringWebDriver.unregister(eventListener);
        System.out.println("event firing webdriver instance closing out...");
        driver.quit();
        System.out.println("Quit driver command executed");
    }
}
