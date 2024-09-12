package exercices.exercice08;

public class exercice8_1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Boucle for, itération" + i);
        }
        int nombre = 1;
        while (nombre <= 5) {
            System.out.println("Boucle while itération" + nombre);
            nombre++;
        }
        int nombre2 = 0;
        do {
            nombre2++;
            System.out.println("Boucle do-while, itération" + nombre2);
        } // le nombre2++ = a nombre + 1 jusqu'a nombre2= 5
        while (nombre2 < 5);

    }
}
