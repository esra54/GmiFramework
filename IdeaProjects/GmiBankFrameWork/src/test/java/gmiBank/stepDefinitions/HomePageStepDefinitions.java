package gmiBank.stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gmiBank.pages.HomePage;

public class HomePageStepDefinitions {
    HomePage homePage = new HomePage();
    @When("User navigates {string}")
    public void user_navigates(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("User clicks on iconAccountMenu")
    public void user_clicks_on_iconAccountMenu() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
