package devoirs.devoir02;

public class devoir2 {
    public final static double CAPACITE_RSERVOIR_A = 3;
    public final static double CAPACITE_RSERVOIR_B = 5;

    public static void main(String[] args) {
        int reservoirA = 0;
        int reservoirB = 0;
        int remplissage = (int) (Math.random() * (8 - 3 + 1)) + 3;
        System.out.println("" + remplissage);
        while (reservoirA < 3) {
            reservoirA++;
            remplissage--;
            System.out.println("reservoirA : " + reservoirA);
            System.out.println("remplissage : " + remplissage);
        }
        while (reservoirB < 5) {
            if (remplissage == 0) {
            } else {
                reservoirB++;
                remplissage--;
                System.out.println("reservoirB : " + reservoirB);
                System.out.println("remplissage : " + remplissage);
            }
        }
        System.out.println("reservoirA a " + reservoirA + " litre et le reservoirB a " + reservoirB
                + " litre. le remplissage est a " + remplissage + "litre");
    }
}
