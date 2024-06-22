CREATE TABLE Boleto (
	id_boleto INT PRIMARY KEY AUTO_INCREMENT,
	id_sala INT,
	numero_asiento INT,
	fecha_hora_funcion DATETIME,
	precio DECIMAL(10, 2) NOT NULL,
	FOREIGN KEY (id_sala) REFERENCES Sala(id_sala)
);

CREATE TABLE Sala (
	id_sala INT PRIMARY KEY AUTO_INCREMENT,
	nombre_sala VARCHAR(50) NOT NULL,
	capacidad INT NOT NULL
	tipo_pantalla ENUM('2D', '3D') NOT NULL,
);
