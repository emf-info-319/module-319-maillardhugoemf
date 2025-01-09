import java.util.Scanner;
public class testeJeuDeLaVie {
  
public class GameOfLife {
    private static final int ROWS = 20;  // Nombre de lignes
    private static final int COLS = 20;  // Nombre de colonnes
    private boolean[][] grid = new boolean[ROWS][COLS];

    // Méthode pour afficher la grille
    public void printGrid() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (grid[i][j]) {
                    System.out.print("O "); // Cellule vivante
                } else {
                    System.out.print(". "); // Cellule morte
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Méthode pour initialiser la grille avec des cellules vivantes
    public void initializeGrid() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Initialisez la grille avec des cellules vivantes (0 pour morte, 1 pour vivante) : ");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                grid[i][j] = scanner.nextInt() == 1;
            }
        }
    }

    // Méthode pour calculer le nombre de voisins vivants d'une cellule
    private int countNeighbors(int row, int col) {
        int neighbors = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;
                int r = row + i;
                int c = col + j;
                if (r >= 0 && r < ROWS && c >= 0 && c < COLS && grid[r][c]) {
                    neighbors++;
                }
            }
        }
        return neighbors;
    }

    // Méthode pour appliquer les règles du jeu de la vie
    public void nextGeneration() {
        boolean[][] newGrid = new boolean[ROWS][COLS];

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                int neighbors = countNeighbors(i, j);

                // Règle 1: Toute cellule vivante avec moins de deux voisins meurt
                // (sous-population).
                // Règle 2: Toute cellule vivante avec plus de trois voisins meurt
                // (sur-population).
                // Règle 3: Toute cellule morte avec exactement trois voisins devient vivante
                // (reproduction).
                if (grid[i][j] && (neighbors == 2 || neighbors == 3)) {
                    newGrid[i][j] = true;  // Cellule vivante continue à vivre
                } else if (!grid[i][j] && neighbors == 3) {
                    newGrid[i][j] = true;  // Cellule morte devient vivante
                } else {
                    newGrid[i][j] = false; // Cellule reste morte
                }
            }
        }

        grid = newGrid; // Met à jour la grille avec la nouvelle génération
    }

    public static void main(String[] args) {
        GameOfLife game = new GameOfLife();
        game.initializeGrid();

        while (true) {
            game.printGrid();
            game.nextGeneration();
            try {
                Thread.sleep(500); // Pause de 0.5 seconde entre chaque génération
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

}
