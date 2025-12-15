import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int b = scanner.nextInt();

        System.out.println("La suma de los dos numeros es: " + sumar(a, b));

        scanner.close();
    }

    public static int sumar(int a, int b) {
        return a + b;
    }
}
