/**
 * CLASE CONCRETA CUADRADO
 * 
 */

public class Cuadrado extends Figura {

    // Atributos de la clase concreta Cuadrado

    private double lado;

    // Implementación en Cuadrado de los métodos calcularArea y calcularPerimetro de la clase abstracta Figura

    public double calcularArea() {

        double areaCuadrado = lado * lado;
        return areaCuadrado;
    }

    public double calcularPerimetro() {

        double perimetroCuadrado = lado * 4;
        return perimetroCuadrado;
    }
    
}
