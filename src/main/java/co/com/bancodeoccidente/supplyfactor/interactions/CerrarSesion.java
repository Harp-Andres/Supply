package co.com.bancodeoccidente.supplyfactor.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.bancodeoccidente.supplyfactor.userinterfaces.ProveedoresVerTodos.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class CerrarSesion implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(Click.on(BTN_OPCIONESUSUARIO),
                    Click.on(BTN_CERRARSESION));
    }

    public static CerrarSesion cerrarSesion(){
        return instrumented(CerrarSesion.class);
    }
}
