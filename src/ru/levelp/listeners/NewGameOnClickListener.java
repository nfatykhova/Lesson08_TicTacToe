package ru.levelp.listeners;

import ru.levelp.ui.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ru.levelp.ui.GUI;

/**
 * Created by natalie on 19.03.16.
 */
public class NewGameOnClickListener extends GUI implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setText("");
        }

    }
}
