package corection;
public class evalcoriger02 {
    public final static int NOTE_MAX = 6;
    public final static int NOTE_MIN = 1;
    public final static int NBRE_NOTES = 5;

    public static void main(String[] args) {
        int[] notesObtenues = new int[NBRE_NOTES];
        int totalNote = 0;
        for (int i = 0; i < notesObtenues.length; i++) {
            notesObtenues[i] = (int) (Math.random() * (NOTE_MAX + NOTE_MIN - 1)) + 1;
            System.out.print("la note est " + notesObtenues[i]);
            switch (notesObtenues[i]) {
                case 4:
                    System.out.println(" : sufisant");
                    break;
                case 5:
                    System.out.println("  : bien");
                    break;
                case 6:
                    System.out.println(" : tres bien");
                    break;
                default:
                    System.out.println(" : insufisant");
                    break;
            }

        }
        
        for (int i = 0; i < notesObtenues.length; i++) {
            totalNote = totalNote + notesObtenues[i];
        }
        double moyenne = totalNote / NBRE_NOTES;
        System.out.println("la moyenne est de : " + moyenne);
        if (moyenne < 4) {
            System.out.println("l'eleve est non promu");
        } else {
            System.out.println("l'eleve est promus");
        }
    }
}
