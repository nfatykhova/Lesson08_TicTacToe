package ru.levelp.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by natalie on 18.03.16.
 */
public class OnGameButtonClickListener implements ActionListener {

    private boolean isX = true;

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton source = (JButton) e.getSource(); // возвращает источник события

        if (source.getText().isEmpty()) {
            if (isX) {
                source.setText("X");
            } else {
                source.setText("O");
            }
            isX = !isX; // инвертируем значение isX
        }

    }
}

//    три равны и хоть одна не пустая, проверить одну на Х/О
// передать ссылку на массив кнопок в онгеймкликлистенер