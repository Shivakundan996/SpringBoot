package com.cgi.spring;

import com.cgi.Game.GameRunner;
import com.cgi.Game.SuperContraGame;

/**
 * @LooseCoupling can be achieved through the interfaces.
 */

public class App01GamingBasicJava {

    public static void main(String[] args) {
//      MarioGame game = new MarioGame();
//      var game = new MarioGame(); we can us "var" instead of class name ,but it should be instantiated to the required class
        SuperContraGame game = new SuperContraGame();
        GameRunner gameRunner = new GameRunner(game);
        gameRunner.run();


    }
}
