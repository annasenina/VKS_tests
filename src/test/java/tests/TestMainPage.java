package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestMainPage {

    @Test
    void testOpenedMainPage()
    {
        open("https://shop.vsk.ru/");


        $(".row").shouldHave(text("Оформите полис онлайн"));
        sleep(2000);
    }
}
