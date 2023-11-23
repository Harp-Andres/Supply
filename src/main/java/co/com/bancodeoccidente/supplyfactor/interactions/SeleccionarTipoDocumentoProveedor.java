package co.com.bancodeoccidente.supplyfactor.interactions;

import co.com.bancodeoccidente.supplyfactor.utils.MetodoUtilCargarArchivo;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import org.openqa.selenium.WebElement;


import java.util.List;

import static co.com.bancodeoccidente.supplyfactor.userinterfaces.FormularioAgregarProveedor.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarTipoDocumentoProveedor implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        MetodoUtilCargarArchivo.configDataProveedorProperties();
        System.out.println(MetodoUtilCargarArchivo.properties.
                getProperty("tipoDocumentoProveedor"));
           List<WebElementFacade> opciones = CBO_LISTA_TIPODOCUMENTO.resolveAllFor(actor);
           for (int i = 0; i < opciones.size(); i++){
               WebElement seleccionOpcion = opciones.get(i);
               if (seleccionOpcion.getText().equals(MetodoUtilCargarArchivo.properties.
                       getProperty("tipoDocumentoProveedor"))){
                   seleccionOpcion.click();
                   break;

               }
           }
    }

    public static Performable seleccion() {
        return  instrumented(SeleccionarTipoDocumentoProveedor.class);
    }

}
