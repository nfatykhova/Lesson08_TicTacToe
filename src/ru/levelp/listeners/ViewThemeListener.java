package ru.levelp.listeners;

import ru.levelp.ui.ViewSettings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by natalie on 19.03.16.
 */
public class ViewThemeListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        new ViewSettings().view();

    }
}
