package co.com.choucair.certification.proyectoreto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtextPageComplete extends PageObject {
    public static final Target JOIN_TODAY_BUTTON = Target.the("button that shows as the form")
            .located(By.xpath("//a[contains(text(),'Join Today')]"));
    public static final Target INPUT_FIRST_NAME = Target.the("where we do write the first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where we do write the last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where we do write the email")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("where we do select the birth month")
            .located(By.xpath("//select[@id='birthMonth']//option[contains(text(),'September')]"));
    public static final Target SELECT_DAY = Target.the("where we do select the birth day")
            .located(By.xpath("//select[@id='birthDay']//option[contains(text(),'6')]"));
    public static final Target SELECT_YEAR = Target.the("where we do select the birth year")
            .located(By.xpath("//select[@id='birthYear']//option[contains(text(),'1999')]"));
    public static final Target ENTER_BUTTON = Target.the("button to the next page")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
