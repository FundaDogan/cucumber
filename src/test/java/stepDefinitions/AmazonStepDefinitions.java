package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("user goes to Amazon page")
    public void user_goes_to_amazon_page() {
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));

    }
    @When("user search for desk")
    public void user_search_for_desk() {
        amazonPage.searchBox.sendKeys("desk"+ Keys.ENTER);

    }
    @Then("verify results contains desk")
    public void verify_results_contains_desk() {
        Assert.assertTrue(amazonPage.result.getText().contains("desk"));

    }

    @And("close the application")
    public void closeTheApplication() {
        Driver.closeDriver();
    }

    @When("user search for shoe")
    public void user_search_for_shoe() {

        amazonPage.searchBox.sendKeys("shoe"+Keys.ENTER);
    }

    @Then("verify results contains shoe")
    public void verify_results_contains_shoe() {
       Assert.assertTrue(amazonPage.result.getText().contains("shoe"));
    }

    @When("user search for Iphone")
    public void userSearchForIphone() {
        amazonPage.searchBox.sendKeys("Iphone"+Keys.ENTER);

    }

    @Then("verify results contains Iphone")
    public void verifyResultsContainsIphone() {
        Assert.assertTrue(amazonPage.result.getText().contains("Iphone"));
    }

    @When("user search for {string}")
    public void user_search_for(String string) {
        amazonPage.searchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("verify results contains {string}")
    public void verify_results_contains(String string) {
        Assert.assertTrue(amazonPage.result.getText().contains(string));

    }

    @Given("user goes to {string}")
    public void userGoesTo(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));
    }

    @Then("verify url contains {string}")
    public void verifyUrlContains(String string) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(string));
    }

    @Then("user waits for {int} seconds")
    public void userWaitsForSeconds(int second) {
        ReusableMethods.waitFor(second);
    }
}
