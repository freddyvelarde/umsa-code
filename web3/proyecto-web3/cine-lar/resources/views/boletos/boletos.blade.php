<!DOCTYPE html>
<html>
<head>
    <title>Boletos</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
    <x-header />
    <div class="container">
        <h1 class="mt-5">Boletos</h1>
        <table class="table table-bordered mt-3">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Pelicula</th>
                    <th>Precio</th>
                    <th>Nro Asiento</th>
                    <th>ID Sala</th>
                    <th>Fecha</th>
                    <th>Hora</th>
                    <th>operaciones</th>
                </tr>
            </thead>
            <tbody>
                @foreach ($boletos as $boleto)
                    <tr>
                        <td>{{ $boleto->id }}</td>
                        <td>{{ $boleto->pelicula }}</td>
                        <td>{{ $boleto->precio }}</td>
                        <td>{{ $boleto->nro_asiento }}</td>
                        <td>{{ $boleto->id_sala }}</td>
                        <td>{{ $boleto->fecha }}</td>
                        <td>{{ $boleto->hora }}</td>
                        <td>
                        <a href="{{ route('boletos.destroy', $boleto->id) }}" class="btn btn-danger"
                               onclick="return confirm('Quieres eliminar este boleto?');">eliminar</a>

    <a href="{{ route('boletos.edit', $boleto->id) }}" class="btn btn-danger"
                               >Actualizar</a>
                        </td>

                    </tr>
                @endforeach
            </tbody>
        </table>
    </div>
</body>
</html>
1
