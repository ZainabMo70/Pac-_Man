import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args)  {
        int rowCount =21;
        int columnCount= 19;
        int tileSize =32;
        int boardWidth = columnCount* tileSize;
        int boardHeight = rowCount*tileSize;

        JFrame frame =new JFrame("Pac Man");
        frame.setSize(boardWidth, boardHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        ImageIcon image =new ImageIcon("D:/College/OOP/pngegg (2).png");
        frame.setIconImage(image.getImage());
        PacMan pacman = new PacMan();
        frame.add(pacman);
        frame.pack();
        pacman.requestFocus();
        frame.setVisible(true);
    }
}