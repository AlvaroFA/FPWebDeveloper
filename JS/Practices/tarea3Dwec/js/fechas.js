/* Fecha: mostrará la fecha actual (la del momento de pulsar) con el formato del siguiente ejemplo (para español y españa):
 jue., 8 de noviembre de 2012
 */
function mostrarFecha() {
    var dia= ['lue.','mar.','mie.','jue.','vie.','sab.','dom.'];
    var meses= ['Enero','Febrero','Marzo','Abril','Mayo','Junio','Julio','Agosto', 'Septiembre','Octubre', 'Noviembre', 'Diciembre'];
    var fecha = new Date();
    document.getElementById("fecha").innerHTML=dia[fecha.getDay()]+' '+fecha.getDate()+' de '+ meses[fecha.getMonth()]+' de '+ fecha.getFullYear();
}
