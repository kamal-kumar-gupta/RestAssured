package EventFiringWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class IAmTheEventListener extends AbstractWebDriverEventListener {


    public void beforeAlertAccept(WebDriver driver) {
        System.out.println("beforeAlertAccept method");

    }

    public void afterAlertAccept(WebDriver driver) {
        System.out.println("afterAlertAccept method");
    }

    public void afterAlertDismiss(WebDriver driver) {
        System.out.println("afterAlertDismiss method");
    }


    public void beforeAlertDismiss(WebDriver driver) {
        System.out.println("beforeAlertDismiss method");
    }

    public void beforeNavigateTo(String url, WebDriver driver) {
        System.out.println("beforeNavigateTo method");
    }

    public void afterNavigateTo(String url, WebDriver driver) {
        System.out.println("afterNavigateTo method");
    }

    public void beforeNavigateBack(WebDriver driver) {
        System.out.println("Just before beforeNavigateBack " + driver.getCurrentUrl());
    }

    public void afterNavigateBack(WebDriver driver) {
        System.out.println("afterNavigateBack method");
    }

    public void beforeNavigateForward(WebDriver driver) {
        System.out.println("beforeNavigateForward method");
    }




}
