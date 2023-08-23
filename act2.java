
public class act2 {
	    public static void main(String[] args) {
	        for (int num = 50; num <= 100; num++) {
	            boolean esPrimo = true;

	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    esPrimo = false;
	                    break;
	                }
	            }

	            System.out.print("Número: " + num);
	            
	            if (esPrimo) {
	                System.out.println(" (Primo)");
	            } else {
	                System.out.print(" (No Primo) - Divisores: ");
	                for (int i = 2; i <= num / 2; i++) {
	                    if (num % i == 0) {
	                        System.out.print(i + " ");
	                    }
	                }
	                System.out.println();
	            }
	        }
	    }
	}
