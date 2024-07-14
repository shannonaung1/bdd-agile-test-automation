package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.navigation.NavigateTo;
import starter.navigation.RyanAirHomePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.containsString;
import static starter.navigation.RyanAirHomePage.*;

public class AccountCreationStepDefinitions {

    @Given("{actor} is on the Ryanair home page")
    public void shannon_is_on_the_ryanair_home_page(Actor actor) {
        actor.attemptsTo(NavigateTo.theRyanAirHomePage(),Click.on(COOKIE_POPUP_CLOSE_BUTTON));

    }
    @When("{actor} initiates the account creation process")
    public void she_initiates_the_account_creation_process(Actor actor) {
         actor.attemptsTo(Click.on(SIGNUP_BUTTON)
        );
    }
//    @When("{actor} provides their {email} and {password}")
//    public void she_provides_their_and(Actor actor, String email, String password) {
////        actor.attemptsTo(Click.on(RyanAirHomePage.EMAIL_FIELD));
////        actor.attemptsTo(Click.on(RyanAirHomePage.PASSWORD_FIELD));
//    }
//    @When("{actor} confirms the account creation")
//    public void she_confirms_the_account_creation(Actor actor) {
//       // actor.attemptsTo(Click.on(RyanAirHomePage.CREATE_ACCOUNT_BUTTON));
//    }
//    @Then("{actor} should see a confirmation message that the account was created successfully")
//    public void she_should_see_a_confirmation_message_that_the_account_was_created_successfully(Actor actor, String message) {
//        //actor.should(seeThat(TheConfirmationMessage.displayed(), containsString("Your account has been created successfully."));
//    }

}
