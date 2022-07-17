package Step_Definition;

import Pages.LessonPage;
import Pages.SearchPage;
import Pages.WorkSheetPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Search {
    public SearchPage searchPage;
    public LessonPage lessonPage;
    public WorkSheetPage workSheetPage;

    @Given("Click Search Icon")
    public void ClickSearch() throws InterruptedException {
        Hook.homePage.ClickSearchIcon();
    }
    @When("^Send Search Word \"(.*)\"$")
    public void send_Search_Key(String searchKey){
     searchPage=   Hook.homePage.SendSearchKey(searchKey);
    }
    @Then("Make List of Lessons")
    public void makeList(){
        searchPage.list_of_Lessons();
    }
    @Then("^click \"(.*)\"lesson$")
    public void clickOnLesson(int index){
     lessonPage=   searchPage.clickLesson(index);
    }
    @Then("Click WorkSheet")
    public void clickWorkSheet(){
        lessonPage.clickWorkSheet();
    }
    @Then("go back")
    public void goBack(){
        lessonPage.clickPreview();
    }
    @Then("count number of Question in WorkSheet")
    public void count_no_Question_in_workSheet(){
        workSheetPage =lessonPage.clickWorkSheet();
        workSheetPage.print_no_of_Question();

    }
}
