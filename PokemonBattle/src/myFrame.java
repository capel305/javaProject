import javax.swing.*;

import components.initBtn;

public class myFrame extends JFrame {
    Integer frameWidth = 428;
    Integer frameHeight = 707;
    String reSource = initBtn.srcPath;

    void myFrame() {
        // JFrame frame = new JFrame();
        this.setTitle("Welcome to Pokemon fight game!");
        this.setSize(this.frameWidth, this.frameHeight);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}