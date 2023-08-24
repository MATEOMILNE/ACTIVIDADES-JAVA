import java.util.Scanner;

public class ACT11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cadenaMasLarga = "";
        int longitudMasLarga = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese la palabra " + i + ": ");
            String palabra = scanner.nextLine();

            if (palabra.length() > longitudMasLarga) {
                cadenaMasLarga = palabra;
                longitudMasLarga = palabra.length();
            }
        }

        System.out.println("La palabra más larga es: " + cadenaMasLarga);

        scanner.close();
    }
}
