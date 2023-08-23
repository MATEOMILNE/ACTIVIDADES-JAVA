
import java.util.Scanner;

public class ACT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("¡Hola, " + nombre + "! Bienvenido.");

        scanner.close();
    }
}
