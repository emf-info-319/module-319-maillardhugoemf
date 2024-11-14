package exercices.exercice11;

public class exerciceInvercionTableau {
  public static final int MIN = 0;
  public static final int MAX = 100;
    public static void main(String[] args) {
      afficheNombre(4);
      int[] tabRetourne;
      inverseLeTableau(tabRetourne);
    }

    public static int[] inverseLeTableau (int[] tab){
      int tableauinverse = new int[tab.length];   
       for (int i = 0; i < tab.length; i++) {
        tableauinverse[i] = 
       } 
        return tab;
    }


    public static void afficheNombre(int nombre){
      System.out.println(nombre);
    }

}
