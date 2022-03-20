-- Alias, limit y offset

-- 1. Mostrar el título de todas las series y usar alias para que el nombre del campo
-- este en español.

SELECT title AS titulo
FROM series;

-- 2. Traer el título de las películas con el rating mayor a 3, con más de 1 premio y con
-- fecha de lanzamiento entre el año ‘1988-01-01’ al ‘2009-12-31’. Ordenar los
-- resultados por rating descendentemente.

SELECT  title AS titulo, rating AS popularidad, awards AS premios, release_date AS fecha_lanzamiento
FROM movies 
WHERE rating > 3 AND awards > 1 AND release_date BETWEEN "1988-01-01" AND "2009-12-31"
ORDER BY rating DESC; 

-- 3. Traer el top 3 a partir del registro 10 de la consulta anterior.

SELECT  title AS titulo, rating AS popularidad, awards AS premios, release_date AS fecha_lanzamiento
FROM movies 
WHERE rating > 3 AND awards > 1 AND release_date BETWEEN "1988-01-01" AND "2009-12-31"
ORDER BY rating DESC
LIMIT 3

OFFSET 9;
-- 4. ¿Cuáles son los 3 peores episodios teniendo en cuenta su rating?

SELECT title AS peores_episodios, rating AS puntuacion 
FROM episodes
ORDER BY rating
LIMIT 3;

-- 5. Obtener el listado de todos los actores. Quitar las columnas de fechas y película
-- favorita, además traducir los nombres de las columnas.

SELECT first_name AS nombre, last_name AS apellido, rating AS puntuacion
FROM actors AS actores;
