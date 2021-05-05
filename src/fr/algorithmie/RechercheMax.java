package fr.algorithmie;


public class RechercheMax {


    public static int rechercherMaximum(int[] tab) {
        int valMax = Integer.MIN_VALUE;
        for (int elem : tab) {
            if (elem > valMax)
                valMax = elem;
        }
        return valMax;
    }


    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};


        System.out.println("La valeur maximale est " + rechercherMaximum(array));
    }


}

























