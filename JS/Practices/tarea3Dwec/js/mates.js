//Área del círculo: pedirá al usuario el radio en cm (con un prompt) y devolverá el área de la circunferencia.
function calcularAreaCirculo(){

    var prompt= window.prompt("Introduzca valor de radio en cm");
    var radio= parseFloat(prompt);
    var resultado=Math.PI*Math.pow(radio,2);
    document.getElementById('area').innerHTML='El area del circulo es '+resultado +' cm' ;
    
}
//Trigonometría: al pulsar, pedirá al usuario un ángulo en grados (entre 0 y 360 mediante un prompt) y devolverá los valores del seno, coseno y tangente (en un alert).
function trigonomiaAngulo(){
    var prompt= window.prompt("Introduzca el angulo ,en grados,a calcular ");
    var grados = parseInt(prompt);
    var radianes= grados* Math.PI/180;


    //Calculos trigonometricos en base a radianes
    var resultado='Los resultados de '+ grados + ' es:'+ '\n';
    var coseno= Math.cos(radianes);
    resultado+= 'cos:'+coseno+'\n';
    var seno= Math.sin(radianes);
    resultado+= seno+'\n';
    var tangente= Math.tan(radianes);
    resultado+= tangente+'\n';
    alert(resultado);
}



