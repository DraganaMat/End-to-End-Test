package halooglasi.page;

import halooglasi.base.HaloOglasiBaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePageMailinator extends HaloOglasiBaseTest {

    public HomePageMailinator () {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "search-mobile")
    WebElement mailinatorInputField;

    public void mailinatorInputFieldSendKeys (String email) {
        wdWait.until(ExpectedConditions.visibilityOf(mailinatorInputField)).clear();
        mailinatorInputField.sendKeys(email);
    }

    public void mailinatorInputFieldSendKeyboardKeys (Keys keyboardButton) {
        wdWait.until(ExpectedConditions.visibilityOf(mailinatorInputField)).sendKeys(keyboardButton);
    }














}
