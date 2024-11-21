package coachingMethode;

public class coaching {
    public static void main(String[] args) {
        int reponse = additionne(3, 8);
        int reponse2 = additionne(3, 3);
        System.out.println("la réponce est : " + reponse );
        System.out.println(" la 2eme reponce est : " + reponse2);//fait toute les opération
        String[] tabvide = new String[10];
        String[] tabrempli = remplisTableau(tabvide);
       for (int i = 0; i < tabvide.length; i++) {
        System.out.println(tabrempli[i]);
       }
    
    }

    public static int additionne(int nombre1, int nombre2) {// additionne 2 nombre
        int resultat = nombre1 + nombre2;

        return resultat;
    }

    public static String[] remplisTableau(String[] tab) {// remplis le tableau
        for (int i = 0; i < tab.length; i++) {
            tab[i] = "bonjour";
        }

        return tab;
    }
}
