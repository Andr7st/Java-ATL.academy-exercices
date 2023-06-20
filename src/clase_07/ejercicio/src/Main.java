import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // command: control + alt + s
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("================== Paso 1 ====================");
        // Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
        System.out.println("Ingresa números 5 veces:");
        for (int i=0; i<5; i++) {
            System.out.print("ingresa número: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println(); // un salto de línea vacío.

        System.out.print("Números ingresados: ");
        for (int i=0; i<5; i++) {
            System.out.print( numbers[i] + " " );
        }
        System.out.println("\n");
        System.out.println("----------------------------------------------");


        System.out.println("================== Paso 2 ====================");
        // Después de realizar el ejercicio anterior,
        // agregar que muestre el número mayor y el número menor.

        int maxNumber = numbers[0], minNumber = numbers[0];
        // La posición 0 ya está tomada en la inicialización de min y max numbers.
        for( int i=1; i<numbers.length; i++ ) {
           if(numbers[i] > maxNumber) { maxNumber = numbers[i]; }
           if(numbers[i] < minNumber) { minNumber = numbers[i]; }
        }
        System.out.println("El número mayor es: " + maxNumber);
        System.out.println("El número menor es: " + minNumber);

        System.out.println("----------------------------------------------");

        System.out.println();


        System.out.println("================== Paso 3 ====================");
        // Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números
        // y se divide por 5, ya que el usuario agregó 5 números.

        double total = 0;
        for (int i=0; i<numbers.length; i++ ) {
            total += numbers[i];
        }

        System.out.println("total = " + total);
        System.out.println("promedio = " + (total / 5));

        System.out.println("----------------------------------------------");


        scanner.close();





    }
}