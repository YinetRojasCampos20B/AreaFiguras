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

    // Método constructor para crear objetos de la clase concreta Triángulo

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Implementación en Triángulo de los métodos calcularArea y calcularPerimetro de la clase abstracta Figura

    public double calcularArea() {
        double areaTriangulo = (base * altura)/2;
        return areaTriangulo;
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

}
