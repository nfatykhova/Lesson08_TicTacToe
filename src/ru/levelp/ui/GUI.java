package ru.levelp.ui;

import ru.levelp.customview.MyBtn;
import ru.levelp.listeners.MenuItemListener;
import ru.levelp.listeners.ExitOnClickListener;
import ru.levelp.listeners.NewGameOnClickListener;
import ru.levelp.listeners.OnGameButtonClickListener;

import javax.swing.*;
import java.awt.*;

/**
 * Created by natalie on 18.03.16.
 */

public class GUI {

    private static JFrame mainFrame;
    public static MyBtn[] buttons;

    public void start() {

        mainFrame = new JFrame("TicTacToe");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setBounds(100, 100, 300, 300);
        mainFrame.setMinimumSize(new Dimension(300, 300)); // Dimension хранит инфо о размере

        setLightTheme();

        // JMenuBar, JMenu, JMenuItem

        JMenuBar menuBar = new JMenuBar();
        JMenu gameMenu = new JMenu("Game");
        JMenu settingsMenu = new JMenu("Settings");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem newGameMenuItem = new JMenuItem("New Game");
        NewGameOnClickListener newGameListener = new NewGameOnClickListener();
        newGameMenuItem.addActionListener(newGameListener);

        JMenuItem quitMenuItem = new JMenuItem("Quit");
        ExitOnClickListener exitListener = new ExitOnClickListener();
        quitMenuItem.addActionListener(exitListener);

        JMenuItem viewSettingsMenuItem = new JMenuItem("View settings");
        MenuItemListener itemListener = new MenuItemListener();
        viewSettingsMenuItem.addActionListener(itemListener);

        JMenuItem rulesSettingsMenuItem = new JMenuItem("Rules");

        JMenuItem aboutHelpMenuItem = new JMenuItem("About");
        aboutHelpMenuItem.addActionListener(itemListener);

        settingsMenu.add(viewSettingsMenuItem);
        settingsMenu.add(rulesSettingsMenuItem);

        gameMenu.add(newGameMenuItem);
        gameMenu.add(settingsMenu);
        gameMenu.add(quitMenuItem);

        helpMenu.add(aboutHelpMenuItem);

        menuBar.add(gameMenu);
        menuBar.add(helpMenu);

        mainFrame.setJMenuBar(menuBar); // метод устанавливает bar, север остается свободным

        JPanel playgroundPanel = new JPanel(); // как окошко, frame, пустое хранилище
        playgroundPanel.setLayout(new GridLayout(3,3));

        buttons = new MyBtn[9]; // делаем кнопки в массиве для удобства обработки
        OnGameButtonClickListener gameListener = new OnGameButtonClickListener();
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new MyBtn("");
            playgroundPanel.add(buttons[i]);
            buttons[i].addActionListener(gameListener);
        }

        JPanel footer = new JPanel(); // по умолчанию JPanel использует стиль FlowLayout
        MyBtn newGameBtn = new MyBtn("New Game");
        newGameBtn.addActionListener(newGameListener);

        MyBtn exitBtn = new MyBtn("Quit");
        exitBtn.addActionListener(exitListener);

        footer.add(newGameBtn);
        footer.add(exitBtn);

        mainFrame.add(BorderLayout.CENTER, playgroundPanel);
        mainFrame.add(BorderLayout.SOUTH, footer);

        mainFrame.setVisible(true);

    }

    public void setDarkTheme() {

        MyBtn.

    }

    public void setLightTheme() {

        mainFrame.setFont(new Font("Arial", Font.PLAIN, 14));
        mainFrame.setForeground(Color.BLACK);
        mainFrame.setBackground(Color.LIGHT_GRAY);

    }
}
