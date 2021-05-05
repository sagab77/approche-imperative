package fr.algorithmie;

public class InteractifFibonacci {
    public static void main(String[] args) {

        int x = 0;
        int y = 1;
        int z = 0;
        int i;
        int c = 10;

        // afficher 0 and 1

        System.out.print(x + " " + y);

        // 0 et 1 sont deja affiches

        for (i = 2; i < c; ++i) {
            z = x + y;
            x = y;
            y = z;

            System.out.print(" " + z);
        }
    }
}
