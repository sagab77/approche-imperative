package fr.algorithmie;

import java.util.Scanner;

public class sommeArithmetique {
    private static final Scanner sc = new Scanner(System.in);


    public static void calculerSommeChiffreEntre(){
        System.out.println("Veuillez saisir un chiffre: ");
        int nombre = sc.nextInt();

        int somme = 0;
        for (int i = 1; i <= nombre; i++) {
            somme += i;
        }
        System.out.println("La somme des chiffres compris entre 1 et "+ nombre+ " est: "+somme);
    }

    public static void main(String[] args) {
        calculerSommeChiffreEntre();
    }
}