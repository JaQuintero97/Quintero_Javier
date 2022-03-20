-- 1. Queremos tener un listado de todas las categorías.

SELECT * FROM categorias;

-- 2. Cómo las categorías no tienen imágenes, solamente interesa obtener un
-- listado de CategoriaNombre y Descripcion.

SELECT CategoriaNombre, descripcion
FROM categorias;

-- 3. Obtener un listado de los productos.

SELECT * FROM productos;

-- 4. ¿Existen productos discontinuados? (Discontinuado = 1).

SELECT * 
FROM productos
WHERE discontinuado = 1; 
-- NO EXISTEN PRODUCTOS DESCONTINUADOS

-- 5. Para el viernes hay que reunirse con el Proveedor 8. ¿Qué productos son
-- los que nos provee?

SELECT ProductoNombre AS producto 
FROM productos
WHERE ProveedorID = 8;

-- 6. Queremos conocer todos los productos cuyo precio unitario se encuentre
-- entre 10 y 22.

SELECT productoNombre AS producto, precioUnitario AS precio
FROM productos 
WHERE precioUnitario BETWEEN 10 AND 22
ORDER by precioUnitario;

-- 7. Se define que un producto hay que solicitarlo al proveedor si sus unidades
-- en stock son menores al Nivel de Reorden. ¿Hay productos por solicitar?

SELECT productoNombre AS producto, UnidadesStock AS unidades, NivelReorden AS minimo
FROM productos 
WHERE unidadesStock < NivelReorden;
-- SI HAY MUCHOS PRODUCTOS QUE DEBEMOS SOLICITAR

-- 8. Se quiere conocer todos los productos del listado anterior, pero que
-- unidades pedidas sea igual a cero.

SELECT productoNombre AS producto, UnidadesStock AS unidades, NivelReorden AS minimo
FROM productos 
WHERE unidadesStock < NivelReorden AND unidadesPedidas = 0;

-- Clientes

-- 1. Obtener un listado de todos los clientes con Contacto, Compania, Título,
-- País. Ordenar el listado por País.

SELECT Contacto, Compania, Titulo, Pais 
FROM clientes
ORDER BY pais;

-- 2. Queremos conocer a todos los clientes que tengan un título “Owner”.

Select contacto AS nombre_completo
FROM clientes
WHERE titulo  LIKE "Owner";

-- 3. El operador telefónico que atendió a un cliente no recuerda su nombre.
-- Solo sabe que comienza con “C”. ¿Lo ayudamos a obtener un listado con
-- todos los contactos que inician con la letra “C”?

SELECT Contacto 
FROM clientes
WHERE Contacto LIKE "C%";

-- Facturas

-- 1. Obtener un listado de todas las facturas, ordenado por fecha de factura
-- ascendente.

SELECT * 
FROM facturas
ORDER BY FechaFactura ASC;

-- 2. Ahora se requiere un listado de las facturas con el país de envío “USA” y
-- que su correo (EnvioVia) sea distinto de 3.

SELECT *
FROM facturas
WHERE paisEnvio = "USA" AND EnvioVia <> 3; 

-- 3. ¿El cliente 'GOURL' realizó algún pedido?

SELECT * 
FROM facturas
WHERE ClienteID = "GOURL";
-- SI, EL CLIENTE GOURL REALIZO 9 PEDIDOS

-- 4. Se quiere visualizar todas las facturas de los empleados 2, 3, 5, 8 y 9.

SELECT *
FROM facturas
WHERE EmpleadoID = 2 OR 3 OR 5 OR 8 OR 9;

-- Consultas queries ML - Parte II

-- En esta segunda parte vamos a intensificar la práctica de consultas

-- SELECT, añadiendo ALIAS, LIMIT y OFFSET.

-- Productos

-- 1. Obtener el listado de todos los productos ordenados
-- descendentemente por precio unitario.

SELECT *
FROM productos
ORDER BY PrecioUnitario DESC;

-- 2. Obtener el listado de top 5 de productos cuyo precio unitario es
-- el más caro.

SELECT *
FROM productos
ORDER BY PrecioUnitario DESC
LIMIT 5;

-- 3. Obtener un top 10 de los productos con más unidades en stock.

SELECT ProductoNombre, UnidadesStock
FROM productos
ORDER BY UnidadesStock DESC
LIMIT 10;

-- FacturaDetalle

-- 1. Obtener un listado de FacturaID, Producto, Cantidad.

SELECT FacturaID, ProductoID, Cantidad
FROM facturadetalle;

-- 2. Ordenar el listado anterior por cantidad descendentemente.

SELECT FacturaID, ProductoID, Cantidad
FROM facturadetalle
ORDER BY cantidad DESC;

-- 3. Filtrar el listado solo para aquellos productos donde la cantidad
-- se encuentre entre 50 y 100.

SELECT FacturaID, ProductoID, Cantidad
FROM facturadetalle
WHERE cantidad BETWEEN 50 AND 100
ORDER BY cantidad DESC;

-- 4. En otro listado nuevo, obtener un listado con los siguientes
-- nombres de columnas: NroFactura (FacturaID), Producto
-- (ProductoID), Total (PrecioUnitario*Cantidad).

SELECT facturaID AS NroFactura, productoID as Producto, precioUnitario*Cantidad AS total
FROM facturadetalle;

-- 4

-- ¡Extras!

-- ¿Te sobró tiempo? ¿Querés seguir practicando?
-- Te dejamos unos ejercicios extras a partir de la misma base:

-- 1. Obtener un listado de todos los clientes que viven en “Brazil" o “Mexico”,
-- o que tengan un título que empiece con “Sales”.

SELECT * 
FROM clientes
WHERE pais = "Brazil" OR pais = "Mexico" OR titulo LIKE "SALES%";

-- 2. Obtener un listado de todos los clientes que pertenecen a una compañía
-- que empiece con la letra "A".

SELECT *
FROM clientes
WHERE compania LIKE "A%";

-- 3. Obtener un listado con los datos: Ciudad, Contacto y renombrarlo
-- como Apellido y Nombre, Titulo y renombrarlo como Puesto, de todos
-- los clientes que sean de la ciudad "Madrid".

SELECT ciudad, contacto AS "Nombre y Apellido", titulo AS Puesto
FROM clientes
WHERE ciudad = "Madrid";

-- 4. Obtener un listado de todas las facturas con ID entre 10000 y 10500

SELECT *
FROM facturas
WHERE facturaid BETWEEN 10000 AND 10500;

-- 5. Obtener un listado de todas las facturas con ID entre 10000 y 10500 o de
-- los clientes con ID que empiecen con la letra “B”.

SELECT *
FROM facturas
WHERE facturaid BETWEEN 10000 AND 10500 OR clienteID LIKE "B%";

-- 6. ¿Existen facturas que la ciudad de envío sea “Vancouver” o que
-- utilicen el correo 3?

SELECT *
FROM facturas
WHERE CiudadEnvio = "Vancouver" OR EnvioVia = 3;
-- SI, EXISTEN AMBAS CONSULTAS

-- 7. ¿Cuál es el ID de empleado de “Buchanan”?

SELECT * 
FROM empleados
WHERE empleadoID = "Buchanan";

-- 8. ¿Existen facturas con EmpleadoID del empleado del ejercicio anterior?



-- (No relacionar, sino verificar que existan facturas)