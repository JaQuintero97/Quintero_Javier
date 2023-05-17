import java.util.ArrayList;
import java.util.List;

public class Documento {
    private Integer id;
    private String url;
    private String contenido;
    private List<String> usuariosAutorizados;

    public Documento(Integer id, String url, String contenido) {
        this.id = id;
        this.url = url;
        this.contenido = contenido;
        this.usuariosAutorizados = new ArrayList<String>();
    }

    public void agregarUsuario(String usuario){
        usuariosAutorizados.add(usuario);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public List<String> getUsuariosAutorizados() {
        return usuariosAutorizados;
    }

    public void setUsuariosAutorizados(List<String> usuariosAutorizados) {
        this.usuariosAutorizados = usuariosAutorizados;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", contenido='" + contenido + '\'' +
                ", usuariosAutorizados=" + usuariosAutorizados +
                '}';
    }
}
