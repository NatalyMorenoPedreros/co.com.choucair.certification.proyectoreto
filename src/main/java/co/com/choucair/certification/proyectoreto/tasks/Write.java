package co.com.choucair.certification.proyectoreto.tasks;

import co.com.choucair.certification.proyectoreto.model.UTextData;
import co.com.choucair.certification.proyectoreto.userinterface.UtextPageWrite;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Write implements Task {
    UTextData uTextData;

    public Write(UTextData uTextData) {
        this.uTextData = uTextData;
    }

    public static Write thePassword(UTextData uTextData){
        return Tasks.instrumented(Write.class,uTextData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(uTextData.getStrPassword()).into(UtextPageWrite.INPUT_PASSWORD),
                Enter.theValue(uTextData.getStrPassword()).into(UtextPageWrite.INPUT_PASSWORD_CONFIRM),
                Click.on(UtextPageWrite.ENTER_CHECK_TERMS),
                Click.on(UtextPageWrite.ENTER_CHECK_PRIVACY),
                Click.on(UtextPageWrite.ENTER_BUTTON));
    }
}
