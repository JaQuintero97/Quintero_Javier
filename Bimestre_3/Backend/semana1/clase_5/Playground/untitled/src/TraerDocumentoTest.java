import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TraerDocumentoTest {
    @Test
    public void estoyAutorizado(){
        //DADO
        Documento documento = new Documento(1,"www.youtube.com","Imagen de Youtube");
        String usuario1 = "jaqp.97@gmail.com";
        String usuario2 = "ana@gmail.com";
        String usuario3 = "jose@hotmail.com";

        //CUANDO
        documento.agregarUsuario(usuario1);
        documento.agregarUsuario(usuario2);
        documento.agregarUsuario(usuario3);

        ProxyDocumento proxy = new ProxyDocumento("jaqp.97@gmail.com","www.youtube.com");
        String respuestaActual = proxy.traerDocumentos(documento);
        String respuestaEsperada = "Estás autorizado para ver este contenido Imagen de Youtube";
        //ENTONCES
        assertEquals(respuestaEsperada,respuestaActual);
    }
    @Test
    public void noEstoyAutorizadoEmail(){
        //DADO
        Documento documento = new Documento(1,"www.youtube.com","Imagen de Youtube");
        String usuario1 = "jaqp.97@gmail.com";
        String usuario2 = "ana@gmail.com";
        String usuario3 = "jose@hotmail.com";

        //CUANDO
        documento.agregarUsuario(usuario1);
        documento.agregarUsuario(usuario2);
        documento.agregarUsuario(usuario3);

        ProxyDocumento proxy = new ProxyDocumento("jaqp1.97@gmail.com","www.youtube.com");
        String respuestaActual = proxy.traerDocumentos(documento);
        String respuestaEsperada = "El usuario jaqp1.97@gmail.com No está autorizado para ver este contenido";
        //ENTONCES
        assertEquals(respuestaEsperada,respuestaActual);
    }
    @Test
    public void noEstoyAutorizadoUrl(){
        //DADO
        Documento documento = new Documento(1,"www.youtube.com","Imagen de Youtube");
        String usuario1 = "jaqp.97@gmail.com";
        String usuario2 = "ana@gmail.com";
        String usuario3 = "jose@hotmail.com";

        //CUANDO
        documento.agregarUsuario(usuario1);
        documento.agregarUsuario(usuario2);
        documento.agregarUsuario(usuario3);

        ProxyDocumento proxy = new ProxyDocumento("jaqp.97@gmail.com","www.youtube.com1");
        String respuestaActual = proxy.traerDocumentos(documento);
        String respuestaEsperada = "El usuario jaqp.97@gmail.com No está autorizado para ver este contenido";
        //ENTONCES
        assertEquals(respuestaEsperada,respuestaActual);
    }
}