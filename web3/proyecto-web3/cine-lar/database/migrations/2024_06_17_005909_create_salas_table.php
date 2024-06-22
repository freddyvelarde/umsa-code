<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    public function up(): void
    {
        Schema::create('salas', function (Blueprint $table) {
            $table->id();
            $table->integer('capacidad');
            $table->string('nombre_sala');
            $table->string('tipo_pantalla');
        });
    }

    public function down(): void
    {
        Schema::dropIfExists('salas');
    }
};
