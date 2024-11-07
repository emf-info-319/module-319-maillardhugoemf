package corection;

public class corigerAvecIF {
    public final static int NOTE_MAX = 6;
    public final static int NOTE_MIN = 1;
    public final static int NBRE_NOTES = 5;

    public static void main(String[] args) {
        int[] notesObtenues = new int[NBRE_NOTES];
        for (int i = 0; i < notesObtenues.length; i++) {
            notesObtenues[i] = (int) (Math.random() * (NOTE_MAX + NOTE_MIN - 1)) + 1;
            if (notesObtenues[i] == 4) {
                System.out.println("la note obtenue est " + notesObtenues[i] + " : sufisant");
            }
            else if (notesObtenues[i] == 5) {
                System.out.println("la note obtenue est " + notesObtenues[i] + " : bien");
            }
            else if (notesObtenues[i] == 6) {
                System.out.println("la note obtenue est " + notesObtenues[i] + " : très bien");
            }
            else {
                System.out.println("la note obtenue est " + notesObtenues[i] + " : insufisant");
            }

        }
        ;
        int totalNote = 0;
        totalNote = notesObtenues[0] + notesObtenues[1] + notesObtenues[2] + notesObtenues[3] + notesObtenues[4];
        double moyenne = totalNote / NBRE_NOTES;
        System.out.println("la moyenne est de: " + moyenne);
        if (moyenne < 4) {
            System.out.println("l'eleve est non promu");
        } else {
            System.out.println("l'eleve est promus");
        }
    }
}
