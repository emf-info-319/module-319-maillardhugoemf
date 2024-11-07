
import java.util.Random;

public class teste {// avec chat gpt
    // Méthode qui inverse le tableau passé en paramètre
    public static int[] inverseLeTableau(int[] tableau) {
        int[] tableauInverse = new int[tableau.length];
        int j = 0;
        // Inverser les éléments du tableau
        for (int i = tableau.length - 1; i >= 0; i--) {
            tableauInverse[j] = tableau[i];
            j++;
        }
        return tableauInverse;
    }

    // Déclaration des constantes MIN et MAX
    public static int MIN = 0;
    public static int MAX = 100;

    public static void main(String[] args) {

        // Création du tab1
        int[] tab1 = new int[4];

        // Remplissage du tab1 avec des valeurs aléatoires entre MIN et MAX
        Random rand = new Random();
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = rand.nextInt(MAX - MIN + 1) + MIN;
        }

        // Affichage du contenu du tableauInitial
        System.out.println("Contenu du tableau initial :");
        for (int i = 0; i < tab1.length; i++) {
            System.out.println("Tableau initial [" + i + "] = " + tab1[i]);
        }

        // Inverser le tableau avec la méthode inverseLeTableau
        int[] tab2 = inverseLeTableau(tab1);

        // Affichage du contenu du tableauFinal
        System.out.println("\nContenu du tableau final :");
        for (int i = 0; i < tab2.length; i++) {
            System.out.println("Tableau final [" + i + "] = " + tab2[i]);
        }
    }

}
