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
    String pokemonPath = src + "pokemon/";
    // main score
    Integer userScore = 0;
    Integer computerScore = 0;
    // round score
    Integer userRoundStar = 0;
    Integer computerRoundStar = 0;

    // game labels
    initLabels msgBoxSelectPokemon = new initLabels(0, 0, 428, 926, "msgBoxSelectPokemon3.png");

    scoreLabel yourScore = new scoreLabel(150, 525, 180, 100, "Score: " + userScore);
    initLabels selectPokemon = new initLabels(150, 360, 95, 85, "selectPokemon.png");
    initLabels enemyPokemon = new initLabels(150, 180, 95, 85, "enemyPokemon.png");
    scoreLabel enemyScore = new scoreLabel(150, 0, 180, 100, "Score: " + computerScore);
    initLabels enemyLabel = new initLabels(110, 70, 180, 53, "enemyLabel.png");
    scoreLabel vsLabel = new scoreLabel(180, 260, 180, 100, "VS");
    initLabels youLabel = new initLabels(110, 460, 180, 53, "youLabel.png");
    initLabels enemyStarRound = new initLabels(138, 130, 128, 32, computerRoundStar + "star.png");
    initLabels yourStarRound = new initLabels(138, 520, 128, 32, userRoundStar + "star.png");

    // game button
    // selecting pokemon section
    initBtn backBtn = new initBtn(15, 15, 54, 52, "backBtn.png");
    attkBtn attkBtn = new attkBtn();
    initBtn continueBtn = new initBtn(110, 430, 204, 70, "continueBtn.png");
    // water pokemon
    pokemonBtn waterPokemon = new pokemonBtn(waterPokemonList.get(0).get("fileName"), 50, 700,
            waterPokemonList.get(0).get("type"), 0, waterPokemonList.get(0).get("name"));

    pokemonBtn waterPokemon2 = new pokemonBtn(waterPokemonList.get(1).get("fileName"), 50, 790,
            waterPokemonList.get(0).get("type"), 1, waterPokemonList.get(0).get("name"));

    // fire pokemon
    pokemonBtn firePokemon = new pokemonBtn(firePokemonList.get(0).get("fileName"), 160, 700,
            firePokemonList.get(0).get("type"), 0,
            firePokemonList.get(0).get("name"));

    pokemonBtn firePokemon2 = new pokemonBtn(firePokemonList.get(1).get("fileName"), 160, 790,
            firePokemonList.get(0).get("type"), 1,
            firePokemonList.get(0).get("name"));
    // nature pokemon
    pokemonBtn naturePokemon = new pokemonBtn(naturePokemonList.get(0).get("fileName"), 270, 700,
            naturePokemonList.get(0).get("type"), 0, naturePokemonList.get(0).get("name"));

    pokemonBtn naturePokemon2 = new pokemonBtn(naturePokemonList.get(2).get("fileName"), 270, 790,
            naturePokemonList.get(0).get("type"), 2, naturePokemonList.get(0).get("name"));

    Integer pokemon1Unlock = 1;
    Integer pokemon2Unlock = 2;
    Integer pokemon3Unlock = 3;

    myMain() {
        firstFrame();
        btnEvents();
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

    void thirdFrame() {
        // clearing existing content
        clearFrame();
        // main content
        ImageIcon mainBg = new ImageIcon();
        JLabel mainContent = new JLabel(mainBg);
        mainContent.setSize(myFrame.frameWidth, myFrame.frameHeight);
        mainContent.setOpaque(true);
        mainContent.setBackground(new Color(0, 0, 0));
        // msgBoxSelectPokemon.setVisible(false);
        msgboxToggle(false, "msgBoxSelectPokemon3.png");
        userSelectPokemon = new HashMap<>();

        naturePokemon2.setVisible(false);
        firePokemon2.setVisible(false);
        waterPokemon2.setVisible(false);
        unlockPokemon();

        // adding objects
        myFrame.add(mainContent);
        // msgbox
        mainContent.add(msgBoxSelectPokemon);
        msgBoxSelectPokemon.add(continueBtn);
        // components
        mainContent.add(enemyStarRound);
        mainContent.add(yourStarRound);
        mainContent.add(backBtn);
        mainContent.add(enemyScore);
        mainContent.add(enemyLabel);
        mainContent.add(enemyPokemon);
        mainContent.add(vsLabel);
        mainContent.add(selectPokemon);
        mainContent.add(youLabel);
        mainContent.add(waterPokemon);
        mainContent.add(waterPokemon2);
        mainContent.add(naturePokemon);
        mainContent.add(naturePokemon2);
        mainContent.add(firePokemon);
        mainContent.add(firePokemon2);
        mainContent.add(yourScore);
        mainContent.add(attkBtn);

    }

    void btnEvents() {
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondFrame();
            }
        });
        attkBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String computerPokemon = pokemonLogics.pokemonLogics().get(pokemonLogics.randomNumber(3)).get("type");
                int intFight = pokemonLogics.pokemonFighting(userSelectPokemon.get("type"), computerPokemon);
                HashMap<String, String> computerPokemonHashMap = pokemonLogics.computerPick(computerPokemon);
                enemyPokemon.setIcon(new ImageIcon(
                        this.getClass().getResource(pokemonPath + computerPokemonHashMap.get("fileName"))));

                theBattle(intFight);
                enemyStarRound.setIcon(new ImageIcon(
                        this.getClass().getResource(src + computerRoundStar + "star.png")));
                yourStarRound.setIcon(new ImageIcon(
                        this.getClass().getResource(src + userRoundStar + "star.png")));
                yourScore.setText("Score: " + userScore);
                enemyScore.setText("Score: " + computerScore);
                // reseting selection
                userSelectPokemon = new HashMap<>();
                unlockPokemon();

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

                enemyPokemon.setIcon(new ImageIcon(this.getClass().getResource(src + "enemyPokemon.png")));

            }
        });

        waterPokemon2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userSelectPokemon = pokemonLogics.userSelect(waterPokemon2.getType(), waterPokemon2.getFileName(),
                        waterPokemon2.getName());
                selectPokemon
                        .setIcon(
                                new ImageIcon(
                                        this.getClass().getResource(pokemonPath + waterPokemon2.getFileName())));

                enemyPokemon.setIcon(new ImageIcon(this.getClass().getResource(src + "enemyPokemon.png")));

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
                enemyPokemon.setIcon(new ImageIcon(this.getClass().getResource(src + "enemyPokemon.png")));

            }
        });

        firePokemon2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userSelectPokemon = pokemonLogics.userSelect(firePokemon2.getType(), firePokemon2.getFileName(),
                        firePokemon2.getName());
                selectPokemon
                        .setIcon(
                                new ImageIcon(this.getClass().getResource(pokemonPath + firePokemon2.getFileName())));
                enemyPokemon.setIcon(new ImageIcon(this.getClass().getResource(src + "enemyPokemon.png")));

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
                enemyPokemon.setIcon(new ImageIcon(this.getClass().getResource(src + "enemyPokemon.png")));

            }
        });

        naturePokemon2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userSelectPokemon = pokemonLogics.userSelect(naturePokemon2.getType(), naturePokemon2.getFileName(),
                        naturePokemon2.getName());
                selectPokemon
                        .setIcon(new ImageIcon(
                                this.getClass().getResource(pokemonPath + naturePokemon2.getFileName())));
                enemyPokemon.setIcon(new ImageIcon(this.getClass().getResource(src + "enemyPokemon.png")));

            }
        });

        continueBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                msgboxToggle(false, "msgBoxSelectPokemon3.png");
            }
        });
    }

    void clearFrame() {
        myFrame.getContentPane().removeAll();
        myFrame.revalidate();
        myFrame.repaint();
    }

    void msgboxToggle(Boolean Bool, String fileName) {
        msgBoxSelectPokemon.setVisible(Bool);
        msgBoxSelectPokemon
                .setIcon(new ImageIcon(this.getClass().getResource(src + fileName)));
        backBtn.setEnabled(!Bool);
        attkBtn.setEnabled(!Bool);
        waterPokemon.setEnabled(!Bool);
        firePokemon.setEnabled(!Bool);
        naturePokemon.setEnabled(!Bool);

    }

    void theBattle(Integer res) {
        // intFight
        if (res == 0) {
            computerRoundStar = computerRoundStar + 1;
            if (computerRoundStar == 3) {
                computerScore = computerScore + 1;
                computerRoundStar = 0;
                userRoundStar = 0;
            }

            msgboxToggle(true, "msgBoxYouLose.png");
            return;
        }
        if (res == 1) {
            // userScore = userScore + 1;
            userRoundStar = userRoundStar + 1;
            if (userRoundStar == 3) {
                userScore = userScore + 1;
                computerRoundStar = 0;
                userRoundStar = 0;
            }

            msgboxToggle(true, "msgBoxYouWin2.png");
            return;
        }
        if (res == 2) {

            msgboxToggle(true, "msgBoxDraw.png");
            return;
        }

        msgboxToggle(true, "msgBoxSelectPokemon3.png");
        return;

    }

    void unlockPokemon() {
        if (waterPokemon2.isVisible() == false && userScore >= pokemon1Unlock) {
            waterPokemon2.setVisible(true);
            msgboxToggle(true, "msgBoxPokemonUnlock.png");
        }

        if (firePokemon2.isVisible() == false && userScore >= pokemon2Unlock) {
            firePokemon2.setVisible(true);
            msgboxToggle(true, "msgBoxPokemonUnlock.png");
        }

        if (naturePokemon2.isVisible() == false && userScore >= pokemon3Unlock) {
            naturePokemon2.setVisible(true);
            msgboxToggle(true, "msgBoxPokemonUnlock.png");
        }

    }
}
