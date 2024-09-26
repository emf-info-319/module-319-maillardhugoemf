package devoirs.devoir03;

public class devoircor {
    public static void main(String[] args) {
        int jour = 20;
        int mois = 2;
        int annee = 2024;
        int[] jourMois;
        jourMois = new int[] { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };
        int jourtotal = 0;
        if (annee % 4 == 0 || annee % 400 == 0) {
            jourMois[1] = 29;
        }
        for (int i = 0; i < mois - 1; i++) {
            jourtotal = jourtotal + jourMois[i];
        }
        jourtotal = jourtotal + jour;
        System.out.println("le " + jour + "/" + mois + "/" + annee + " est le jour " + jourtotal + " de l'an");
    }
}
