public class FiguraGeometrica {
    private String tipoDeFigura;
    private Double valor;

    public FiguraGeometrica(String tipoDeFigura,Double valor) {
        this.tipoDeFigura = tipoDeFigura.toLowerCase();
        this.valor = valor;
    }

    public String getTipoDeFigura() {
        return tipoDeFigura;
    }

    public void setTipoDeFigura(String tipoDeFigura) {
        this.tipoDeFigura = tipoDeFigura;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String calcularAreaFigura(){
        double areaCirculo = Math.PI * valor* valor;
        double areaCuadrado = valor * valor;
        if (tipoDeFigura == "circulo" || tipoDeFigura == "cuadrado"){
            if (valor <= 0){
                return "El valor del radio o lado debe ser mayor que cero";
            }
            else if (tipoDeFigura == "circulo"){
                return "El área del " + tipoDeFigura + " es " + areaCirculo + "unidades";
            }
            else{
                return "El área del " + tipoDeFigura + " es " + areaCuadrado + "unidades";
            }
        }
        return "El tipo de figura no se reconoce, debes ingresar un cuadrado o un círculo";
    }
}
