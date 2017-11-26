<html>
    <head>
    </head>    
    <body>
        <?php
        $values = array();

        for ($index = 1; $index <= 10; $index++) {
            $values[$index] = postValue($index);
        }

        function postValue($param) {
            if (isset($_POST[$param])) {
                return $_POST[$param];
            } else {
                return 0;
            }
        }

        $numero = $_POST['numero'];

        if (isset($_POST['boton'])) {
            $values[$numero] = $values[$numero] + 1;
        }

        function tablaMultiplicar($numero) {
            $resultado = 0;
            if ($numero <= 0 || $numero > 10) {
                echo "El valor introducido no es correcto";
            } else {

                echo "<h3> Tabla de Multiplicar del " . $numero . "</h3>";
                for ($multiplicador = 0; $multiplicador <= 10; $multiplicador++) {

                    $resultado = $numero * $multiplicador;
                    echo $numero . " X " . $multiplicador . " = " . $resultado . "<br>";
                }
            }
        }
        ?>

        <form name="tabla" method="post" action="<?php echo $_SERVER['PHP_SELF']; ?>">
            <?php
            if (isset($_POST['boton'])) {
                tablaMultiplicar($numero);
            }
            ?>
            <h3>Numero de veces que se ejecuta la multiplicación</h3>
            <?php for ($i = 1; $i <= 10; $i++) { ?>
                <input name = "<?php echo $i ?>" readonly = "true" type = "hidden" value = "<?php echo $values[$i]; ?>">
                <?php echo $i . ": " . $values[$i] ?><br>
            <?php } ?>
            <p>Escribe aquí el número: <input type="text" name="numero" maxlength="2" size="2" autofocus="autofocus"/></p>
            <p><input name="boton" type="submit" value="Ver tabla de multiplicar." /></p>


        </form>

    </body>    
</html>