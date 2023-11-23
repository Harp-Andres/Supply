package co.com.bancodeoccidente.supplyfactor.taks;

import co.com.bancodeoccidente.supplyfactor.userinterfaces.PaginaDeInicio;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirElNavegador implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new PaginaDeInicio() ));

    }

    public static AbrirElNavegador en(){
        return instrumented(AbrirElNavegador.class);
    }



}
