package fr.algorithmie;

import java.util.Arrays;

public class InversionContenu {

    public static void main(String[] args) {


        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        int[] copyArray = Arrays.copyOf(array, array.length);


        for (int i = 0; i < array.length / 2; i++) {

            int c = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = c;

        }

        System.out.println("Afficher le 1er tableau et le 2eme copié et inversé : ");


        for (int i = 0; i < copyArray.length; i++) {


            System.out.println(array[i]);
            System.out.println(copyArray[i]);

        }
    }


}










