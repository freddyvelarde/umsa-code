
<?php defined("BASEPATH") OR exit('error in view salas.php'); ?>
<!doctype html>
<html lang="en">
<head>
    <title>Crear Sala</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="mb-4">Crear Sala</h1>
        <form method='post' class="needs-validation" novalidate>
            <div class="mb-3">
                <label for="nombre_sala" class="form-label">NOMBRE DE SALA:</label>
                <input type='text' name='nombre_sala' id='nombre_sala' class="form-control" value="<?php echo set_value('nombre_sala'); ?>" required />
                <div class="invalid-feedback">
                    <?php echo form_error('nombre_sala'); ?>
                </div>
            </div>

            <div class="mb-3">
                <label for="capacidad" class="form-label">CAPACIDAD:</label>
                <input type='text' name='capacidad' id='capacidad' class="form-control" value="<?php echo set_value('capacidad'); ?>" required />
                <div class="invalid-feedback">
                    <?php echo form_error('capacidad'); ?>
                </div>
            </div>

            <div class="mb-3">
                <label for="tipo_pantalla" class="form-label">TIPO DE PANTALLA:</label>
                <select id="tipo_pantalla" name="tipo_pantalla" class="form-select" required>
                    <option value="3D" <?php echo set_select('tipo_pantalla', '3D'); ?>>3D</option>
                    <option value="2D" <?php echo set_select('tipo_pantalla', '2D'); ?>>2D</option>
                </select>
                <div class="invalid-feedback">
                    <?php echo form_error('tipo_pantalla'); ?>
                </div>
            </div>

            <button type="submit" class="btn btn-primary">Crear</button>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    <script>
        (function () {
            'use strict'
            var forms = document.querySelectorAll('.needs-validation')
            Array.prototype.slice.call(forms)
                .forEach(function (form) {
                    form.addEventListener('submit', function (event) {
                        if (!form.checkValidity()) {
                            event.preventDefault()
                            event.stopPropagation()
                        }
                        form.classList.add('was-validated')
                    }, false)
                })
        })()
    </script>
</body>
</html>

