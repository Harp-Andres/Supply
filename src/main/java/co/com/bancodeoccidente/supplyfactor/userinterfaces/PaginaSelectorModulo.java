package co.com.bancodeoccidente.supplyfactor.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaSelectorModulo {
    public static final Target LBL_MODULOS = Target.the("titulo de pagina selector de modulo").
            located(By.xpath("//h1[contains(text(),' Selector de módulo')]"));
    public static final Target BTN_PAGADOR = Target.the
            ("boton ingresar como pagador").located(By.
            xpath("//role-card[@icon='/enterprise/assets/images/Pagador.png']/div/child::button"));
}
