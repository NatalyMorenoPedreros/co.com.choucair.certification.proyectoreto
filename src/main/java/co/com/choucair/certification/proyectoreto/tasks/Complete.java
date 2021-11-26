package co.com.choucair.certification.proyectoreto.tasks;

import co.com.choucair.certification.proyectoreto.model.UTextData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.proyectoreto.userinterface.UtextPageComplete.*;

public class Complete implements Task {
    UTextData uTextData;

    public Complete(UTextData uTextData) {
        this.uTextData = uTextData;
    }

    public static Complete thePersonalData(UTextData uTextData) {
        return Tasks.instrumented(Complete.class,uTextData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(JOIN_TODAY_BUTTON),
                Enter.theValue(uTextData.getStrFirstName()).into(INPUT_FIRST_NAME),
                Enter.theValue(uTextData.getStrLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(uTextData.getStrEmail()).into(INPUT_EMAIL),
                Click.on(SELECT_MONTH),
                Click.on(SELECT_DAY),
                Click.on(SELECT_YEAR),
                Click.on(ENTER_BUTTON));
    }
}
