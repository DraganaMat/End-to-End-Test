package halooglasi.page;

import halooglasi.base.HaloOglasiBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class SuccessfulRegistrationPage extends HaloOglasiBaseTest {

    public SuccessfulRegistrationPage () {

        PageFactory.initElements(driver,this);
    }

    @FindBy (className = "regsitration-success")
    WebElement registrationSuccess;

    @FindBy (linkText = "Prijava")
    WebElement registrationLink;

    public boolean registrationSuccessDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(registrationSuccess));
        return registrationSuccess.isDisplayed();
    }
    public String registrationSuccessGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(registrationSuccess));
        return registrationSuccess.getText();
    }

    public void registrationLinkClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(registrationLink)).click();
    }

    public void switchToNewTab (int tabNumber, int tab) {
        wdWait.until(ExpectedConditions.numberOfWindowsToBe(tabNumber));
        ArrayList<String> numberOfTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(numberOfTabs.get(tab));
    }
//    We have waited two tabs
//    We made new variable type list and in that list we have packed all tabs
//    list items starts from zero, we need second window hence we will tell driver to switch to one
//    getWindowHandles is a method that counts tabs





}
