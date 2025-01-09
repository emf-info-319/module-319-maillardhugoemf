import java.util.Scanner;

public class E1Maillard2021 {
    public static final String[] BRANCHES = {"maths", "Français", "anglais"};

    public static void main(String[] args) {
        
    }
    public static String[] ajouterEleves(String[] Eleves){
        System.out.print("veillez saisir le nom d'un nel élèves");
        Scanner scanner = new Scanner(System.in);
        String nom = scanner.nextLine();
        String[] nouveauxEleves = new String[Eleves.length + 1];
        nom = nouveauxEleves[nouveauxEleves.length - 1];
        return nouveauxEleves;
    }
    public static void afficherListEleves(String[] Eleves){
        System.out.println("voici la liste des élèves ");
        
    }


}
