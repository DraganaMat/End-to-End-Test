package halooglasi.page;

import halooglasi.base.HaloOglasiBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePageHaloOglasi extends HaloOglasiBaseTest {

    public HomePageHaloOglasi() {
        PageFactory.initElements(driver,this);

    }

    @FindBy (xpath = "//a[text()= 'Uloguj se']")
    @CacheLookup
    WebElement loginButton;

    public void loginButtonClick () {

        wdWait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }





}
