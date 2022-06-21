package Page.Object;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RegPage {
    public SelenideElement
        AuthorizationIcon = $(".header-main__profile-greet"),
        ClickFirstSignin = $("#.register-button"),
        GenderInput = $(".el-input__inner"),
        FirstnameInput = $("#firstname"),
        LastnameInput = $("#lastname"),
        EmailInput =$("#username"),
        MobileInput = $("#phone"),
        PassInput = $("#password"),
        ConfirmpasswordInput = $("#confirm_password"),
        TermsCheckbox = $(".el-checkbox__inner"),
        RegistrationBtn = $("#register-button");







}
