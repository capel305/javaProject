package components;

import java.awt.*;
import javax.swing.*;

public class initBtn extends JButton {
    public static String srcPath = "./img/";
    static String compRes = "./." + srcPath;
    String fileName;

    public initBtn(Integer x, Integer y, Integer width, Integer height, String fileName) {
        super();
        this.setBounds(x, y, width, height);
        this.setOpaque(false); // Make the button transparent
        this.setContentAreaFilled(false); // Remove default content fill
        this.setBorderPainted(false); // Remove the border
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));

        this.fileName = fileName;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Image selectedImg = new ImageIcon(getClass().getResource(compRes + fileName)).getImage();
        g.drawImage(selectedImg, 0, 0, null);
    }
}
