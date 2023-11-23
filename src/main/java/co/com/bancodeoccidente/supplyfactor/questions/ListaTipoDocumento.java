package co.com.bancodeoccidente.supplyfactor.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

import static co.com.bancodeoccidente.supplyfactor.userinterfaces.FormularioAgregarProveedor.*;

public class ListaTipoDocumento implements Question<List<WebElement>> {


    @Override
    public List<WebElement> answeredBy(Actor actor) {
        //ela siguiente linea retorna la lista de los elementos del localizador
       //return Text.of(CBO_LISTATIPODOCUMENTO).viewedBy(actor).asList();

        return (List<WebElement>) CBO_LISTATIPODOCUMENTO.resolveFor(actor);
    }


    public static ListaTipoDocumento obtenerLista(){
        return new ListaTipoDocumento();
    }




}
