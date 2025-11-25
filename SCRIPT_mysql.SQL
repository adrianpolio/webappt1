DROP DATABASE IF EXISTS webappt1;
CREATE DATABASE webappt1;
USE webappt1;

CREATE TABLE carrera (
	id INT AUTO_INCREMENT PRIMARY KEY,
	nombre_carrera VARCHAR(100),
	facultad VARCHAR(100)
);

CREATE TABLE alumno (
	id INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(100),
	apellido VARCHAR(100),
	fecha_nacimiento DATE,
	carrera_id INT,
	FOREIGN KEY (carrera_id) REFERENCES carrera(id)
);

CREATE TABLE curso (
	id INT AUTO_INCREMENT PRIMARY KEY,
	nombre_curso VARCHAR(100),
	ciclo VARCHAR(20),
	docente VARCHAR(100),
	carrera_id INT,
	FOREIGN KEY (carrera_id) REFERENCES carrera(id)
);

INSERT INTO carrera(nombre_carrera, facultad) VALUES
('Ingenieria de Sistemas', 'Ingenieria'),
('Administracion', 'Negocios'),
('Contabilidad', 'Negocios');

INSERT INTO alumno(nombre, apellido, fecha_nacimiento, carrera_id) VALUES
('Juan', 'Perez', '2002-01-10', 1),
('Maria', 'Lopez', '2001-06-20', 2),
('Carlos', 'Rodriguez', '2000-03-15', 1),
('Lucia', 'Garcia', '2002-11-05', 3),
('Jorge', 'Silva', '2001-08-12', 2),
('Rosa', 'Mendoza', '2003-02-28', 1),
('Pedro', 'Quispe', '2000-07-19', 3);

INSERT INTO curso(nombre_curso, ciclo, docente, carrera_id) VALUES
('Programacion I', '1', 'Carlos Diaz', 1),
('Matematica Basica', '1', 'Ana Torres', 1),
('Base de Datos', '3', 'Luis Flores', 1),
('Redes de Computadoras', '4', 'Maria Soto', 1),
('Ingenieria de Software', '5', 'Jorge Ruiz', 1),
('Sistemas Operativos', '3', 'Pedro Chavez', 1),
('Contabilidad General', '2', 'Marta Rojas', 3),
('Costos y Presupuestos', '4', 'Rosa Ramirez', 3),
('Auditoria Financiera', '6', 'Lucas Vera', 3),
('Tributacion', '5', 'Carmen Diaz', 3),
('Administracion I', '1', 'Alberto Castro', 2),
('Marketing Digital', '3', 'Silvia Mendoza', 2),
('Recursos Humanos', '4', 'Pablo Gomez', 2),
('Finanzas Corporativas', '5', 'Elena Torres', 2),
('Planificacion Estrategica', '6', 'Raul Quiroz', 2);
