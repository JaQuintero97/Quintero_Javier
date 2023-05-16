public class ManejadorPresidente extends Manejador{
    private Integer tipoAcceso = 3;

    @Override
    public Boolean leerDocumento(Documento documento) {
        documento.setContenido("Recibido por el presidente ");
        return true;
    }
}
