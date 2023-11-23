package co.com.bancodeoccidente.supplyfactor.userinterfaces;

import co.com.bancodeoccidente.supplyfactor.utils.MetodoUtilCargarArchivo;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProveedoresVerTodos {


    public static final Target BTN_AGREGARPROVEEDOR = Target.the("boton agregar proveedor").
            located(By.xpath("//button/span[contains(text(),' Agregar proveedor ')]/.."));
    public static final Target BTN_OPCIONESUSUARIO = Target.the("boton opciones del usuario autenticado").
            located(By.xpath("//mat-toolbar/button/span[contains(text(),'@')]"));
    public static final Target BTN_CERRARSESION = Target.the("boton cerrar sesion").
            located(By.xpath("//button[contains(text(),' Cerrar sesión ')]"));
    public static final Target LBL_COLUMNAEMAIL = Target.the("label de primer campo de la columna email").
            located(By.xpath("//tr[1]/td[3]"));

}
