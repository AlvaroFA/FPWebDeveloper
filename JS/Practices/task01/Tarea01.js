/**
 * Created by alvaro on 26/10/17.
 */


//Tarea1
function numerosNaturales() {
    var listado = "";
    for (i = 1; i <= 10; i++) {
        listado += i.toString() + ",";
    }
    window.alert(listado);
}

//Tarea2
function numerosNaturalesPares() {
    var listado = "";
    for (i = 2; i <= 20; i = i + 2) {
        listado += i.toString() + ",";
    }
    window.alert(listado);
}

//Tarea3
function mediaNumerosNaturales() {
    var numeros = 0;
    for (i = 0; i <= 10; i++) {
        numeros += i;
    }
    var mediaNumeros = numeros / 10;
    window.alert(mediaNumeros.toString());
}

//Tarea4
function n_numerosNaturales() {
    var numero = window.prompt("Introduzca numero");
    var listado = "";
    for (i = 1; i <= numero; i++) {
        listado += i + ",";
    }
    window.alert(listado);
}

//Tarea5
function n_sumaNumerosNaturales(numero) {
    var resultado = 0;
    numero = window.prompt("Introduzca numero limite para sumar");
    for (i = 0; i <= numero; i++) {
        resultado += i;
    }
    window.alert(resultado);
}

//Tarea6
function n_mediaNumerosNaturales(numero) {
    var resultado = 0;
    numero = window.prompt("Introduzca numero");
    for (i = 0; i <= numero; i++) {
        resultado += i;
    }
    var media = resultado / parseInt(numero);
    window.alert(media);
}

//Tarea7
function n_combinada() {
    var numero = window.prompt("Introduzca numero");
    var listado = "";
    var resultado = 0;
    for (i = 1; i <= numero; i++) {
        resultado += i;
        listado += i;
    }
    var media = resultado / parseInt(numero);
    window.alert(listado + "\n" + "La media es:" + media + "\n" + "La suma total es :" + resultado);
}

//Tarea8
function numeroPrimoFijo() {
    for (i = 2; i < 237; i++) {
        if (237 % i === 0) {
            window.alert("No Es primo");
            return false;
        }
    }
    window.alert("Es primo");
    return true;
}

//Tarea9
function n_numeroPrimo() {
    prompt = window.prompt("Inserte numero");
    var numero = parseInt(prompt);
    for (i = 2; i < numero; i++) {
        if (numero % i === 0) {
            window.alert("No Es primo");
            return false;
        }
    }
    window.alert("Es primo");
    return true;
}

//Tarea10
function primerosPrimos() {
    var cantidadNumerosPrimos = 1;
    var numero = 2;

    while (cantidadNumerosPrimos <= 10) {
        var numeroActualEsPrimo = true;
        for (i = 2; i < numero; i++) {
            if (numero % i === 0) {
                numeroActualEsPrimo = false;
                break;
            }
        }
        if (numeroActualEsPrimo) {
            window.alert(numero + " es el " + cantidadNumerosPrimos + "º primo");
            cantidadNumerosPrimos++;
        }
        numero++;
    }
}

//Tarea 11
function n_primerosPrimos(limite) {
    var cantidadNumerosPrimos = 1;
    listado = "";
    limite = window.prompt("cuantos numero primos quieres?");
    numero = 2;
    var resultado = 0;

    while (cantidadNumerosPrimos <= limite) {
        var numeroActualEsPrimo = true;
        for (i = 2; i < numero; i++) {
            if (numero % i === 0) {
                //No es primo
                numeroActualEsPrimo = false;
                break;
            }
        }
        if (numeroActualEsPrimo) {
            resultado += i;
            listado += i.toString() + ",";
            cantidadNumerosPrimos++;
        }
        numero++;   //Comprobamos el siguiente número
    }
    var media = resultado / parseInt(numero);
    var resultado = window.alert("Los numeros son:" + listado + "\n" +
        "La media es:" + media + ",la suma total es :" + resultado);
}

//Tarea12
function mediaNumeros() {
    var sumador = 0;
    var contador = 0;
    var media = 0;
    var salir = false;
    var params = null;
    var paramsAsNumber = 0;
    while (salir === false) {
        switch (params) {
            case"*":
                media = sumador / contador;
                sumador = window.alert("fin de secuencia: La media es:" + media);
                salir = true;
                break;
            default:
                params = window.prompt("Introduzca numero:" + contador, 0);
                paramsAsNumber = parseInt(params);
                if (!isNaN(paramsAsNumber)) {
                    sumador += paramsAsNumber;
                    contador++;
                }
                break;
        }
    }
}

