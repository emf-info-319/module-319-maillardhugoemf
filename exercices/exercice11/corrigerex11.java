package exercices.exercice11;

public class corrigerex11 {
    public static final int MIN = 0;
    public static final int MAX = 100;

    public static void main(String[] args) {
        int[]tabInitial = new int[4];
        for (int i = 0; i < tabInitial.length; i++) {
            tabInitial[i] = (int) (Math.random() * (MIN + MAX - 1)) + 1;
        }
    System.out.println(" contenu du tabéeau initial");
    for (int i = 0; i < tabInitial.length; i++) {
        System.out.println("tableau Initial [" + i + " ] " + tabInitial[i] );

    }
    int[] tabfinal = inverseLeTableau(tabInitial);
    System.out.println("le contenu final est");
    for (int i = 0; i < tabfinal.length; i++) {
        System.out.println("tableau final [ " + i + " ] " + tabInitial[i]);
    }
}

public static int[] inverseLeTableau(int[] tab){
int[] inverseTableau = new int[tab.length];
for (int i = 0; i < tab.length; i++) {
    inverseTableau[i] = tab[tab.length - 1 - i];
}
return inverseTableau;
}

}
