import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        /// 1) Calculadora de edad de perros:
        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 1:");
        System.out.print("Ingresa la edad del perro:");
        double edadPerro = sc.nextDouble();

        System.out.println("Equivalencia en edad humana: " + (edadPerro * 7));

        System.out.println("EJERCICIO 2:");
        /// 2) Conversor de millas a kilómetros:
        System.out.print("Ingresa una distancia en millas: ");

        double ditanciaMillas = sc.nextDouble();
        System.out.println("La distancia en kilometros equivale a: " + (ditanciaMillas * 1.60934));

        System.out.println("EJERCICIO 3:");
        /// 3) Calculadora de descuento:
        System.out.print("Ingresa el precio del arroz: ");
        double precioOriginal = sc.nextDouble();

        System.out.print("Ingresa el procentaje de descuento: ");
        double descuento = sc.nextDouble();

        double precioFinal = precioOriginal - (precioOriginal * descuento / 100);

        System.out.println("El precio final es: " + precioFinal);

        System.out.println("EJERCICIO 4:");

        System.out.print("Ingrese el total de la cuenta: " );
        double totalCuenta = sc.nextDouble();

        System.out.print("porcentaje de propina que deseas dejar: ");
        double porcentajePropina = sc.nextDouble();

        double montoTotal = totalCuenta * (porcentajePropina / 100);
        System.out.println("El monto total es: " + montoTotal );

        System.out.println("EJERCICIO 5:");
        // Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
        double numeroAdivinar = Math.floor(Math.random() * 100);
        // System.out.println("esto debe ser incognito al usuario: " + numeroAdivinar);

        System.out.print("Ingresa tu némero: ");
        double numeroDelUsuario = sc.nextDouble();
        if (numeroDelUsuario != numeroAdivinar) {
            System.out.println("El número que ingresaste es incorrecto! " );
        } else {
            System.out.println("El número que ingresaste es correcto! " );
        }


    }

}





/*

    Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu peso:");
        double peso = scanner.nextDouble();

        System.out.print("Ingresa tu altura:");
        double altura = scanner.nextDouble();

        double indiceMasaCorporal = peso / (altura * altura);

        System.out.println("El indice de masa corporal es: " + indiceMasaCorporal);

        // para saber si es obeso
        if (indiceMasaCorporal >= 30) {
            System.out.println("En estado de obesidad.");
        }

        if (indiceMasaCorporal >= 25 && indiceMasaCorporal < 30) {
            System.out.println("Estado de sobrepeso");
        }

        if (indiceMasaCorporal >= 18.5 && indiceMasaCorporal < 25) {
            System.out.println("Estado de peso normal");
        }

        if (indiceMasaCorporal < 18.5) {
            System.out.println("Estado de peso menor al normal");
        }


* */
