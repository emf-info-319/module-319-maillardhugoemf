import java.util.Scanner;
public class E2Chatgpt {
    

    // Déclaration des constantes
    public static final int PRIX_CATEGORIE_UN = 25;
    public static final int PRIX_CATEGORIE_DEUX = 18;
    public static final int PRIX_CATEGORIE_TROIS = 12;
    public static final int[] CATEGORIE_SALLE = {3, 3, 2, 2, 1, 1, 2, 2, 3, 3};

    // Méthode pour afficher les tarifs
    public static void afficherTarifs() {
        System.out.println("Catégorie 1 : " + PRIX_CATEGORIE_UN + " CHF");
        System.out.println("Catégorie 2 : " + PRIX_CATEGORIE_DEUX + " CHF");
        System.out.println("Catégorie 3 : " + PRIX_CATEGORIE_TROIS + " CHF");
    }

    // Méthode pour afficher l'état de la salle
    public static void afficherSalle(boolean[] occupationSalle) {
        System.out.println("Occupation de la salle :");
        
        // Affichage des catégories
        for (int i = 0; i < CATEGORIE_SALLE.length; i++) {
            System.out.print(CATEGORIE_SALLE[i] + " ");
        }
        System.out.println();

        // Affichage des places occupées ou libres
        for (boolean place : occupationSalle) {
            if (place) {
                System.out.print("O "); // Place occupée
            } else {
                System.out.print("X "); // Place libre
            }
        }
        System.out.println();
    }

    // Méthode pour trouver une place libre selon la catégorie
    public static int trouverPlace(int categorie, boolean[] occupationSalle) {
        for (int i = 0; i < CATEGORIE_SALLE.length; i++) {
            if (CATEGORIE_SALLE[i] == categorie && !occupationSalle[i]) {
                return i; // Retourne l'index de la place libre
            }
        }
        return -1; // Aucune place disponible pour la catégorie
    }

    // Méthode pour commander un billet
    public static boolean[] commanderBillet(boolean[] occupationSalle) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle catégorie voulez-vous : ");
        int categorie = scanner.nextInt();

        if (categorie == 1 || categorie == 2 || categorie == 3) {
            int positionPlace = trouverPlace(categorie, occupationSalle);
            if (positionPlace != -1) {
                occupationSalle[positionPlace] = true; // Place occupée
                int prix = (categorie == 1) ? PRIX_CATEGORIE_UN :
                           (categorie == 2) ? PRIX_CATEGORIE_DEUX : PRIX_CATEGORIE_TROIS;
                System.out.println("Votre place est réservée et coûte " + prix + " CHF");
            } else {
                System.out.println("Aucune place disponible");
            }
        } else {
            System.out.println("Cette catégorie n’existe pas");
        }
        return occupationSalle; // Retourne l'état mis à jour de l'occupation
    }

    // Méthode principale
    public static void main(String[] args) {
        boolean[] occupationSalle = new boolean[CATEGORIE_SALLE.length]; // Initialisation de la salle (toutes les places sont libres)
        int commande = -1;
        Scanner scanner = new Scanner(System.in);

        while (commande != 0) {
            // Affichage du menu
            System.out.println("--------------------------------------------------");
            System.out.println("1 = Commander un billet, 2 = Afficher les tarifs, 3 = Afficher l'état de la salle, 0 = Quitter");
            System.out.print("Quelle opération voulez-vous faire : ");
            commande = scanner.nextInt();

            switch (commande) {
                case 0:
                    System.out.println("Au revoir");
                    break;
                case 1:
                    occupationSalle = commanderBillet(occupationSalle); // Commander un billet
                    break;
                case 2:
                    afficherTarifs(); // Afficher les tarifs
                    break;
                case 3:
                    afficherSalle(occupationSalle); // Afficher l'état de la salle
                    break;
                default:
                    System.out.println("Commande inconnue");
            }
        }
    }
}

