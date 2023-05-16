public class ManejadorDiputado extends Manejador{
    private Integer tipoAcceso = 1;

    @Override
    public Boolean leerDocumento(Documento documento) {
        if (tipoAcceso >= documento.getTipo()){
            documento.setContenido(" Recibido por el diputado ");
        }
        return getSiguienteManejador().leerDocumento(documento);
    }
}
