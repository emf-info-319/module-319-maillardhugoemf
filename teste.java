public class teste {
    public static int MAX = 5;
    public static int MIN = 0;

    public static void main(String[] args) {
        int equipe1 = (int) (Math.random() * (MAX + MIN - 1)) + 1;
        int equipe2 = (int) (Math.random() * (MAX + MIN - 1)) + 1;
        int equipe3 = (int) (Math.random() * (MAX + MIN - 1)) + 1;
        int equipe4 = (int) (Math.random() * (MAX + MIN - 1)) + 1;
        String equipe01 = "france ";
        String equipe02 = "allemagne";
        String equipe03 = "belgique";
        String equipe04 = "portual";
        int gagnant1 = (int) (Math.random() * (MAX + MIN - 1)) + 1;
        int gagnant2 = (int) (Math.random() * (MAX + MIN - 1)) + 1;


        // premier quart
        if (equipe1 == equipe2) {
            System.out.println("matche null");

        } else if (equipe4 == equipe3) {
            System.out.println("matche null");
        } else if (gagnant1 == gagnant2) {
            System.out.println("matche null");
        } else if (equipe1 < equipe2) {
            System.out.println(equipe01 + " a perdu " + equipe1 + "a" + equipe2);
            String gagnant01 = equipe02;
            System.out.println(equipe02 + " est le gagnant 1");
            if (equipe3 < equipe4) {
                System.out.println(equipe03 + " a perdu " + equipe3 + "a" + equipe4);
                System.out.println(equipe04 + " est le gagnant 2");
                String gagnant02 = equipe04;
                if (gagnant1 < gagnant2) {
                    System.out.println(gagnant02 + " est vainquer du tournois");
                } else if (gagnant1 > gagnant2) {
                    System.out.println(gagnant01 + " est vainquer du tournois");
                }

            } else if (equipe3 > equipe4) {
                System.out.println(equipe04 + " a perdu " + equipe4 + "a" + equipe3);
                System.out.println(equipe03 + " est le gagnant 2");
                String gagnant02 = equipe03;
                if (gagnant1 < gagnant2) {
                    System.out.println(gagnant02 + " est vainquer du tournois");
                } else if (gagnant1 > gagnant2) {
                    System.out.println(gagnant01 + " est vainquer du tournois");
                }
            }

        } else if (equipe1 > equipe2) {
            System.out.println(equipe02 + " a perdu " + equipe2 + "a" + equipe1);
            System.out.println(equipe01 + " est le gagnant 1");
            String gagnant01 = equipe01;
            if (equipe3 < equipe4) {
                System.out.println(equipe03 + " a perdu " + equipe3 + "a" + equipe4);
                System.out.println(equipe04 + " est le gagnant 2");
                String gagnant02 = equipe04;
                if (gagnant1 < gagnant2) {
                    System.out.println(gagnant02 + " est vainquer du tournois");
                    System.out.println(gagnant02 + " a gagné " + gagnant1 + " a " + gagnant2);
                } else if (gagnant1 > gagnant2) {
                    System.out.println(gagnant01 + " est vainquer du tournois");
                    System.out.println(gagnant01 + " a gagné " + gagnant2 + " a " + gagnant1);
                }

            } else if (equipe3 > equipe4) {
                System.out.println(equipe04 + " a perdu " + equipe4 + " a " + equipe3);
                System.out.println(equipe03 + " est le gagnant 2");
                String gagnant02 = equipe03;
                if (gagnant1 < gagnant2) {
                    System.out.println(gagnant02 + " est vainquer du tournois");
                    System.out.println(gagnant02 + " a gagné " + gagnant1 + " a " + gagnant2);
                } else if (gagnant1 > gagnant2) {
                    System.out.println(gagnant01 + " est vainquer du tournois");
                    System.out.println(gagnant01 + " a gagné " + gagnant2 + " a " + gagnant1);
                }
            }
        }

    }

}
