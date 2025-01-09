<?php
    // Incluyo el id del dato que voy a editar
    include "modelo/conexion.php";
    $id = $_GET["id"];
    $sql = $conexion->query("SELECT * FROM informacion WHERE id = $id");
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Modificar formulario</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
    <form class="col-4 p-3 m-auto" method="POST">
            <h3 class="text-center alert alert-secondary">Editar datos</h3>
            <input type="hidden" name="id" value=<?= $_GET["id"] ?>>
            <?php
                include "controlador/editar_datos.php";
                //Hago una consulta en bucle para traer todos los datos en los respectivos campos
                while($datos = $sql->fetch_object()){ ?>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Primer nombre</label>
                        <input type="text" class="form-control" name="nombre1" value="<?= $datos->nombre1 ?>">
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Segundo nombre</label>
                        <input type="text" class="form-control" name="nombre2" value="<?= $datos->nombre2 ?>">
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Primer apellido</label>
                        <input type="text" class="form-control" name="apellido1" value="<?= $datos->apellido1 ?>">
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Segundo apellido</label>
                        <input type="text" class="form-control" name="apellido2" value="<?= $datos->apellido2 ?>">
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Edad</label>
                        <input type="text" class="form-control" name="edad" value="<?= $datos->edad ?>">
                    </div>
                    <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">Correo electronico</label>
                        <input type="email" class="form-control" name="correo" value="<?= $datos->correo ?>">
                    </div>
                <?php }
            ?>
            <button type="submit" class="btn btn-primary" name="btneditar" value="ok">Editar datos</button>
        </form>

    </body>
    </html>