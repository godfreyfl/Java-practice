package ru.mirea.lab7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatchApp {
    // Переменные для хранения счета Милана и Мадрида
    private int milanScore = 0;
    private int madridScore = 0;

    // GUI-компоненты, которые будут обновляться
    private JLabel resultLabel;      // Надпись для отображения счета
    private JLabel lastScorerLabel;  // Надпись для отображения последнего забившего
    private JLabel winnerLabel;      // Надпись для отображения победителя

    public FootballMatchApp() {
        // Создаем главное окно приложения
        JFrame frame = new JFrame("Football Match");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Устанавливаем действие при закрытии окна
        frame.setSize(600, 400); // Устанавливаем размер окна

        // Создаем панель для размещения компонентов
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1)); // Используем GridLayout для компоновки компонентов

        // Создаем кнопки для Милана и Мадрида
        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        // Создаем и инициализируем надписи
        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: ---");

        // Добавляем обработчики событий для кнопок
        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++; // Увеличиваем счет Милана
                updateLabels("AC Milan"); // Обновляем надписи
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++; // Увеличиваем счет Мадрида
                updateLabels("Real Madrid"); // Обновляем надписи
            }
        });

        // Добавляем компоненты на панель
        panel.add(milanButton);
        panel.add(madridButton);
        panel.add(resultLabel);
        panel.add(lastScorerLabel);
        panel.add(winnerLabel);

        // Добавляем панель на главное окно
        frame.add(panel);

        // Отображаем окно
        frame.setVisible(true);
    }

    // Метод для обновления надписей
    private void updateLabels(String lastScorer) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);

        // Определяем победителя и обновляем надпись
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: ---");
        }
    }

    // Метод main для запуска приложения
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FootballMatchApp(); // Создаем и запускаем приложение
            }
        });
    }
}


