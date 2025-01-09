<?php
    include ('conexion/conexion.php');
    
    session_start();

    if(isset($_POST['loguear']))
    {
        $Usuario = $_POST['usuario'];
        $Clave = $_POST['clave'];
        //Crear los valores de permisos entre admin y usuario para dirigir al admin al CRUD de los productos para
        //que gestione la cantidad de productos
        $VerificarUsuario = mysqli_query($conexion, "SELECT * FROM usuarios WHERE usuario = '$Usuario'");
        $Resultado = mysqli_num_rows($VerificarUsuario);
        $VerificarClave = mysqli_fetch_array($VerificarUsuario);

        if($Resultado > 0)
        {
            if(password_verify($Clave, $VerificarClave['clave']))
            {
                $_SESSION['usuario'] = $Usuario;
                header("location:index.php");
            }
            else
            {
                echo'<div class="alerta_error">Contraseña incorrecta</div>';
            }
        }
        else
        {
            echo'<div class="alerta_error">Datos incorrectos</div>';
        }
    }

?>