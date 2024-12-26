import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Generar un número aleatorio entre 0 y 100
        Random random = new Random();
        int numeroSecreto = random.nextInt(101); // Límite superior es exclusivo, por eso se usa 101
        int intentosMaximos = 5; // Número máximo de intentos
        int intentosRealizados = 0;

        System.out.println("¡Bienvenido al juego de adivinanzas!");
        System.out.println("He pensado un número entre 0 y 100. ¿Puedes adivinar cuál es?");
        System.out.println("Tienes un máximo de " + intentosMaximos + " intentos.");

        // Crear un Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        while (intentosRealizados < intentosMaximos) {
            System.out.print("Introduce tu intento: ");
            int intentoUsuario = scanner.nextInt();
            intentosRealizados++;

            if (intentoUsuario == numeroSecreto) {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentosRealizados + " intentos.");
                break; // Salir del bucle al adivinar el número
            } else if (intentoUsuario < numeroSecreto) {
                System.out.println("El número es mayor que " + intentoUsuario + ".");
            } else {
                System.out.println("El número es menor que " + intentoUsuario + ".");
            }

            if (intentosRealizados == intentosMaximos) {
                System.out.println("¡Lo siento! Has alcanzado el límite de intentos.");
                System.out.println("El número secreto era: " + numeroSecreto);
            }
        }

        // Cerrar el scanner
        scanner.close();
    }
}
