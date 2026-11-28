package starter.stepdefinitions;
import io.cucumber.java.PendingException;
import io.cucumber.java.af.En;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.UilityFunctions.WaitSeconds;
import starter.fill.SwagLabsPath;
import starter.navigation.NavigateToActions;
import starter.navigation.SwagLabsActions;

import java.util.List;

public class SwagLabsStepDefinitions {

    @Given("{actor} navigates to the home page")
    public void userNavigatesToTheHomePage(Actor actor) {
        actor.wasAbleTo(
                NavigateToActions.theHomePage(),
                WaitSeconds.Now()
        );
    }

    @Then("{actor} enters username {string}")
    public void userEntersUsernameUsername(Actor actor, String userName) {
        actor.attemptsTo(
                Enter.keyValues(userName).into(SwagLabsPath.ENTER_USER_NAME),
                WaitSeconds.Now()
        );
    }

    @And("{actor} enters password {string}")
    public void userEntersPasswordPassword(Actor actor, String userPassword) {
        actor.attemptsTo(
                Enter.keyValues(userPassword).into(SwagLabsPath.ENTER_USER_PASSWORD),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the login button")
    public void userClickOnTheLoginButton(Actor actor) {
        actor.attemptsTo(
                Click.on(SwagLabsPath.CLICK_LOGIN_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} select the product category {string}")
    public void userSelectTheProductCategoryCategory(Actor actor, String productCategory) {
        actor.attemptsTo(
                SwagLabsActions.selectProductCategory(productCategory),
                WaitSeconds.Now()
        );
    }

    @Then("{actor} select the product")
    public void userSelectTheProduct(Actor actor, String selectProduct) {
        actor.attemptsTo(
                SwagLabsActions.selecttheProduct(selectProduct),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the cart")
    public void userClickOnTheCart(Actor actor) {
        actor.attemptsTo(
                Click.on(SwagLabsPath.CLICK_ON_THE_CART),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the checkout button")
    public void userClickOnTheCheckoutButton(Actor actor) {
        actor.attemptsTo(
                Click.on(SwagLabsPath.CLICK_CHECKOUT_BUTTON),
                WaitSeconds.Now()
        );
    }

    @Then("{actor} enter details")
    public void userEnterDetails(Actor actor, List<String> personalDetails) {
        actor.attemptsTo(
                SwagLabsActions.enterPersonalFirstName(personalDetails.get(0)),
                WaitSeconds.Now(),
                SwagLabsActions.enterPersoanLastName(personalDetails.get(1)),
                WaitSeconds.Now(),
                SwagLabsActions.enterPersonalZipCode(personalDetails.get(2)),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the continue button")
    public void userClickOnTheContinueButton(Actor actor) {
        actor.attemptsTo(
                Click.on(SwagLabsPath.CLICK_ON_THE_CONTINUE_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the finish button")
    public void userClickOnTheFinishButton(Actor actor) {
        actor.attemptsTo(
                Click.on(SwagLabsPath.CLICK_ON_THE_FINISH_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the back home button")
    public void userClickOnTheBackHomeButton(Actor actor) {
        actor.attemptsTo(
                Click.on(SwagLabsPath.CLICK_ON_THE_BACK_HOME_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the menu button")
    public void userClickOnTheMenuButton(Actor actor) {
        actor.attemptsTo(
                Click.on(SwagLabsPath.CLICK_ON_THE_MENU_BUTTON),
                WaitSeconds.Now()
        );
    }

    @And("{actor} click on the logout button")
    public void userClickOnTheLogoutButton(Actor actor) {
        actor.attemptsTo(
                Click.on(SwagLabsPath.CLICK_LOG_OUT_BUTTON),
                WaitSeconds.Now()
        );
    }


    @And("{actor} validate the price")
    public void userValidateThePrice(Actor actor) {
        actor.attemptsTo(
                SwagLabsActions.validatetheProductPrice(),
                WaitSeconds.Now()
        );
    }
}
