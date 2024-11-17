package exercices.exercice11;

public class exercice11chatgpt {
    // Constantes MIN et MAX
    public static final int MIN = 0;
    public static final int MAX = 100;

    // Méthode pour inverser un tableau
    public static int[] inverseLeTableau(int[] tableau) {
        int[] tableauInverse = new int[tableau.length];
        for (int i = 0; i < tableau.length; i++) {
            tableauInverse[i] = tableau[tableau.length - 1 - i];
        }
        return tableauInverse;
    }

    public static void main(String[] args) {
        // Initialisation du tableauInitial de taille 4
        int[] tableauInitial = new int[4];

        // Remplissage du tableauInitial avec des valeurs aléatoires entre MIN et MAX
        for (int i = 0; i < tableauInitial.length; i++) {
            tableauInitial[i] = (int) (Math.random() * (MIN + MAX - 1)) + 1;  // Valeur entre MIN et MAX
        }

        // Affichage du contenu du tableauInitial
        System.out.println("Contenu du tableau initial :");
        for (int i = 0; i < tableauInitial.length; i++) {
            System.out.println("Tableau initial [" + i + "] = " + tableauInitial[i]);
        }

        // Appel de la méthode inverseLeTableau et stockage du résultat dans tableauFinal
        int[] tableauFinal = inverseLeTableau(tableauInitial);

        // Affichage du contenu du tableauFinal
        System.out.println("\nContenu du tableau final :");
        for (int i = 0; i < tableauFinal.length; i++) {
            System.out.println("Tableau final [" + i + "] = " + tableauFinal[i]);
}
    }}
