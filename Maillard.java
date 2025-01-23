import java.util.Scanner;

public class Maillard {
    public final static int TALLIE_PLATEAU = 20;
    public final static char CASE_VIDE = '-';
    public final static char CASE_REJOUER = 'R'; // RECULER
    public final static char CASE_RECULER = 'B'; // BACK
    public final static char CASE_AVANCER = 'A';
    public final static char CASE_DEPART = 'D';
    public final static char CASE_FIN = 'F';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] plateau = initialiserPlateau();
        int positionJoueur = 0;
        boolean jeuTermine = false;
        int nombreDeLance = 0;
        System.out.println("bienvenu au jeu de l'oie");
        afficherTableau(plateau, positionJoueur);
        System.out.println();

        while (jeuTermine == false) {
            System.out.println("apuyez sur enter pour lancer le dé...");
            scanner.nextLine();
            int de = lanceDe();
            nombreDeLance = nombreDeLance + 1;
            System.out.println("vous avez obtenu " + de);
            positionJoueur = deplacerJoueur(positionJoueur, de, plateau);
            positionJoueur = appliquerEffetCase(plateau, positionJoueur);
            afficherTableau(plateau, positionJoueur);
            if(positionJoueur >= plateau.length){
                positionJoueur = plateau.length;
            }
            System.out.println("position " + positionJoueur);
            if (positionJoueur == plateau.length) {
                System.out.println(
                        "félicitation, vous avez atteint la case finalet gagné le jeu en " + nombreDeLance + " coup");
                jeuTermine = true;
            }
        }
        // le nombre de positionjoueur sort du tableau et je n'arrive pas a faire en sorte que lorsque qu'il sort du tavleau a le remettre dedans en faisant un .length
    }

    public static char[] initialiserPlateau() {
        char[] plateau = new char[TALLIE_PLATEAU];
        plateau[0] = CASE_DEPART;
        plateau[TALLIE_PLATEAU - 1] = CASE_FIN;
        for (int i = 1; i < plateau.length - 1; i++) {
            int nbre = (int) (Math.random() * (4 - 0)) + 0;
            if (nbre <= 1) {
                plateau[i] = CASE_VIDE;
                // System.out.print(nbre + " ");
            }
            if (nbre == 2) {
                plateau[i] = CASE_AVANCER;
                // System.out.print(nbre + " ");
            }
            if (nbre == 3) {
                plateau[i] = CASE_REJOUER;
                // System.out.print(nbre + " ");
            }
            if (nbre == 4) {
                plateau[i] = CASE_RECULER;
                // System.out.print(nbre + " ");
            }
        }
        return plateau;
    }

    public static void afficherTableau(char[] plateau, int positionJoueur) {
        System.out.print("|");
        for (int i = 0; i < plateau.length; i++) {
            if (i == positionJoueur) {
                System.out.print("P");
            } else {
                System.out.print(plateau[i]);
            }
            System.out.print("|");

        }

    }

    public static int lanceDe() {
        int de = (int) (Math.random() * (6 - 1));
        return de;
    }

    public static int deplacerJoueur(int positionActuelle, int nombreDe, char[] plateau) {
        int nouvelPosition = positionActuelle + nombreDe;
        if (nouvelPosition > plateau.length) {
            nouvelPosition = plateau.length;

        }
        return nouvelPosition;
    }

    public static int appliquerEffetCase(char[] plateau, int positionJoueur) {
        Scanner scanner = new Scanner(System.in);
        if (plateau[positionJoueur] == CASE_REJOUER) {
            System.out.println("case rejouer : vous relancez le dé imédiatement");
            afficherTableau(plateau, positionJoueur);
            int de = lanceDe();
            scanner.nextLine();
            System.out.println("vous avez obtenu " + de);
            positionJoueur = deplacerJoueur(positionJoueur, de, plateau);
        } else if (plateau[positionJoueur] == CASE_RECULER) {
            positionJoueur = positionJoueur - 3;
            if (positionJoueur < 0) {
                positionJoueur = 0;
            }
            System.out.println("case reculer : vous reculer de 3 case. nouvelle posituion " + positionJoueur);
        } else if (plateau[positionJoueur] == CASE_AVANCER) {
            positionJoueur = positionJoueur + 2;
            System.out.println("case avancer : vous avancer de 2 case. nouvelle position " + positionJoueur);
        } else if (plateau[positionJoueur] == CASE_VIDE) {
            System.out.println("case normale ");
        }

        return positionJoueur;
    }
}
