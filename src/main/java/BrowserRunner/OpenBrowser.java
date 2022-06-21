package BrowserRunner;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenBrowser {
    @BeforeTest
    public static void Setup() {
        Selenide.open("https://vendoo.ge/");
        Configuration.browserSize = "1920x1080";
    }
}