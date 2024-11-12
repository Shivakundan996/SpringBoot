package com.cgi.Game;

public class SuperContraGame implements GamingConsole{
    public SuperContraGame(){
        System.out.println("SuperContraGame started....");
    }
    public void up(){
        System.out.println("up....");
    }
    public void down(){
        System.out.println("sit down...");
    }
    public void left(){
        System.out.println("Shoot a bullet...");
    }
    public void right(){
        System.out.println("Go back...");
    }

    void damp(){
        System.out.println("damp");
    }

}
