import java.util.Scanner;
public class E2Maillard {
    
    public static final int PRIX_CATEGORIE_UN = 25;
    public static final int PRIX_CATEGORIE_DEUX = 18;
    public static final int PRIX_CATEGORIE_TROIS = 12;
    public static final int[] CATEGORIE_SALLE = new int[]{3 ,3 ,2 ,2 ,1 ,1 ,2 ,2 ,3 ,3} ;

    public static void main(String[] args) {
    boolean[] occupationSalle = new boolean[CATEGORIE_SALLE.length];
    int commande = -1;
    while(commande != 0 ){
        System.out.println("----------------------------------------------------");
        System.out.println("1 = commander un billet, 2 = afficher les tarif, 3 = afficher l'ettat de la salle, 0 = quitter ");
        
        System.out.print("quelle opération voulez vous faire : ");
        Scanner scanner = new Scanner(System.in);
        commande = scanner.nextInt(); 

        switch (commande){
            
            case 0:
            System.out.println("au revoir");
            break;

            case 1:
            CommanderBillet(occupationSalle);
            break;

            case 2: 
            afficherTarif();
            break;

            case 3: 
            afficherSalle(occupationSalle);
            break;

            default:
            System.out.println("commande inconue");
            break;
        }

        
    }


    }
    public static void afficherTarif(){
        System.out.println("catégorie 1 : " + PRIX_CATEGORIE_UN + " CHF " );
        System.out.println("catégorie 2 : " + PRIX_CATEGORIE_DEUX + " CHF ");
        System.out.println("catégorie 3 : " + PRIX_CATEGORIE_TROIS + " CHF ");
    // la methode vas afficher les trois tarrife mais sur des ligne différente  
    }
    public static void afficherSalle(boolean[] ocupationSalle ){
        System.out.println("ocupation de la salle ");
        for (int i = 0; i < CATEGORIE_SALLE.length; i++) {
            System.out.print(CATEGORIE_SALLE[i] + " ");
        }
        System.out.println();
        for(boolean place : ocupationSalle){
            if (place) {
                System.out.print("O "); // Place occupée
            } else {
                System.out.print("X "); // Place libre
            }
        }    
        System.out.println();
    }
    public static int trouverPlace(int categorie, boolean[] occupationSalle){
        for (int i = 0; i < CATEGORIE_SALLE.length; i++) {
            if(CATEGORIE_SALLE[i] == categorie && !occupationSalle[i]) {
                return i;// si la place est libre
            }
        }
        return -1;// si la place est occupé
    }
    public static boolean[] CommanderBillet(boolean[] occupationSalle){
        System.out.print("quelle categorie voulez vous : ");
        Scanner scanner = new Scanner(System.in); 
        int categorie = scanner.nextInt();
        if(categorie >= 1 && categorie <= 3){
            int positionPlace = trouverPlace(categorie, occupationSalle);
            if(positionPlace != -1 ){
                occupationSalle[positionPlace] = true;
                int prix;
                if (categorie == 1 ){
                    prix = PRIX_CATEGORIE_UN;    
                }
                else if(categorie == 2 ){
                    prix = PRIX_CATEGORIE_DEUX;
                }
                else{
                    prix = PRIX_CATEGORIE_TROIS;
                }
                System.out.println("votre place réservé coute " + prix + " CHF ");
            }
            else{
                System.out.println("aucune place est disponible");
            }
        }
        else{
            System.out.println("cette cetégorie n'existe pas");
        }
        return occupationSalle;
    }

}

