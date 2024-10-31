import java.util.Scanner;

public class IntroMethode {

    public static void main(String[] args) {
        intro();

        int guess1 = demandenombre();// le nombre sera prix dans la méthode demande nombre
        int guess2 = demandenombre();
        int guess3 = demandenombre();

        int totalResultat = somme(guess1, guess1, guess3);// les nombre aditionner dans la méthode somme
        System.out.println("la somme est " + totalResultat);// sont repris pour le résultat final

        finProgram();
    }

    public static void intro() {
        System.out.println("Bonjour et bienvenu sur ce premier programme.");
        System.out.println("On va voir les méthode dans ce cours.f");

    }

    public static int demandenombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer un nombre >");
        int nombre = scanner.nextInt();
        System.out.println("nombr enregistrer est " + nombre);
        return nombre;
    }

    public static void finProgram() {
        System.out.println("programe terminez");

    }

    public static int somme(int chiffre1, int chiffre2, int chiffre3) {
        int resultat = chiffre1 + chiffre2 + chiffre3;
        return resultat;// les parremètre vont prendre la place des guess1 2 et 3 puis le calcul vas
                        // etre éfuctuer

    }

}
