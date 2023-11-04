package components;

import java.awt.*;
import javax.swing.*;

public class pokemonBtn extends JButton {
    String type;
    Integer index;
    String name;
    String fileName;
    String src = initBtn.compRes + "pokemon/";
    String srcPath;

    public pokemonBtn(String fileName, Integer xAxis, Integer yAxis, String type, Integer index, String name) {
        super();
        this.srcPath = src + fileName;
        // ImageIcon icon = new ImageIcon(this.getClass().getResource(this.srcPath));
        // this.setIcon(icon);
        this.setBounds(xAxis, yAxis, 80, 80);
        this.setOpaque(false); // Make the button transparent
        this.setContentAreaFilled(false); // Remove default content fill
        this.setBorderPainted(false); // Remove the border
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));

        this.type = type;
        this.index = index;
        this.name = name;
        this.fileName = fileName;

    }

    public String getType() {
        return type;
    }

    public Integer getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Image selectedImg = new ImageIcon(getClass().getResource(srcPath)).getImage();
        g.drawImage(selectedImg, 0, 0, null);
    }

}