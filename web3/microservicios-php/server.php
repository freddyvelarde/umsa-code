<?php
require "./conexion.php";

$conexion = new Conexion();
$pdo = $conexion->conectar();

// if($_SERVER["REQUEST_METHOD"] == "GET") {
//   $sql = "select * from Boleto";
//   $variables = [];
//
//   if (isset($_GET['id'])) {
//
//     $sql .= " where id_boleto=:id ";
//     $variables[":id"]=$_GET["id"];
//   }
//
//   $ejec = $pdo->prepare($sql);
//   $ejec->execute($variables);
//   $ejec->setFetchMode(PDO::FETCH_ASSOC);
//   header("Content-Type: application/json");
//   header("HTTP/1.1 200 OK");
//   echo json_encode($ejec->fetchAll());
//   exit;
// }

if ($_SERVER["REQUEST_METHOD"]=="PUT") {
  $sql="update Boleto set id_sala=:id_sala, numero_asiento=:paterno, fecha_hora_funcion=:fecha_hora_funcion, precio=:precio where id_boleto=:id";
  $ejec = $pdo->prepare($sql);
  $ejec->bindValue(":id_sala", $_GET["id_sala"]);
  $ejec->bindValue(":numero_asiento", $_GET["numero_asiento"]);
  $ejec->bindValue(":fecha_hora_funcion", $_GET["fecha_hora_funcion"]);
  $ejec->bindValue(":precio", $_GET["precio"]);
  $ejec->bindValue(":id", $_GET["id"]);
  $ejec->execute();
  header("Content-Type: application/json");
  header("HTTP/1.1 200 Bien");
  // echo json_encode(["message" => "datos Actualizado xdxd"]);
  exit;
}

// if($_SERVER["REQUEST_METHOD"] == "GET") {
//   $sql = "select * from Boleto";
//   $ejec = $pdo->prepare($sql);
//   $ejec->execute();
//   $ejec->setFetchMode(PDO::FETCH_ASSOC);
//   header("Content-Type: application/json");
//   header("HTTP/1.1 200 OK");
//   echo json_encode($ejec->fetchAll());
//   exit;
// }
?>
