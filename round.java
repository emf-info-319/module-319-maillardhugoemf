public class round {

    public static double PI = 3.14159265;

    public static void main(String[] args) {
        int[] rayon = new int[10];
        for (int i = 0; i < rayon.length; i++) {
            int min = 1;
            int max = 10;
            rayon[i] = genrNombre(min, max);
            System.out.println(rayon[i]);
        }
        for (int i = rayon.length-1; i >= 0; i --) {

        }
        if (rayon[i] > 50) {
            System.out.println("air = " + PI *rayon[i]*rayon[i]);
            
        }

        }

        }
    

    public static int genrNombre(int min, int max) {
        int nombre = (int) (Math.random() * (min + max - 1)) + min;
        return nombre;
    }
