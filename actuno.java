public class actuno {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print("N�mero: " + i);
            
            if (i % 2 == 0) {
                System.out.println(" (Par)");
            } else {
                System.out.println(" (Impar)");
            }
        }
    }
}
