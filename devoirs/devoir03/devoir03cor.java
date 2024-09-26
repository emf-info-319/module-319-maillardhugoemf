package devoirs.devoir03;

public class devoir03cor {
    public static void main(String[] args) {
       int jour = 24;
       int mois = 9;
       int annee = 2024;
       int resultat = 0;
       
       switch (mois) {
        case 1:
            resultat = jour;
            break;
       case 2:
       resultat = jour + 31;
            break;
        case 3:
            resultat = jour + 31 + 28;
            break;
        case 4:
            resultat = jour + 31 + 28 + 31;
            break;
        case 5:
                resultat = jour + 31 + 28 + 31 + 30;
            break;
        case 6:
                 resultat = jour + 31 + 28 + 31 + 30 + 31;
                 break;
        case 7:
                 resultat = jour + 31 + 28 + 31 + 30 + 31 + 30;
                 break;
        case 8:
                resultat = jour + 31 + 28 + 31 + 30 + 31 + 30 + 31;
                break;
        case 9:
                resultat = jour + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30;
                break;
        
       }
    }
}
