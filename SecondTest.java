package ru.yandex;

import org.junit.*;

public class SecondTest extends BaseTest {
    protected ApplicationManager app;
    @Test
    public void Test1() {
//      Проверка title страницы
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Яндекс"));

     }

    @Test
    public void Test2() {
        app.gotoMail("home-link", this);
        app.enterLogin(app.searchLogin(this), "логин");
        app.enterPassword(app.searchPassword(this),"пароль");
        app.searchMails(this);
    }

}
