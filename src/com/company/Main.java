package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {

            //Setting up the game
        String path1 = "src\\com\\company\\ex1.csv";
        String path2 = "src\\com\\company\\ex2.txt";
        String path3 = "src\\com\\company\\ex3.csv";
        GameSetup gs = new GameSetup();
        gs.createBags();
//        gs.startingGameInfo();

            //Setting up PebbleGame
        PebbleGame pg = new PebbleGame();
        pg.setTotalPlayerNumber(gs.getPlayersNo());
        pg.createPlayerArray();
        pg.setAllBags(gs.getAllbags());
        pg.fillPlayerBag(0);

//        pg.fillPlayerBag();



//        System.out.println(pg.getPlayerArrayList().get(0));
//        PebbleGame.Player players = new PebbleGame.Player(1);
//        System.out.println("Random generated Number: ");
//        System.out.print(pg.generateRandomNum(5));


    }
}
