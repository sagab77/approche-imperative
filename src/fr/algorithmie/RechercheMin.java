package fr.algorithmie;

public class RechercheMin {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for (int i = 0;i < array.length ; i++) {

            if(array[i] > min)
                max = array[i];
            if(array[i] > max)
                min = array[i];

        }
        System.out.println("Le plus petite element du tableau est : " + max);
    }


}
