package com.cgi.Game;

public class MarioGame implements GamingConsole{

    public MarioGame(){
        System.out.println("MarioGame started...");
    }
    public void up(){
        System.out.println("jumping....");
    }
    public void down(){
        System.out.println("getting into hole...");
    }
    public void left(){
        System.out.println("moving forward...");
    }
    public void right(){
        System.out.println("moving backward...");
    }
}
