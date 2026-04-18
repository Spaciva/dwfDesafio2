-- 5 profesores
INSERT INTO profesor(id, nombre) VALUES (1, 'Profe Ana') ON DUPLICATE KEY UPDATE nombre = VALUES(nombre);
INSERT INTO profesor(id, nombre) VALUES (2, 'Profe Luis') ON DUPLICATE KEY UPDATE nombre = VALUES(nombre);
INSERT INTO profesor(id, nombre) VALUES (3, 'Profe Marta') ON DUPLICATE KEY UPDATE nombre = VALUES(nombre);
INSERT INTO profesor(id, nombre) VALUES (4, 'Profe Carlos') ON DUPLICATE KEY UPDATE nombre = VALUES(nombre);
INSERT INTO profesor(id, nombre) VALUES (5, 'Profe Sofia') ON DUPLICATE KEY UPDATE nombre = VALUES(nombre);

-- 5 materias (amarradas a profesores)
INSERT INTO materia(id, nombre, id_profesor) VALUES (1, 'Matematica', 1) ON DUPLICATE KEY UPDATE nombre = VALUES(nombre), id_profesor = VALUES(id_profesor);
INSERT INTO materia(id, nombre, id_profesor) VALUES (2, 'Lenguaje', 2) ON DUPLICATE KEY UPDATE nombre = VALUES(nombre), id_profesor = VALUES(id_profesor);
INSERT INTO materia(id, nombre, id_profesor) VALUES (3, 'Ciencias', 3) ON DUPLICATE KEY UPDATE nombre = VALUES(nombre), id_profesor = VALUES(id_profesor);
INSERT INTO materia(id, nombre, id_profesor) VALUES (4, 'Historia', 4) ON DUPLICATE KEY UPDATE nombre = VALUES(nombre), id_profesor = VALUES(id_profesor);
INSERT INTO materia(id, nombre, id_profesor) VALUES (5, 'Ingles', 5) ON DUPLICATE KEY UPDATE nombre = VALUES(nombre), id_profesor = VALUES(id_profesor);

-- 5 alumnos
INSERT INTO alumno(id, nombre, apellido) VALUES (1, 'Juan', 'Perez') ON DUPLICATE KEY UPDATE nombre = VALUES(nombre), apellido = VALUES(apellido);
INSERT INTO alumno(id, nombre, apellido) VALUES (2, 'Maria', 'Lopez') ON DUPLICATE KEY UPDATE nombre = VALUES(nombre), apellido = VALUES(apellido);
INSERT INTO alumno(id, nombre, apellido) VALUES (3, 'Kevin', 'Diaz') ON DUPLICATE KEY UPDATE nombre = VALUES(nombre), apellido = VALUES(apellido);
INSERT INTO alumno(id, nombre, apellido) VALUES (4, 'Emily', 'Martinez') ON DUPLICATE KEY UPDATE nombre = VALUES(nombre), apellido = VALUES(apellido);
INSERT INTO alumno(id, nombre, apellido) VALUES (5, 'Sergio', 'Gomez') ON DUPLICATE KEY UPDATE nombre = VALUES(nombre), apellido = VALUES(apellido);

-- 5 inscripciones (alumno_materia)
INSERT INTO alumno_materia(id_alumno, id_materia) VALUES (1, 1) ON DUPLICATE KEY UPDATE id_alumno = VALUES(id_alumno), id_materia = VALUES(id_materia);
INSERT INTO alumno_materia(id_alumno, id_materia) VALUES (1, 2) ON DUPLICATE KEY UPDATE id_alumno = VALUES(id_alumno), id_materia = VALUES(id_materia);
INSERT INTO alumno_materia(id_alumno, id_materia) VALUES (2, 1) ON DUPLICATE KEY UPDATE id_alumno = VALUES(id_alumno), id_materia = VALUES(id_materia);
INSERT INTO alumno_materia(id_alumno, id_materia) VALUES (3, 3) ON DUPLICATE KEY UPDATE id_alumno = VALUES(id_alumno), id_materia = VALUES(id_materia);
INSERT INTO alumno_materia(id_alumno, id_materia) VALUES (4, 5) ON DUPLICATE KEY UPDATE id_alumno = VALUES(id_alumno), id_materia = VALUES(id_materia);
