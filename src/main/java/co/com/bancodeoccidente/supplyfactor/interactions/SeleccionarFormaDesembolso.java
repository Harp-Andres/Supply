package co.com.bancodeoccidente.supplyfactor.interactions;

import co.com.bancodeoccidente.supplyfactor.utils.MetodoUtilCargarArchivo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.bancodeoccidente.supplyfactor.userinterfaces.FormularioAgregarProveedor.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarFormaDesembolso implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        MetodoUtilCargarArchivo.configDataProveedorProperties();
            actor.attemptsTo(Click.on(CBO_FORMADESEMBOLSO));
            if (MetodoUtilCargarArchivo.properties.getProperty("formaDesembolso").
                    equals("abono a cuenta")){
                actor.attemptsTo(Click.on(CBO_OPC_ABONOCUENTA));
            }else if (MetodoUtilCargarArchivo.properties.getProperty("formaDesembolso").
                    equals("cheque")){
                actor.attemptsTo(Click.on(CBO_OPC_CHEQUE));
            }
    }

    public static SeleccionarFormaDesembolso seleccion() {
        return instrumented(SeleccionarFormaDesembolso.class);
    }
}

