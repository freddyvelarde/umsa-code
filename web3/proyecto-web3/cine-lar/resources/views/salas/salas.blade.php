<!DOCTYPE html>
<html>
<head>
    <title>Salas</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
    <x-header />
    <div class="container">
        <h1 class="mt-5">Salas</h1>

        @if (session('success'))
            <div class="alert alert-success">
                {{ session('success') }}
            </div>
        @endif

        <table class="table table-bordered mt-3">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre Sala</th>
                    <th>Capacidad</th>
                    <th>Tipo de Pantalla</th>
                    <th>Operaciones</th>
                </tr>
            </thead>
    <tbody>
                @foreach ($salas as $sala)
                    <tr>
                        <td>{{ $sala->id }}</td>
                        <td>{{ $sala->nombre_sala }}</td>
                        <td>{{ $sala->capacidad }}</td>
                        <td>{{ $sala->tipo_pantalla }}</td>
                        <td>    <a href="{{ route('salas.edit', $sala->id) }}" class="btn btn-danger"
                               >Actualizar</a>
                               o

                        <a href="{{ route('salas.destroy', $sala->id) }}" class="btn btn-danger"
                               onclick="return confirm('quieres borrar esta sala?');">eliminar</a>
                        </td>
                    </tr>
                @endforeach
            </tbody>
        </table>
    </div>
</body>
</html>

