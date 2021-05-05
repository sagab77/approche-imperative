package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

    private static final Scanner sc = new Scanner(System.in);


    public static void devinerChiffre() {

        int nombreADeviner = (int) (Math.random() * 101);

        boolean trouve = false;
        int nbre_coups = 0;
        while (!trouve) {
            nbre_coups++;
            System.out.println("Inserez un nombre compris entre 1 et 100: ");
            int nombre = sc.nextInt();
            if (nombre > nombreADeviner)
                System.out.println("Trop grand!");
            else if (nombre < nombreADeviner)
                System.out.println("Trop petit!");
            else
                trouve = true;
        }
        System.out.println("Bravo, le chiffre  est: " + nombreADeviner + ". Vous avez essaie " +
                nbre_coups + "fois");

    }

    public static void main(String[] args) {
        devinerChiffre();
    }
}