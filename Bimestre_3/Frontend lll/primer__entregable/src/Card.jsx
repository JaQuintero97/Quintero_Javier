import React from 'react';
import './Card.css'

function Card({ summoners }) {
  return (
    <div id="principal" lassName='Card'>
      
      {summoners.map((summoner, index) => (
          <ul key={index} className="card">
            <li>Nombre de usuario: {summoner.usuario} </li>
            <li>Campeón favorito: {summoner.campeon}</li>
          </ul>
      ))}
    </div>
  );
}

export default Card;
