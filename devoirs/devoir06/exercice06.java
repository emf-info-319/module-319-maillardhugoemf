package devoirs.devoir06;

public class exercice06 {
    public static int TAILLE_TABLEAU = 20;
    public static int VALEUR_MAX = 50;
    public static int VALEUR_MIN = 0;
    public static int VALEUR_RECHERCHEE = 7;

    public static void main(String[] args) {
        genereTableau(VALEUR_MIN, VALEUR_MAX, TAILLE_TABLEAU);
        int[] tab = new int[TAILLE_TABLEAU];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * (VALEUR_MAX + VALEUR_MIN - 1)) + 1;
            System.out.println("contenus du tableau [" + i + "] : [" + tab[i] + "] ");
        }
        int min = rechercheMin(tab);
        int max = rechercheMax(tab);

        System.out.println("le nombre le plus petit est " + min);
        System.out.println("le nombre le plus grande est " + max);

        int position = rechercheValeur(tab, VALEUR_RECHERCHEE);

        if (position != -1) {
            System.out.println(" le nombre " + VALEUR_RECHERCHEE + " ce trouve a la position " + position);
        } else {
            System.out.println("le nombre " + VALEUR_RECHERCHEE + " n'est pas dans le tableau ");
        }
    }

    public static void genereTableau(int entier1, int entier2, int entier3) {
        int[] tab = new int[TAILLE_TABLEAU];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * (VALEUR_MAX + VALEUR_MIN - 1)) + 1;
            System.out.println(tab[i]);
        }

    }

    public static int rechercheMin(int[] tab) {
        int min = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        return min;
    }

    public static int rechercheMax(int[] tab) {
        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }

        return max;
    }

    public static int rechercheValeur(int[] tab, int valeur) {
        for (int i = 0; i < tab.length; i++) {
            if (valeur == tab[i]) {
                return i;
            }
        }
        return -1;
    }
}
