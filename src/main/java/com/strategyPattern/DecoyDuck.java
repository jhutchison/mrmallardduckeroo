package com.strategyPattern;

public class DecoyDuck extends Duck {
    @Override
    public String fly(){
        return "Decoys don't fly, stupid";
    }
    public String quack(){
        return "Decoys don't fly, stupid";
    }
    public String speak(){
        return "Decoys don't speak, stupid";
    }

}
