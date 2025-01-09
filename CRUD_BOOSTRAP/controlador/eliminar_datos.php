<?php

    if(!empty($_GET["id"]))
    {
        $id = $_GET["id"];
        $sql = $conexion->query("DELETE FROM informacion WHERE id=$id");

        if($sql == true){
            echo '<div class="alert alert-success">Informacion eliminada correctamente</div>';
        } else {
            echo '<div class="alert alert-danger">Error al eliminar informacion</div>';
        }
    }
?>