package co.com.bancodeoccidente.supplyfactor.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class RecargarPagina implements Interaction {


    public static Performable Refrescar(){
        return  instrumented(RecargarPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        driver.navigate().refresh();
    }




}
