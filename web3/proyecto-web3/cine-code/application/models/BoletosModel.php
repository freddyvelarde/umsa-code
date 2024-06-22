<?php defined('BASEPATH') OR exit('error in BoletosModel.php');

class BoletosModel extends CI_Model {
    public function __construct() {
        parent::__construct();
        $this->load->database();
    }

    public function traerBoletoPorId($idBoleto) {
        $str_query = "
            SELECT * FROM Boleto WHERE id = ?;
        ";
        $query = $this->db->query($str_query, array($idBoleto));
        return $query->result_array();
    }

	public function traerTodosLosBoletos() {
        $str_query = "
            SELECT * FROM Boleto;
        ";
        $query = $this->db->query($str_query);
        return $query->result_array();
    }

	public function crearBoleto($idSala, $pelicula, $nroAsiento, $fecha, $hora, $precio) {
        $str_query = "
            INSERT INTO Boleto (id_sala, pelicula, nro_asiento, fecha, hora, precio) 
            VALUES (?, ?, ?, ?, ?, ?);
        ";
        $this->db->query($str_query, array($idSala, $pelicula, $nroAsiento, $fecha, $hora, $precio));
    }

	public function actualizarBoleto($id_boleto, $id_sala, $pelicula, $nro_asiento, $fecha, $hora, $precio) {
        $str_query = "
            UPDATE Boleto
            SET id_sala = ?, pelicula = ?, nro_asiento = ?, fecha = ?, hora = ?, precio = ?
            WHERE id = ?;
        ";
        $this->db->query($str_query, array($id_sala, $pelicula, $nro_asiento, $fecha, $hora, $precio, $id_boleto));
    }

    public function eliminarBoletoPorId($idBoleto) {
        $str_query = "DELETE FROM Boleto WHERE id = ?;";
        $this->db->query($str_query, array($idBoleto));
        return $this->db->affected_rows() > 0;
    }
}

