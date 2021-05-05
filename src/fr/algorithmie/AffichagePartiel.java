package fr.algorithmie;

public class AffichagePartiel {

    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        System.out.println("Les entieres suivants sont plus grand que 3 : ");

        for (int i = 0; i < array.length; i++) {

            if (array[i] > 3) {


                System.out.println(array[i]);

            }


        }

        System.out.println("Les nombres paires sont : ");

        for (int j = 0; j < array.length; j++) {

            if (array[j] % 2 == 0 && array[j] > 0) {

                System.out.println(array[j]);
            }

        }

        System.out.println("Les indexes paires sont : ");


        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0 && array[i] > 0) {

                System.out.println("[" + i + "]");

            }

        }

        System.out.println("Les entieres impaires sont : ");

        for (int j = 0; j < array.length; j++) {

            if (array[j] % 2 != 0 && array[j] > 0) {

                System.out.println(array[j]);
            }

        }


    }


}




