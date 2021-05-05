package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {

        int n;
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez les nombres : ");
        n = scanner.nextInt();
        max = n;

        do {
            n = scanner.nextInt();
            if (n >= 10) {
                if (n > max) {
                    max = n;
                }
            }

        } while (n != 10);

        System.out.println("Le maximum est " + max);


    }


}

