package fr.algorithmie;

public class ComparaisonTableau {

    public static int nbElem(int[] tabA, int[] tabB) {
        int nb_elem_com = 0;

        for (int elemA : tabA) {
            for (int elemB : tabB) {
                if (elemA == elemB)
                    nb_elem_com += 1;
            }
        }
        return nb_elem_com;
    }

    public static void main(String[] args) {

        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

        System.out.println("Affichage du Tableau 1: ");
        AffichageInverse.afficherTableau(array1);

        System.out.println("Affichage du Tableau 2: ");
        AffichageInverse.afficherTableau(array2);

        System.out.println("Nombres d'éléments communs sont: " + nbElem(array1, array2));
    }
}


