public class CargaFactory {

    private static final String CODIGO_TV = "CODIGO_TV";
    private static final String CODIGO_MEDICAMENTO = "CODIGO_MEDICAMENTO";
    private static final String CODIGO_CONTENEDOR= "CODIGO_CONTENEDOR";
    private static CargaFactory instance;

    private CargaFactory(){
    }

    public static CargaFactory getInstance() {
        if (instance == null){
            instance = new CargaFactory();
        }
        return instance;
    }

    public Carga generarCarga(String codigo) throws CargaFactoryException{
        switch (codigo){
            case  CODIGO_TV:
                return new CargaSimple("TV", "32’ LCD", 3.00,false);
            case CODIGO_MEDICAMENTO:
                return new CargaSimple("Caja de Medicamentos","Tiene diferentes medicamentos", 2.00,true);
            case CODIGO_CONTENEDOR:
                Contenedor contenedor = new Contenedor("Contenedor","Esto es un contenedor",100.00);
                contenedor.agregarCarga(this.generarCarga(CODIGO_TV));
                contenedor.agregarCarga(this.generarCarga(CODIGO_MEDICAMENTO));
                return contenedor;
        }
        throw new CargaFactoryException(codigo + " este no es un código válido");
    }
}
