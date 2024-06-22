<?php defined("BASEPATH") OR exit('error in Salas controller');


class Salas extends CI_Controller {
	private $MAIN_URL = "http://localhost/cine/index.php/salas";

	public function __construct(){
		parent::__construct();
		$this->load->model("SalasModel", 'salas');
		$this->load->helper('url');
		$this->load->library('form_validation');
	}

	public function actualizar($id) {
		$this->form_validation->set_rules('nombre_sala', 'nombre_sala', 'required');
		$this->form_validation->set_rules('capacidad', 'capacidad', 'required');
		$this->form_validation->set_rules('tipo_pantalla', 'tipo_pantalla', 'required');

		if ($this->form_validation->run() == FALSE) {
		$this->load->view('header');
			$this->load->view('salas/actualizar');
		} else{
			$nombre_sala = $this->input->post('nombre_sala');
			$capacidad = $this->input->post('capacidad');
			$tipo_pantalla = $this->input->post('tipo_pantalla');
			$this->salas->actualizarSala($id, $nombre_sala, $capacidad, $tipo_pantalla);

			redirect($this->MAIN_URL);
		}
	}

	public function crear() {
		$this->form_validation->set_rules('nombre_sala', 'nombre_sala', 'required');
		$this->form_validation->set_rules('capacidad', 'capacidad', 'required');
		$this->form_validation->set_rules('tipo_pantalla', 'tipo_pantalla', 'required');

		if ($this->form_validation->run() == FALSE) {
			$this->load->view('header');
			$this->load->view('salas/crear');
		} else{
			$nombre_sala = $this->input->post('nombre_sala');
			$capacidad = $this->input->post('capacidad');
			$tipo_pantalla = $this->input->post('tipo_pantalla');

			$this->salas->crearSala($nombre_sala, $capacidad, $tipo_pantalla);

			redirect($this->MAIN_URL);
		}
	}

	public function eliminar($id) {
		if ($this->salas->eliminarSala($id)) {
			redirect($this->MAIN_URL);

		}else {
			echo "Error al eliminar sala con id: " .$id;
		}

	}

	public function index() {
		$salas = $this->salas->traerTodasLasSalas();
		$datos['salas'] = $salas;
		$datos['eliminarUrl'] = $this->MAIN_URL."/eliminar";
		$datos['actualizarUrl'] = $this->MAIN_URL."/actualizar";
		$this->load->view('header');
		$this->load->view('salas/salas', $datos);
	}
}
