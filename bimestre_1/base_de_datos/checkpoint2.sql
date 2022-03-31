-- Join

-- 1. Utilizando la base de datos de movies, queremos conocer, por un lado, los
-- títulos y el nombre del género de todas las series de la base de datos.

SELECT title, name
FROM series
INNER JOIN genres ON genre_id = genres.id;

-- 2. Por otro, necesitamos listar los títulos de los episodios junto con el nombre y
-- apellido de los actores que trabajan en cada uno de ellos.

SELECT DISTINCT title AS "Titulo de Episodio", CONCAT(first_name, " ", last_name) AS "Actores"
FROM actor_episode
INNER JOIN episodes ON actor_episode.episode_id = episode_id
INNER JOIN actors ON actor_id = actors.id
ORDER BY title;

-- 3. Para nuestro próximo desafío, necesitamos obtener a todos los actores o
-- actrices (mostrar nombre y apellido) que han trabajado en cualquier película
-- de la saga de La Guerra de las galaxias.

SELECT DISTINCT *
FROM actor_movie
INNER JOIN movies ON movie_id = actor_movie.movie_id 
INNER JOIN actors ON actor_id = actors.id
WHERE movies.title LIKE "%La Guerra%";

SELECT * FROM movies;


-- 4. Crear un listado a partir de la tabla de películas, mostrar un reporte de la
-- cantidad de películas por nombre de género.

