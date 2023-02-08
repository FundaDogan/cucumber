package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;

public class DataTablesStepDefinitions {

    DataTablesPage dataTablesPage = new DataTablesPage();

    @When("user clicks on new button")
    public void userClicksOnNewButton() {
    dataTablesPage.newButton.click();

    }

    @And("user fills First Name box {string}")
    public void userFillsFirstNameBox(String firstname) {
        dataTablesPage.firstName.sendKeys(firstname);
    }

    @And("user fills Last Name box {string}")
    public void userFillsLastNameBox(String lastname) {
        dataTablesPage.lastName.sendKeys(lastname);
    }

    @And("user fills position box {string}")
    public void userFillsPositionBox(String position) {
        dataTablesPage.position.sendKeys(position);
    }

    @And("user fills office box {string}")
    public void userFillsOfficeBox(String office) {
        dataTablesPage.office.sendKeys(office);
    }

    @And("user fills extension box {string}")
    public void userFillsExtensionBox(String extension) {
        dataTablesPage.extension.sendKeys(extension);

    }

    @And("user fills start date box {string}")
    public void userFillsStartDateBox(String start_date) {
        dataTablesPage.startDate.sendKeys(start_date);
    }

    @And("user fills salary box {string}")
    public void userFillsSalaryBox(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }

    @Then("user clicks create button")
    public void userClicksCreateButton() {
        dataTablesPage.createButton.click();
    }

    @And("search for the first name {string}")
    public void searchForTheFirstName(String firstname) {
        dataTablesPage.searchBox.click();
        dataTablesPage.searchBox.sendKeys(firstname);
    }

    @Then("verify the name field contains the first name {string}")
    public void verifyTheNameFieldContainsTheFirstName(String firstname) {
        Assert.assertTrue(dataTablesPage.nameColumn.getText().contains(firstname));

    }
}
