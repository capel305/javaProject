import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import components.*;

public class myMain {
    myFrame myFrame = new myFrame();
    String src = myFrame.reSource;

    pokemonLogics pokemonLogics = new pokemonLogics();
    HashMap<String, ArrayList<HashMap<String, String>>> pokemonList = pokemonLogics.pokemonList();
    ArrayList<HashMap<String, String>> waterPokemonList = pokemonLogics.pokemonList().get("water");
    ArrayList<HashMap<String, String>> firePokemonList = pokemonLogics.pokemonList().get("fire");
    ArrayList<HashMap<String, String>> naturePokemonList = pokemonLogics.pokemonList().get("nature");
    Map<String, String> userSelectPokemon = new HashMap<>();
    Integer userScore = 0;
    Integer computerScore = 0;

    myMain() {
        firstFrame();
    }

    void thirdFrame() {
        // clearing existing content
        clearFrame();
        // main content
        ImageIcon mainBg = new ImageIcon();
        JLabel mainContent = new JLabel(mainBg);
        mainContent.setSize(myFrame.frameWidth, myFrame.frameHeight);
        mainContent.setOpaque(true);
        mainContent.setBackground(new Color(0, 0, 0));

        // btns
        initBtn backBtn = new initBtn(15, 15, 54, 52, "backBtn.png");
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondFrame();
            }
        });

        // enemy
        // enemyscore
        scoreLabel enemyScore = new scoreLabel(150, 20, 180, 100, "Score: 0");
        initLabels enemyLabel = new initLabels(110, 100, 180, 53, "enemyLabel.png");
        initLabels enemyPokemon = new initLabels(150, 180, 95, 85, "enemyPokemon.png");

        scoreLabel vsLabel = new scoreLabel(180, 260, 180, 100, "VS");

        // your pokemon
        initLabels selectPokemon = new initLabels(150, 360, 95, 85, "selectPokemon.png");
        initLabels youLabel = new initLabels(110, 460, 180, 53, "youLabel.png");
        scoreLabel yourScore = new scoreLabel(150, 490, 180, 100, "Score: 0");

        // selecting pokemon section
        String pokemonPath = "img/pokemon/";
        attkBtn attkBtn = new attkBtn();

        pokemonBtn waterPokemon = new pokemonBtn(waterPokemonList.get(0).get("fileName"), 50, 700,
                waterPokemonList.get(0).get("type"), 0, waterPokemonList.get(0).get("name"));
        pokemonBtn firePokemon = new pokemonBtn(firePokemonList.get(0).get("fileName"), 160, 700,
                firePokemonList.get(0).get("type"), 0,
                firePokemonList.get(0).get("name"));
        pokemonBtn naturePokemon = new pokemonBtn(naturePokemonList.get(0).get("fileName"), 270, 700,
                naturePokemonList.get(0).get("type"), 0, naturePokemonList.get(0).get("name"));

        attkBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String computerPokemon = pokemonLogics.pokemonLogics().get(pokemonLogics.randomNumber(3)).get("type");
                int intFight = pokemonLogics.pokemonFighting(userSelectPokemon.get("type"), computerPokemon);

                HashMap<String, String> computerPokemonHashMap = pokemonLogics.computerPick(computerPokemon);
                enemyPokemon.setIcon(new ImageIcon(
                        this.getClass().getResource(pokemonPath + computerPokemonHashMap.get("fileName"))));

                if (intFight == 0) {
                    computerScore = computerScore + 1;
                    System.out.println("you Lose!");
                    JOptionPane.showMessageDialog(null, "Lose!", "Message",
                            JOptionPane.INFORMATION_MESSAGE);
                } else if (intFight == 1) {
                    userScore = userScore + 1;
                    System.out.println("you Win!");
                    JOptionPane.showMessageDialog(null, "You Win!", "Message",
                            JOptionPane.INFORMATION_MESSAGE);
                } else if (intFight == 2) {
                    System.out.println("draw!");
                    JOptionPane.showMessageDialog(null, "Draw!", "Message",
                            JOptionPane.INFORMATION_MESSAGE);

                } else if (intFight == 9) {
                    JOptionPane.showMessageDialog(null, "Select pokemon first", "Message",
                            JOptionPane.INFORMATION_MESSAGE);

                }

                yourScore.setText("Score: " + userScore);
                enemyScore.setText("Score: " + computerScore);
                // reseting selection
                userSelectPokemon = new HashMap<>();

            }
        });

        waterPokemon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userSelectPokemon = pokemonLogics.userSelect(waterPokemon.getType(), waterPokemon.getFileName(),
                        waterPokemon.getName());
                selectPokemon
                        .setIcon(
                                new ImageIcon(
                                        this.getClass().getResource(pokemonPath + waterPokemon.getFileName())));

                enemyPokemon.setIcon(new ImageIcon(this.getClass().getResource("./img/enemyPokemon.png")));

            }
        });

        firePokemon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userSelectPokemon = pokemonLogics.userSelect(firePokemon.getType(), firePokemon.getFileName(),
                        firePokemon.getName());
                selectPokemon
                        .setIcon(
                                new ImageIcon(this.getClass().getResource(pokemonPath + firePokemon.getFileName())));
                enemyPokemon.setIcon(new ImageIcon(this.getClass().getResource("./img/enemyPokemon.png")));

            }
        });

        naturePokemon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userSelectPokemon = pokemonLogics.userSelect(naturePokemon.getType(), naturePokemon.getFileName(),
                        naturePokemon.getName());
                selectPokemon
                        .setIcon(new ImageIcon(
                                this.getClass().getResource(pokemonPath + naturePokemon.getFileName())));
                enemyPokemon.setIcon(new ImageIcon(this.getClass().getResource("./img/enemyPokemon.png")));

            }
        });

        // adding objects
        myFrame.add(mainContent);
        mainContent.add(backBtn);
        mainContent.add(enemyScore);
        mainContent.add(enemyLabel);
        mainContent.add(enemyPokemon);
        mainContent.add(vsLabel);
        mainContent.add(selectPokemon);
        mainContent.add(youLabel);
        mainContent.add(waterPokemon);
        mainContent.add(naturePokemon);
        mainContent.add(firePokemon);
        mainContent.add(yourScore);
        mainContent.add(attkBtn);

    }

    void secondFrame() {
        // clearing existing content
        clearFrame();

        // init background
        initLabels mainContent = new initLabels(0, 0, myFrame.frameWidth, myFrame.frameHeight, "frame2bg.jpg");
        // btn
        initBtn beginBtn = new initBtn(130, 690, 160, 52, "beginBtn.png");
        beginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thirdFrame();
            }
        });
        myFrame.add(mainContent);
        mainContent.add(beginBtn);
    }

    void firstFrame() {
        initLabels mainContent = new initLabels(0, 0, myFrame.frameWidth, myFrame.frameHeight, "loadingBg.jpg");

        myFrame.myFrame();

        initBtn initBtn = new initBtn(130, 650, 160, 52, "startGameBtn.png");
        initBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondFrame();
            }
        });
        myFrame.add(mainContent);
        mainContent.add(initBtn);

    }

    void clearFrame() {
        myFrame.getContentPane().removeAll();
        myFrame.revalidate();
        myFrame.repaint();
    }
}
