import PageObject.HomePage;
import PageObject.Hooks;
import PageObject.SearchPage;
import PageObject.WebDriverUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Homepage_MyStepdefs extends Hooks {

    HomePage homepage;
    SearchPage searchpage;
    @Given("^User is on the home page$")
    public void userIsOnTheHomePage(){
        homepage=new HomePage();
        Assert.assertTrue(homepage.IsUserInHomepage());

    }

    @When("^he clicks on \"([^\"]*)\" link$")
    public void heClicksOnLink(String link) {
        homepage.clickOnPage(link);

    }
    @Then("^he should be landed on page with text \"([^\"]*)\"$")
    public void heShouldBeLandedOnPageWithText(String text) {
        Assert.assertTrue(WebDriverUtil.isTextPresent(text));
    }



    @When("^user navigates back$")
    public void userNavigatesBack() {
        homepage.goBack();
    }



    @When("^user types \"([^\"]*)\" in the search bar$")
    public void userTypesInTheSearchBar(String type) {
        searchpage=new SearchPage();
        searchpage.enterinsearchbar(type);


    }


    @And("^clicks on \"([^\"]*)\" button$")
    public void clicksOnButton(String clickbutton) {
        searchpage.clickonbutton(clickbutton);
    }




    @And("^user clicks on \"([^\"]*)\" button$")
    public void userClicksOnButton(String basketlink) {
        searchpage.clickonaddtobasket(basketlink);
    }


    @Then("^user is able to see the item in the basket as \"([^\"]*)\"$")
    public void userIsAbleToSeeTheItemInTheBasketAs(String text1) {
        Assert.assertTrue(WebDriverUtil.isTextPresent(text1));

    }

    @And("^clicks on \"([^\"]*)\" link$")
    public void clicksOnLink(String legolink) {
        searchpage.clickonlegolink(legolink);

    }
}
