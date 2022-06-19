package halooglasi.page;

import halooglasi.base.HaloOglasiBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationPageHaloOglasi extends HaloOglasiBaseTest {

    public RegistrationPageHaloOglasi() {

        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//input[contains(@value,'person')]")
    @CacheLookup
    WebElement radioButton;

    @FindBy (id = "UserName")
    @CacheLookup
    WebElement userNameInputField;

    @FindBy (id = "Email")
    @CacheLookup
    WebElement emailInputField;

    @FindBy (id ="Password")
    @CacheLookup
    WebElement passwordInputField;

    @FindBy (id ="ConfirmPassword")
    @CacheLookup
    WebElement confirmationPasswordInputField;

    @FindBy (id = "HasAgreedToGetFiscalReceiptByEmail")
    @CacheLookup
    WebElement checkBoxHasAgreed;

    @FindBy (css = ".button-reg.save-entity")
    WebElement registrationButton;

    @FindBy (css = ".cookie-policy-btn")
    WebElement cookieButton;


    public void radioButtonSelected () {
        wdWait.until(ExpectedConditions.elementToBeClickable(radioButton));
        if (!radioButton.isSelected())
            radioButton.click();

    }
    public void emailInputFieldSendKeys (String email) {
        wdWait.until(ExpectedConditions.visibilityOf(emailInputField)).clear();
        emailInputField.sendKeys(email);
    }
    public void userNameInputFieldSendKeys (String username) {
        wdWait.until(ExpectedConditions.visibilityOf(userNameInputField)).clear();
        userNameInputField.sendKeys(username);
    }

    public void passwordInputFieldSendKeys (String pass) {
        wdWait.until(ExpectedConditions.visibilityOf(passwordInputField)).clear();
        passwordInputField.sendKeys(pass);
    }
    public void confirmationPasswordInputFieldSendKeys (String confirmation) {
        wdWait.until(ExpectedConditions.visibilityOf(confirmationPasswordInputField)).clear();
        confirmationPasswordInputField.sendKeys(confirmation);
    }

    public void cookieButtonClick () {

        wdWait.until(ExpectedConditions.elementToBeClickable(cookieButton)).click();
    }

    public void checkBoxHasAgreedSelect () {

        wdWait.until(ExpectedConditions.elementToBeClickable(checkBoxHasAgreed)).click();
    }
    public void registrationButtonClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(registrationButton)).click();
    }


   }





