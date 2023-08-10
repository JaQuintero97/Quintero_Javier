import "./App.css"

function Producto(props){
    return (
        <div className="card">
            <p>Nombre = {props.nombre}</p>
            <p>Precio = {props.precio}</p>
        </div>
    )
}

export default Producto;