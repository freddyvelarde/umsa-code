CREATE TABLE Sala (
    id INT AUTO_INCREMENT PRIMARY KEY,
    capacidad INT NOT NULL,
    nombre_sala VARCHAR(100) NOT NULL
    tipo_pantalla VARCHAR(50)
);

CREATE TABLE Boleto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    pelicula VARCHAR(100) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
	  nro_asiento INT NOT NULL,
    id_sala INT,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    FOREIGN KEY (id_sala) REFERENCES Sala(id)
);

INSERT INTO Sala (capacidad, nombre_sala, tipo_pantalla) VALUES
(50, 'Sala A', '2D'),
(80, 'Sala B', '3D'),
(100, 'Sala C', 'IMAX');

INSERT INTO Boleto (pelicula, precio, nro_asiento, id_sala, fecha, hora) VALUES
('Avengers: Endgame', 12.50, 15, 1, '2024-06-15', '18:00:00'),
('The Matrix', 10.00, 20, 2, '2024-06-16', '19:30:00'),
('Jurassic Park', 8.75, 10, 3, '2024-06-17', '20:15:00');
