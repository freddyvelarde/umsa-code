<?php defined("BASEPATH") OR exit('error in Boletos controller');

class Boletos extends CI_Controller {
	public function __construct() {
		parent::__construct();
		$this->load->model('BoletosModel', 'boletos');
		$this->load->model('SalasModel', 'salas');
        $this->load->library('form_validation');
		$this->load->helper('url');
	}

	public function boleto($id) {
		$boleto = $this->boletos->traerBoletoPorId($id);
		print_r($boleto);
	}

	public function index() {
		$boletos = $this->boletos->traerTodosLosBoletos();
		$datos['boletos'] = $boletos;
		$this->load->view('header');
		$this->load->view('boletos/boletos', $datos);
	}

	public function eliminar($idBoleto) {
		$boletoEliminado = $this->boletos->traerBoletoPorId($idBoleto);
		$datos['boleto'] = $boletoEliminado;
		if ($this->boletos->eliminarBoletoPorId($idBoleto)) {
		$this->load->view('header');
			$this->load->view('boletos/eliminar', $datos);
		} else {
			echo "error al eliminar boleto con id: ".$idBoleto;
		}
	}

	public function crear() {
		$this->form_validation->set_rules('id_sala', 'id sala', 'required');
		$this->form_validation->set_rules('pelicula', 'pelicula', 'required');
		$this->form_validation->set_rules('fecha', 'fecha y hora de la funcion', 'required');
		$this->form_validation->set_rules('hora', 'fecha y hora de la funcion', 'required');
		$this->form_validation->set_rules('numero_asiento', 'numero de asiento', 'required');
		$this->form_validation->set_rules('precio', 'precio', 'required');

		if ($this->form_validation->run() == FALSE) {
			$salas = $this->salas->traerTodasLasSalas();
			$datos['salas'] = $salas;
			$this->load->view('header');
			$this->load->view('boletos/generar', $datos);
		} else {
			$precio = $this->input->post('precio');
			$id_sala = $this->input->post('id_sala');
			$pelicula = $this->input->post('pelicula');
			$numero_asiento = $this->input->post('numero_asiento');
			$fecha = $this->input->post('fecha');
			$hora = $this->input->post('hora');

			$this->boletos->crearBoleto($id_sala, $pelicula, $numero_asiento, $fecha,$hora, $precio);
			redirect('http://localhost/cine/index.php/boletos');
		}
	}

	public function actualizar($idBoleto) {
		$this->form_validation->set_rules('id_sala', 'id sala', 'required');
		$this->form_validation->set_rules('pelicula', 'pelicula', 'required');
		$this->form_validation->set_rules('fecha', 'fecha y hora de la funcion', 'required');
		$this->form_validation->set_rules('hora', 'fecha y hora de la funcion', 'required');
		$this->form_validation->set_rules('numero_asiento', 'numero de asiento', 'required');
		$this->form_validation->set_rules('precio', 'precio', 'required');

		if ($this->form_validation->run() == FALSE) {
			$salas = $this->salas->traerTodasLasSalas();
			$datos['salas'] = $salas;
		$this->load->view('header');
			$this->load->view('boletos/actualizar', $datos);
		} else {
			$precio = $this->input->post('precio');
			$id_sala = $this->input->post('id_sala');
			$pelicula = $this->input->post('pelicula');
			$numero_asiento = $this->input->post('numero_asiento');
			$fecha = $this->input->post('fecha');
			$hora = $this->input->post('hora');

			$this->boletos->actualizarBoleto($idBoleto, $id_sala, $pelicula, $numero_asiento, $fecha, $hora, $precio);
			redirect('http://localhost/cine/index.php/boletos');
		}
	}

}

?>
