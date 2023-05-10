public class Persona {
    private String nombre;
    private Integer edad;

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public boolean checkEdad(){
        return edad>=18;
    }

    public boolean checkEdadPosible(){
        boolean resultado = false;
        if(edad >=0 && edad <= 120){
            resultado = true;
        }
        return resultado;
    }

    public boolean checkLetras(){
        boolean resultado = false;
        char[] letras = nombre.toCharArray();
        for (char letra:letras) {
            if (!Character.isLetter(letra)){
                return resultado;
            }
        }
        resultado = true;
        return resultado;
    }

    public boolean cantLetras(){
        return nombre.length() >= 5;
    }
}
