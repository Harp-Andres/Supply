package co.com.bancodeoccidente.supplyfactor.taks;

import co.com.bancodeoccidente.supplyfactor.interactions.RecargarPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static co.com.bancodeoccidente.supplyfactor.userinterfaces.FormularioAgregarProveedor.CBO_TIPODOCUMENTO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static co.com.bancodeoccidente.supplyfactor.userinterfaces.ProveedoresVerTodos.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static co.com.bancodeoccidente.supplyfactor.userinterfaces.PaginaSelectorModulo.*;

public class IngresarFormularioAgregarProveedor implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
            Click.on(BTN_PAGADOR.waitingForNoMoreThan(Duration.ofSeconds(7))));
        }catch (Exception e){
            System.out.println("llego hasta aqui ya debo consumir metodo refrescar pagina");
            actor.attemptsTo(RecargarPagina.Refrescar());
            actor.attemptsTo(
                    Click.on(BTN_PAGADOR.waitingForNoMoreThan(Duration.ofSeconds(7))));
            //actor.attemptsTo(WaitUntil.the(BTN_PAGADOR,isPresent()).forNoMoreThan(7).
                    //seconds(), Click.on(BTN_PAGADOR));
        }
        actor.attemptsTo(WaitUntil.the(BTN_AGREGARPROVEEDOR,isPresent()).forNoMoreThan(5).seconds(),
                Click.on(BTN_AGREGARPROVEEDOR));
    }

    public static IngresarFormularioAgregarProveedor entrar(){
        return instrumented(IngresarFormularioAgregarProveedor.class);
    }

}
