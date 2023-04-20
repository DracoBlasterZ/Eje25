DROP TABLE IF EXISTS fabricantes;
DROP table IF EXISTS articulos;


CREATE TABLE fabricantes (
  codigo int NOT NULL AUTO_INCREMENT,
  nombre nvarchar(100) DEFAULT NULL,
  PRIMARY KEY (codigo)
);

CREATE TABLE articulos (
  codigo int NOT NULL AUTO_INCREMENT,
  nombre nvarchar(100) DEFAULT NULL,
  precio int DEFAULT NULL,
  fabricante int DEFAULT NULL,
  PRIMARY KEY (codigo),
  CONSTRAINT articulos_fk FOREIGN KEY (fabricante) REFERENCES fabricantes (codigo)
);


insert into fabricantes (nombre) values ('Kibaro');
insert into fabricantes (nombre) values ('Puig');
insert into fabricantes (nombre) values ('Luis');

insert into articulos (nombre, precio, fabricante) values ('NSFW', 300, 2);
insert into articulos (nombre, precio, fabricante) values ('Humor', 20, 1);
insert into articulos (nombre, precio, fabricante) values ('Musculos', 32, 3);