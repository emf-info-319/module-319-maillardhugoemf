import java.util.Base64;

public class Activity2 {

    public static final String PASSWORD = "YnJhdjA";
    public static final char[] CHARACTERS = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b',
            'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
            'x', 'y', 'z' };

    public static void main(String[] args) {
        /*
         * à faire : afficher le mot de passe trouvé avec un sout
         * Le mot de passe contient exactement 5 caractères du tableau CHARACTERS
         * Pour tester si un mot de passe est correct, il faut appeler la méthode
         * testPassword en lui donnant en paramètre le password à tester
         * Testez votre application en affichant un SOUT pour chaque password essayé et
         * retestez sans ce SOUT. Voyez vous une différence ?
         */
        
         for (int i = 0; i < CHARACTERS.length; i++) {
            for (int j = 0; j < CHARACTERS.length; j++) {
                for (int l = 0; l < CHARACTERS.length; l++) {
                    for (int k = 0; k < CHARACTERS.length; k++) {
                        for (int m = 0; m < CHARACTERS.length; m++) {

                            boolean test = testPassword(CHARACTERS[i] + "" + CHARACTERS[j] + "" + CHARACTERS[l] + "" + CHARACTERS[k] + "" +CHARACTERS[m]);
                            if (test) {
                                System.out.println(CHARACTERS[i] + "" + CHARACTERS[j] + "" + CHARACTERS[l] + "" + CHARACTERS[k] + "" +CHARACTERS[m]);
                            }
                           
                           
                        
                        
                        }
                    }
                }
            }
            System.out.println(CHARACTERS[i]);

           //boolean test = testPassword(CHARACTERS[i]);
           //if (test) {
            // System.out.println(CHARACTERS[j]);
          // }
        }

    }

    public static boolean testPassword(String passwordToTest) {
        boolean retour = false;
        byte[] decodedBytes = Base64.getDecoder().decode(PASSWORD);
        String decodedPwd = new String(decodedBytes);

        if (passwordToTest.equals(decodedPwd)) {
            retour = true;
        }

        return retour;
    }

}