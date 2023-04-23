DROP TABLE IF EXISTS salas;
DROP TABLE IF EXISTS peliculas;

CREATE TABLE peliculas(
	id INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(100) DEFAULT NULL,
	edad_minima int DEFAULT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE salas(
	id INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(100) DEFAULT NULL,
	pelicula int DEFAULT NULL,
	PRIMARY KEY(id),
	CONSTRAINT FK_pelicula FOREIGN KEY (pelicula) REFERENCES peliculas(id)
	ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO peliculas(nombre, edad_minima) VALUES ('Barbie una aventura de caballos', 3);
INSERT INTO peliculas(nombre, edad_minima) VALUES ('Zelda', 13);
INSERT INTO peliculas(nombre, edad_minima) VALUES ('Fast and Furious X', 18);
INSERT INTO peliculas(nombre, edad_minima) VALUES ('Zafarancho en el rancho', 3);
INSERT INTO peliculas(nombre, edad_minima) VALUES ('Monster Hunter', 10);

INSERT INTO salas(nombre, pelicula) VALUES ('Sala 1', 1);
INSERT INTO salas(nombre, pelicula) VALUES ('Sala 2', 2);
INSERT INTO salas(nombre, pelicula) VALUES ('Sala 3', 3);
INSERT INTO salas(nombre, pelicula) VALUES ('Sala 4', 4);
INSERT INTO salas(nombre, pelicula) VALUES ('Sala Especial', 5);