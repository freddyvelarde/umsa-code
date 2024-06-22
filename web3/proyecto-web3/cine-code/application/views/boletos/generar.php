<?php 
defined("BASEPATH") OR exit('error in boletos.php view');
?>
<!doctype html>
<html lang="en">
<head>
    <title>Crear Boleto</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="mb-4">Crear Boleto</h1>
        <form method='post' class="needs-validation" novalidate>
            <div class="mb-3">
                <label for="id_sala" class="form-label">ID SALA</label>
                <select name='id_sala' id="id_sala" class="form-select" required>
                    <?php foreach($salas as $s): ?>
                        <option value="<?php echo $s['id']; ?>" <?php echo set_select('id_sala', $s['id']); ?>><?php echo $s['nombre_sala'];?></option>
                    <?php endforeach; ?>
                </select>
                <div class="invalid-feedback">
                    <?php echo form_error('id_sala'); ?>
                </div>
            </div>

            <div class="mb-3">
                <label for="pelicula" class="form-label">PELICULA</label>
                <input type='text' name='pelicula' id='pelicula' class="form-control" value='<?php echo set_value('pelicula');?>' required />
                <div class="invalid-feedback">
                    <?php echo form_error('pelicula'); ?>
                </div>
            </div>

            <div class="mb-3">
                <label for="numero_asiento" class="form-label">NUMERO DE ASIENTO</label>
                <input type='text' name='numero_asiento' id='numero_asiento' class="form-control" value='<?php echo set_value('numero_asiento');?>' required />
                <div class="invalid-feedback">
                    <?php echo form_error('numero_asiento'); ?>
                </div>
            </div>

            <div class="mb-3">
                <label for="fecha" class="form-label">FECHA</label>
                <input type="date" name="fecha" id="fecha" class="form-control" value='<?php echo set_value('fecha') ?>' required />
                <div class="invalid-feedback">
                    <?php echo form_error('fecha'); ?>
                </div>
            </div>

            <div class="mb-3">
                <label for="hora" class="form-label">HORA</label>
                <input type="time" name="hora" id="hora" class="form-control" value='<?php echo set_value('hora') ?>' required />
                <div class="invalid-feedback">
                    <?php echo form_error('hora'); ?>
                </div>
            </div>

            <div class="mb-3">
                <label for="precio" class="form-label">PRECIO</label>
                <input type='text' name='precio' id='precio' class="form-control" value='<?php echo set_value('precio');?>' required />
                <div class="invalid-feedback">
                    <?php echo form_error('precio'); ?>
                </div>
            </div>

            <button type="submit" class="btn btn-primary">Crear</button>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

