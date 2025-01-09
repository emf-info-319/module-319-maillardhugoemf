public class chatgpt {
    public class BinaireEnDecimal {

        // Fonction pour convertir le binaire en décimal
        public static int binaireEnDecimal(String binaire) {
            int decimal = 0;
            int longueur = binaire.length();
    
            // On parcourt chaque caractère du nombre binaire
            for (int i = 0; i < longueur; i++) {
                // On récupère le caractère à la position i
                char bit = binaire.charAt(i);
                
                // Si le bit est 1, on l'ajoute à la somme des puissances de 2
                if (bit == '1') {
                    decimal += Math.pow(2, (longueur - 1 - i));
                }
            }
    
            return decimal;
        }
    
        public static void main(String[] args) {
            // Exemple d'utilisation
            String binaire = "11000011";
            int decimal = binaireEnDecimal(binaire);
            System.out.println("Le nombre binaire " + binaire + " en décimal est : " + decimal);
        }
    }
    
}
