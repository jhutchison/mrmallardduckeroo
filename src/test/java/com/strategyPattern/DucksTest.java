package com.strategyPattern;


import org.junit.Test;

public class DucksTest {

    @Test
    public void should_return_mallardDuckFlyingString(){
        Duck mallard = new MallardDuck();
        String actualResult = mallard.fly();
        String EXPECTED = "Flying like a mallard Duck!";

        assert(actualResult).contentEquals(EXPECTED);
    }

    @Test
    public void should_return_decoyDuckFlyingString(){
        Duck decoy = new DecoyDuck();
        String actualResult = decoy.fly();
        String EXPECTED = "Decoys don't fly, stupid";

        assert(actualResult).contentEquals(EXPECTED);
    }

    @Test
    public void should_return_decoyDuckSpeakString(){
        Duck decoy = new DecoyDuck();
        String actualResult = decoy.speak();
        String EXPECTED = "Decoys don't speak, stupid";

        assert(actualResult).contentEquals(EXPECTED);
    }

}
