import javax.print.DocFlavor.STRING;

public class tournoieHugoMaillard {
    public static String[] EQUIPE = new String[] { "FC Richemont", "FC Central", "FC Schonberg", "FC beauregard",
            " team AFF ", "etoile sport" };
            public static int MAX_GOAL = 10;
            public static int[] pointEquipe;
    public static void main(String[] args) {
        pointEquipe = new int[EQUIPE.length];
        for (int i = 0; i < args.length; i++) {
            simuleMatche(i, i);
            
        }
    }
    public static int simuleMatche(int imdiceEquipe, int indiceEquipeSuivante ){

        return 1;

    }
}
