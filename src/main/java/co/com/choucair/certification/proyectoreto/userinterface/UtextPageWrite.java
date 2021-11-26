package co.com.choucair.certification.proyectoreto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtextPageWrite extends PageObject {
    public static final Target INPUT_PASSWORD = Target.the("where we do write the password")
            .located(By.id("password"));
    public static final Target INPUT_PASSWORD_CONFIRM = Target.the("where we do write the password confirm")
            .located(By.id("confirmPassword"));
    public static final Target ENTER_CHECK_TERMS = Target.the("button to the select accept the Utext terms")
            .located(By.id("termOfUse"));
    public static final Target ENTER_CHECK_PRIVACY = Target.the("button to the select accept the privacy and security")
            .located(By.id("privacySetting"));
    public static final Target ENTER_BUTTON = Target.the("button to the next page")
            .located(By.id("laddaBtn"));

}
