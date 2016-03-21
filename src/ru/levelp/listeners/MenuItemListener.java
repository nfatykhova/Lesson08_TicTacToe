package ru.levelp.listeners;

import ru.levelp.ui.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ru.levelp.ui.About;
import ru.levelp.ui.ViewSettings;

/**
 * Created by natalie on 19.03.16.
 */
public class MenuItemListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        JMenuItem source = (JMenuItem) e.getSource();

        if (source.getText().equals("About")) new About().about();
        if (source.getText().equals("View settings")) new ViewSettings().view();

    }
}
