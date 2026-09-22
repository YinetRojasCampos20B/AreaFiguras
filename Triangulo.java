/*
CLASE CONCRETA TRIÁNGULO
*/

public class Triangulo {

    // Atributos de la clase concreta Triángulo

    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    // Implementación en Triángulo de los métodos calcularArea y calcularPerimetro de la clase abstracta Figura

    public double calcularArea() {
        double areaTriangulo = (base * altura)/2;
        return areaTriangulo;
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

}
