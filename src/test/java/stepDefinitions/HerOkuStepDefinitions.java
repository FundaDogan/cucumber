package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HerOkuAppPage;
import utilities.ReusableMethods;

public class HerOkuStepDefinitions {
    HerOkuAppPage herOkuAppPage = new HerOkuAppPage();

    @Given("user clicks add element button")
    public void user_clicks_add_element_button() {
        herOkuAppPage.addElementButtonu.click();
    }
    @Then("user waits till delete button is visible")
    public void user_waits_till_delete_button_is_visible() {
        ReusableMethods.waitForVisibility(herOkuAppPage.deleteElementButton,1);
    }
    @Then("verify delete button is visible")
    public void verify_delete_button_is_visible() {
        Assert.assertTrue(herOkuAppPage.deleteElementButton.isDisplayed());
    }
    @Then("user clicks Delete button")
    public void user_clicks_delete_button() {
        herOkuAppPage.deleteElementButton.click();
    }

}
