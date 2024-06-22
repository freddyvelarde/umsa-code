<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Boleto extends Model
{
    use HasFactory;

    protected $table = 'boletos';
    public $timestamps = false;

    // Specify the fillable attributes
    protected $fillable = [
        'pelicula',
        'precio',
        'nro_asiento',
        'id_sala',
        'fecha',
        'hora',
    ];

    /**
     * Get the sala that owns the boleto.
     */
    public function salas()
    {
        return $this->belongsTo(Sala::class, 'id_sala');
    }
}
