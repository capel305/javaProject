package components;

import java.awt.*;
import javax.swing.*;

public class attkBtn extends JButton {
    String srcPath = initBtn.compRes + "attkBtn.png";

    public attkBtn() {
        super();
        // ImageIcon icon = new ImageIcon(this.getClass().getResource(srcPath));
        // this.setIcon(icon);
        this.setBounds(150, 604, 80, 80);
        this.setOpaque(false); // Make the button transparent
        this.setContentAreaFilled(false); // Remove default content fill
        this.setBorderPainted(false); // Remove the border
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Image selectedImg = new ImageIcon(getClass().getResource(srcPath)).getImage();
        g.drawImage(selectedImg, 0, 0, null);
    }
}