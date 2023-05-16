public class ManejadorMinistro extends Manejador{
    private Integer tipoAcceso = 2;

    @Override
    public Boolean leerDocumento(Documento documento) {
        if (tipoAcceso >= documento.getTipo()){
            documento.setContenido("Recibido por el Ministro ");
        }
        return getSiguienteManejador().leerDocumento(documento);
    }
}
