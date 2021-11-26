package co.com.choucair.certification.proyectoreto.questions;

import co.com.choucair.certification.proyectoreto.userinterface.UtextPageLogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameUser = Text.of(UtextPageLogin.SELECT_NAME).viewedBy(actor).asString();
        if (question.contains(nameUser)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}