package co.com.bancodeoccidente.supplyfactor.questions;

import co.com.bancodeoccidente.supplyfactor.interactions.RecargarPagina;
import co.com.bancodeoccidente.supplyfactor.utils.MetodoUtilCargarArchivo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import java.time.Duration;


import static co.com.bancodeoccidente.supplyfactor.userinterfaces.ProveedoresVerTodos.*;

public class ValidacionCreacionProveedor implements Question {


    @Override
    public String answeredBy(Actor actor) {
        return LBL_COLUMNAEMAIL.resolveFor(actor).getText();

    }

    public static ValidacionCreacionProveedor validarCreacion(){
        return new ValidacionCreacionProveedor();
    }
}
