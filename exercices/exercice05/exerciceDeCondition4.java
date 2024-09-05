package exercices.exercice05;

public class exerciceDeCondition4 {
    public static void main(String[] args) {

        int temperature = 25;

        if (temperature < -10) {
            System.out.println("il fait très froid ");

        }
        if (temperature >= -10 && temperature < 0) {
            System.out.println("il fait froid");

        }
        if (temperature >= 0 && temperature < 25) {
            System.out.println("il faut normal");

            if (temperature >= 25 && temperature < 35) {
                System.out.println("il fait chaud");

                if (temperature >= 35) {
                    System.out.println("il fait trés cahud");

                }

            }

        }
    }
}
