package co.com.bancodeoccidente.supplyfactor.stepdefinitions;

import co.com.bancodeoccidente.supplyfactor.taks.AbrirElNavegador;
import co.com.bancodeoccidente.supplyfactor.taks.IngresarCredenciales;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class AgreagrEmpresaStepDefinitions {

@Managed(driver = "chrome")
private WebDriver herBrowser;

private final Actor andres = Actor.named("Andres");

@Before()
public void setup(){
    andres.can(BrowseTheWeb.with(herBrowser));
}

    @Dado("^ingrese a la plataforma Supply Factor$")
    public void ingreseALaPlataformaSupplyFactor() {
    andres.wasAbleTo(AbrirElNavegador.en());
    }


    @Dado("^realice la autenticacion con el usuario que cuenta con permisos de crear empresas pagadoras$")
    public void realiceLaAutenticacionConElUsuarioQueCuentaConPermisosDeCrearEmpresasPagadoras() {
    andres.attemptsTo(IngresarCredenciales.enviar());

    }

    @Cuando("^ingrese al formulario agregar empresas$")
    public void ingreseAlFormularioAgregarEmpresas() {

    }

    @Cuando("^diligencie el formulario$")
    public void diligencieElFormulario() {

    }

    @Entonces("^debo poder visualizar la empresa creada en la grilla de empresas ver todas$")
    public void deboPoderVisualizarLaEmpresaCreadaEnLaGrillaDeEmpresasVerTodas() {

    }



}
