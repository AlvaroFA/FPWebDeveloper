function Edificio(calle, numero, codigoPostal, plantasEdificio) {
    this.calle = calle;
    this.numero = numero;
    this.codigoPostal = codigoPostal;
    this.plantasEdificio = agregarPlantasYPuertas();


    /*
     crea plantas con las puertas indicadas
     */
    function agregarPlantasYPuertas(numplantas, puertas) {


    }
    // Setters
    function modificarNumero(numero) {
        this.numero = numero
    }

    function modificarCalle(calle) {
        this.calle = calle;
    }

    function modificarCodigoPostal(codigoPostal) {
        this.codigoPostal = codigoPostal;
    }


// Getters
    function recuperaNumero() {
        return this.numero;
    }

    function recuperaCalle() {
        return this.calle;
    }

    function recuperaCodigoPostal() {
        return this.codigoPostal;
    }

    function agregarPropietario(nombre, planta, puerta) {

    }

    function imprimePlantas() {

    }

}






