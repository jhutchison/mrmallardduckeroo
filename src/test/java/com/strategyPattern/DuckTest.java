package com.strategyPattern;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class DuckTest {

    @Test
    public void should_return_regularDuckFlyingString(){

        Duck mallard = new MallardDuck();
        String actualResult = mallard.fly();
        String EXPECTED = "Flying like a mallard Duck!";

        assert(actualResult).contentEquals(EXPECTED);
    }

}
