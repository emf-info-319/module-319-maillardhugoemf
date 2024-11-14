package coachingMethode;

public class coaching {
    public static void main(String[] args) {
        int reponse = additionne(3, 8);

        System.out.println("la réponce est : " + reponse );
    
    }
    public static int additionne(int nombre1, int nombre2){
        int resultat = nombre1 + nombre2;
        return resultat;
    }
}
