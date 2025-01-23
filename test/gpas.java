
public class gpas {

    public static void main(String[] args) {
        int[] tab1 = new int[10];
        for (int i = 0; i < tab1.length - 1; i++) {
            tab1[i] = (int) (Math.random() * (10 + 0 - 0)) + 0;
            tab1[9] = tab1[9] + tab1[i];
            System.out.println("i = " + tab1[i] + " et l'addition de tous le nombre = " + tab1[9]);
        }
    }
}
