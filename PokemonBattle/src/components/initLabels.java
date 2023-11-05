package components;

import javax.swing.*;

public class initLabels extends JLabel {
    String src = initBtn.compRes;

    public initLabels(Integer x, Integer y, Integer width, Integer height, String fileName) {
        this.setIcon(new ImageIcon(this.getClass().getResource(src + fileName)));
        this.setBounds(x, y, width, height);
    }
}
