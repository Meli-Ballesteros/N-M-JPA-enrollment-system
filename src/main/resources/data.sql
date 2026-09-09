-- 1. Insertar Estudiantes (IDs 1 al 16 autogenerados)
INSERT INTO STUDENTS(name) VALUES ('Melissa Ballesteros'); -- ID 1
INSERT INTO STUDENTS(name) VALUES ('Juan Pablo Restrepo'); -- ID 2
INSERT INTO STUDENTS(name) VALUES ('Valentina Gómez');     -- ID 3
INSERT INTO STUDENTS(name) VALUES ('Santiago Muñoz');      -- ID 4
INSERT INTO STUDENTS(name) VALUES ('Camila Torres');       -- ID 5
INSERT INTO STUDENTS(name) VALUES ('Andrés Felipe López'); -- ID 6
INSERT INTO STUDENTS(name) VALUES ('Isabella Ramírez');    -- ID 7
INSERT INTO STUDENTS(name) VALUES ('Mateo Cárdenas');      -- ID 8
INSERT INTO STUDENTS(name) VALUES ('Sofía Herrera');       -- ID 9
INSERT INTO STUDENTS(name) VALUES ('Daniel Ortiz');        -- ID 10
INSERT INTO STUDENTS(name) VALUES ('Laura Valentina Gil'); -- ID 11
INSERT INTO STUDENTS(name) VALUES ('Nicolás Zapata');      -- ID 12
INSERT INTO STUDENTS(name) VALUES ('María José Vargas');   -- ID 13
INSERT INTO STUDENTS(name) VALUES ('Sebastián Aguirre');   -- ID 14
INSERT INTO STUDENTS(name) VALUES ('Gabriela Rojas');      -- ID 15
INSERT INTO STUDENTS(name) VALUES ('Julián Esteban Peña'); -- ID 16

-- 2. Insertar Cursos (IDs 1 al 5 autogenerados)
INSERT INTO COURSES(name) VALUES ('Computación 2');            -- ID 1
INSERT INTO COURSES(name) VALUES ('Estructuras de Datos');     -- ID 2
INSERT INTO COURSES(name) VALUES ('Arquitectura de Software'); -- ID 3
INSERT INTO COURSES(name) VALUES ('Bases de Datos');            -- ID 4
INSERT INTO COURSES(name) VALUES ('Ingeniería de Requisitos');  -- ID 5

-- 3. Insertar las Tuplas del Tablero en la Tabla Intermedia ENROLLMENTS:
-- (student_id = 10, course_id = 1, enrollment_date) -> Daniel Ortiz en Computación 2
INSERT INTO ENROLLMENTS(student_id, course_id, enrollment_date) VALUES (10, 1, CURRENT_DATE);

-- (student_id = 10, course_id = 2, enrollment_date) -> Daniel Ortiz en Estructuras de Datos
INSERT INTO ENROLLMENTS(student_id, course_id, enrollment_date) VALUES (10, 2, CURRENT_DATE);

-- (student_id = 3, course_id = 1, enrollment_date)  -> Valentina Gómez en Computación 2
INSERT INTO ENROLLMENTS(student_id, course_id, enrollment_date) VALUES (3, 1, CURRENT_DATE);