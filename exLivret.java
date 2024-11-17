public class exLivret {
    public static int MIN = 5;
    public static int MAX = 10;

    public static void main(String[] args) {
        int nombre1 = choisirUnNombre(MAX, MIN);
        int nombre2 = choisirUnNombre(MAX, MIN);
       String[] multiplication = construirTableMultiple(MIN, MAX);
        System.out.println("les chifre sont : " + MIN + " et " + MAX) ;
       for (int i = 0; i < multiplication.length; i++) {
            System.out.println(multiplication[i]);
        }
        
    }

    public static int choisirUnNombre(int nMaximal, int nMinimal) {
        int nombreAleatoire = (int) (Math.random() * (nMaximal + nMinimal - 1)) + nMinimal;
        return nombreAleatoire;
    }

    public static String[] construirTableMultiple(int entier1, int entier2) {
        String[] tab = new String[entier1 * entier2];
        int a = 1;
        int b = 1;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = a + " x " + b + " = " + a*b;
        }
        b++;
        if (b == entier2 + 1) {
            b = 1;
            a++;
        }
        return tab;

    }
}
