package ru.mirea.lab8_2;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ImageWindow {
    public static void main(String[] args) {
        String imagePath = "C:\\Users\\katey\\OneDrive\\Изображения\\Saved Pictures\\wImsHEmlbKM.jpg"; // Укажите путь к вашему изображению здесь

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Image Viewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            try {
                BufferedImage image = ImageIO.read(new File(imagePath));
                JLabel label = new JLabel(new ImageIcon(image));

                JScrollPane scrollPane = new JScrollPane(label);
                frame.add(scrollPane);
                frame.pack(); // Автоматически настраивает размер окна на размеры изображения
                frame.setVisible(true);
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Error loading image: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}


