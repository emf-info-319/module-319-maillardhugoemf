package exercices.exercice09;

public class exercice09p2 {
    public final static int MAX = 6;
    public final static int MIN = 1;

    public static void main(String[] args) {
        int[] monTableau = new int[10];

        for (int i = 0; i < monTableau.length; i++) {
            int nombreRamdom = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            monTableau[i] = nombreRamdom;
            System.out.println(monTableau[i]); 
            
        }
       
    }
}
