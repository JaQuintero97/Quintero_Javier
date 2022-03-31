-- Funciones de agregación, GROUP BY y HAVING

-- 1. ¿Cuántas películas hay?
SELECT * FROM movies

SELECT COUNT(*) FROM movies;

-- 2. ¿Cuántas películas tienen entre 3 y 7 premios?

SELECT awards,COUNT(awards) 
FROM movies
GROUP BY awards
HAVING awards BETWEEN 3 AND 7
ORDER BY awards;

-- 3. ¿Cuántas películas tienen entre 3 y 7 premios y un rating mayor a 7?

SELECT SELECT awards, rating 
FROM movies
GROUP BY awards, rating
HAVING awards BETWEEN 3 AND 7 AND rating > 7
ORDER BY awards; 

-- 4. Crear un listado a partir de la tabla de películas, mostrar un reporte de la
-- cantidad de películas por id. de género.



-- 5. De la consulta anterior, listar sólo aquellos géneros que tengan como suma
-- de premios un número mayor a 5.