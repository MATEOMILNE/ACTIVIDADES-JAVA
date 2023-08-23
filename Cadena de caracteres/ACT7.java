import java.util.Scanner;

public class ACT7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un mensaje que desees: ");
        String cadena = scanner.nextLine();

        int contadorVocales = contarVocales(cadena);

        System.out.println("La cadena tiene " + contadorVocales + " vocales.");

        scanner.close();
    }

    public static int contarVocales(String cadena) {
        int contador = 0;
        cadena = cadena.toLowerCase(); // Convertir la cadena a minúsculas para considerar todas las vocales

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }

        return contador;
    }
}
