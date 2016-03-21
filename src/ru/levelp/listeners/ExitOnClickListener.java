package ru.levelp.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by natalie on 19.03.16.
 */
public class ExitOnClickListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
