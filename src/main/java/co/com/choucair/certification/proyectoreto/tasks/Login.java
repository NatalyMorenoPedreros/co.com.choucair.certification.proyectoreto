package co.com.choucair.certification.proyectoreto.tasks;

import co.com.choucair.certification.proyectoreto.model.UTextData;
import co.com.choucair.certification.proyectoreto.userinterface.UtextPageLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    UTextData uTextData;

    public Login(UTextData uTextData) {
        this.uTextData = uTextData;
    }

    public static Login onThePage(UTextData uTextData){
        return Tasks.instrumented(Login.class, uTextData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtextPageLogin.LOGIN_BUTTON),
                Enter.theValue(uTextData.getStrPassword()).into(UtextPageLogin.INPUT_EMAIL),
                Enter.theValue(uTextData.getStrPassword()).into(UtextPageLogin.INPUT_PASSWORD),
                Click.on(UtextPageLogin.ENTER_BUTTON),
                Click.on(UtextPageLogin.SELECT_NAME));
    }
}
