package co.com.choucair.certification.proyectoreto.stepdefinitions;

import co.com.choucair.certification.proyectoreto.model.UTextData;
import co.com.choucair.certification.proyectoreto.questions.Answer;
import co.com.choucair.certification.proyectoreto.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class UtextCreationUserStepDefinitions {
    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Given("^than Nataly wants check in in the page UText$")
    public void thanNatalyWantsCheckInInThePageUText(List<UTextData> uTextData) {
        theActorCalled("Nataly").wasAbleTo(OpenUp.thePage(),
                Complete.thePersonalData(uTextData.get(0)),
                Enter.theLocationInformation(uTextData.get(0)),
                Select.theDeviceInformation(uTextData.get(0)),
                Write.thePassword(uTextData.get(0)));
    }

    @When("^she login$")
    public void sheSearchInThePageUTextTheButtonJoinToday(List<UTextData> uTextData) {
        theActorInTheSpotlight().attemptsTo(Login.onThePage(uTextData.get(0)));
    }

    @Then("^she creates her new user$")
    public void sheCreatesHerNewUser(List<UTextData> uTextData) {
        theActorInTheSpotlight().should(seeThat(Answer.toThe(uTextData.get(0).getStrFirstName())));
    }
}
