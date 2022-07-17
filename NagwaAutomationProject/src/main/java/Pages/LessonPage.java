package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LessonPage {
    private WebDriver driver;
    By workSheetLink=By.cssSelector("div [class=components] >ul>li:nth-child(7) > div > a");


    public LessonPage(WebDriver driver) {
        this.driver = driver;
    }
    public WorkSheetPage clickWorkSheet(){
        driver.findElement(workSheetLink).click();
        return new WorkSheetPage(driver);
    }
    public LessonPage clickPreview(){
        driver.navigate().back();
        return new LessonPage(driver);
    }
}
