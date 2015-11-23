package by.tut.pages;

import org.testng.annotations.Test;
import pages.FinancePage;
import pages.HomePage;

public class FinancePageTest {

    @Test
    public void currentCourseTest() throws InterruptedException {
        HomePage hPage = new HomePage();
        hPage.clickFinanceLink();

        FinancePage fPage = new FinancePage();
        fPage.getCurrentCource();
    }

    @Test
    public void currentDateValidationTest() throws InterruptedException {
        FinancePage fPage = new FinancePage();
        fPage.getCurrentCource();

        fPage.getCurrentDate();

    }

}
