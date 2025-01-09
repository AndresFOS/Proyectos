<?php
    //Consulto si se rellenaron los campos exceptuando el correo
    if(!empty($_POST["btnregistrar"]))
    {
        if(!empty($_POST["nombre1"]) and !empty($_POST["apellido1"]) and !empty($_POST["apellido2"]) and !empty($_POST["edad"]) and !empty($_POST["correo"]))
        {
            $nombre1 = $_POST["nombre1"];
            $nombre2 = $_POST["nombre2"];
            $apellido1 = $_POST["apellido1"];
            $apellido2 = $_POST["apellido2"];
            $edad = $_POST["edad"];
            $correo = $_POST["correo"];
            //Valido que no se repita el mismo correo
            $ValidarCorreo = $conexion->query("SELECT correo from informacion WHERE correo='$correo'");
            if($ValidarCorreo->num_rows > 0)
            {
                echo '<div class="alert alert-danger">Ese correo ya está en uso</div>';
            } 
            else 
            {
                $sql = $conexion->query("INSERT INTO informacion(nombre1, nombre2, apellido1, apellido2, edad, correo) VALUES ('$nombre1', '$nombre2', '$apellido1', '$apellido2', '$edad', '$correo')");

                if($sql == true)
                {
                    echo '<div class="alert alert-success">Registrado correctamente</div>';
                } 
                else 
                {
                    echo '<div class="alert alert-danger">Ha ocurrido un error</div>';
                }
            }
        } 
        else 
        {
            echo '<div class="alert alert-warning">Alguno de los campos está vacio (Segundo nombre no cuenta)</div>';
        }
    }
?>