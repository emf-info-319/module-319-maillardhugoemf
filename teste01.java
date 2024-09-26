public class teste01 {
    public static void main(String[] args) {
        int age = 2;
        if (age >= 18 && age < 100) {
            System.out.println("je suis majeur");
        }
        if (age >= 100) {
            System.out.println("je suis un dinosaure");
        }
        if (age >= 200) {
            System.out.println("meme un super dinosaure");
        } else {
            System.out.println("je suis mineur");
        }            
        int equipe1 = (int) (Math.random() * (4 - 1)) + 0;
        int equipe2 = (int) (Math.random() * (4 - 1)) + 0;
        int equipe3 = (int) (Math.random() * (4 - 1)) + 0;
        int equipe4 = (int) (Math.random() * (4 - 1)) + 0;
        if (equipe1 < equipe2) {
            System.out.println(" equipe 1 est éliminer " + equipe1 + "  " + equipe2);
        }
        if (equipe2 < equipe1) {
            System.out.println("equipe2 est eliminer " + equipe1 + " " + equipe2);
        }
        else if (equipe2 == equipe1 ) {
        equipe1 = (int) (Math.random() * (5 - 1)) + 0;
        equipe2 = (int) (Math.random() * (5 - 1)) + 0;
        if (equipe1 < equipe2) {
            System.out.println(" equipe 1 est éliminer " + equipe1 + "  " + equipe2);
        }
        if (equipe1 < equipe2) {
            System.out.println(" equipe 1 est éliminer " + equipe1 + "  " + equipe2);
        }
        else
        {System.out.println("l'equipe 2 est éliminer " + equipe1 + " " + equipe2);}
    }
}
}
