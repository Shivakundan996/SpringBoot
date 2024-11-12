package com.cgi.Game;

public class GameRunner{

    //    private MarioGame game;
    private GamingConsole game;

    /**
     * here in construction parameter is tightly coupled as everytime class should be chnaged to SuperContarGame and MarioGame,
     * to achieve loose Coupling Interface should be And implemnetd to  class SuperContarGame MarioGame.
     */
   /* public GameRunner(MarioGame game){
        this.game = game;
    }*/

    public GameRunner(GamingConsole game){
        this.game = game;
    }

    public void run(){
        System.out.println("Running game:"+game);
        game.down();
        game.up();
        game.left();
        game.right();
        SuperContraGame game1 = (SuperContraGame) game; // cass casting as methods damp method is not overridden

        game1.damp();

    }
}
