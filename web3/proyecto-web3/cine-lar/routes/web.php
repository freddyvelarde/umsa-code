<?php

use App\Http\Controllers\BoletoController;
use App\Http\Controllers\SalaController;
use App\Models\Sala;
use Illuminate\Support\Facades\Route;

Route::get('/', function () {
    return view('welcome');
});

// Route::get('/boletos', function () {
//     return "hello word";
// });

Route::get('/boletos', [BoletoController::class, "index"])->name('boleto.index');
Route::get('/boletos/crear', [BoletoController::class, "crear"])->name('boleto.crear');
Route::get('/boletos/actualizar', [BoletoController::class, "edit"])->name('boleto.edit');
Route::get('/boletos/eliminar/{id}', [BoletoController::class, "destroy"])->name('boleto.destroy');

Route::post('/boletos', [BoletoController::class, 'store'])->name('boletos.store');

Route::get('/boletos/eliminar/{id}', [BoletoController::class, 'destroy'])->name('boletos.destroy');

Route::get('/boletos/{id}/actualizar', [BoletoController::class, 'edit'])->name('boletos.edit');
Route::put('/boletos/{id}', [BoletoController::class, 'update'])->name('boletos.update');


// -------- salas
Route::get('/salas', [SalaController::class, 'index'])->name('salas.index');
Route::get('/salas/crear', [SalaController::class, 'create'])->name('salas.create');
Route::post('/salas', [SalaController::class, 'store'])->name('salas.store');

Route::get('/salas/{id}/actualizar', [SalaController::class, 'edit'])->name('salas.edit');
Route::put('/salas/{id}', [SalaController::class, 'update'])->name('salas.update');
Route::get('/salas/eliminar/{id}', [SalaController::class, 'destroy'])->name('salas.destroy');

