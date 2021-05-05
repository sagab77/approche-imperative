
package fr.algorithmie;

import java.util.Scanner;

     public class InteractifChiffreSuivants {

    private static final Scanner sc = new Scanner(System.in);


    public static void afficherDixChiffresSuivantsA() {

        System.out.println("Veuillez saisir un chiffre: ");
        int nombre = sc.nextInt();
        System.out.print("Les chiffres suivants à  " + nombre + " sont: ");
        for (int i = 1; i <= 10; i++) {
            System.out.print((nombre + i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        afficherDixChiffresSuivantsA();
    }
}
