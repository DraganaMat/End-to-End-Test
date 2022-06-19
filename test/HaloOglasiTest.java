package halooglasi.test;

import halooglasi.base.HaloOglasiBaseTest;
import halooglasi.page.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;

public class HaloOglasiTest extends HaloOglasiBaseTest {

       HomePageHaloOglasi homePageHaloOglasi;
       LoginPageHaloOglasi loginPageHaloOglasi;
       RegistrationPageHaloOglasi registrationPageHaloOglasi;
       SuccessfulRegistrationPage successfulRegistrationPage;
       HaloOglasiEmailPageMailinator haloOglasiEmailPageMailinator;
       HomePageMailinator homePageMailinator;
       InboxMailinatorPage inboxMailinatorPage;
       UserPageHaloOglasi userPageHaloOglasi;

       String testIme = "Animozitet7";
       String testEmail = testIme + "@mailinator.com";

       @Before
    public void setUpTest () {

       homePageHaloOglasi = new HomePageHaloOglasi();
       loginPageHaloOglasi = new LoginPageHaloOglasi();
       registrationPageHaloOglasi = new RegistrationPageHaloOglasi();
       successfulRegistrationPage = new SuccessfulRegistrationPage();
       haloOglasiEmailPageMailinator = new HaloOglasiEmailPageMailinator();
       homePageMailinator = new HomePageMailinator();
       inboxMailinatorPage = new InboxMailinatorPage();
       userPageHaloOglasi = new UserPageHaloOglasi();

       }

      @Test

    public void RegistryTest () {
//         click on login button
           homePageHaloOglasi.loginButtonClick();
//         click on cookie button
           registrationPageHaloOglasi.cookieButtonClick();
//         click on registrationLink button down-page
           loginPageHaloOglasi.registrationLinkClick();
//         verify if radio button is selected, if it is leave it, if is not select
           registrationPageHaloOglasi.radioButtonSelected();
//         fill out the registration form
           registrationPageHaloOglasi.userNameInputFieldSendKeys(testIme);
           registrationPageHaloOglasi.emailInputFieldSendKeys(testEmail);
           registrationPageHaloOglasi.passwordInputFieldSendKeys("12345+");
           registrationPageHaloOglasi.confirmationPasswordInputFieldSendKeys("12345+");
           registrationPageHaloOglasi.checkBoxHasAgreedSelect();
           registrationPageHaloOglasi.registrationButtonClick();
//         verify if the successful registration message is displayed
           Assert.assertTrue(successfulRegistrationPage.registrationSuccessDisplayed());
           String successmessage = successfulRegistrationPage.registrationSuccessGetText();
           Assert.assertEquals("Registracija je uspela!\n" +
                           "Kako bi Vaš nalog postao aktivan, neophodno je da kliknite na link u mejlu koji Vam je poslat na : "  + testEmail + " !",
                   successmessage );
//         go to the mailinator page
           driver.get("https://www.mailinator.com/");
//         in search bar write the email adress we have used
          homePageMailinator.mailinatorInputFieldSendKeys(testEmail);
          homePageMailinator.mailinatorInputFieldSendKeyboardKeys(Keys.ENTER);
//        in mailinator inbox there is activaton link
          inboxMailinatorPage.haloOglasiactivationEmailClick();
//        switch focus to the iframe
          haloOglasiEmailPageMailinator.switchFocusToIframeBody();
//        open the mail and click on activation link
          haloOglasiEmailPageMailinator.activationAccountButtonClick();
//        verify if message is displayed with assert
//        but first we need to tell driver to switch to second window
          successfulRegistrationPage.switchToNewTab(2,1);
          Assert.assertTrue(successfulRegistrationPage.registrationSuccessDisplayed());
          Assert.assertEquals("Vaš nalog je uspešno aktiviran" +
                  "Produžite na stranicu za logovanje kako biste pristupili našem portalu. Prijava",
                  successfulRegistrationPage.registrationSuccessGetText());
//        click on login link which is in the email
          successfulRegistrationPage.registrationLinkClick();
//         fill out login text boxes with email and password
          loginPageHaloOglasi.emailOrUserNameInputField(testIme);
          registrationPageHaloOglasi.passwordInputFieldSendKeys("12345+");
//         click on login button
          loginPageHaloOglasi.loginButtonClick();
//         verify if in right upper corner is username and email we have used
          userPageHaloOglasi.myProfileDropDownHover();
          Assert.assertTrue(userPageHaloOglasi.userNameDisplayed());
          Assert.assertEquals(testIme, userPageHaloOglasi.userNameGetText());
          Assert.assertTrue(userPageHaloOglasi.userNameEmailDisplayed());
          Assert.assertEquals("email: " + testEmail, userPageHaloOglasi.userNameEmailGetText());

      }








}
