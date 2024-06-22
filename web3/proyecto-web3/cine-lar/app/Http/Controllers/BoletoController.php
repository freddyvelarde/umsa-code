<?php

namespace App\Http\Controllers;

use App\Models\Boleto;
use App\Models\Sala;
use Illuminate\Http\Request;

class BoletoController extends Controller
{
    public function index()
    {

        $boletos = Boleto::all();

        return view('boletos.boletos', ['boletos' => $boletos]);
        //
    }

    public function crear()
    {
        $salas = Sala::all();

        return view('boletos.crear', ['salas' => $salas]);
    }

    public function store(Request $request)
    {
        $validatedData = $request->validate([
            'pelicula' => 'required|string|max:100',
            'precio' => 'required|numeric',
            'nro_asiento' => 'required|integer',
            'id_sala' => 'integer|exists:salas,id',
            'fecha' => 'required|date',
            'hora' => 'required|date_format:H:i',
        ]);

        Boleto::create($validatedData);

        return redirect()->route('boleto.index')->with('success', 'Boleto creado.');
    }


    /**
     * Display the specified resource.
     */
    public function show(Boleto $boleto)
    {
        return 'show';
        //
    }

    public function destroy($id)
    {
        $boleto = Boleto::findOrFail($id);
        $boleto->delete();

        return redirect()->route('boleto.index')->with('success', 'Boleto borrado.');
    }

    public function edit($id)
    {
        $boleto = Boleto::findOrFail($id);
        $salas = Sala::all();

        return view('boletos.actualizar', ['boleto' => $boleto, 'salas' => $salas]);
    }

    public function update(Request $request, $id)
    {
        $validatedData = $request->validate([
            'pelicula' => 'required|string|max:100',
            'precio' => 'required|numeric',
            'nro_asiento' => 'required|integer',
            'id_sala' => 'nullable|integer|exists:salas,id',
            'fecha' => 'required|date',
            'hora' => 'required|date_format:H:i:s',
        ]);

        $boleto = Boleto::findOrFail($id);
        $boleto->update($validatedData);

        return redirect()->route('boleto.index')->with('success', 'Boleto actualizado.');
    }
}
