package pages;


import helpers.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;


public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static final String BASE_URL = "http://www.tut.by/";
    private static final By FINANCE_LINK = By.linkText("Финансы");

    public HomePage() {

    }

    public void clickFinanceLink(){

        getDriver().get(BASE_URL);
        getDriver().findElement(FINANCE_LINK).click();
    }
}
