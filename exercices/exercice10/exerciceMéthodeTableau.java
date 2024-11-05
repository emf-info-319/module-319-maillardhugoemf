package exercices.exercice10;

public class exerciceMéthodeTableau {
    public static void main(String[] args) {

        int[] tab = creertab(0);
        for (int i = 0; i < tab.length; i++) {
            System.out.println(i);
        }
        // je n'ai pas trouver le le sollution du point 5 et je ne pense pas bien
        // comprendre
        // Math.min(tab, tab); je ne trouve pas la sollution pour trouver la valeur
        // minimale
        // de meme pour la valeur max
        int valeurMax = 0;
        for (int i = 0; i < tab.length; i++) {
            valeurMax = valeurMax + tab[i];
            
        }
        System.out.println(valeurMax);// je ne comprend pas l'erreure il est senser m'afficher 10
        

    }

    public static int[] creertab(int taille) {
        int[] tab = new int[5];
        for (int i = 0; i < tab.length; i++) {

        }
        return tab;

    }
}
