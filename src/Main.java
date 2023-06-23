import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void mostrarMenu() {
        System.out.println("Figuras Geometricas:");
        System.out.println("1.- Triangulo");
        System.out.println("2.- Cuadrado");
        System.out.println("3.- Circulo");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMenu();
            System.out.print("Seleccione cual figura geometrica: ");
            String opcion = scanner.nextLine();

            if (opcion.equals("1")) {
                List<Punto> puntosTriangulo = new ArrayList<>();
                for (int i = 0; i < 3; i++) {
                    System.out.print("Coordenadas del Punto " + (i + 1) + " del Triangulo (x , y): ");
                    double x = scanner.nextDouble();
                    double y = scanner.nextDouble();
                    scanner.nextLine();
                    Punto punto = new Punto(x, y);
                    puntosTriangulo.add(punto);
                }
                Triangulo triangulo = new Triangulo(puntosTriangulo);

                System.out.println("Área del Triángulo: " + triangulo.calcularArea());
                System.out.println("Perímetro del Triángulo: " + triangulo.calcularPerimetro());
                System.out.println();
            } else if (opcion.equals("2")) {
                System.out.print("Coordenadas del Punto 1 del Cuadrado (x , y): ");
                double x1 = scanner.nextDouble();
                double y1 = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Coordenadas del Punto 2 del Cuadrado (x , y): ");
                double x2 = scanner.nextDouble();
                double y2 = scanner.nextDouble();
                scanner.nextLine();
                Punto punto1 = new Punto(x1, y1);
                Punto punto2 = new Punto(x2, y2);
                Cuadrado cuadrado = new Cuadrado(punto1, punto2);

                System.out.println("Área del Cuadrado: " + cuadrado.calcularArea());
                System.out.println("Perímetro del Cuadrado: " + cuadrado.calcularPerimetro());
                System.out.println();
            } else if (opcion.equals("3")) {
                System.out.print("Coordenadas del Centro del Círculo (x , y): ");
                double x = scanner.nextDouble();
                double y = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Ingrese el radio del Círculo: ");
                double radio = scanner.nextDouble();
                scanner.nextLine();
                Punto centro = new Punto(x, y);
                Circulo circulo = new Circulo(centro, radio);

                System.out.println("Área del Círculo: " + circulo.calcularArea());
                System.out.println("Perímetro del Círculo: " + circulo.calcularPerimetro());
                System.out.println();
            }
            
                break;

        }

        scanner.close();
    }
}
