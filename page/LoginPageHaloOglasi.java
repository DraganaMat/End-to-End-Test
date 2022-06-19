package halooglasi.page;

import halooglasi.base.HaloOglasiBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPageHaloOglasi extends HaloOglasiBaseTest {

     public LoginPageHaloOglasi() {

         PageFactory.initElements(driver,this);
     }

    @FindBy (css = ".no-account-reg-link")
    @CacheLookup
    WebElement registrationLink;

     @FindBy (id = "EMailOrUsername")
     WebElement emailOrUserNameInputField;

     @FindBy (css = ".login-button")
     WebElement loginButton;


     public void registrationLinkClick () {

         wdWait.until(ExpectedConditions.elementToBeClickable(registrationLink)).click();
     }
     public void emailOrUserNameInputField (String emailOrUsername) {
         wdWait.until(ExpectedConditions.visibilityOf(emailOrUserNameInputField)).clear();
         emailOrUserNameInputField.sendKeys(emailOrUsername);
     }
     public void loginButtonClick () {
         wdWait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
     }








}
