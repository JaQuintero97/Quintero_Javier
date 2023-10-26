import './App.css'
import Header from './components/Header/Header'
import Listado from './components/PanelAdmin/Listado'
import Footer from './components/Footer/Footer'
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import { routes } from './Routes/routes';
import Body from './components/Body/Body';
import CrearProducto from './components/PanelAdmin/CrearProducto';
import AdminPanel from './components/PanelAdmin/AdminPanel';



function App() {
  return (
    <BrowserRouter>
        {/* Envuelve toda la aplicación con BrowserRouter para el enrutamiento */}
          {/* Envuelve la aplicación con ContextGlobal para el estado global */}
          <div className="app">
            <Header /> 
            <Routes>
              {/*Página de inicio - Home*/}
              <Route path="/" element={<Body />} />
              {/*Página de inicio - Home*/}
              <Route path={routes.producto} element={<Listado />} />
               {/*Página principal administradores*/}
               <Route path={routes.admiPanel} element={<AdminPanel/>} />
              {/*Página para crear productos*/}
              <Route path={routes.crearProducto} element={<CrearProducto/>} />
            </Routes>
            <Footer /> 
          </div>
    </BrowserRouter>
  )
}

export default App
