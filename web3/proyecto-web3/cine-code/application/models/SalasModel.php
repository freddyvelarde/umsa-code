<?php defined("BASEPATH") OR exit('error in salas model');

class SalasModel extends CI_Model {
	public function __construct() {
		parent::__construct();
		$this->load->database();
	}

	public function actualizarSala($id, $nombre_sala, $capacidad, $tipo_pantalla) {
		$str_query = "
			UPDATE Sala 
			SET nombre_sala = ?, capacidad = ?, tipo_pantalla = ?
			WHERE id = ?;
		";
		$this->db->query($str_query, array($nombre_sala, $capacidad, $tipo_pantalla, $id));
	}

	public function crearSala($nombre_sala, $capacidad,$tipo_pantalla) {
		$str_query = "
			INSERT INTO Sala (nombre_sala, capacidad, tipo_pantalla) 
			VALUES (?,?,?);
		";
		$this->db->query($str_query, array($nombre_sala, $capacidad, $tipo_pantalla));
	}

	public function eliminarSala($id) {
		$str_query = "DELETE FROM Boleto WHERE id_sala = ?";
		$this->db->query($str_query, array($id));

		$str_query = "DELETE FROM Sala WHERE id = ?";
		$this->db->query($str_query, array($id));
		return $this->db->affected_rows() > 0;
	}

	public function traerTodasLasSalas() {
		$str_query = "SELECT * FROM Sala;";
		$query = $this->db->query($str_query);
		return $query->result_array();
	}

}
