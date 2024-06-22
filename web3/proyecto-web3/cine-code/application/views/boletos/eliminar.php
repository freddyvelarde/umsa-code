<?php 
defined("BASEPATH") OR exit('error in boletos.php view');
?>
<!doctype html>
<html lang="en">
	<head>
		<title>Todos los boletos</title>
		<meta charset="UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link href="css/style.css" rel="stylesheet" />
	</head>
	<body>

        <h1>Boleto eliminado:</h1>
        <span>id boleto: <?php echo $boleto[0]['id'] ?></span> <br/>
        <span>id sala: <?php echo $boleto[0]['id_sala'] ?></span> <br/>
        <span>numero de asiento: <?php echo $boleto[0]['nro_asiento'] ?></span> <br />
        <span>fecha y hora de funcion: <?php echo $boleto[0]['fecha']." ".$boleto[0]['hora'] ?></span> <br />
        <span>precio: <?php echo $boleto[0]['precio'] ?></span>
        
    </body>
</html>
