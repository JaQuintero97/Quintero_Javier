import { useState } from "react";
function Form({onAddSummoner}){

    const [usuario,setUsuario]=useState("");
    const [campeon,setCampeon]=useState("");

    const handleSubmit = (e)=>{
        e.preventDefault();
        console.log(usuario);
        console.log(campeon);

        function validarUsuario(usuario){
            const usuarioValidado = usuario.trim("");
            return (usuarioValidado.length > 3)
                
        }
        if(validarUsuario(usuario) && campeon.length > 6){
            onAddSummoner({usuario,campeon});
            setUsuario("");
            setCampeon("");
        } else {
            alert("Por favor chequea que la información sea correcta");
        }
    }

    return (
        <div>
            <h1>Registro de Invocadores</h1>
            <form onSubmit={handleSubmit}>
                <input type="text" placeholder="Ingrese su nombre de usuario" value={usuario} onChange={(e)=>setUsuario(e.target.value)} />
                <input type="text" placeholder="Ingrese su campeón favorito" value={campeon} onChange={(e)=>setCampeon(e.target.value)} />
                <button type="submit">Agregar invocador</button>      
            </form>
    </div>
    
        )

  



}

export default Form;