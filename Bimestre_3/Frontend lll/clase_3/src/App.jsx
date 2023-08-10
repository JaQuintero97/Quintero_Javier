import './App.css';
import Header from "./Header";
import Footer from "./Footer";
import Producto from './Producto';

function App() {
  return (
    <>
     <Header/>
     <Producto nombre="Telefono" precio="200000"/>
     <Producto nombre="PC" precio="500000"/>
     <Producto nombre="Balon" precio="20000"/> 
     <Footer/>
    </>
  )
}

export default App
