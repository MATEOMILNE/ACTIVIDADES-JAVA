import java.util.Scanner;

public class ACT8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String cadena = scanner.nextLine();

        if (esPalindromo(cadena)) {
            System.out.println("La palabra es un pal�ndromo.");
        } else {
            System.out.println("La palabra no es un pal�ndromo.");
        }

        scanner.close();
    }

    public static boolean esPalindromo(String cadena) {
        cadena = cadena.replaceAll("[^a-zA-Z]", "").toLowerCase(); // Elimino caracteres no alfab�ticos y convertir a min�sculas

        int inicio = 0;
        int fin = cadena.length() - 1;

        while (inicio < fin) {
            if (cadena.charAt(inicio) != cadena.charAt(fin)) {
                return false;
            }
            inicio++;
            fin--;
        }

        return true;
    }
}
