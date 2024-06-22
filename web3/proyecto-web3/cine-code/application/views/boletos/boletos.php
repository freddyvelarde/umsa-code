<?php 
defined("BASEPATH") OR exit('error in boletos.php view');
?>
<!doctype html>
<html lang="en">
<head>
    <title>Todos los boletos</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="mb-4">Todos los boletos</h1>
        <table class="table table-striped">
            <thead class="table-dark">
                <tr>
                    <th>ID Boleto</th>
                    <th>ID Sala</th>
                    <th>Película</th>
                    <th>Número de Asiento</th>
                    <th>Fecha y Hora de la Función</th>
                    <th>Precio</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                <?php foreach($boletos as $boleto): ?>
                    <tr>
                        <td><?php echo $boleto["id"]; ?></td>
                        <td><?php echo $boleto["id_sala"]; ?></td>
                        <td><?php echo $boleto['pelicula']; ?></td>
                        <td><?php echo $boleto['nro_asiento']; ?></td>
                        <td><?php echo $boleto['fecha'] . " " . $boleto['hora']; ?></td>
                        <td><?php echo $boleto['precio']; ?></td>
                        <td>
                            <a href="<?php echo base_url('index.php/boletos/eliminar/' . $boleto['id']); ?>" class="btn btn-danger btn-sm">Eliminar</a>
                            <a href="<?php echo base_url('index.php/boletos/actualizar/' . $boleto['id']); ?>" class="btn btn-primary btn-sm">Actualizar</a>
                        </td>
                    </tr>
                <?php endforeach; ?>
            </tbody>
        </table>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

