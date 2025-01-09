<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CRUD</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
    <script>
        function eliminar(){
            var respuesta=confirm("Realmente deseas eliminar estos datos?");
            return respuesta
        }
    </script>
    <h1 class="text-center p-3">Bienvenido</h1>
        <?php
            include "modelo/conexion.php";
            include "controlador/eliminar_datos.php";
        ?>
    <div class="container-fluid row">
        <form class="col-4 p-3" method="POST">
            <h3 class="text-center text-secondary">Registrar</h3>
            <?php
                include "controlador/registro.php";
            ?>
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Primer nombre</label>
                <input type="text" class="form-control" name="nombre1">
            </div>
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Segundo nombre</label>
                <input type="text" class="form-control" name="nombre2">
            </div>
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Primer apellido</label>
                <input type="text" class="form-control" name="apellido1">
            </div>
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Segundo apellido</label>
                <input type="text" class="form-control" name="apellido2">
            </div>
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Edad</label>
                <input type="text" class="form-control" name="edad">
            </div>
            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Correo electronico</label>
                <input type="email" class="form-control" name="correo">
            </div>
            <button type="submit" class="btn btn-primary" name="btnregistrar" value="ok">Registrar</button>
        </form>
        <div class="col-8 p-4">
            <table class="table">
                <thead class="bg-info">
                    <tr>
                        <th scope="col">Id</th>
                        <th scope="col">Primer nombre</th>
                        <th scope="col">Segundo nombre</th>
                        <th scope="col">Primer apellido</th>
                        <th scope="col">Segundo apellido</th>
                        <th scope="col">Edad</th>
                        <th scope="col">correo</th>
                        <th scope="col"></th>
                    </tr>
                </thead>
                <tbody>
                    <?php
                        include "modelo/conexion.php";
                        $sql = $conexion->query("SELECT * from informacion");

                        while($datos = $sql->fetch_object()){ ?>
                            <tr>
                                <td><?= $datos->id ?></td>
                                <td><?= $datos->nombre1 ?></td>
                                <td><?= $datos->nombre2 ?></td>
                                <td><?= $datos->apellido1 ?></td>
                                <td><?= $datos->apellido2 ?></td>
                                <td><?= $datos->edad?></td>
                                <td><?= $datos->correo ?></td>
                                <td>
                                    <a href="editar.php?id=<?= $datos->id ?>" class="btn btn-small btn-warning m-2">Editar</a>
                                    <a onclick="return eliminar()" href="index.php?id=<?= $datos->id ?>" class="btn btn-small btn-danger m-2">Eliminar</a>
                                </td>
                            </tr>
                        <?php }
                    ?>
                </tbody>
            </table>
        </div>
    </div>
    

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>