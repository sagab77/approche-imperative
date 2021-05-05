package fr.algorithmie;

public class SommeDeTableaux {

    public static int[] sommeTab(int[] tabA, int [] tabB){
        if(tabA.length != tabB.length){
            return null;
        }
        int[] tabResultat = new int[tabA.length];
        for (int i = 0; i < tabResultat.length; i++) {
            tabResultat[i] = tabA[i] + tabB[i];
        }
        return tabResultat;
    }
    public static void main(String[] args) {

        int[] tabA = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
        int[] tabB = {-1,12,17,14,5,-9,0,18,-6,0,4,-13,5,7,-2,8,-1};

        System.out.println("Affichage du Tableau A: ");
        AffichageInverse.afficherTableau(tabA);
        System.out.println("Affichage du Tableau B: ");
        AffichageInverse.afficherTableau(tabB);

        int[] tabResultat = sommeTab(tabA,tabB);
        if (tabResultat!=null) {
            System.out.println("Affichage du Tableau Résultat: ");
            AffichageInverse.afficherTableau(tabResultat);
        }
        else
            System.out.println("Les tabelaux doivent être de même dimension");
    }
}













