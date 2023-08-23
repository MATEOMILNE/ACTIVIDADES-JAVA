import java.util.Scanner;

public class act4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("BIENVENIDO/A A LA CALCULADORA DE MILNE");
        System.out.println("--------------------------------------");

        System.out.print("Ingrese un numero para calcular: ");
        double num1 = scanner.nextDouble();

        System.out.print("ingrese otro numero para calcular: ");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = scanner.nextInt();

        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("No se puede dividir por cero.");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Opción no válida.");
                System.exit(0);
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}

