package com.design.pattern.state;

import com.design.pattern.state.v1.CandyMachine;
import org.junit.Test;

/**
 * @author zhuzhenke
 * @date 2019/5/1
 */
public class StateTest {
    @Test
    public void testStateV1() {
        CandyMachine candyMachine = new CandyMachine(2);

        //normal action
        System.out.println("normal action ......");
        candyMachine.insertCoin();
        candyMachine.turnCrank();
        candyMachine.printStateAndCandyCount();

        //return action
        System.out.println("return action ......");
        candyMachine.insertCoin();
        candyMachine.returnCoin();
        candyMachine.printStateAndCandyCount();

        //abnormal action
        System.out.println("abnormal action ......");
        candyMachine.turnCrank();
        candyMachine.printStateAndCandyCount();

        //normal action
        System.out.println("normal action ......");
        candyMachine.insertCoin();
        candyMachine.turnCrank();
        candyMachine.printStateAndCandyCount();

        //normal action but sold out
        System.out.println("normal action but sold out ......");
        candyMachine.insertCoin();
        candyMachine.printStateAndCandyCount();
    }
}
