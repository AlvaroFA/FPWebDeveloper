<html>
    <head>
    </head>    
    <body>
        <?php
        $_1 = postValue('1');
        $_2 = postValue('2');
        $_3 = postValue('3');
        $_4 = postValue('4');
        $_5 = postValue('5');
        $_6 = postValue('6');
        $_7 = postValue('7');
        $_8 = postValue('8');
        $_9 = postValue('9');
        $_10 = postValue('10');


        if (isset($_SESSION['test'])) {
            $_SESSION['test'] += $_SESSION['test'];
        } else {
            $_SESSION['test'] = 0;
        }

        if (isset($_POST['1'])) {
            $variable = 1 + $_POST['1'];
        } else {
            $variable = 0;
        }
        echo $variable;

        function postValue($param) {
            if (isset($_POST[$param])) {
                return $_POST[$param];
            } else {
                return 0;
            }
        }

        $numero = $_POST['numero'];

        if (isset($_POST['boton'])) {
            tablaMultiplicar($numero);

            switch ($numero) {
                case 1:
                    $_1 += 1;
                    break;
                case 2:
                    $_2 += 1;
                    break;
                case 3:
                    $_3 += 1;
                    break;
                case 4:
                    $_4 += 1;
                    break;
                case 5:
                    $_5 += 1;
                    break;
                case 6:
                    $_6 += 1;
                    break;
                case 7:
                    $_7 += 1;
                    break;
                case 8:
                    $_8 += 1;
                    break;
                case 9:
                    $_9 += 1;
                    break;
                case 10:
                    $_10 += 1;
                    break;
            }
        }

        function tablaMultiplicar($numero) {
            $resultado = 0;
            if ($numero <= 0 || $numero > 10) {
                echo "El valor introducido no es correcto";
            } else {


                for ($multiplicador = 0; $multiplicador <= 10; $multiplicador++) {
                    $resultado = $numero * $multiplicador;
                    echo $numero . " * " . $multiplicador . " = " . $resultado . "<br>";
                }
            }
        }
        ?>

        <form name="tabla" method="post" action="<?php echo $_SERVER['PHP_SELF']; ?>">
            <p>Escribe aquí el número: <input type="text" name="numero" maxlength="2" size="2" /></p>
            <p><input name="boton" type="submit" value="Ver tabla de multiplicar." /></p>
            <input name="1" readonly="true" type="text" value="<?php echo $_1; ?>"><br>
            <input name="2" readonly="true" type="text" value="<?php echo $_2; ?>"><br>
            <input name="3" readonly="true" type="text" value="<?php echo $_3; ?>"><br>
            <input name="4" readonly="true" type="text" value="<?php echo $_4; ?>"><br>
            <input name="5" readonly="true" type="text" value="<?php echo $_5; ?>"><br>
            <input name="6" readonly="true" type="text" value="<?php echo $_6; ?>"><br>
            <input name="7" readonly="true" type="text" value="<?php echo $_7; ?>"><br>
            <input name="8" readonly="true" type="text" value="<?php echo $_8; ?>"><br>
            <input name="9" readonly="true" type="text" value="<?php echo $_9; ?>"><br>
            <input name="10" readonly="true" type="text" value="<?php echo $_10; ?>"><br>
        </form>
    </form>

</body>    
</html>