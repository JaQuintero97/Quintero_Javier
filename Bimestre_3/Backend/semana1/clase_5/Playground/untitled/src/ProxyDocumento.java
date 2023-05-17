import javax.print.Doc;
import java.util.List;

public class ProxyDocumento implements TraerDocumento{
    private ServicioDocumento servicioDocumento;
    private String url;
    private String email;

    public ProxyDocumento(String email, String url) {
        this.servicioDocumento = new ServicioDocumento();
        this.email = email;
        this.url = url;
    }


    @Override
    public String traerDocumentos(Documento documento) {
        String respuesta = "El usuario " + email + " No está autorizado para ver este contenido";
        if (documento.getUrl().contains(url) && documento.getUsuariosAutorizados().contains(email)){
            respuesta =  servicioDocumento.traerDocumentos(documento);
        }
        return respuesta;
    }
}


