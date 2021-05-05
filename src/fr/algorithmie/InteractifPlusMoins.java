package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int nA;
        int nE;
        int nC;

        nA = r.nextInt(100) + 1;
        nC = scanner.nextInt();
        System.out.println("Entrez un nombre : ");

        do {
            nE = scanner.nextInt();
            if (nE == nA)
                System.out.println("Vous avez trouvé le numéro en " + nC);
            else if (nE > nA)
                System.out.println("Le nombre est trop grand!");
            else
                System.out.println("Le nombre est trop petit!");
        } while (nE != nA);


    }
}
