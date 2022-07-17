package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {
    private WebDriver driver;
    By SearchIcon= By.cssSelector("button[type=button]");
    By SearchInputBar= By.id("txt_search_query");
    By SearchIconSubmit =By.cssSelector("button[type=submit]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void ClickSearchIcon() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(SearchIcon).click();
    }
    public SearchPage SendSearchKey(String key){
        driver.findElement(SearchInputBar).sendKeys(key);
        driver.findElement(SearchIconSubmit).click();
        return new SearchPage(driver);
    }
}
