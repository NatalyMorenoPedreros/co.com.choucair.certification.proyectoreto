package co.com.choucair.certification.proyectoreto.tasks;

import co.com.choucair.certification.proyectoreto.model.UTextData;
import co.com.choucair.certification.proyectoreto.userinterface.UtextPageSelect;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Select implements Task {
    UTextData uTextData;

    public Select(UTextData uTextData) {
        this.uTextData = uTextData;
    }

    public static Select theDeviceInformation(UTextData uTextData){
        return Tasks.instrumented(Select.class,uTextData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtextPageSelect.SELECT_MOBILE_DEVICE),
                Click.on(UtextPageSelect.SELECT_MOBILE_MODEL),
                Click.on(UtextPageSelect.SELECT_MOBILE_SYSTEM),
                Click.on(UtextPageSelect.ENTER_BUTTON));
    }
}
