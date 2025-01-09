package test;

import java.util.Scanner;

public class E2hugoMaillard {
    public static final int NOMBRE_BATONNETS = 21;
    public static final int MIN = 1;
    public static final int MAX = 3;

    public static void main(String[] args) {
        int[] batonnets = new int[NOMBRE_BATONNETS];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < batonnets.length; i++) {
            batonnets[i] = 1;
        }

        boolean tourjeur = true;
        while (tourjeur) {
            afficherBAtonnet(batonnets);
            tourjeur = !tourjeur;
            if (tourjeur) {
                int nbEnlever = demanderNombre(scanner);
                batonnets = enleverBatonnets(batonnets, nbEnlever); 
            }
           else{
            int  nbEnleverIA = (int) Math.random()*(MAX - MIN+1)+MIN;
            System.out.println("l'ia veut enlever " + nbEnleverIA);
            batonnets = enleverBatonnets(batonnets, nbEnleverIA);

           }

        }scanner.close();
    }

    public static void afficherBAtonnet(int[] batonnet) {
        for (int i = 0; i < batonnet.length; i++) {

            if (batonnet[i] == 1) {
                System.out.print("|");
            } else {
                System.out.print("-");
            }

            System.out.print("");
        }
    }

    public static int nbBatonnetRestant(int[] batonnets) {
        int compteur = 0;
        for (int i = 0; i < batonnets.length; i++) {
            if (batonnets[i] == 1) {
                compteur++;
            }
        }
        return compteur;

    }

    public static int[] enleverBatonnets(int[] batonnets, int nbEnlever) {
        int nbRestants = nbBatonnetRestant(batonnets);
        int nbEnleverMax = Math.min(nbRestants, nbEnlever);
        for (int i = batonnets.length - 1; i >= 0 && nbEnleverMax > 0; i--) {
            if (batonnets[i] == 1) {
                batonnets[i] = 0;
                nbEnleverMax--;
            }

        }

        return batonnets;

    }

    public static int demanderNombre(Scanner scanner) {
        int nombreDemander = 0;
        while (nombreDemander < 1 || nombreDemander > 3) {
            nombreDemander = scanner.nextInt();
            System.out.println("entre un nombre entre 1 et 3");
            scanner.nextLine();
            if (nombreDemander < 1 || nombreDemander > 3) {
                System.out.println("le nombre demader est incorecte ");
            }
        }

        return nombreDemander;
    }
}
