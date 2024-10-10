package test;
public class maillardE00 {

    public final static int NOMBRE_PTS_VICTOIR = 3;

    public static void main(String[] args) {
        String nomEquipe1 = "madride";
        String nomEquipe2 = "barcelone";
        int nombrePointEquipe1 = 0;
        int nombrePointEquipe2 = 0;

        for (int i = 0; i <= 10; i++) {
            int scoreEquipe1 = (int) (Math.random() * (10 - 1)) + 0;
            int scoreEquipe2 = (int) (Math.random() * (10 - 1)) + 0;// nombre aléatoir entre 0 et 10
            System.out.println(nomEquipe1 + " joue contre " + nomEquipe2 + " le resultat est " + scoreEquipe1 + " a "
                    + scoreEquipe2);
            if (scoreEquipe1 > scoreEquipe2) {
                System.out.println(nomEquipe1 + " a gagner");
                nombrePointEquipe1 += NOMBRE_PTS_VICTOIR;// nombrePointEquipe1 + 3
            }
            if (scoreEquipe2 > scoreEquipe1) {
                System.out.println(nomEquipe2 + " a ganger");
                nombrePointEquipe2 += NOMBRE_PTS_VICTOIR;// nombrePointEquipe2 + 3
            }
            if (scoreEquipe1 == scoreEquipe2)
                System.out.println("matche nul");
            nombrePointEquipe1++;
            nombrePointEquipe2++;
        }
        System.out.println(nomEquipe1 + " a " + nombrePointEquipe1 + " point");
        System.out.println(nomEquipe2 + " a " + nombrePointEquipe2 + " point");
    }
}
