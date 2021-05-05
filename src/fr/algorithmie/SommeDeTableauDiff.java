package fr.algorithmie;

public class SommeDeTableauDiff {
    public static void main(String[] args) {

        int somme;

        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};

        for (int i : array1) {
            somme = array1[i]+array2[i];
            System.out.println(somme);
        }

        }
    }

