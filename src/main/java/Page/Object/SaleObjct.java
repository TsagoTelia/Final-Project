package Page.Object;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SaleObjct {
    public SelenideElement
        SearchIcon = $("#searchinput"),

    public void ClickOnSearch(){
        SearchIcon.click();

    }

}
