package exercices.exercice04;

public class EchangeValeur {
    public static void main(String[] args) {
        int variable1 = 1;
        int variable2 = 2;


        System.out.println("le contenu de la variable1 est "+variable1+" le contenu de la variable2 est"+ variable2 );

        int variable3 = variable1;
        variable1=variable2; //valeur1 = 2
        variable2=variable3; //valeur2 = 2
 
    
    System.out.println("le contenu de la variable1 est"+ variable1);
   System.out.println("le contenu de la variable2 est"+ variable2);
    System.out.println(".... traitement.... ");
    System.out.println("le contenus de la variable1 est"+ variable1);
    System.out.println("le contenus de la variable2 est"+ variable3);

}

}
