package co.com.bancodeoccidente.supplyfactor.stepdefinitions;

import co.com.bancodeoccidente.supplyfactor.interactions.CerrarSesion;
import co.com.bancodeoccidente.supplyfactor.interactions.RecargarPagina;
import co.com.bancodeoccidente.supplyfactor.questions.ValidacionCreacionProveedor;
import co.com.bancodeoccidente.supplyfactor.taks.DiligenciarFormularioAgregarProveedor;
import co.com.bancodeoccidente.supplyfactor.taks.IngresarCredenciales;
import co.com.bancodeoccidente.supplyfactor.taks.IngresarFormularioAgregarProveedor;
import co.com.bancodeoccidente.supplyfactor.utils.MetodoUtilCargarArchivo;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static co.com.bancodeoccidente.supplyfactor.userinterfaces.ProveedoresVerTodos.LBL_COLUMNAEMAIL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;


public class AgregarProveedorStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver herBrowser;

    private final Actor andres = Actor.named("Andres");



    @Before()
    public void setup(){
        andres.can(BrowseTheWeb.with(herBrowser));
    }



    @Dado("^realice la autenticacion con un usuario pagador que cuenta con permisos de crear proveedores$")
    public void realiceLaAutenticacionConUnUsuarioPagadorQueCuentaConPermisosDeCrearProveedores() {
        andres.attemptsTo(IngresarCredenciales.enviar());

    }


    @Cuando("^ingrese al formulario agregar proveedor$")
    public void ingreseAlFormularioAgregarProveedor() {
        andres.attemptsTo(IngresarFormularioAgregarProveedor.entrar());

    }

    @Cuando("^diligencie el formulario de agregar proveedor$")
    public void diligencieElFormularioDeAgregarProveedor() {
        andres.attemptsTo(DiligenciarFormularioAgregarProveedor.diligenciar());

    }

    @Entonces("^debo poder visualizar la empresa proveedor creada en la grilla de mis proveedores$")
    public void deboPoderVisualizarLaEmpresaProveedorCreadaEnLaGrillaDeMisProveedores() {
        MetodoUtilCargarArchivo.configDataProveedorProperties();
            andres.attemptsTo(WaitUntil.the(LBL_COLUMNAEMAIL,isPresent()).forNoMoreThan(3).seconds());
            andres.attemptsTo(RecargarPagina.Refrescar());
            andres.attemptsTo(WaitUntil.the(LBL_COLUMNAEMAIL,isPresent()).forNoMoreThan(5).seconds());
        System.out.println(LBL_COLUMNAEMAIL.resolveFor(andres).getText());
        andres.should(GivenWhenThen.seeThat(ValidacionCreacionProveedor.validarCreacion(),
                Matchers.equalTo(MetodoUtilCargarArchivo.properties.getProperty("email"))));

    }

    @After
    public void logout(){
        andres.attemptsTo(CerrarSesion.cerrarSesion());

    }

}
