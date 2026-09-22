import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        imprimirMenuInicio();

        Scanner entrada = new Scanner(System.in);

        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                /* CÍRCULO */
                System.out.println("Ingrese el radio del círculo en centímetros: ");

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

                // Instanciación del objeto Triángulo

                Triangulo trianguloUsuario = new Triangulo(baseTriangulo, alturaTriangulo, lado1, lado2, lado3);

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

    // Método para solicitar los valores de los lados del triángulo al usuario

    public static void solicitarLadosTriangulo(Scanner entrada) {

        // Solicitar el ingreso de los lados del triángulo
                
        System.out.println("Ingrese el valor del lado 1");

        double lado1 = entrada.nextDouble();
        

    }


    // Método para 

    public static areaPerimetroCirculo() {


    }

}