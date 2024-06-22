<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cinema Dashboard</title>
    <link rel="stylesheet" href="{{ asset('css/style.css') }}">
</head>
<body>
    <header class="header">
        <div class="logo">
            {{-- <img src="{{ asset('path/to/your/logo.png') }}" alt="Cinema Logo"> --}}
            <span>Cine - Laravel</span>
        </div>
        <nav class="nav">
            <a href="/salas">
                <span class="icon">▦</span>
                Salas
            </a>
            <a href="/boletos">
                <span class="icon">🎟️</span>
                Boletos
            </a>
            <a href="/salas/crear">
                <span class="icon">+</span>
                Nueva Sala
            </a>
            <a href="/boletos/crear">
                <span class="icon">+</span>
                Nuevo Boleto
            </a>
        </nav>
    </header>
</body>
</html>

