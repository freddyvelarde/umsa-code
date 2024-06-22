<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Sala extends Model
{
    use HasFactory;

    public $timestamps = false;
    protected $table ='salas';

    protected $fillable= [
        'nombre_sala', 'capacidad', 'tipo_pantalla'
    ];

    public function boletos() {
        return $this->hasMany(Boleto::class, 'id_sala');
    }
}
