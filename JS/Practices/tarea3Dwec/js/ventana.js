var ventana=null
function abrirVentana() {

    //Se abrirá una nueva ventana que cargue el código de ventana.html.
    // Verificar previamente si existe la ventana: si no exite se abre y si existe, se muestra.
    // La ventena tendrá que incluir como título tu nombre y no mostrará barra de navegación.
    if  (ventana== null || ventana.closed)
    {

        ventana  =  window.open("html/ventana.html",  "Alvaro Fraga Arnaiz", "width=420,height=230,toolbar=0,menubar=0");
        ventana.focus();
    }else{

        alert('Ventana ya abierta');
    }

}


function cerrarVentana() {

    if  (ventana != null)
    {
        ventana.close();
        ventana=null;

    }else{
        alert('Ventana ya cerrada');
    }


}

//Mover la ventana a la posición 100x100px.
// Verificar previamente si la ventana existe: si no existiese se mostraría un error mediante alert.
function moverVentana(){

    if  (ventana != null)
    {
        ventana.moveTo(100,100);
        ventana=null;

    }else{
        alert('Ventana no abierta');
    }
}
//Redimensionar: Crecer el tamaño de la ventana en 10px en ambas medidas.
// Verificar previamente si la ventana existe: si no existiese se mostraría un error mediante alert.
function redimensionarVentana(){

    if  (ventana != null)
    {
        ventana.focus();
        ventana.resizeBy(10,10);
    }else{
        alert('Ventana no abierta');
    }
}

//Desplazar: moverá la ventanta hacia la derecha cha 10px y abajo 20px.
// Verificar previamente si la ventana existe: si no existiese se mostraría un error mediante alert.

function desplazarVentana(){

    if  (ventana != null)
    {
        ventana.focus();
        ventana.moveBy(10,20);
    }else{
        alert('Ventana no abierta');
    }
}


