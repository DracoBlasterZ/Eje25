DROP table IF EXISTS empleados;
DROP table IF EXISTS departamentos;

create table departamentos(
	codigo int auto_increment,
    nombre varchar(100),
    presupuesto int,
    PRIMARY KEY (codigo)
);
create table empleados(
	id int ,
	nombre varchar(250),
	apellidos varchar(250),
	departamento integer,
    PRIMARY KEY (id),
	CONSTRAINT FK_departamento FOREIGN KEY (departamento) REFERENCES departamentos(codigo)
	ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO departamentos(nombre, presupuesto) VALUES ('Desarollo web', 10000);
INSERT INTO departamentos(nombre, presupuesto) VALUES ('Arte', 30000);
INSERT INTO departamentos(nombre, presupuesto) VALUES ('Marketing', 5000);
INSERT INTO departamentos(nombre, presupuesto) VALUES ('Recuersos Humanos', 50000);

insert into empleados (id, nombre,trabajo,salario)values(203940,'Maurin','Mauron',2);
insert into empleados (id, nombre,trabajo,salario)values(847924,'Lopez','Lopez',3);
insert into empleados (id, nombre,trabajo,salario)values(354567,'Tulio','Sinella',2);
insert into empleados (id, nombre,trabajo,salario)values(134635,'Wester','Far',1);
insert into empleados (id, nombre,trabajo,salario)values(246685,'Linda','Preciosa',4);