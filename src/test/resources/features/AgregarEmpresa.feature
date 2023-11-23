#language: es
#Author: hardware.rodriguez@sqasa.co

@AgreagrEmpresa
Característica: Agregar empresa
  Quiero agregar una empresa pagadora a la plataforma Supply Factor

  Antecedentes: Ingresar a la plataforma de supply Factor y realizar la autenticacion de usuario
    Dado ingrese a la plataforma Supply Factor
    Y realice la autenticacion con el usuario que cuenta con permisos de crear empresas pagadoras

  Escenario: Agregar empresa pagadora
    Cuando ingrese al formulario agregar empresas
    Y diligencie el formulario de agregar empresas
    Entonces debo poder visualizar la empresa creada en la grilla de empresas ver todas

    #pruebas


