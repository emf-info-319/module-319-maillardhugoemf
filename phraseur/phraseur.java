package phraseur;

public class phraseur {
    public static void main(String[] args) {
        String[] sujet = new String[]{"le prof ", "mon voisin ", "le mec la ", "le tableau ","la personne la plus belle au monde ", "nolhan ", "victor", "le marain " };
        String[] verbe = new String[]{" joue "," casse ", " peint ", " mache " , " coure sur " , " part dans " ," frappe ", " frote "};
        String[] chose = new String[]{" la porte ", " nolhan ", " un jouet " , " le caleçon de ta mère ", " le phare ", " la maison ", " le pc ", " la cloche "};
        System.out.println(sujet[nombreAleatoire(0)]+verbe[nombreAleatoire(0) ] + chose[nombreAleatoire(0)]);
    }

    public static int nombreAleatoire(int nombre){
        nombre = (int) (Math.random() * (7 + 0 - 1)) + 1;
        return nombre;
    }
    //public static String choisimots(String mot ){
        
        
        //return
    //}
}
