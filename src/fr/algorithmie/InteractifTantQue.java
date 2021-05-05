package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        int nb;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre: ");
        nb = scanner.nextInt();

        if(nb >=1 && nb<=10) {
            System.out.println(nb);
        } else {
            System.out.println("Le nombre est trop grand!");
        }


    }
}
