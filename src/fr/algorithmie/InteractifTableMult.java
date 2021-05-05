package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {

        int nb;
        System.out.println("Entrez un nombre : ");
        Scanner scanner = new Scanner(System.in);

        nb = scanner.nextInt();

        System.out.println("La table de multiplication " + nb);

        for (int i = 0; i <= 10 ; i++) {

            System.out.println(nb + "x" + i + "=" + (nb*i));

            
        }

    }
}
