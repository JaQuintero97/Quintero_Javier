SET sql_mode = 'ONLY_FULL_GROUP_BY';

SELECT f.FacturaID, f.FechaFactura, c.compania, cl.contacto, cat.categoriaNombre, p.productoNombre, fd.preciounitario, fd.Cantidad FROM facturas f
JOIN correos c ON f.EnvioVia=c.CorreoID
JOIN clientes cl ON cl.ClienteID=f.ClienteID
JOIN facturadetalle fd ON fd.FacturaID = f.FacturaID
JOIN productos p ON fd.ProductoID = p.ProductoID
JOIN categorias cat ON p.CategoriaID = cat.CategoriaID ;

-- Reportes parte II - INNER, LEFT Y RIGHT JOIN

-- 1. Listar todas las categorías junto con información de sus productos. Incluir todas
-- las categorías aunque no tengan productos.

SELECT *
FROM categorias c
LEFT JOIN productos p ON p.categoriaID = c.CategoriaID;

-- 2. Listar la información de contacto de los clientes que no hayan comprado nunca
-- en emarket

SELECT * FROM clientes c
LEFT JOIN facturas f ON c.ClienteID = f.ClienteID
WHERE FacturaID IS NULL;

-- 3. Realizar un listado de productos. Para cada uno indicar su nombre, categoría, y
-- la información de contacto de su proveedor. Tener en cuenta que puede haber
-- productos para los cuales no se indicó quién es el proveedor.

SELECT p.ProductoNombre, c.Categorianombre, pr.contacto
FROM productos p 
LEFT JOIN proveedores pr ON pr.ProveedorID = p.ProveedorID
JOIN categorias c ON p.CategoriaID = c.CategoriaID;

-- 4. Para cada categoría listar el promedio del precio unitario de sus productos.

SELECT c.categorianombre, AVG(p.precioUnitario)
FROM categorias c
JOIN productos p ON c.CategoriaID = p.CategoriaID
GROUP BY c.categorianombre;

-- 5. Para cada cliente, indicar la última factura de compra. Incluir a los clientes que
-- nunca hayan comprado en e-market.

SELECT c.contacto, MAX(fechafactura) AS "Ultima factura"
FROM clientes c
LEFT JOIN facturas f ON f.clienteID = c.clienteID
GROUP BY c.contacto;

-- 6. Todas las facturas tienen una empresa de correo asociada (enviovia). Generar un
-- listado con todas las empresas de correo, y la cantidad de facturas
-- correspondientes. Realizar la consulta utilizando RIGHT JOIN.

SELECT compania, count(facturaid)
FROM facturas f
RIGHT JOIN correos c ON f.enviovia = c.correoID
GROUP BY compania;
