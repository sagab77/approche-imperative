package fr.algorithmie;

public class FirstLast {

    public static boolean testerCondition(int[] tab ){
        return tab.length >= 1 && (tab[0] == tab[tab.length - 1]);
    }

    public static void main(String[] args) {

        int[] array = {5, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 5};

        System.out.println("Affichage du Tableau 1: ");
        AffichageInverse.afficherTableau(array);

        System.out.println("Le tableau a au moins 1 élément et son premier élément ont la meme valeur ?");

        if (testerCondition(array))
            System.out.println("Oui");
        else
            System.out.println("Non");
    }
}
