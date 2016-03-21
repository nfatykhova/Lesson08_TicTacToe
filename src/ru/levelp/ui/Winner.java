package ru.levelp.ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by natalie on 20.03.16.
 */
public class Winner {

    public void win() {

        JFrame winFrame = new JFrame("Winner");
        winFrame.setBounds(150, 150, 200, 200);
        winFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JLabel winLabel = new JLabel();
//        winLabel.setText(winner + "won");

        winFrame.add(BorderLayout.CENTER, winLabel);

        winFrame.setVisible(true);
    }

}
