import javax.print.Doc;

public class AutorizaDocumento {
    private Manejador inicial;

    public AutorizaDocumento() {
        inicial = new ManejadorDiputado();
        ManejadorMinistro ministro = new ManejadorMinistro();
        ManejadorPresidente presidente = new ManejadorPresidente();

        inicial.setSiguienteManejador(ministro);
        ministro.setSiguienteManejador(presidente);
        }

        public Boolean autorizar(Documento documento){
         return inicial.leerDocumento(documento);
        }
    }

