package co.com.bancodeoccidente.supplyfactor.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioAgregarProveedor {

    public static final Target CBO_TIPODOCUMENTO = Target.the("seleccionar tipo de documento del proveedor").
            located(By.name("provider-document-type"));
    public static final Target CBO_LISTATIPODOCUMENTO = Target.the("lista de tipo de documento del proveedor").
            located(By.xpath("//mat-option[@class='mat-option mat-selected mat-active']/.."));
    public static final Target CBO_OPC_NIT = Target.the("seleccionar tipo de documento nit").
            located(By.xpath("//mat-option[@value='NIT']"));
    public static final Target CBO_OPC_CEDULACIUDADANIA   = Target.the("seleccionar tipo de documento cedula de ciudadania").
            located(By.xpath("//mat-option[@value='IDENTIFICATION_CARD']"));
    public static final Target CBO_OPC_CEDULAEXTRANJERIA   = Target.the("seleccionar tipo de documento cedula de extranjeria").
            located(By.xpath("//mat-option[@value='IDENTIFICATION_CARD']"));
    public static final Target CBO_OPC_PATRIMONIOAUTONOMO  = Target.the("seleccionar tipo de documento patrimonio autonomo").
            located(By.xpath("//mat-option[@value='AUTONOMOUS_HERITAGE']"));
    public static final Target CBO_OPC_PASAPORTE  = Target.the("seleccionar tipo de documento pasaporte").
            located(By.xpath("//mat-option[@value='PASSPORT']"));
    public static final Target TXT_NUMERODOCUMENTO = Target.the("ingresar numero de documento del proveedor").
            located(By.xpath("//input[@placeholder='Número de documento']"));
    public static final Target TXT_RAZONSOCIAL = Target.the("ingresar la razon social del proveedor").
            located(By.xpath("//input[@placeholder='Razón social']"));
    public static final Target CBO_TIPOPRODUCTO = Target.the("seleccionar tipo de producto").
            located(By.xpath("//div[@class='mat-select-value']/span/span[contains(text(),'Factoring') or span[contains(text(),'Unidirecto')]]"));
    public static final Target CBO_DEPARTAMENTO = Target.the("seleccionar campo de texto departamento").
            located(By.xpath("//input[@placeholder='Departamento']"));
    public static final Target CBO_LISTADEPARTAMENTOS = Target.the("seleccionar departamento de la lista campo de departamentos").
            located(By.xpath("//mat-option[@role='option']/span"));
    public static final Target CBO_CIUDAD = Target.the("seleccionar campo de texto ciudad").
            located(By.xpath("//input[@placeholder='Ciudad']"));
    public static final Target CBO_LISTACIUDAD = Target.the("seleccionar ciudad de la lista campo de ciudades").
            located(By.xpath("//mat-option[@role='option']/span"));
    public static final Target BTN_CANCELAR = Target.the("boton cancelar registro de formulario").
            located(By.xpath("//button/span[contains(text(),' Cancelar ')]/.."));
    public static final Target TXT_CIIU = Target.the("ingresar codigo CIIU").
            located(By.xpath("//input[@placeholder='CIIU']"));
    public static final Target TXT_NOMBRE = Target.the("ingresar el nombre del contacto").
            located(By.xpath("//input[@placeholder='Nombre']"));
    public static final Target TXT_PRIMERAPELLIDO = Target.the("ingresar el primer apellido del contacto").
            located(By.xpath("//input[@placeholder='Primer apellido']"));
    public static final Target TXT_SEGUNDOAPELLIDO = Target.the("ingresar el segundo apellido del contacto").
            located(By.xpath("//input[@placeholder='Segundo apellido']"));
    public static final Target TXT_EMAIL = Target.the("ingresar el correo del contacto").
            located(By.name("email"));
    public static final Target TXT_TELEFONO = Target.the("ingresar el telefono del contacto").
            located(By.name("phone-number"));
    public static final Target TXT_EXTENSION = Target.the("ingresar la extension del contacto").
            located(By.name("phone-extension"));
    public static final Target CBO_FORMADESEMBOLSO = Target.the("seleccione campo de texto forma de desembolso").
            located(By.xpath("//mat-select/div/div/span[contains(text(),'Forma de desembolso')]"));
    public static final Target CBO_OPC_ABONOCUENTA = Target.the("seleccione de la lista forma de desembolso abono a cuenta").
            located(By.xpath("//mat-option[@value='ACCOUNT_DEPOSIT']/span"));
    public static final Target CBO_OPC_CHEQUE = Target.the("seleccione de la lista forma de desembolso cheque").
            located(By.xpath("//mat-option[@value='BANK_CHECK']/span"));
    public static final Target CBO_LISTA_TIPODOCUMENTO = Target.the("seleccione de la lista tipo de documento").
            located(By.xpath("//mat-option/span"));
    public static final Target BTN_ENVIAR = Target.the("boton enviar registro de formulario").
            located(By.xpath("//button/span[contains(text(),' Enviar ')]/.."));

}
