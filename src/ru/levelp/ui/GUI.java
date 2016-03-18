package ru.levelp.ui;

import ru.levelp.listeners.OnGameButtonClickListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by natalie on 18.03.16.
 */
public class GUI {

    public void start() {

        JFrame mainFrame = new JFrame("TicTacToe");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setBounds(100, 100, 300, 300);
        mainFrame.setMinimumSize(new Dimension(300, 300)); // Dimension хранит инфо о размере

        // JMenuBar, JMenu, JMenuItem

        JMenuBar menuBar = new JMenuBar();
        JMenu gameMenu = new JMenu("Game");
        JMenu settingsMenu = new JMenu("Settings");
        JMenuItem newGameMenuItem = new JMenuItem("New Game");
        JMenuItem quitMenuItem = new JMenuItem("Quit");
        JMenuItem viewSettingsMenuItem = new JMenuItem("Settings");
        JMenuItem rulesSettingsMenuItem = new JMenuItem("Rules");

  //      settingsMenu.setIcon(new ImageIcon("icons/ic_settings.jpeg")); - этот файл в папке package

        quitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        settingsMenu.add(viewSettingsMenuItem);
        settingsMenu.add(rulesSettingsMenuItem);

        gameMenu.add(newGameMenuItem);
        gameMenu.add(quitMenuItem);
        gameMenu.add(settingsMenu);
        menuBar.add(gameMenu);

        mainFrame.setJMenuBar(menuBar); // метод устанавливает bar, север остается свободным

        JPanel playgroundPanel = new JPanel(); // как окошко, frame, пустое хранилище
        playgroundPanel.setLayout(new GridLayout(3,3));

        JButton[] buttons = new JButton[9]; // делаем кнопки в массиве для удобства обработки
        OnGameButtonClickListener gameListener = new OnGameButtonClickListener();
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("");
            playgroundPanel.add(buttons[i]);
            buttons[i].addActionListener(gameListener);
        }

        JPanel footer = new JPanel(); // по умолчанию JPanel использует стиль FlowLayout
        JButton newGameBtn = new JButton("New Game");
        JButton exitBtn = new JButton("Quit");
        footer.add(newGameBtn);
        footer.add(exitBtn);

        mainFrame.add(BorderLayout.CENTER, playgroundPanel);
        mainFrame.add(BorderLayout.SOUTH, footer);

        mainFrame.setVisible(true);

    }
}
