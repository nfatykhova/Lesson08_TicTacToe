package ru.levelp.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by natalie on 19.03.16.
 */
public class ViewSettings extends GUI {

    public void view() {

        JFrame viewSettings = new JFrame("View Settings");
        viewSettings.setBounds(150, 150, 200, 200);
        viewSettings.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JLabel viewHeader = new JLabel("View Settings");
        JCheckBox viewTheme = new JCheckBox("Use dark theme");

        viewSettings.add(BorderLayout.NORTH, viewHeader);
        viewSettings.add(BorderLayout.CENTER, viewTheme);

        viewTheme.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                setDarkTheme();
            }
        });


        viewSettings.setVisible(true);
    }
}
