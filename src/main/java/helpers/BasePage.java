package helpers;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private WebDriver driver;

    public BasePage(WebDriver driver) {

        this.driver = driver;
    }

    public BasePage() {

    }

    public WebDriver getDriver(){

        return this.driver;
    }

    public  void waitForElementPresence(WebDriver driver, final By locator, long timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return driver.findElements(locator).size() > 0;
            }
        });
    }

}
