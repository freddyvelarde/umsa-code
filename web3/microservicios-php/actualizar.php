<?php
// Enable error reporting for PDO
require "./conexion.php";

$conexion = new Conexion();
$pdo = $conexion->conectar();

if ($_SERVER["REQUEST_METHOD"] == "PUT") {
    $json_data = file_get_contents("php://input");

    $put_vars = json_decode($json_data, true);

    if ($put_vars === null) {
        header("Content-Type: application/json");
        header("HTTP/1.1 400 Bad Request");
        echo json_encode(["error" => "error en json"]);
        exit;
    }

    $sql = "UPDATE Boleto SET id_sala = :id_sala, numero_asiento = :numero_asiento, fecha_hora_funcion = :fecha_hora_funcion, precio = :precio WHERE id_boleto = :id";

    $stmt = $pdo->prepare($sql);

    $stmt->bindValue(":id_sala", $put_vars["id_sala"]);
    $stmt->bindValue(":numero_asiento", $put_vars["numero_asiento"]);
    $stmt->bindValue(":fecha_hora_funcion", $put_vars["fecha_hora_funcion"]);
    $stmt->bindValue(":precio", $put_vars["precio"]);
    $stmt->bindValue(":id", $put_vars["id"]);

    $stmt->execute();

    header("Content-Type: application/json");
    header("HTTP/1.1 200 OK");
    echo json_encode(["message" => "Data updated successfully"]);
    exit;
}

?>

