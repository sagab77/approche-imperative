package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    private static final Scanner sc = new Scanner(System.in);


    public static void calcNombFib() {

        System.out.println("Veuillez saisir la valeur : ");

        int N = sc.nextInt();
        int[] fibo = new int[N + 1];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i < fibo.length; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        System.out.println("F[" + N + "]= " + fibo[N]);
    }

    public static void main(String[] args) {
        calcNombFib();
    }
}


/*package fr.algorithmie;

public class InteractifFibonacci {
    public static void main(String[] args) {

        int x = 0;
        int y = 1;
        int z = 0;
        int i;
        int c = 100;



        System.out.print(x + " " + y);

        // 0 et 1 sont deja affiches

        for (i = 2; i < c; ++i) {
            z = x + y;
            x = y;
            y = z;

            System.out.print(" " + z);
        }
    }
}*/
