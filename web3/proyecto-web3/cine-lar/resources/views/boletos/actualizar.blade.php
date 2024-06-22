<!DOCTYPE html>
<html>
<head>
    <title>Actualizar Boleto</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
    <x-header/>
    <div class="container">
        <h1 class="mt-5">Actualizar boleto con ID: "{{$boleto->id}}"</h1>

        <!-- Display validation errors -->
        @if ($errors->any())
            <div class="alert alert-danger">
                <ul>
                    @foreach ($errors->all() as $error)
                        <li>{{ $error }}</li>
                    @endforeach
                </ul>
            </div>
        @endif

        <!-- Boleto edit form -->
        <form method="POST" action="{{ route('boletos.update', $boleto->id) }}">
            @csrf
            @method('PUT')

            <div class="form-group">
                <label for="pelicula">Pelicula</label>
                <input type="text" class="form-control" id="pelicula" name="pelicula" value="{{ old('pelicula', $boleto->pelicula) }}" required>
            </div>

            <div class="form-group">
                <label for="precio">Precio</label>
                <input type="text" class="form-control" id="precio" name="precio" value="{{ old('precio', $boleto->precio) }}" required>
            </div>

            <div class="form-group">
                <label for="nro_asiento">Nro Asiento</label>
                <input type="number" class="form-control" id="nro_asiento" name="nro_asiento" value="{{ old('nro_asiento', $boleto->nro_asiento) }}" required>
            </div>

            <div class="form-group">
                <label for="id_sala">ID Sala</label>
                <select class="form-control" id="id_sala" name="id_sala">
                    @foreach ($salas as $sala)
                        <option value="{{ $sala->id }}" {{ $boleto->id_sala == $sala->id ? 'selected' : '' }}>
                            {{ $sala->nombre_sala }}
                        </option>
                    @endforeach
                </select>
            </div>

            <div class="form-group">
                <label for="fecha">Fecha</label>
                <input type="date" class="form-control" id="fecha" name="fecha" value="{{ old('fecha', $boleto->fecha) }}" required>
            </div>

            <div class="form-group">
                <label for="hora">Hora</label>
                <input type="time" class="form-control" id="hora" name="hora" value="{{ old('hora', $boleto->hora) }}" required>
            </div>

            <button type="submit" class="btn btn-primary">Actualizar Boleto</button>
        </form>
    </div>
</body>
</html>

