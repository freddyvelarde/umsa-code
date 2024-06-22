<?php 
class Conexion {

  private $pdo;

  public function __construct() {
    try {
      $this->pdo=new PDO("mysql:host=localhost;dbname=cine;charset=utf8","root","");
      $this->pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    } catch (PDOException $e) {
      echo "Error: ".$e->getMessage();
    }
  }
  public function conectar() {return $this->pdo;}
}
?>
