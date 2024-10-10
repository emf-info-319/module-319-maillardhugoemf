package exercices.exercice12;

public class exercicesString {
    public static void main(String[] args) {
        String maCHaineDeCharacter = "voici du contenu stocké dans un sring";
        String mot = "contenu";
        int position = maCHaineDeCharacter.indexof(mot);
        System.out.print(" le mot " + maCHaineDeCharacter.substring(9, 16) + " se trouve a " + " de character et ");
        int nombreDeCharacter = maCHaineDeCharacter.length();
        System.out.println(" le nombre de chararter de ma chaine est de " + nombreDeCharacter);
        
    }
}
