public class App {
    public static void main(String[] args) throws Exception {
        final int N = 10;
        int[] numero = new int[N];
        int i;

        System.out.println("Introduzca 10 números separados por INTRO: ");
        for (i = 0; i < N; i++) {
            numero[i] = Integer.parseInt(System.console().readLine());
        }

        for (i = 0; i < N; i++) {
            System.out.printf("|%3d ", i);
        }
        System.out.println("|");

        for (i = 0; i < N * 5; i++) {
            System.out.print("-");
        }
        System.out.println("-");

        for (i = 0; i < N; i++) {
            System.out.printf("|%3d ", numero[i]);
        }
        System.out.println("|");

        int inicio = Integer.parseInt(System.console().readLine("Introduzca la posición inicial: "));
        int fin = Integer.parseInt(System.console().readLine("Introduzca la posición final: "));

        System.out.println("Array original");

        for (i = 0; i < N; i++) {
            System.out.printf("|%3d ", i);
        }
        System.out.println("|");

        for (i = 0; i < N * 5; i++) {
            System.out.print("-");
        }
        System.out.println("-");

        for (i = 0; i < N; i++) {
            System.out.printf("|%3d ", numero[i]);
        }
        System.out.println("|");

        System.out.println("Array resultante: ");

        int aux = numero[inicio];
        int aux2 = numero[N - 1];
        numero[inicio] = numero[inicio - 1];

        for (i = N - 1; i > 0; i--) { 
            if (i == fin) {
                numero[i] = aux; 
            } else if (i > inicio && i <= fin) {
                numero[i] = numero[i];
            } else {

                numero[i] = numero[i - 1];
            } 
        }
        numero[0] = aux2; 

        for (i = 0; i < N; i++) {
            System.out.printf("|%3d ", i);
        }
        System.out.println("|");

        for (i = 0; i < N * 5; i++) {
            System.out.print("-");
        }
        System.out.println("-");

        for (i = 0; i < N; i++) {
            System.out.printf("|%3d ", numero[i]);
        }
        System.out.println("|");
    }
}
