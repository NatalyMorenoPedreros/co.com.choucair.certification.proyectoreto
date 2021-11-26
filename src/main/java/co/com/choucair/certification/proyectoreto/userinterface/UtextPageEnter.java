package co.com.choucair.certification.proyectoreto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtextPageEnter extends PageObject {

    public static final Target INPUT_CITY = Target.the("where we do write the city")
            .located(By.id("city"));
    public static final Target INPUT_POSTAL = Target.the("where we do write the postal city")
            .located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the("where we do write the country")
            .located(By.name("countryId"));
    public static final Target ENTER_BUTTON = Target.the("button to the next page")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
}
