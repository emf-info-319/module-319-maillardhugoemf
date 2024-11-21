

public class coaching {
    public static void main(String[] args) {
        int[] noteModule = new int[5];
        //noteModule[4] = 5;
        for (int i = 0; i < noteModule.length ; i++) {
             noteModule[i] =  (int) (Math.random() * (10 + 0 - 0)) + 0;// remplis avec un nombre aléatoir 
        }
        for (int i = 0 ; i < noteModule.length; i++) {
            System.out.println("note  "+ i +" : " + noteModule [i]); // permet d'affiche l'index du tableau
        }

        }
    }

