package co.com.bancodeoccidente.supplyfactor.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://d24ezfigdsqm8q.cloudfront.net/sign-in")
public class PaginaDeInicio extends PageObject {

    public static final Target INPUT_CORREO = Target.the
            ("ingrese el nombre de usuario").located(By.name("email"));
    public static final Target BTN_CONTINUAR = Target.the
            ("boton continuar").located(By.
            xpath("//a[@class = 'mat-flat-button mat-button-base' and //span[contains(text(),'Continuar')] ]"));
    public static final Target BTN_ACTIVE_DIRECTORY = Target.the("boton de ingreso directorio activo").
            located(By.xpath("//input[@class='btn btn-info idpButton-customizable']"));
    public static final Target INPUT_CONTRASENA = Target.the("ingreso la contraseña").
            located(By.name("password"));
    public static final Target BTN_INGRESAR = Target.the("boton ingresar").
            located(By.xpath("//a[@class = 'mat-flat-button mat-button-base' and //span[contains(text(),'Ingresar')] ]"));


}
