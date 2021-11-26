package co.com.choucair.certification.proyectoreto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtextPageSelect extends PageObject {
    public static final Target SELECT_MOBILE_DEVICE = Target.the("where we do select the mobile device")
            .located(By.xpath("//*[@id='ui-select-choices-row-29-23']/span/div"));
    public static final Target SELECT_MOBILE_MODEL = Target.the("where we do select the mobile model")
            .located(By.xpath("//*[@id='ui-select-choices-row-30-114']/span/div"));
    public static final Target SELECT_MOBILE_SYSTEM = Target.the("where we do select the mobile system")
            .located(By.xpath("//*[@id='ui-select-choices-row-31-0']/span/div"));
    public static final Target ENTER_BUTTON = Target.the("button to the next page")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a/span"));
}
