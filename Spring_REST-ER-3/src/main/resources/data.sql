DROP TABLE IF EXISTS cajas;
DROP TABLE IF EXISTS almacenes;

CREATE TABLE almacenes(
	id INT NOT NULL AUTO_INCREMENT,
	lugar VARCHAR(100) DEFAULT NULL,
	capacidad int DEFAULT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE cajas(
	ref_num VARCHAR(5) NOT NULL,
	contenido VARCHAR(100) DEFAULT NULL,
	valor int DEFAULT NULL,
	almacen int,
	PRIMARY KEY(ref_num),
	CONSTRAINT FK_almacen FOREIGN KEY (almacen) REFERENCES almacenes(id)
	ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO almacenes(lugar, capacidad) VALUES ('Barcelona', 150);
INSERT INTO almacenes(lugar, capacidad) VALUES ('Reus', 25);
INSERT INTO almacenes(lugar, capacidad) VALUES ('Tarragona', 40);
INSERT INTO almacenes(lugar, capacidad) VALUES ('Sabadell', 130);
INSERT INTO almacenes(lugar, capacidad) VALUES ('Zaragoza', 65);

INSERT INTO cajas(ref_num, contenido, valor, almacen) VALUES ('163AB', 'Libretas', 300, 1);
INSERT INTO cajas(ref_num, contenido, valor, almacen) VALUES ('123AD', 'Grava', 50, 4);
INSERT INTO cajas(ref_num, contenido, valor, almacen) VALUES ('123DC', 'Palomitas', 150, 5);
INSERT INTO cajas(ref_num, contenido, valor, almacen) VALUES ('223CD', 'Madera', 600, 2);
INSERT INTO cajas(ref_num, contenido, valor, almacen) VALUES ('124PD', 'Hierro', 20, 3);
