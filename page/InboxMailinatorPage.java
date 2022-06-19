package halooglasi.page;

import halooglasi.base.HaloOglasiBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InboxMailinatorPage extends HaloOglasiBaseTest {

    public InboxMailinatorPage () {

        PageFactory.initElements(driver,this);
    }

  @FindBy (xpath = "//td[@class= 'ng-binding'][contains(text(), 'aktivirajte Vaš Halo oglasi nalog')]")
    WebElement haloOglasiactivationEmail;

    public void haloOglasiactivationEmailClick () {
        wdWait.until(ExpectedConditions.elementToBeClickable(haloOglasiactivationEmail)).click();
    }









}
