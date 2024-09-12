package exercices.exercice08;

public class ExerciceBoucle2 {
    public static void main(String[] args) {
        System.out.println("Boucle for ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("" + i );
        }
        System.out.println("décollage!!!");
        // boolean condition = true;
        int nombre = 1;
        System.out.println("Boucle while,");
        while (nombre <= 5) {
            System.out.println("" + nombre);
            nombre++;
        }
        System.out.println("décollage!!!");
        int nombre2 = 0;
        System.out.println("Boucle do-while, itération" );
        do {
            nombre2++;
            System.out.println("" + nombre2);
        } // le nombre2++ = a nombre + 1 jusqu'a nombre2= 5
        while (nombre2 < 5);
        System.out.println("décollage!!!");
    }
}