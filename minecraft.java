import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
public class minecraft {


public class Minecraft2DClone extends JPanel implements KeyListener, MouseListener {

    private final int TILE_SIZE = 30; // Taille d'un bloc
    private final int WIDTH = 800, HEIGHT = 600;
    private final List<Rectangle> blocks; // Liste des blocs placés
    private int playerX, playerY;
    private boolean left, right, down, up;

    public Minecraft2DClone() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.CYAN);
        this.setFocusable(true);
        this.addKeyListener(this);
        this.addMouseListener(this);
        blocks = new ArrayList<>();
        playerX = WIDTH / 2;
        playerY = HEIGHT - TILE_SIZE - 10; // Position initiale du joueur
    }

    // Méthode de mise à jour
    public void updateGame() {
        if (left) playerX -= TILE_SIZE;
        if (right) playerX += TILE_SIZE;
        if (up) playerY -= TILE_SIZE;
        if (down) playerY += TILE_SIZE;

        // Limiter le joueur à la fenêtre
        playerX = Math.max(0, Math.min(playerX, WIDTH - TILE_SIZE));
        playerY = Math.max(0, Math.min(playerY, HEIGHT - TILE_SIZE));

        repaint(); // Redessiner la scène
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.fillRect(playerX, playerY, TILE_SIZE, TILE_SIZE); // Dessiner le joueur (un carré)

        // Dessiner tous les blocs
        for (Rectangle block : blocks) {
            g.setColor(Color.BROWN);
            g.fillRect(block.x, block.y, TILE_SIZE, TILE_SIZE);
        }
    }

    // Gestion des entrées clavier
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT: left = true; break;
            case KeyEvent.VK_RIGHT: right = true; break;
            case KeyEvent.VK_UP: up = true; break;
            case KeyEvent.VK_DOWN: down = true; break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT: left = false; break;
            case KeyEvent.VK_RIGHT: right = false; break;
            case KeyEvent.VK_UP: up = false; break;
            case KeyEvent.VK_DOWN: down = false; break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    // Gestion des clics pour ajouter des blocs
    @Override
    public void mousePressed(MouseEvent e) {
        int mouseX = e.getX();
        int mouseY = e.getY();
        // Ajouter un bloc à la position du curseur
        blocks.add(new Rectangle((mouseX / TILE_SIZE) * TILE_SIZE, (mouseY / TILE_SIZE) * TILE_SIZE, TILE_SIZE, TILE_SIZE));
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}

    // Méthode main pour exécuter l'application
    public static void main(String[] args) {
        JFrame frame = new JFrame("Minecraft 2D Clone");
        Minecraft2DClone gamePanel = new Minecraft2DClone();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gamePanel);
        frame.pack();
        frame.setVisible(true);

        // Boucle de jeu
        while (true) {
            gamePanel.updateGame();
            try {
                Thread.sleep(16); // 60 FPS
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

}
