/*
CLASE CONCRETA CÍRCULO
*/

public class Circulo extends Figura{

    // Atributos de la clase concreta Círculo

    private double radio;

    // Método constructor de la clase concreta Círculo

    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación en Circulo de los métodos calcularArea y calcularPerimetro de la clase abstracta Figura

    public double calcularArea() {
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        return areaCirculo;
    }

    public double calcularPerimetro() {
        double perimetroCirculo = 2 * Math.PI * radio;
        return perimetroCirculo;
    }

    
}
