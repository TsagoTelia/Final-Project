package Step.Object;

import Page.Object.RegPage;
import io.qameta.allure.Step;

import static Data.Object.DataObjects.*;

public class RegistrationSteps extends RegPage{
    @Step
    public RegistrationSteps GotoPage () {
        AuthorizationIcon.click();
        return this;
    }
    @Step
    public RegistrationSteps ClickFirstSignin (){
        ClickFirstSignin.click();
        return this;
    }
    @Step
    public RegistrationSteps Firstname(String UserName){
        FirstnameInput.setValue(UserName);
        return this;
    }
    @Step
    public RegistrationSteps Lastname(String LastName){
        LastnameInput.setValue(LastName);
        return this;
    }
    @Step
    public RegistrationSteps Mobile(String Mobile){
        MobileInput.setValue(Mobile);
        return this;
    }
    @Step
    public RegistrationSteps Email(String Email ){
        EmailInput.setValue(Email);
        return this;
    }
    @Step 
    public RegistrationSteps Password(String Pass){
        PassInput.setValue(Pass);
        return this;
    }
    @Step
    public RegistrationSteps ConfirmPassword(String Confirmpassword ){
        ConfirmpasswordInput.setValue(Confirmpassword);
        return this;
         }
     @Step
    public RegistrationSteps TermsCheckbox(){
         TermsCheckbox.click();
         return this;
     }
     @Step
    public RegistrationSteps Registrationbox(){
        RegistrationBtn.click();
        return this;
     }
}
