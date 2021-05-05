package fr.algorithmie;

public class FirstLast6 {


    public static boolean testerCondition(int[] tab) {


        return tab.length >= 1 && (tab[0] == 6 || tab[tab.length - 1] == 6);
    }

    public static void main(String[] args) {

        int[] array = {5, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 6};

        System.out.println("Affichage du Tableau 1: ");

        AffichageInverse.afficherTableau(array);
        System.out.println("Le tableau a au  moins 1 élément et son premier élément ou dernier élément vaut 6?");

        if (testerCondition(array)) {
            System.out.println("Oui");
        } else {
            System.out.println("Non");
        }
    }
}
