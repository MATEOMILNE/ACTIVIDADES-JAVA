import java.util.Scanner;

public class ACT9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de caracteres: ");
        String cadena = scanner.nextLine();

        System.out.print("Ingrese el carácter a reemplazar: ");
        char caracterOriginal = scanner.nextLine().charAt(0);

        System.out.print("Ingrese el nuevo carácter: ");
        char nuevoCaracter = scanner.nextLine().charAt(0);

        String cadenaReemplazada = reemplazarCaracter(cadena, caracterOriginal, nuevoCaracter);

        System.out.println("Cadena después de reemplazar: " + cadenaReemplazada);

        scanner.close();
    }

    public static String reemplazarCaracter(String cadena, char caracterOriginal, char nuevoCaracter) {
        return cadena.replace(caracterOriginal, nuevoCaracter);
    }
}
