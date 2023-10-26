import React, { useState } from 'react';
import axios from 'axios';
import "./CrearProducto.css"
import { Link } from 'react-router-dom';
import BackToAdminPanelButton from './BackToAdminPanelButton';

function CrearProducto() {
  const [nombre, setNombre] = useState('');
  const [descripcion, setDescripcion] = useState('');
  const [precio, setPrecio] = useState(0);
  const [origen, setOrigen] = useState('');
  const [mensajeError, setMensajeError] = useState('');
  const [mensajeExito, setMensajeExito] = useState('');

  const handleGuardarProducto = async () => {
    // Realizar validación antes de enviar los datos al servidor
    if (!nombre) {
      setMensajeError('Por favor, ingrese el nombre del producto.');
      return;
    }
    if (!descripcion) {
      setMensajeError('Por favor, ingrese la descripción del producto.');
      return;
    }
    if (!precio) {
      setMensajeError('Por favor, ingrese el precio del producto.');
      return;
    }
    if (!origen) {
      setMensajeError('Por favor, ingrese el origen del producto.');
      return;
    }

    // Crear un objeto con los datos del producto
    const nuevoProducto = {
      nombre,
      descripcion,
      precio,
      origen
    };

    // Realizar una solicitud POST al servidor para guardar el producto
    try {
      const response = await axios.post('http://localhost:8082/productos', nuevoProducto);
      setMensajeExito('El producto se ha guardado con éxito.');
      // Limpieza de campos después del éxito, si es necesario
      setNombre('');
      setDescripcion('');
      setPrecio(0);
      setOrigen('');
    } catch (error) {
      setMensajeError('Error al guardar el producto. Por favor, intente nuevamente.');
    }
  };

  return (
    <div className='form'>
      <h2>Agregar Producto</h2>
      {mensajeError && <p className="mensaje-error">{mensajeError}</p>}
      {mensajeExito && <p className="mensaje-exito">{mensajeExito}</p>}
      <form>
        <h2>Nuevo Producto</h2>
        <input className="controls" placeholder='Nombre del producto' type="text" value={nombre} onChange={(e) => setNombre(e.target.value)} />
        <input className="controls" placeholder="Descripción" value={descripcion} onChange={(e) => setDescripcion(e.target.value)} />
        <input className="controls" type="number" placeholder="Precio" value={precio} onChange={(e) => setPrecio(e.target.value)} />
        <input className="controls" type="text" placeholder='Origen' value={origen} onChange={(e) => setOrigen(e.target.value)} />
        <div>
          <button className='botonsOk' onClick={handleGuardarProducto}>Guardar Producto</button>
        </div>
        <div>
          <Link to="/administracion">
          <button className='botonsNo'>Cancelar</button>
          </Link>
        </div>
      </form>
    </div>
  );
}

export default CrearProducto;