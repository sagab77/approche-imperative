package fr.algorithmie;

public class Rotation {

    public static int[] rotDroite(int[] tab) {

        int[] tabRotation = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            tabRotation[(i + 1) % tab.length] = tab[i];
        }
        return tabRotation;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 9, 1, 4, 3};

        System.out.println("Affichage du Tableau: ");
        AffichageInverse.afficherTableau(array);
        int[] tabRot = rotDroite(array);
        System.out.println("Affichage du Tableau résultat de la 1ere rotation à droite: ");

        AffichageInverse.afficherTableau(tabRot);





    }
}
