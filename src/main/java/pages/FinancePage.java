package pages;


import helpers.BasePage;
import helpers.DateValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FinancePage extends BasePage {

    public FinancePage(WebDriver driver) {
        super(driver);
    }

    public FinancePage(){}

    private static final By SELECT_FIELD_BYR = By.xpath(".//*[@id='BYR_item']//input");
    private static final By SELECT_FIELD_USD = By.xpath(".//*[@id='USD_item']//input");
    // not efficient
    private static final By CURRENT_NBRB_COURSE = By.xpath(".//*[@id='k-nbrb']/div/table/tbody/tr[1]/td[2]/span");
    private static final By CURRENT_DATE_STRING = By.xpath(".//*[@id='convert_calendar']//a/span[1]");

    public void getCurrentCource() throws InterruptedException {
        getDriver().findElement(SELECT_FIELD_USD).sendKeys("1");
        //Thread.sleep(2000);
        BasePage page = new BasePage();
        page.waitForElementPresence(getDriver(),SELECT_FIELD_BYR,30);

        String convertedValue = getDriver().findElement(SELECT_FIELD_BYR).getText();
        String nbrbCourse = getDriver().findElement(CURRENT_NBRB_COURSE).getText();

        Assert.assertEquals(convertedValue,nbrbCourse);

    }

    public void getCurrentDate(){
        String currentDate = getDriver().findElement(CURRENT_DATE_STRING).getText();

        DateValidator date = new DateValidator();
        date.dateChecker(currentDate);

    }


}
