import java.util.Date;

public abstract class Tarjeta {
    
    private String numeroFrente;
    private Integer codigoSegurdad;
    private Integer fechaExpiracion;

    public Tarjeta(String numeroFrente, Integer codigoSegurdad, Integer fechaExpiracion) {
        this.numeroFrente = numeroFrente;
        this.codigoSegurdad = codigoSegurdad;
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getNumeroFrente() {
        return numeroFrente;
    }

    public void setNumeroFrente(String numeroFrente) {
        this.numeroFrente = numeroFrente;
    }

    public Integer getCodigoSegurdad() {
        return codigoSegurdad;
    }

    public void setCodigoSegurdad(Integer codigoSegurdad) {
        this.codigoSegurdad = codigoSegurdad;
    }

    public Integer getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Integer fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }
}



