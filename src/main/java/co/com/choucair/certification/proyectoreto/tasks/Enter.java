package co.com.choucair.certification.proyectoreto.tasks;

import co.com.choucair.certification.proyectoreto.model.UTextData;
import co.com.choucair.certification.proyectoreto.userinterface.UtextPageEnter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Enter implements Task {
    UTextData uTextData;

    public Enter(UTextData uTextData) {
        this.uTextData = uTextData;
    }

    public static Enter theLocationInformation(UTextData uTextData){
        return Tasks.instrumented(Enter.class,uTextData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(net.serenitybdd.screenplay.actions.Enter.theValue(uTextData.getStrCity()).into(UtextPageEnter.INPUT_CITY),
                net.serenitybdd.screenplay.actions.Enter.theValue(uTextData.getStrPostal()).into(UtextPageEnter.INPUT_POSTAL),
                //Enter.theValue(strCountry).into(UtextPageFormLocation.INPUT_COUNTRY),
                Click.on(UtextPageEnter.ENTER_BUTTON));
    }
}
