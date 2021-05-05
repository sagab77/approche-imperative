package fr.algorithmie;


import java.util.Arrays;


public class AffichageInverse {

    public static void main(String[] args) {


        int[] array = new int[]{1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        int[] copyArray = Arrays.copyOf(array, array.length);

        System.out.println("Afficher le tableau :");

        for (int i = 0; i < copyArray.length; i++) {
            System.out.println(copyArray[i]);

        }

        System.out.println("Afficher le tableau copié : ");

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);


        }

        System.out.println("Afficher le tableau inversé : ");

        for (int i = 0; i < array.length / 2; i++) {

            int c = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = c;

        }

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);

        }
    }

    public static void afficherTableau(int[] tab) {

        for (int elem : tab) {
            System.out.print(elem + ", ");
        }
        System.out.println();
    }
}




















