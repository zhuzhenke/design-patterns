package com.design.pattern.state.v2;

import lombok.Getter;

/**
 * @author zhuzhenke
 * @date 2019/5/1
 */
public class CandyMachineContext {


    State state;
    @Getter
    State noCoinState;
    @Getter
    State hasCoinState;
    @Getter
    State soldState;
    @Getter
    State winnerState;
    @Getter
    State soldOutState;
    @Getter
    private int candyCount;

    public CandyMachineContext(int candyCount) {
        this.candyCount = candyCount;

        this.noCoinState = new NoCoinState(this);
        this.hasCoinState = new HasCoinState(this);
        this.soldState = new SoldState(this);
        this.soldOutState = new SoldOutState(this);
        this.winnerState = new WinnerState(this);

        if (candyCount > 0) {
            state = this.noCoinState;
        } else {
            state = this.soldOutState;
        }
    }

    /**
     * insert coin to candy machine
     * 投入硬币到糖果机中
     */
    public void insertCoin() {
        state.insertCoin();
    }

    /**
     * you can give up turning crank and get your coin back
     * 如果你不想玩了，点击退币
     */
    public void returnCoin() {
        state.returnCoin();
    }

    /**
     * turn crank if coin has been put into the candy machine
     * 可在投入硬币转动曲柄以获得糖果
     */
    public void turnCrank() {
        state.turnCrank();
        state.giveCandy();
    }

    /**
     * get candy if you insert coin and turn crank successfully
     * 转动曲柄后来获得糖果
     */
    private void giveCandy() {
        state.giveCandy();
    }

    public void printStateAndCandyCount() {
        System.out.println("CandyMachineContext{" +
                "state=" + state.getClass().getSimpleName() +
                ", candyCount=" + candyCount +
                '}');
    }

    public void setState(State state) {
        this.state = state;
    }

    public void decreaseCandyCount() {
        if (candyCount <= 0) {
            System.out.println("candies has been sold out , could not be decreased");
        }
        candyCount--;
    }
}
