// eslint-disable-next-line no-unused-vars
import React from 'react'; 
import './header.css';


function Header() {
 return (
    <header>
     

      <nav>
   
        <div>
          <img src='../../assets/logo.png' alt='logo' />
          <span>Viví experiencias inolvidables</span>
        </div>
        <button id="createAccountButton">Crear cuenta</button>
    <button id="loginButton">Iniciar sesión</button>
      
         
       
      </nav>
    </header>
 );
}

 
export default Header;