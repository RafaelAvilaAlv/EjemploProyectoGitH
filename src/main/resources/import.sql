insert into provincia (nombre) values ('Pichincha'); 

-- Ejemplo 2
INSERT INTO provincia (nombre) VALUES ('Guayas');

-- Ejemplo 3
INSERT INTO provincia (nombre) VALUES ('Azuay');

-- Ejemplo 4
INSERT INTO provincia (nombre) VALUES ('Manabí');

-- Ejemplo 5
INSERT INTO provincia (nombre) VALUES ('Loja');

INSERT INTO canton (nombre_canton, id_provincia) VALUES ('Quito', 1);
INSERT INTO canton (nombre_canton, id_provincia) VALUES ('Cayambe', 1);
INSERT INTO canton (nombre_canton, id_provincia) VALUES ('Rumiñahui', 1);
INSERT INTO canton (nombre_canton, id_provincia) VALUES ('Guayaquil', 2);
 
INSERT INTO parroquia (nombre_parroquia, id_canton) VALUES('Carcelén', 1);
INSERT INTO parroquia (nombre_parroquia, id_canton) VALUES ('Letamendi', 2);

-- Insertar datos en la tabla area
INSERT INTO area (nombre_area, id_parroquia) VALUES ('Zona Oeste', 1);
INSERT INTO area (nombre_area, id_parroquia) VALUES ('Zona Este', 2);


-- Insertar datos en la tabla de Unidad_Operativa
INSERT INTO unidad_operativa (codigo, nombre_unidad_operativa, id_area) VALUES (1, 'Unidad A1', 1);
INSERT INTO unidad_operativa (codigo, nombre_unidad_operativa, id_area) VALUES (2, 'Unidad A2', 1);
INSERT INTO unidad_operativa (codigo, nombre_unidad_operativa, id_area) VALUES (3, 'Unidad B1', 2);

INSERT INTO historias_clinicas (fecha_nacimiento_paciente, nombre_paciente)VALUES ('2000-01-01','Richard');

INSERT INTO registro_parte_diario (fecha_registro, peso_paciente, talla_paciente, cedula_nro_historia_clinica, codigo, id_parte_diario, numero_vista) VALUES ('2023-12-01', 70.5, 175, 1, '1', 1, 1);