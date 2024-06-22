
<?php defined("BASEPATH") OR exit('error in view salas.php'); ?>
<!doctype html>
<html lang="en">
<head>
    <title>Todos los boletos</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h1 class="mt-4">Actualizar</h1>
        <form method='post'> 
            <div class="form-group">
                <label for="nombre_sala">NOMBRE DE SALA:</label>
                <input type='text' class="form-control" name='nombre_sala' id='nombre_sala' value="<?php echo set_value('nombre_sala'); ?>" />
                <?php echo form_error('nombre_sala'); ?>
            </div>

            <div class="form-group">
                <label for="capacidad">CAPACIDAD:</label>
                <input type='text' class="form-control" name='capacidad' id='capacidad' value="<?php echo set_value('capacidad'); ?>" />
                <?php echo form_error('capacidad'); ?>
            </div>

            <div class="form-group">
                <label for="tipo_pantalla">TIPO DE PANTALLA:</label>
                <select id="tipos_pantalla" class="form-control" name="tipo_pantalla">
                    <option value="3D">3D</option>
                    <option value="2D">2D</option>
                </select>
                <?php echo form_error('tipo_pantalla'); ?>
            </div>

            <button type="submit" class="btn btn-primary">Actualizar</button>
        </form>
    </div>


</body>
</html>

