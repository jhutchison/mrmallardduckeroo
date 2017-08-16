package com.strategyPattern;

public class DecoyDuck extends Duck {
    @Override
    public String fly(){
        return "Decoys don't fly, stupid";
    }
}
