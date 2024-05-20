/* Populate tables */
INSERT INTO naturaleza (nombre, efecto) VALUES('huraña', 'Aumenta el ataque y disminuye la defensa');
INSERT INTO item (nombre, descripcion, imagen) VALUES('Baya Zidra', 'Recuperaa el 40% de tu vida', "BayaZidra.png");
/*INSERT INTO pokemon (nombre, num_pokedex, num_evolucion, descripcion, generacion_numGeneracion, imagen,
 nivel, ps_base, ataque_base, defensa_base, ataqueEspecial_base, defensaEspecial_base, velocidad_base,
  ps_maximo, ataque_maximo, defensa_maximo, ataqueEspecial_maximo, defensaEspecial_maximo, velocidad_maximo,
iv, shiny, nombre_habilidad, nombre_naturaleza)
VALUES ('Charizard', 6, 3, 'El Pokémon Llama', 'charizard.png', 50, 78, 84, 78, 109, 85, 100, 78, 130, 111, 154, 85, 100, 0, false, 'Habilidad1', 'Naturaleza1');


-- Insertar los tipos del Pokémon Charizard
INSERT INTO pokemon_tipo (ID_Pokémon, ID_Tipo)
SELECT p.ID_Pokémon, t.ID_Tipo
FROM pokemon p, tipo t
WHERE p.nombre = 'Charizard' AND t.nombre IN ('Fuego', 'Volador');*/


