package Pages;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.messages.types.Hook;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LanguagePage {
    private final WebDriver driver;
    By EnglishLink = By.cssSelector("a[href=\"/en/\"]");


    public LanguagePage(WebDriver driver) {
        this.driver = driver;
    }
    public HomePage SelectLanguage(String language ){
        switch (language){
            case "English" :
                driver.findElement(EnglishLink).click();
        }
        return new HomePage(driver);
    }
}
