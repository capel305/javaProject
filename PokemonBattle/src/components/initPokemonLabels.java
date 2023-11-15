
package components;

import javax.swing.*;

public class initPokemonLabels extends JLabel {
    String src = initBtn.compRes;

    public initPokemonLabels(Integer x, Integer y, Integer width, Integer height, String fileName) {
        this.setIcon(new ImageIcon(this.getClass().getResource(src + "pokemon/" + fileName)));
        this.setBounds(x, y, width, height);
    }

}
