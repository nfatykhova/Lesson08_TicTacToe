package ru.levelp.ui;

import com.sun.tools.javah.Util;
import ru.levelp.listeners.ExitOnClickListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by natalie on 19.03.16.
 */
public class About {

    public void about() {

        JFrame aboutFrame = new JFrame("About");
        aboutFrame.setBounds(150, 150, 200, 200);
        aboutFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // разница между exit / dispose ?

        JLabel aboutLabel = new JLabel();

        String aboutText = "<html><h3>ABOUT TicTacToe</h3>" +
        " This is a descktop Tic Tac Toe game. <br>" +
        " Developer: Natalie F <br>" +
        " Level UP Java lessons <br>" +
        " 2016 <br>" +
        " All rights reserved</html>";

        Font aboutFont = new Font("Arial", Font.PLAIN, 14);
        aboutLabel.setText(aboutText);
        aboutLabel.setFont(aboutFont);

        JButton okBtn = new JButton("OK");
        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aboutFrame.dispose();
            }
        });

        aboutFrame.add(BorderLayout.CENTER, aboutLabel);
        aboutFrame.add(BorderLayout.SOUTH, okBtn);

        aboutFrame.setVisible(true);


    }
}