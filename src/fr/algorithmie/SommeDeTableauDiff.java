package fr.algorithmie;

public class SommeDeTableauDiff {

    public static int[] somme2TabDiff(int[] tabA, int[] tabB) {

        int taille = Math.min(tabA.length, tabB.length);
        int[] tabResultat = new int[taille];
        for (int i = 0; i < tabResultat.length; i++) {
            tabResultat[i] = tabA[i] + tabB[i];
        }
        return tabResultat;
    }

    public static void main(String[] args) {
        int[] tabA = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] tabB = {-1, 12, 17, 14, 5, -9, 0, 18};

        System.out.println("Affichage du Tableau A: ");
        AffichageInverse.afficherTableau(tabA);
        System.out.println("Affichage du Tableau B: ");
        AffichageInverse.afficherTableau(tabB);
        int[] tabResultat = somme2TabDiff(tabA, tabB);
        System.out.println("Affichage du Tableau Résultat: ");
        AffichageInverse.afficherTableau(tabResultat);
    }
}
