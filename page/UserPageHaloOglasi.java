package halooglasi.page;

import halooglasi.base.HaloOglasiBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UserPageHaloOglasi extends HaloOglasiBaseTest {
    public UserPageHaloOglasi () {
        PageFactory.initElements(driver,this);
    }
    @FindBy(className = "header-label")
    WebElement myProfileDropDown;

    @FindBy (xpath = "(//p[@class='user-display-name'])[1]")
    WebElement userName;

    @FindBy (xpath = "(//p[@class='user-email'])[1]")
    WebElement userNameEmail;

    public void myProfileDropDownHover () {
        wdWait.until(ExpectedConditions.visibilityOf(myProfileDropDown));
        actions.moveToElement(myProfileDropDown).perform();
    }
    public boolean userNameDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(userName));
        return userName.isDisplayed();
    }
    public String userNameGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(userName));
        return userName.getText();
    }

    public boolean userNameEmailDisplayed () {
        wdWait.until(ExpectedConditions.visibilityOf(userNameEmail));
        return userNameEmail.isDisplayed();
    }
    public String userNameEmailGetText () {
        wdWait.until(ExpectedConditions.visibilityOf(userNameEmail));
        return userNameEmail.getText();
    }

}
