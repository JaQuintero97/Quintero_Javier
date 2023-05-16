import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutorizaDocumentoTest {
    @Test
    public void llegoAlPresidente(){
        //DADO
        Documento documento = new Documento("Documento de texto.", 3);
        AutorizaDocumento autorizacion = new AutorizaDocumento();

        //CUANDO
        Boolean respuestaActual = autorizacion.autorizar(documento);

        //Entonces
        assertTrue(respuestaActual);
        System.out.println(documento.getContenido());
    }
    @Test
    public void llegoAlDiputadoYSiguio(){
        //DADO
        Documento documento = new Documento("Documento de texto.", 1);
        AutorizaDocumento autorizacion = new AutorizaDocumento();

        //CUANDO
        Boolean respuestaActual = autorizacion.autorizar(documento);

        //Entonces
        assertTrue(respuestaActual);
        System.out.println(documento.getContenido());
    }
    @Test
    public void llegoAlMinistroYSiguio(){
        Documento documento = new Documento("Documento de texto.", 2);
        AutorizaDocumento autorizacion = new AutorizaDocumento();

        //CUANDO
        Boolean respuestaActual = autorizacion.autorizar(documento);

        //Entonces
        assertTrue(respuestaActual);
        System.out.println(documento.getContenido());
    }
}

