
public class exerciceString01 {

    public static void main(String[] args) {
        String maCHaineDeCharacter = "voici du contenu stocké dans un sring";
        String mot = "contenu";
        int position = maCHaineDeCharacter.indexof(mot);
        if (position != -1) {
            System.out.print(" le mot " + maCHaineDeCharacter.substring(9, 16) + " se trouve a la position "+ maCHaineDeCharacter + " de character et "); 
        }
        System.out.print(" le mot " + maCHaineDeCharacter.substring(9, 16) + " se trouve a " + " de character et ");
        
        
        int nombreDeCharacter = maCHaineDeCharacter.length();
        System.out.println(" le nombre de chararter de ma chaine est de " + nombreDeCharacter);
    }
}é