package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage {
    private WebDriver driver;
    By LessonsLinks = By.cssSelector("ul[class=list]>li");
    String child="ul[class=list]>li:nth-child";
    private List<WebElement> lessonsList;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void list_of_Lessons() {
        lessonsList = driver.findElements(LessonsLinks);
        int size = lessonsList.size();
        System.out.println("number of lesson ="+size);
    }

    public LessonPage clickLesson(int index){

        driver.findElement(By.cssSelector(child+"("+index+") > div > a")).click();
        return new LessonPage(driver);

    }


}