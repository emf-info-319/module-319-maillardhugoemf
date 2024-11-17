import java.util.Random;

public class exLivretCG {
    

    public class TableMultiplication {
    
        // Déclaration des constantes MIN et MAX
        public static final int MIN = 5;
        public static final int MAX = 20;
    
        // Méthode pour choisir un nombre aléatoire entre MIN et MAX
        public static int choisirUnNombre() {
            Random rand = new Random();
            return rand.nextInt(MAX - MIN + 1) + MIN; // Retourne un nombre entre MIN et MAX
        }
    
        // Méthode pour construire la table de multiplication
        public static String[] construireTableMultiplication(int a, int b) {
            String[] table = new String[10]; // La table contiendra 10 lignes (de 1 à 10)
    
            for (int i = 0; i < 10; i++) {
                int multiplicateur = i + 1; // Multiplicateur allant de 1 à 10
                int resultat = a * multiplicateur; 
                // Formatage pour l'affichage, avec un alignement des chiffres
                table[i] = String.format("%2d x %2d = %3d", a, multiplicateur, resultat);
            }
    
            return table;
        }
    
        // Méthode principale
        public static void main(String[] args) {
            // Choisir deux nombres aléatoires entre MIN et MAX
            int nombre1 = choisirUnNombre();
            int nombre2 = choisirUnNombre();
    
            // Afficher les deux nombres choisis
            System.out.println("Les chiffres sont : " + nombre1 + " " + nombre2);
            
            // Construire la table de multiplication pour le premier nombre
            String[] table1 = construireTableMultiplication(nombre1, nombre2);
            // Afficher la table pour le premier nombre
            for (String ligne : table1) {
                System.out.println(ligne);
            }
    
            // Construire la table de multiplication pour le second nombre
            String[] table2 = construireTableMultiplication(nombre2, nombre1);
            // Afficher la table pour le second nombre
            for (String ligne : table2) {
                System.out.println(ligne);
            }
        }
    }
    
}
