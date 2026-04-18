-- 5 profesores
INSERT INTO profesor(nombre) VALUES ('Profe Ana');
INSERT INTO profesor(nombre) VALUES ('Profe Luis');
INSERT INTO profesor(nombre) VALUES ('Profe Marta');
INSERT INTO profesor(nombre) VALUES ('Profe Carlos');
INSERT INTO profesor(nombre) VALUES ('Profe Sofía');

-- 5 materias (amarradas a profesores)
INSERT INTO materia(nombre, id_profesor) VALUES ('Matemática', 1);
INSERT INTO materia(nombre, id_profesor) VALUES ('Lenguaje', 2);
INSERT INTO materia(nombre, id_profesor) VALUES ('Ciencias', 3);
INSERT INTO materia(nombre, id_profesor) VALUES ('Historia', 4);
INSERT INTO materia(nombre, id_profesor) VALUES ('Inglés', 5);

-- 5 alumnos
INSERT INTO alumno(nombre, apellido) VALUES ('Juan', 'Pérez');
INSERT INTO alumno(nombre, apellido) VALUES ('María', 'López');
INSERT INTO alumno(nombre, apellido) VALUES ('Kevin', 'Díaz');
INSERT INTO alumno(nombre, apellido) VALUES ('Emily', 'Martínez');
INSERT INTO alumno(nombre, apellido) VALUES ('Sergio', 'Gómez');

-- 5 inscripciones (alumno_materia)
INSERT INTO alumno_materia(id_alumno, id_materia) VALUES (1, 1);
INSERT INTO alumno_materia(id_alumno, id_materia) VALUES (1, 2);
INSERT INTO alumno_materia(id_alumno, id_materia) VALUES (2, 1);
INSERT INTO alumno_materia(id_alumno, id_materia) VALUES (3, 3);
INSERT INTO alumno_materia(id_alumno, id_materia) VALUES (4, 5);