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
    ArrayList<HashMap<String, String>> electricPokemonList = pokemonLogics.pokemonList().get("electric");
    ArrayList<HashMap<String, String>> windPokemonList = pokemonLogics.pokemonList().get("wind");

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

    initLabels selectPokemon = new initLabels(50, 120, 95, 85, "selectPokemon.png");
    initLabels youLabel = new initLabels(10, 210, 180, 53, "youLabel.png");
    scoreLabel yourScore = new scoreLabel(150, 260, 180, 100, "Score: " + userScore);

    initLabels enemyPokemon = new initLabels(260, 120, 95, 85, "enemyPokemon.png");
    initLabels enemyLabel = new initLabels(220, 210, 180, 53, "enemyLabel.png");
    scoreLabel enemyScore = new scoreLabel(150, 0, 180, 100, "Score: " + computerScore);

    scoreLabel vsLabel = new scoreLabel(185, 130, 180, 100, "VS");

    initLabels enemyStarRound = new initLabels(260, 265, 128, 32, computerRoundStar + "star.png");
    initLabels yourStarRound = new initLabels(50, 265, 128, 32, userRoundStar + "star.png");

    initLabels yourWinner = new initLabels(28, 80, 120, 42, "winner.png");
    initLabels enemyWinner = new initLabels(239, 80, 120, 42, "winner.png");
    // game button
    // selecting pokemon section
    initBtn backBtn = new initBtn(15, 15, 54, 52, "backBtn.png");
    attkBtn attkBtn = new attkBtn();
    initBtn continueBtn = new initBtn(110, 430, 204, 70, "continueBtn.png");
    // water pokemon
    pokemonBtn waterPokemon = new pokemonBtn(waterPokemonList.get(0).get("fileName"), 50, 440,
            waterPokemonList.get(0).get("type"), 0, waterPokemonList.get(0).get("name"));

    pokemonBtn windPokemon = new pokemonBtn(windPokemonList.get(0).get("fileName"), 50, 530,
            windPokemonList.get(0).get("type"), 0, windPokemonList.get(0).get("name"));

    // fire pokemon
    pokemonBtn firePokemon = new pokemonBtn(firePokemonList.get(0).get("fileName"), 160, 440,
            firePokemonList.get(0).get("type"), 0,
            firePokemonList.get(0).get("name"));

    pokemonBtn electricPokemon = new pokemonBtn(electricPokemonList.get(0).get("fileName"), 160, 530,
            electricPokemonList.get(0).get("type"), 0,
            electricPokemonList.get(0).get("name"));
    // nature pokemon
    pokemonBtn naturePokemon = new pokemonBtn(naturePokemonList.get(0).get("fileName"), 270, 440,
            naturePokemonList.get(0).get("type"), 0, naturePokemonList.get(0).get("name"));

    pokemonBtn naturePokemon2 = new pokemonBtn(naturePokemonList.get(1).get("fileName"), 270, 530,
            naturePokemonList.get(1).get("type"), 1, naturePokemonList.get(1).get("name"));

    Integer pokemon1Unlock = 3;
    Integer pokemon2Unlock = 6;
    Integer pokemon3Unlock = 9;

    Integer waterPokemonEvolve = 3;
    Boolean isWaterPokemonEvolve = false;

    Integer windPokemonEvolve = 5;
    Boolean isWindPokemonEvolve = false;

    Integer firePokemonEvolve = 7;
    Boolean isfirePokemonEvolve = false;

    Integer electricPokemonEvolve = 9;
    Boolean isElectricPokemonEvolve = false;

    Integer naturePokemonEvolve = 9;
    Boolean isNaturePokemonEvolve = false;

    myMain() {
        firstFrame();
        btnEvents();
    }

    HashMap<String, String> pokemonEvolveInit() {
        if (isWaterPokemonEvolve == false) {
            isWaterPokemonEvolve = true;
            waterPokemon = new pokemonBtn(waterPokemonList.get(0).get("fileName2"), 50, 440,
                    waterPokemonList.get(0).get("type2"), 0, waterPokemonList.get(0).get("name2"));
            waterPokemonBtnEvent();
            return waterPokemonList.get(0);
        }
        if (isWindPokemonEvolve == false) {
            isWindPokemonEvolve = true;
            windPokemon = new pokemonBtn(windPokemonList.get(0).get("fileName2"), 50, 530,
                    windPokemonList.get(0).get("type2"), 0, windPokemonList.get(0).get("name2"));
            windPokemonBtnEvent();
            return windPokemonList.get(0);
        }
        if (isfirePokemonEvolve == false) {
            isfirePokemonEvolve = true;
            firePokemon = new pokemonBtn(firePokemonList.get(0).get("fileName2"), 160, 440,
                    firePokemonList.get(0).get("type2"), 0,
                    firePokemonList.get(0).get("name2"));
            firePokemonBtnEvent();
            return firePokemonList.get(0);
        }

        if (isElectricPokemonEvolve == false) {
            isElectricPokemonEvolve = true;
            electricPokemon = new pokemonBtn(electricPokemonList.get(0).get("fileName2"), 160, 530,
                    electricPokemonList.get(0).get("type2"), 0,
                    electricPokemonList.get(0).get("name2"));
            electricPokemonBtnEvent();
            return electricPokemonList.get(0);
        }

        if (isNaturePokemonEvolve == false) {
            isNaturePokemonEvolve = true;
            naturePokemon = new pokemonBtn(naturePokemonList.get(0).get("fileName2"), 270, 440,
                    naturePokemonList.get(0).get("type2"), 0, naturePokemonList.get(0).get("name2"));
            naturePokemonBtnEvents();
            return naturePokemonList.get(0);
        }
        return waterPokemonList.get(0);
    }

    void pokemonEvolveFrame() {
        clearFrame();
        // main content
        ImageIcon mainBg = new ImageIcon();
        JLabel mainContent = new JLabel(mainBg);
        mainContent.setSize(myFrame.frameWidth, myFrame.frameHeight);
        mainContent.setOpaque(true);
        mainContent.setBackground(new Color(0, 0, 0));

        HashMap<String, String> pokemonObj = pokemonEvolveInit();
        initLabels pokemonEvolveTxt = new initLabels(40, 81, 322, 81, "pokemonEvolveTxt.png");
        initLabels arrowRight = new initLabels(160, 250, 66, 78, "arrowRight.png");

        initPokemonLabels pokemonFrom = new initPokemonLabels(40, 250, 80, 80, pokemonObj.get("fileName"));
        initPokemonLabels pokemonTo = new initPokemonLabels(260, 250, 80, 80, pokemonObj.get("fileName2"));

        initBtn continueBtn = new initBtn(120, 400, 160, 55, "confirmBtn.png");
        continueBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thirdFrame();
            }
        });
        // adding contents
        myFrame.add(mainContent);
        mainContent.add(continueBtn);
        mainContent.add(pokemonEvolveTxt);
        mainContent.add(pokemonFrom);
        mainContent.add(pokemonTo);
        mainContent.add(arrowRight);

    }

    void firstFrame() {
        initLabels mainContent = new initLabels(0, 0, myFrame.frameWidth, myFrame.frameHeight, "loadingBg.jpg");

        myFrame.myFrame();

        initBtn initBtn = new initBtn(130, 560, 160, 52, "startGameBtn.png");
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
        initBtn beginBtn = new initBtn(130, 560, 160, 52, "beginBtn.png");
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

        yourWinner.setVisible(false);
        enemyWinner.setVisible(false);

        naturePokemon2.setVisible(false);
        // electricPokemon.setVisible(false);
        // windPokemon.setVisible(false);
        // unlockPokemon();

        // adding objects
        myFrame.add(mainContent);
        // msgbox
        mainContent.add(msgBoxSelectPokemon);
        msgBoxSelectPokemon.add(continueBtn);

        JButton testBtn = new JButton("Test Evolve");
        testBtn.setBounds(300, 5, 100, 50);
        testBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pokemonEvolveFrame();
            }
        });

        // components
        mainContent.add(testBtn);
        mainContent.add(yourWinner);
        mainContent.add(enemyWinner);
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
        mainContent.add(windPokemon);
        mainContent.add(naturePokemon);
        mainContent.add(naturePokemon2);
        mainContent.add(firePokemon);
        mainContent.add(electricPokemon);
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

                String computerPokemon = pokemonLogics.pokemonLogics()
                        .get(pokemonLogics.randomNumber(pokemonLogics.pokemonLogics().size())).get("type");

                HashMap<String, String> computerPokemonHashMap = pokemonLogics.computerPick(computerPokemon);
                int intFight = pokemonLogics.pokemonFighting(userSelectPokemon.get("type"),
                        computerPokemonHashMap.get("type"));

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
        waterPokemonBtnEvent();
        windPokemonBtnEvent();
        firePokemonBtnEvent();
        electricPokemonBtnEvent();
        naturePokemonBtnEvents();
        naturePokemon2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userSelectPokemon = pokemonLogics.userSelect(naturePokemon2.getType(), naturePokemon2.getFileName(),
                        naturePokemon2.getName());
                selectPokemon
                        .setIcon(new ImageIcon(
                                this.getClass().getResource(pokemonPath + naturePokemon2.getFileName())));
                enemyPokemon.setIcon(new ImageIcon(this.getClass().getResource(src + "enemyPokemon.png")));
                yourWinner.setVisible(false);
                enemyWinner.setVisible(false);

            }
        });

        continueBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                msgboxToggle(false, "msgBoxSelectPokemon3.png");
            }
        });
    }

    // misc meathods
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
            enemyWinner.setVisible(true);
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
            yourWinner.setVisible(true);

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
        if (windPokemon.isVisible() == false && userScore >= pokemon1Unlock) {
            windPokemon.setVisible(true);
            msgboxToggle(true, "msgBoxPokemonUnlock.png");
        }

        if (electricPokemon.isVisible() == false && userScore >= pokemon2Unlock) {
            electricPokemon.setVisible(true);
            msgboxToggle(true, "msgBoxPokemonUnlock.png");
        }

        if (naturePokemon2.isVisible() == false && userScore >= pokemon3Unlock) {
            naturePokemon2.setVisible(true);
            msgboxToggle(true, "msgBoxPokemonUnlock.png");

            userScore = 0;
            computerScore = 0;

            userRoundStar = 0;
            computerRoundStar = 0;
        }

    }

    void waterPokemonBtnEvent() {
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

                yourWinner.setVisible(false);
                enemyWinner.setVisible(false);

            }
        });
    }

    void windPokemonBtnEvent() {
        windPokemon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userSelectPokemon = pokemonLogics.userSelect(windPokemon.getType(), windPokemon.getFileName(),
                        windPokemon.getName());
                selectPokemon
                        .setIcon(
                                new ImageIcon(
                                        this.getClass().getResource(pokemonPath + windPokemon.getFileName())));

                enemyPokemon.setIcon(new ImageIcon(this.getClass().getResource(src + "enemyPokemon.png")));
                yourWinner.setVisible(false);
                enemyWinner.setVisible(false);

            }
        });
    }

    void firePokemonBtnEvent() {
        firePokemon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userSelectPokemon = pokemonLogics.userSelect(firePokemon.getType(), firePokemon.getFileName(),
                        firePokemon.getName());
                selectPokemon
                        .setIcon(
                                new ImageIcon(this.getClass().getResource(pokemonPath + firePokemon.getFileName())));
                enemyPokemon.setIcon(new ImageIcon(this.getClass().getResource(src + "enemyPokemon.png")));
                yourWinner.setVisible(false);
                enemyWinner.setVisible(false);

            }
        });
    }

    void electricPokemonBtnEvent() {
        electricPokemon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userSelectPokemon = pokemonLogics.userSelect(electricPokemon.getType(), electricPokemon.getFileName(),
                        electricPokemon.getName());
                selectPokemon
                        .setIcon(
                                new ImageIcon(
                                        this.getClass().getResource(pokemonPath + electricPokemon.getFileName())));
                enemyPokemon.setIcon(new ImageIcon(this.getClass().getResource(src + "enemyPokemon.png")));
                yourWinner.setVisible(false);
                enemyWinner.setVisible(false);

            }
        });
    }

    void naturePokemonBtnEvents() {
        naturePokemon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userSelectPokemon = pokemonLogics.userSelect(naturePokemon.getType(), naturePokemon.getFileName(),
                        naturePokemon.getName());
                selectPokemon
                        .setIcon(new ImageIcon(
                                this.getClass().getResource(pokemonPath + naturePokemon.getFileName())));
                enemyPokemon.setIcon(new ImageIcon(this.getClass().getResource(src + "enemyPokemon.png")));
                yourWinner.setVisible(false);
                enemyWinner.setVisible(false);

            }
        });
    }

}
