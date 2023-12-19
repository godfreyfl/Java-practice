package ru.mirea.lab8_1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapesWindow extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int NUM_SHAPES = 20;

    private Shape[] shapes;

    public RandomShapesWindow() {
        shapes = new Shape[NUM_SHAPES];
        Random rand = new Random();

        for (int i = 0; i < NUM_SHAPES; i++) {
            int x = rand.nextInt(WIDTH);
            int y = rand.nextInt(HEIGHT);
            int width = rand.nextInt(50) + 20;
            int height = rand.nextInt(50) + 20;
            int radius = rand.nextInt(40) + 10;
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));

            if (rand.nextBoolean()) {
                shapes[i] = new Rectangle(color, x, y, width, height);
            } else {
                shapes[i] = new Circle(color, x, y, radius);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Random Shapes Window");
            RandomShapesWindow panel = new RandomShapesWindow();
            frame.add(panel);
            frame.setSize(WIDTH, HEIGHT);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}