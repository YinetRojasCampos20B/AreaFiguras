import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Imprimiendo el menú del programa de calculadora de áreas y perímetros

        imprimirMenuInicio();

        Scanner entrada = new Scanner(System.in);

        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                /* CÍRCULO */

                System.out.println("Ingrese el radio del círculo en centímetros: ");
                double radioCirculo = entrada.nextDouble();
                
                // Instanciando un objeto de tipo Círculo con el dato del radio ingresado por el usuario

                Circulo circuloUsuario = new Circulo(radioCirculo);

                break;
            case 2:
                /* CUADRADO */

                System.out.println("Ingrese la longitud del lado del cuadrado en centímetros: ");

                break;
            case 3:

                /** TRIÁNGULO */

                System.out.println("Ingrese el valor de la base del triángulo en centímetros: ");
                double baseTriangulo = entrada.nextDouble();

                System.out.println("Ingrese el valor de la altura del triángulo en centímetros: ");
                double alturaTriangulo = entrada.nextDouble();

                // Solicitar el ingreso de los lados del triángulo
                        
                System.out.println("Ingrese el valor del lado 1");

                double lado1 = entrada.nextDouble();

                System.out.println("Ingrese el valor del lado 2");

                double lado2 = entrada.nextDouble();

                System.out.println("Ingrese el valor del lado 3");

                double lado3 = entrada.nextDouble();

                // Instanciación del objeto Triángulo

                Triangulo trianguloUsuario = new Triangulo(baseTriangulo, alturaTriangulo, lado1, lado2, lado3);
                
                // Usando el método areaFigura para calcular el área del triángulo e imprimir los resultados
                
                areaPerimetroTriangulo(trianguloUsuario);
            
                // Usando el método areaFigura para calcular el perímetro del triángulo e imprimir los resultados

                break;
        
            default:
                break;
        }

    }

    // Método auxiliar para imprimir el menú de inicio

    public static void imprimirMenuInicio() {
        System.out.println("Bienvenido a la calculadora de áreas y perímetros");
        System.out.println("Seleccione una figura para comenzar: ");

        System.out.println("1) Círculo");
        System.out.println("2) Cuadrado");
        System.out.println("3) Triángulo no rectángulo");
    }

    // Método para calcular el área y el perímetro del círculo e imprimir el resultado en consola

    public static void areaPerimetroCirculo(Circulo circulo) {
        double areaCirculo = circulo.calcularArea();
        double perimetroCirculo = circulo.calcularPerimetro();
        System.out.println("EL área del círculo es igual a: "+areaCirculo+" centímetros");
        System.out.println("El perímetro del triángulo es igual a: "+perimetroCirculo);
        
        
    }


    // Método para calcular el área y el perímetro del triángulo e imprimir el resultado en consola

    public static void areaPerimetroTriangulo(Triangulo triangulo) {
        double areaTriangulo = triangulo.calcularArea();
        double perimetroTriangulo = triangulo.calcularPerimetro();
        System.out.println("El área del triángulo es igual a: "+areaTriangulo+ " centímetros");
        System.out.println("El perímetro del triángulo es igual a: "+perimetroTriangulo+" centímetros");

    }

}