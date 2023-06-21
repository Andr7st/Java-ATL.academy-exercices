import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Paso 1: Ingresa números 5 veces ");

        for (int i=0; i<5; i++) {
            System.out.print("ingresa un número: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Paso 2: Mostrar el mayor y el menor.");
        int mayor = numbers[0], menor = numbers[0];
        // el número en la posicion 0 ya lo tenemos; entonces
        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] > mayor) { mayor = numbers[j]; }
            if (numbers[j] < menor) { menor = numbers[j]; }
        }

        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);

        System.out.println("Paso 3: Mostrar el promedio.");
        int total = 0;
        for (int k = 0; k < numbers.length; k++) {
            total += numbers[k];
        }

        System.out.println("total " + total);
        System.out.println("promedio " + total / 5);
        scanner.close();
    }
}
