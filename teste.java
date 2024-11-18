public class teste {
    public static int MAX = 5;
    public static int MIN = 0;

    public static void main(String[] args) {
        int equipe1 = (int) (Math.random() * (MAX + MIN - 1)) + 1;
        int equipe2 = (int) (Math.random() * (MAX + MIN - 1)) + 1;
        int equipe3 = (int) (Math.random() * (MAX + MIN - 1)) + 1;
        int equipe4 = (int) (Math.random() * (MAX + MIN - 1)) + 1;
        // System.out.println(equipe1 + " " + equipe2 + " " + equipe3+" " + equipe4);
        // premier quart
        if (equipe1 < equipe2) {
            System.out.println(" equipe 1 a perdu " + equipe1 + "a" + equipe2);
            int gagnant1 = (int) (Math.random() * (MAX + MIN - 1)) + 1;

        } else if (equipe1 > equipe2) {
            System.out.println(" equipe 2 a perdu " + equipe2 + "a" + equipe1);
            int gagnant1 = (int) (Math.random() * (MAX + MIN - 1)) + 1;
        }
        if (equipe3 < equipe4) {
            System.out.println(" equipe 3 a perdu " + equipe3 + "a" + equipe4);
            int gagnant2 = (int) (Math.random() * (MAX + MIN - 1)) + 1;

        } else if (equipe1 > equipe2) {
            System.out.println(" equipe 4 a perdu " + equipe4 + "a" + equipe3);
            int gagnant2 = (int) (Math.random() * (MAX + MIN - 1)) + 1;
        }
        if (gagnant1 < gagnant2) {
            
        }

        }
    }

