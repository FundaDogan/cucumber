package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.OpenSourcePage;
import utilities.Driver;

public class OpenSourceStepDefinitions {

    OpenSourcePage openSourcePage = new OpenSourcePage();

    @Given("user enters username")
    public void user_enters_username() {
      openSourcePage.userName.sendKeys("Admin");

    }
    @Given("user enters password")
    public void user_enters_password() {
        openSourcePage.password.sendKeys("admin123");
    }
    @Given("clicks on login")
    public void clicks_on_login() {
        openSourcePage.submitButton.click();

    }
    @Then("verify url is {string}")
    public void verify_url_is(String string) {
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        Assert.assertEquals(actualURL,expectedURL);
    }


    @And("user enters wrong username")
    public void userEntersWrongUsername() {
        openSourcePage.userName.sendKeys("user");
    }

    @Then("verify login is not successful")
    public void verifyLoginIsNotSuccessful() {
        Assert.assertTrue(openSourcePage.submitButton.isDisplayed());
    }

    @And("user enters wrong password")
    public void userEntersWrongPassword() {
        openSourcePage.password.sendKeys("123");
    }


    @And("user enters wrong username {string}")
    public void userEntersWrongUsername(String username) {
        openSourcePage.userName.sendKeys(username);
    }

    @And("user enters wrong password {string}")
    public void userEntersWrongPassword(String password) {
        openSourcePage.password.sendKeys(password);
    }
}
