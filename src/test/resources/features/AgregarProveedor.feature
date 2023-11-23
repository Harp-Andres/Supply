#language: es
#Author: hardware.rodriguez@sqasa.co

@AgregarProveedor
Característica: Agregar proveedor
  Quiero agregar una empresa proveedora a la plataforma Supply Factor

  Antecedentes: Ingresar a la plataforma de supply Factor y realizar la autenticacion de usuario
    Dado ingrese a la plataforma Supply Factor
    Y realice la autenticacion con un usuario pagador que cuenta con permisos de crear proveedores

  Escenario: Agregar proveedor
    Cuando ingrese al formulario agregar proveedor
    Y diligencie el formulario de agregar proveedor
    Entonces debo poder visualizar la empresa proveedor creada en la grilla de mis proveedores

