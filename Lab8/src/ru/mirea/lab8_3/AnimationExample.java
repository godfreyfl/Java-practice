package ru.mirea.lab8_3;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.JFrame;

public class AnimationExample {
    public static void main(String[] args) {
        // Указываем путь к файлу изначально
        String filePath = "C:\\Users\\katey\\IdeaProjects\\Lab8\\src\\ru\\mirea\\frame1.png";

        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("Файл не найден");
            return;
        }

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage(filePath);
        Dimension screenSize = toolkit.getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        JFrame frame = new JFrame();
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        Graphics g = frame.getGraphics();

        int x = 0;
        int y = 0;
        int frameWidth = 1000;
        int frameHeight = 1000;

        int framesCount = 3;
        int currentFrame = 0;

        while (true) {
            g.clearRect(0, 0, width, height);

            g.drawImage(image, x, y, x + frameWidth, y + frameHeight,
                    currentFrame * frameWidth, 0,
                    currentFrame * frameWidth + frameWidth, frameHeight, null);

            currentFrame++;

            if (currentFrame == framesCount) {
                currentFrame = 0;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
