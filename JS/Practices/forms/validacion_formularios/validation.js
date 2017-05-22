

//first instruction, its starts when document is load 
window.onload=iniciar;

//----------------------------------------------------------//

function iniciar()
{
    
    //When click enviar he call validar function 
	document.getElementById("enviar").addEventListener('click',validar,false);
}

//----------------------------------------------------------//

function validar(eventopordefecto)	/
	
	//Validates all fields and popup window to confirm 
	if (validarcampostexto(this) && validarMatricula() && validarProvincia() && confirm("¿Deseas enviar el formulario?"))
		return true;
	else
	{
		// if something was wrong the form dont send nformation
		eventopordefecto.preventDefault();		
		return false;
	}
}

//----------------------------------------------------------//

function validarcampostexto(objeto)
{
	// A esta función le pasamos un objeto (que en este caso es el botón de enviar.
	// Puesto que validarcampostexto(this) hace referencia al objeto dónde se programó ese evento
	// que fue el botón de enviar.
	var formulario = objeto.form;	// La propiedad form del botón enviar contiene la referencia del formulario dónde está ese botón submit.

	for (var i=0; i<formulario.elements.length; i++)
	{
		// Eliminamos la clase Error que estuviera asignada a algún campo.
		formulario.elements[i].className="";
	}
	
	// De esta manera podemos recorrer todos los elementos del formulario, buscando los que son de tipo texto.
	// Para validar que contengan valores.
	for (var i=0; i<formulario.elements.length; i++)
	{
		if (formulario.elements[i].type == "text" && formulario.elements[i].value=="")
		{
			alert("El campo: "+formulario.elements[i].name+" no puede estar en blanco");
			formulario.elements[i].className="error";
			formulario.elements[i].focus();
			return false;
		}
		// Aprovechamos y dentro de la función validamos también la edad.
		else if (formulario.elements[i].id=="edad")
			{
				if (isNaN(formulario.elements[i].value) || formulario.elements[i].value <0 || formulario.elements[i].value >105)
				{
					alert("El campo: "+formulario.elements[i].name+" posee valores incorrectos o la edad <0 o >105");
					formulario.elements[i].className="error";
					formulario.elements[i].focus();
					return false;
				}
			}
	}
	
	return true;	 // Si sale de la función con esta instrucción es que todos los campos de texto y la edad son válidos.
}

//----------------------------------------------------------//

function validarMatricula()
{
	// 4 Números 1 espacio en blanco(opcional) y 3 letras de la A-Z en mayúsculas
	var patron = /^\d{4}\s?[A-Z]{3}$/;
	
	if (patron.test(document.getElementById("matricula").value))
	{
		document.getElementById("matricula").className="";	
		return true;
	}
	else
	{
		alert("El campo: Matricula no está correcto.\n\nCuatro números espacion en blanco opcional y 3 letras mayúsculas.");
		
		// Situamos el foco en el campo matrícula y le asignamos la clase error.
		document.getElementById("matricula").focus();
		document.getElementById("matricula").className="error";	
		return false;
	}
}

//----------------------------------------------------------//

function validarProvincia()
{
	// Comprueba que la opción seleccionada sea diferente a 0.
	// Si es la 0 es que no ha seleccionado ningún nombre de Provincia.
	if (document.getElementById("provincia").selectedIndex==0)
	{
		alert("Atención!: Debes seleccionar una provincia.");

		// Situamos el foco en el campo provincia y le asignamos la clase error.
		document.getElementById("provincia").focus();
		document.getElementById("provincia").className="error";	
		return false;
	}
	else
		return true;
}