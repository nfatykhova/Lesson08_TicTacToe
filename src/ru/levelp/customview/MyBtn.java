package ru.levelp.customview;

import javax.swing.*;
import java.awt.*;

/**
 * Created by natalie on 20.03.16.
 */

public class MyBtn extends JButton {

    public MyBtn() {
        init();
    }

    public MyBtn(String text) {
        super(text);
        init();
    }

    private void init() {
        setBackground(Color.BLUE);
        setOpaque(true);
    }

    
}
