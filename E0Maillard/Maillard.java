package E0Maillard;

public class Maillard {
    public final static int NOTE_MAX = 6;
    public final static int NOTE_MIN = 1;
    public final static int NBRE_NOTES = 5;
    public static void main(String[] args) {
        int[] notesObtenues = new int[NBRE_NOTES];
        notesObtenues[0] = (int) (Math.random() * (NOTE_MAX + NOTE_MIN - 3 + 1)) + 1;
        System.out.println(notesObtenues[0]);
    
    }
}
