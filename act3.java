import java.util.Scanner;

public class act3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            if (numero > 100 && esPrimo(numero)) {
                System.out.println("¡Número mayor a 100 y primo!");
                break;
            } else {
                System.out.println("No cumple con las condiciones. Intente nuevamente.");
            }
        }

        scanner.close();
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
