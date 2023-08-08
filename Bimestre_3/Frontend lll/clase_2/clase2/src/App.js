import imagen from './logo.png';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={imagen}  alt="logo" />
        <p>
          Estoy entusiasmado por mi primer Hola Mundo! en React, estoy entendiendo bastante con estos temas introductorios.
        </p>
      </header>
    </div>
  );
}

export default App;
