import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiguraGeometricaTest {
    @Test
    public void noEsCuadradoOCirculo(){
        FiguraGeometrica figura = new FiguraGeometrica("triangulo", 1.0);
        String respuestaEsperada = "El tipo de figura no se reconoce, debes ingresar un cuadrado o un círculo";
        String respuesta = figura.calcularAreaFigura();
        assertEquals(respuesta, respuestaEsperada);
        System.out.println(respuesta);
    }

    @Test
    public void cuadradoCasoPositivo(){
        FiguraGeometrica figura = new FiguraGeometrica("cuadrado",4.0);
        String resultadoEsperado = "El área del cuadrado es "+ 16.0 + "unidades";
        String resultado = figura.calcularAreaFigura();
        assertEquals(resultado,resultadoEsperado);
        System.out.println(figura.calcularAreaFigura());
    }

    @Test
    public void cuadradoCasoNegativo(){
        FiguraGeometrica figura = new FiguraGeometrica("cuadrado",0.0);
        String resultadoEsperado = "El valor del radio o lado debe ser mayor que cero";
        String resultado = figura.calcularAreaFigura();
        assertEquals(resultado,resultadoEsperado);
        System.out.println(figura.calcularAreaFigura());
    }

    @Test
    public void circuloCasoPositivo(){
        FiguraGeometrica figura = new FiguraGeometrica("circulo",4.0);
        String resultadoEsperado = "El área del circulo es "+ 50.26548245743669 + "unidades";
        String resultado = figura.calcularAreaFigura();
        assertEquals(resultado,resultadoEsperado);
        System.out.println(figura.calcularAreaFigura());
    }

    @Test
    public void circuloCasoNegativo(){
        FiguraGeometrica figura = new FiguraGeometrica("cuadrado",-1.0);
        String resultadoEsperado = "El valor del radio o lado debe ser mayor que cero";
        String resultado = figura.calcularAreaFigura();
        assertEquals(resultado,resultadoEsperado);
        System.out.println(figura.calcularAreaFigura());
    }

}