//Tarea13
function mediaNumerosMultilinea() {
    var sumador = 0;
    var contador = 0;
    var media = 0;
    var salir = false;
    var params = null;
    var paramsAsNumber = 0;
    var conjuntoValores = "";
    while (salir === false) {
        switch (params) {
            case"*":
                ;
                media = sumador / contador;
                sumador = window.alert("fin de secuencia: La media es:" + media);
                salir = true;
                break;
            default:
                params = window.prompt("Introduzca numero:" + contador, 0);
                paramsAsNumber = parseInt(params);
                if (!isNaN(paramsAsNumber)) {
                    sumador += paramsAsNumber;
                    contador++;
                    media = sumador / contador;
                    conjuntoValores += params + ",";
                    window.alert("La media actual es:" + media +
                        "\n" + "Numeros: " + conjuntoValores);
                }
                break;
        }
    }
}

//Tarea14
function ciudadesTemperaturasMedias() {
    var ciudadContador = 0;
    var ciudad = "";
    var temp1, temp2, temp3 = 0;
    var ciudadTotales = "";
    var media = 0;
    var salir = false;
    var params = null;
    var paramsAsNumber = 0;
    while (salir === false) {
        switch (params) {
            case"*":
                salir = true;
                break;
            default:
                params = window.prompt("Introduzca ciudad:");
                ciudad = params;
                params = window.prompt("Introduzca Temperatura 1:");
                temp1 = parseInt(params);
                params = window.prompt("Introduzca Temperatura 2:");
                temp2 = parseInt(params);
                params = window.prompt("Introduzca Temperatura 3:");
                temp3 = parseInt(params);
                ciudadContador++;
                paramsAsNumber = temp1 + temp2 + temp3;
                if (!isNaN(paramsAsNumber)) {
                    media = paramsAsNumber / 3;
                    media_total += media;
                    ciudadTotales += "\t" + ciudad + "\t" + temp1 + "\t" + temp2 + "\t" + temp3 + "\t" + media + "\n";
                    window.alert("\t" + "Ciudad" + "T1" + "\t" + "T2" + "\t" + "T3" + "\t" + "Media" + "\n" + ciudadTotales +
                        "\n" + "numero Ciudades" + ciudadContador + media_total);
                }
                break;
        }
    }
}
//Lanzara un prompt y pedirá número
function pedirPrompt() {
    var prompt = window.prompt("Introduce numero fibonacci");
    return numero = parseInt(prompt);
}
//Calcula un numero de Fibonacci
function calcularFibonacci(numero) {
    var anterior1 = 0;
    var anterior2 = 1;
    var actual = 0;
    var listado = "";
    for (i = 2; i <= numero; i++) {
        anterior1 = anterior2;
        anterior2 = actual;
        actual = anterior1 + anterior2;
        listado += actual + ",";
    }
    window.alert("0," + listado);
    return ("0,1," + listado);
}


//Tarea15
function fibonacci() {
    var numero = pedirPrompt();
    calcularFibonacci(numero);
}

//Tarea16
function esNumeroFibonacci() {
    var prompt = pedirPrompt();
    var anterior1 = 0;
    var anterior2 = 1;
    var actual = anterior1 + anterior2;
    var esFibonacci = false;
    if (numero === 0 || 1) {
        esFibonacci = true;
        contadorFibo = 1;
    }

    for (i = 2; i <= numero; i++) {
        anterior1 = anterior2;
        anterior2 = actual;
        actual = anterior1 + anterior2;
        if (numero === actual) {
            esFibonacci = true;
            break;
        }
        esFibonacci = false;
    }
    if (esFibonacci === true) {
        window.alert("Es de la sucesion de Fibonacci");
    } else {
        window.alert("No es la sucesion de Fibonacci");
    }
}

//Tarea17
function posicionFibonacci(numero) {
    if (numero === undefined) {
        numero = pedirPrompt();
    }

    var anterior1 = 0;
    var anterior2 = 1;
    var actual = anterior1 + anterior2;
    var esFibonacci = true;
    var contadorFibo = 2;
    if (numero === 0) {
        esFibonacci = true;
        contadorFibo = 1;
    } else if (numero === 1) {
        esFibonacci = true;
    }

    for (i = 2; i <= numero; i++) {

        anterior1 = anterior2;
        anterior2 = actual;
        actual = anterior1 + anterior2;

        if (numero === actual) {
            contadorFibo += i;
            esFibonacci = true;
            break;
        }
        esFibonacci = false;
    }
    if (esFibonacci === true) {
        window.alert("Es de la sucesion de Fibonacci y su posicion es:" + contadorFibo);
        return (contadorFibo);
    } else {
        window.alert("No es la sucesion de Fibonacci");
    }


}

//Tarea18
function fibonacciAnteriorPosterior() {
    var posicion_numero = posicionFibonacci();
    var numeroAnterior = 0;
    var anterior1 = 0;
    var anterior2 = 1;
    var actual = anterior1 + anterior2;
    var esFibonacci = true;
    var contadorFibo = parseInt(posicion_numero);
    for (i = 2; i <= contadorFibo; i++) {
        actual = anterior1 + anterior2;
        anterior1 = anterior2;
        anterior2 = actual;

        if (i === contadorFibo) {
            numeroAnterior = actual - anterior1;
            window.alert("El numero posterior es:" + actual);
            window.alert("El numero anterior es:" + numeroAnterior);
        }
    }
}

