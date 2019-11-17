package ru.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public void gotoMail(String maillink, secondTest secondTest) {
        WebElement element = ru.yandex.secondTest.driver.findElement(By.className(maillink));
        element.click();
    }

    public WebElement searchLogin(secondTest secondTest) {
        WebElement element1 = ru.yandex.secondTest.driver.findElement(By.name("login"));
        ru.yandex.secondTest.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return element1;
    }

    public void enterLogin(WebElement webElement, String login) {
        WebElement element1 = webElement;
        element1.sendKeys(login);
        element1.submit();
    }

    public WebElement searchPassword(secondTest secondTest) {
        WebElement element2 = ru.yandex.secondTest.driver.findElement(By.className("passp-form-field"));
        element2.click();
        return element2;
    }

    public void enterPassword(WebElement webElement1, CharSequence password) {
        WebElement element2 = webElement1;
        element2.sendKeys(password);
        element2.submit();
    }

    public void searchMails(secondTest secondTest) {
        int mail = ru.yandex.secondTest.driver.findElements(By.xpath("//span[@title='Simbirsoft theme']")).size();
        System.out.println("Количество писем с темой Simbirsoft theme " + mail);
    }
}
