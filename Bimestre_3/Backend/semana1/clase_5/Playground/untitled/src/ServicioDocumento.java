public class ServicioDocumento implements TraerDocumento{
    @Override
    public String traerDocumentos(Documento documento) {
       return "Estás autorizado para ver este contenido " + documento.getContenido();
    }
}
