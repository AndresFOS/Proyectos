<?php

    if(!empty($_POST["btneditar"])){
        if(!empty($_POST["nombre1"]) and !empty($_POST["apellido1"]) and !empty($_POST["nombre2"]) and !empty($_POST["edad"]) and !empty($_POST["correo"]))
        {
            $id = $_POST["id"];
            $nombre1 = $_POST["nombre1"];
            $nombre2 = $_POST["nombre2"];
            $apellido1 = $_POST["apellido1"];
            $apellido2 = $_POST["apellido2"];
            $edad = $_POST["edad"];
            $correo = $_POST["correo"];

            $sql = $conexion->query("UPDATE informacion SET nombre1='$nombre1', nombre2='$nombre2', apellido1='$apellido1', apellido2='$apellido2', edad='$edad', correo='$correo' WHERE id=$id");
            if($sql == true){
                header("location:index.php");
            }
            else
            {
                echo '<div class="alert alert-danger">Error al actualizar datos</div>';
            }
        }
        else
        {
            echo '<div class="alert alert-warning">Por favor, rellene los campos con datos</div>';
        }
    }
?>