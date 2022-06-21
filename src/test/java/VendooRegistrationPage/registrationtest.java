package VendooRegistrationPage;

import BrowserRunner.OpenBrowser;
import Step.Object.RegistrationSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static Data.Object.DataObjects.*;
@Test
public class registrationtest extends OpenBrowser {

    @Test
    public void RegPageSuccess(){
        SoftAssert soft = new SoftAssert();
        RegistrationSteps Steps = new RegistrationSteps();

        Steps
                .GotoPage()
                .ClickFirstSignin()
                .Firstname(UserName)
                .Lastname(LastName)
                .Email(Email)
                .Mobile(Mobile)
                .Password(Pass)
                .ConfirmPassword(Confirmpassword)
                .TermsCheckbox();

        Assert.assertTrue(Steps.RegistrationBtn.isDisplayed());



    }


}
