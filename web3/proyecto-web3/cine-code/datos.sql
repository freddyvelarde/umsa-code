-- Salas
CREATE TABLE Sala (
	id_sala INT PRIMARY KEY AUTO_INCREMENT,
	nombre_sala VARCHAR(50) NOT NULL,
	capacidad INT NOT NULL
	tipo_pantalla ENUM('2D', '3D') NOT NULL,
);
-- traer datos desde la tabla 'Sala'
SELECT * FROM Sala;

-- traer dastos desde la tabla 'Sala' por id
SELECT * FROM Sala WHERE id_sala = 1;

-- insertar datos a la tabla 'Sala'
INSERT INTO Sala (nombre_sala, capacidad, tipo_pantalla) 
VALUES ('Sala 1', 100, '2D');
INSERT INTO Sala (nombre_sala, capacidad, tipo_pantalla) 
VALUES ('Sala 2', 150, '3D');

-- actualizar datos
--  SELECT * FROM Sala WHERE id_sala = 1;

-- Boletos
CREATE TABLE Boleto (
	id_boleto INT PRIMARY KEY AUTO_INCREMENT,
	id_sala INT,
	numero_asiento INT,
	fecha_hora_funcion DATETIME,
	precio DECIMAL(10, 2) NOT NULL,
	FOREIGN KEY (id_sala) REFERENCES Sala(id_sala)
);

INSERT INTO Boleto (id_sala, numero_asiento, fecha_hora_funcion, precio) 
VALUES (1, 15, '2024-06-12 20:00:00', 10.50);

INSERT INTO Boleto (id_sala, numero_asiento, fecha_hora_funcion, precio) 
VALUES (2, 25, '2024-06-12 22:00:00', 12.50);

INSERT INTO Boleto (id_sala, numero_asiento, fecha_hora_funcion, precio) 
VALUES (1, 14, '2024-06-12 20:00:00', 10.50);

INSERT INTO Boleto (id_sala, numero_asiento, fecha_hora_funcion, precio) 
VALUES (2, 23, '2024-06-12 22:00:00', 12.50);

UPDATE Boleto
SET id_sala = 1, numero_asiento = 25, fecha_hora_funcion = '2024-06-13 18:00:00', precio = 15.00
WHERE id_boleto = 1;

DELETE FROM Boleto WHERE id_boleto = 1;
