<!DOCTYPE html>
<html>
<head>
    <title>Crear Sala</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
    <x-header />
    <div class="container">
        <h1 class="mt-5">Crear Sala</h1>

        @if ($errors->any())
            <div class="alert alert-danger">
                <ul>
                    @foreach ($errors->all() as $error)
                        <li>{{ $error }}</li>
                    @endforeach
                </ul>
            </div>
        @endif

        <form method="POST" action="{{ route('salas.store') }}">
            @csrf

            <div class="form-group">
                <label for="nombre_sala">Nombre Sala</label>
                <input type="text" class="form-control" id="nombre_sala" name="nombre_sala" value="{{ old('nombre_sala') }}" required>
            </div>

            <div class="form-group">
                <label for="capacidad">Capacidad</label>
                <input type="number" class="form-control" id="capacidad" name="capacidad" value="{{ old('capacidad') }}" required>
            </div>

            <div class="form-group">
                <label for="tipo_pantalla">Tipo de Pantalla</label>
                <input type="text" class="form-control" id="tipo_pantalla" name="tipo_pantalla" value="{{ old('tipo_pantalla') }}" required>
            </div>

            <button type="submit" class="btn btn-primary">Crear Sala</button>
        </form>
    </div>
</body>
</html>

