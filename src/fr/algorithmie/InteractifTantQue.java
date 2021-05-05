package fr.algorithmie;
import java.util.Scanner;

public class InteractifTantQue {

    private static final Scanner sc = new Scanner(System.in);


    public static void saisirNb(){
        int nombre;
        do{
            System.out.println("Entrer un nombre compris entre 1 et 10: ");
            nombre = sc.nextInt();

        } while(nombre < 1 || nombre > 10);

        System.out.println("Bravo, vous avez reussi: "+ nombre);
    }

    public static void main(String[] args) {
        saisirNb();
    }

}
