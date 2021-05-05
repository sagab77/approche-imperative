package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

    private static final Scanner sc = new Scanner(System.in);


    public static void afficherMax(int limite){
        int valMax = Integer.MIN_VALUE;

        for (int i = 0; i < limite; i++) {
            System.out.println("Veuillez saisir le nombre : "+ i);

            int nombre = sc.nextInt();
            if(nombre > valMax)
                valMax = nombre;
        }
        System.out.println("Le nombre plus grand est "+valMax);
    }

    public static void main(String[] args) {
        afficherMax(10);
    }
}

