import java.util.Arrays;
import java.util.Scanner;

public class ACT10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera cadena: ");
        String cadena1 = scanner.nextLine();

        System.out.print("Ingrese la segunda cadena: ");
        String cadena2 = scanner.nextLine();

        if (sonAnagramas(cadena1, cadena2)) {
            System.out.println("Las cadenas son anagramas.");
        } else {
            System.out.println("Las cadenas no son anagramas.");
        }

        scanner.close();
    }

    public static boolean sonAnagramas(String cadena1, String cadena2) {
        cadena1 = cadena1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        cadena2 = cadena2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        if (cadena1.length() != cadena2.length()) {
            return false;
        }

        char[] charsCadena1 = cadena1.toCharArray();
        char[] charsCadena2 = cadena2.toCharArray();

        Arrays.sort(charsCadena1);
        Arrays.sort(charsCadena2);

        return Arrays.equals(charsCadena1, charsCadena2);
    }
}
