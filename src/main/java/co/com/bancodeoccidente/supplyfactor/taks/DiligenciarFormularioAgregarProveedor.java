package co.com.bancodeoccidente.supplyfactor.taks;

import co.com.bancodeoccidente.supplyfactor.interactions.SeleccionarFormaDesembolso;
import co.com.bancodeoccidente.supplyfactor.interactions.SeleccionarTipoDocumentoProveedor;
import co.com.bancodeoccidente.supplyfactor.utils.MetodoUtilCargarArchivo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.time.Duration;


import static co.com.bancodeoccidente.supplyfactor.userinterfaces.FormularioAgregarProveedor.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DiligenciarFormularioAgregarProveedor implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        MetodoUtilCargarArchivo.configDataProveedorProperties();
        actor.attemptsTo(
                Click.on(CBO_TIPODOCUMENTO.waitingForNoMoreThan(Duration.ofSeconds(5))));
        actor.attemptsTo(SeleccionarTipoDocumentoProveedor.seleccion());
        actor.attemptsTo(
                Enter.theValue(MetodoUtilCargarArchivo.properties.
                getProperty("numeroDocumento")).into(TXT_NUMERODOCUMENTO),
                Enter.theValue(MetodoUtilCargarArchivo.properties.
                getProperty("razonSocial")).into(TXT_RAZONSOCIAL),
                Click.on(CBO_DEPARTAMENTO),
                Enter.theValue(MetodoUtilCargarArchivo.properties.
                getProperty("departamento")).into(CBO_DEPARTAMENTO));
        CBO_LISTADEPARTAMENTOS.resolveFor(actor).getText().equals((MetodoUtilCargarArchivo.properties.
                getProperty("departamento")));
        actor.attemptsTo(Click.on(CBO_LISTADEPARTAMENTOS),
                Click.on(CBO_CIUDAD),
                Enter.theValue(MetodoUtilCargarArchivo.properties.
                getProperty("ciudad")).into(CBO_CIUDAD));
        CBO_LISTADEPARTAMENTOS.resolveFor(actor).getText().contains((MetodoUtilCargarArchivo.properties.
                getProperty("ciudad")));
        actor.attemptsTo(Click.on(CBO_LISTACIUDAD),
                Enter.theValue(MetodoUtilCargarArchivo.properties.
                getProperty("CIIU")).into(TXT_CIIU),
                Enter.theValue(MetodoUtilCargarArchivo.properties.
                getProperty("nombre")).into(TXT_NOMBRE),
                Enter.theValue(MetodoUtilCargarArchivo.properties.
                getProperty("primerApellido")).into(TXT_PRIMERAPELLIDO),
                Enter.theValue(MetodoUtilCargarArchivo.properties.
                getProperty("segundoApellido")).into(TXT_SEGUNDOAPELLIDO),
                Enter.theValue(MetodoUtilCargarArchivo.properties.
                getProperty("email")).into(TXT_EMAIL),
                Enter.theValue(MetodoUtilCargarArchivo.properties.
                getProperty("telefono")).into(TXT_TELEFONO),
                Enter.theValue(MetodoUtilCargarArchivo.properties.
                getProperty("extension")).into(TXT_EXTENSION),
                SeleccionarFormaDesembolso.seleccion(),
                Click.on(BTN_ENVIAR));

    }

    public static DiligenciarFormularioAgregarProveedor diligenciar(){
        return instrumented(DiligenciarFormularioAgregarProveedor.class);
    }
}
