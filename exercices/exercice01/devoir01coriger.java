package exercices.exercice01;

public class devoir01coriger {
    public static void main(String[] args) {
        int monAge = 15;
        boolean estMajeur;
            System.out.println("je m'appelle hugo maillard et j'ai " + monAge + "ans");
            if (monAge <= 20 ) {
                estMajeur = true; 
            } else {
                estMajeur = false;
            }
            if (estMajeur) {
                System.out.println("je suis pas encore majeur");
            } else {
                System.out.println("je suis majeur");
            
                
            }
        }
}
