package co.com.choucair.certification.proyectoreto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtextPageLogin extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button to the login")
            .located(By.id("//a[contains(text(),'Login In')]"));
    public static final Target INPUT_EMAIL = Target.the("where we do write the email")
            .located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("where we do write the password")
            .located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("button to the get login")
            .located(By.id("kc-login"));
    public static final Target SELECT_NAME = Target.the("select visual user name")
            .located(By.xpath("//div[contains(text(),'Nataly moreno')]"));
}
