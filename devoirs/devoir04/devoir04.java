package devoirs.devoir04;

public class devoir04 {
    public static void main(String[] args) {
        int year = 2024;
        int month = 13;
        int day = 30;
        
        if (month == 1) {
            if (day > 31) {
                System.out.println("erreur");
            }
            System.out.println("nous sommes le " + day + " janvier " + year);
        }
        if (month == 2 ) {
            if (year % 4 == 4) {
                System.out.println();
                
            }
                
            }
            
        
        if (month == 3) {
            if (day > 31) {
                System.out.println("erreur");
            }
            System.out.println("nous sommes le " + day + " mars " + year);
        }
        if (month == 4) {
            if (day > 30) {
                System.out.println("erreur");
            }
            System.out.println("nous sommes le " + day + " avril " + year);
        }
        if (month == 5) {
            if (day > 31) {
                System.out.println("erreur");
            }
            System.out.println("nous sommes le " + day + " mai " + year);
        }
        if (month == 6) {
            if (day > 30) {
                System.out.println("erreur");
            }
            System.out.println("nous sommes le " + day + " juin " + year);

        }
        if (month == 7) {
            if (day > 31) {
                System.out.println("erreur");
            }
            System.out.println("nous sommes le " + day + " juillet " + year);
        }
        if (month == 8) {
            if (day > 30) {
                System.out.println("erreur");
            }
            System.out.println("nous sommes le " + day + " aout " + year);
        }
        if (month == 9) {
            if (day > 31) {
                System.out.println("erreur");
            }
            System.out.println("nous sommes le " + day + " sptembre " + year);

        }
        if (month == 10) {
            if (day > 30) {
                System.out.println("erreur");
            }
            System.out.println("nous sommes le " + day + " octobre " + year);

        }
        if (month == 11) {
            if (day > 31) {
                System.out.println("erreur");
            }
            System.out.println("nous sommes le " + day + " novembre " + year);

        }
        if (month == 12) {
            if (day > 31) {
                System.out.println("erreur");
            }
            System.out.println("nous sommes le " + day + " decembre " + year);
        }
        if (month > 12) {
            System.out.println("erreur");
            
        }
    }
}
