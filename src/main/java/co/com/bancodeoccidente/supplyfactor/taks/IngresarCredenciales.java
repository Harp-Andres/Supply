package co.com.bancodeoccidente.supplyfactor.taks;

import co.com.bancodeoccidente.supplyfactor.utils.MetodoUtilCargarArchivo;

import net.serenitybdd.screenplay.Actor;

import static co.com.bancodeoccidente.supplyfactor.userinterfaces.PaginaDeInicio.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class IngresarCredenciales implements Task {

    public static IngresarCredenciales enviar() {
        return instrumented(IngresarCredenciales.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        MetodoUtilCargarArchivo.configLoginProperties();
        actor.attemptsTo(Enter.theValue(MetodoUtilCargarArchivo.properties.
                getProperty("email")).into(INPUT_CORREO));
        actor.attemptsTo(Click.on(BTN_CONTINUAR));
        if (MetodoUtilCargarArchivo.properties.getProperty("email").
                contains("@bancodeoccidente.com.co")){
            System.out.println("Es un funcionario banco");


        }else {
            System.out.println("Es un funcionario externo");
            actor.attemptsTo(Enter.theValue(MetodoUtilCargarArchivo.properties.
                    getProperty("Contrasena")).into(INPUT_CONTRASENA),
                    Click.on(BTN_INGRESAR));
        }
    }
}