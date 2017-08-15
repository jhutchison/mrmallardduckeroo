package com.strategyPattern;

public class StrategyPatternApplication {
	public static void main(String[] args) {
        final Duck mallardDuck = new MallardDuck();
        final String duckFlyResult = mallardDuck.fly();
        System.out.println(duckFlyResult);
    }
}
