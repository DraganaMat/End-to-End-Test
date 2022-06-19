package halooglasi.page;

import halooglasi.base.HaloOglasiBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HaloOglasiEmailPageMailinator extends HaloOglasiBaseTest {

    public HaloOglasiEmailPageMailinator () {
        PageFactory.initElements(driver,this);
    }


   @FindBy(linkText = "Aktiviraj nalog")
    WebElement  activationAccountButton;

   @FindBy(id = "html_msg_body")
    WebElement iframeBody;

    public void activationAccountButtonClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(activationAccountButton)).click();
    }
    public void switchFocusToIframeBody () {
        wdWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframeBody));
    }
    public void driverSwitchFocusToIframeBody () {
        wdWait.until(ExpectedConditions.visibilityOf(iframeBody));
        driver.switchTo().frame(iframeBody);
    }

    public void switchFocusToDefaultContent () {
        driver.switchTo().defaultContent();
    }









}
