<?php 
defined("BASEPATH") OR exit('error in salas.php view');
?>
<!doctype html>
<html lang="en">
<head>
    <title>Salas Disponibles</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="mb-4">Salas Disponibles</h1>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>ID SALA</th>
                    <th>NOMBRE DE SALA</th>
                    <th>CAPACIDAD</th>
                    <th>TIPO PANTALLA</th>
                    <th>ACCIONES</th>
                </tr>
            </thead>
            <tbody>
                <?php foreach($salas as $sala): ?>
                <tr>
                    <td><?php echo $sala['id']?></td>
                    <td><?php echo $sala['nombre_sala']?></td>
                    <td><?php echo $sala['capacidad']?></td>
                    <td><?php echo $sala['tipo_pantalla']?></td>
                    <td>
                        <a href="<?php echo $eliminarUrl;?>/<?php echo $sala['id']; ?>" class="btn btn-danger btn-sm">Eliminar</a>
                        <a href="<?php echo $actualizarUrl;?>/<?php echo $sala['id']; ?>" class="btn btn-primary btn-sm">Actualizar</a>
                    </td>
                </tr>
                <?php endforeach; ?>
            </tbody>
        </table>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

