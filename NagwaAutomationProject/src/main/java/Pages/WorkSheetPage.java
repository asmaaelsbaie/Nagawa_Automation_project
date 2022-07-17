package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WorkSheetPage {
    private WebDriver driver;
    By linkOfQuestions =By.cssSelector("div[class=\"instance \"");
    private List<WebElement> questionsList;

    public WorkSheetPage(WebDriver driver) {
        this.driver = driver;
    }
    public void print_no_of_Question() {
        questionsList= driver.findElements(linkOfQuestions);
        int size = questionsList.size();
        System.out.println("No of Question in this workSheet ="+size);
    }

}
