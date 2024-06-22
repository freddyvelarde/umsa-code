<?php

namespace App\Http\Controllers;

use App\Models\Boleto;
use App\Models\Sala;
use Illuminate\Http\Request;

class SalaController extends Controller
{
    public function index()
    {
        $salas = Sala::all();

        return view('salas.salas', ['salas' => $salas]);
    }

    public function create()
    {
        return view('salas.crear');
    }

    public function store(Request $request)
    {
        $validatedData = $request->validate([
            'nombre_sala' => 'required|string|max:100',
            'capacidad' => 'required|integer',
            'tipo_pantalla' => 'required|string|max:100',
        ]);

        Sala::create($validatedData);

        return redirect()->route('salas.index')->with('success', 'Sala creada.');
    }

    /**
     * Display the specified resource.
     */
    public function show(Boleto $boleto)
    {
        return 'show';
        //
    }

    public function edit($id)
    {
        $sala = Sala::findOrFail($id);

        return view('salas.actualizar', ['sala' => $sala]);
    }

    public function update(Request $request, $id)
    {
        $validatedData = $request->validate([
            'nombre_sala' => 'required|string|max:100',
            'capacidad' => 'required|integer',
            'tipo_pantalla' => 'required|string|max:100',
        ]);

        $sala = Sala::findOrFail($id);
        $sala->update($validatedData);

        return redirect()->route('salas.index')->with('success', 'Sala actualizada.');
    }


    public function destroy($id)
    {
        $sala = Sala::findOrFail($id);
        $sala->boletos()->delete();
        $sala->delete();

        return redirect()->route('salas.index')->with('success', 'Sala y sus boletos asociandos eliminados.');
    }
}
