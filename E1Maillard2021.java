
import java.util.Scanner;

public class E1Maillard2021 {

    public static final String[] BRANCHES = {"maths", "Français", "anglais"};

    public static void main(String[] args) {

    }

    public static String[] ajouterEleves(String[] eleves) {
        System.out.print("veillez saisir le nom d'un nel élèves");
        Scanner scanner = new Scanner(System.in);
        String nom = scanner.nextLine();
        String[] nouveauxEleves = new String[eleves.length + 1];
        nom = nouveauxEleves[nouveauxEleves.length - 1];
        return nouveauxEleves;
    }

    public static void afficherListEleves(String[] eleves) {
        System.out.println("voici la liste des élèves ");
        if (eleves.length == 0) {
            System.out.println("la liste des élèves est actuellement vide");
        }
    }

    public static int trouverEleves(String[] eleves) {
        System.out.print("veuilliez saisir le nom d'un Eleves : ");
        Scanner scanner = new Scanner(System.in);
        String nomRecherche = scanner.nextLine();
        int position = -1;
        for (int i = 0; i < eleves.length; i++) {
            if (eleves[i] == nomRecherche) {
                position = i;
            }
        }
        return position;

    }

    public static int[][] agrandirTableau(String[] eleves, int[][] notes) {
        int[][] nouveauxTableauNote = new int[][]{};
        for (int i = 0; i < nouveauxTableauNote.length; i++) {
            for (int j = 0; j < nouveauxTableauNote.length; j++) {
                notes[j][i] = nouveauxTableauNote[j][i];
            }
        }
        return nouveauxTableauNote;
    }

    public static void sasirNotesEleves(int positionEleves, int[][] Notes) {
        System.out.print("veillez saisir la note de maths");
        Scanner scanner = new Scanner(System.in);
    }

}
