package com.strategyPattern;

public class MallardDuck extends Duck {
    @Override
    public String fly(){
        return "Flying like a mallard Duck!";
    }

    @Override
    public String speak() {
        return null;
    }
}
