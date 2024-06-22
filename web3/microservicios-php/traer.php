<?php
require "./conexion.php";

$conexion = new Conexion();
$pdo = $conexion->conectar();

if($_SERVER["REQUEST_METHOD"] == "GET") {
  $sql = "select * from Boleto";
  $variables = [];

  if (isset($_GET['id'])) {

    $sql .= " where id_boleto=:id ";
    $variables[":id"]=$_GET["id"];
  }

  $ejec = $pdo->prepare($sql);
  $ejec->execute($variables);
  $ejec->setFetchMode(PDO::FETCH_ASSOC);
  header("Content-Type: application/json");
  header("HTTP/1.1 200 OK");
  echo json_encode($ejec->fetchAll());
  exit;
}

