package com.strategyPattern;

public abstract class Duck implements FlyBehavior, Quack {
    public String fly(){
        return "flyin' like any ol' duck";
    }
    public String speak(){ return "I'm a regular duck";}
}
