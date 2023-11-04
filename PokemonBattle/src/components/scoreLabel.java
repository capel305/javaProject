package components;

import java.awt.*;
import javax.swing.*;

public class scoreLabel extends JLabel {
    String src = initBtn.compRes;

    public scoreLabel(Integer x, Integer y, Integer width, Integer height, String text) {
        this.setText(text);
        this.setBounds(x, y, width, height);
        this.setForeground(Color.WHITE);
        Font font = new Font("Arial", Font.BOLD, 24);
        this.setFont(font);
    }
}
