package com.design.pattern.state.v2;

/**
 * @author zhuzhenke
 * @date 2019/5/1
 */
public class SoldState implements State {

    private CandyMachineContext candyMachineContext;

    public SoldState(CandyMachineContext candyMachineContext) {
        this.candyMachineContext = candyMachineContext;
    }

    /**
     * insert coin to candy machine
     * 投入硬币到糖果机中
     */
    @Override
    public void insertCoin() {
        System.out.println("sorry , waiting for giving candy");
    }

    /**
     * you can give up turning crank and get your coin back
     * 如果你不想玩了，点击退币
     */
    @Override
    public void returnCoin() {
        System.out.println("sorry , you have using the coin for candy");
    }

    /**
     * turn crank if coin has been put into the candy machine
     * 可在投入硬币转动曲柄以获得糖果
     */
    @Override
    public void turnCrank() {
        System.out.println("sorry , turning twice is not allowed");
    }

    /**
     * get candy if you insert coin and turn crank successfully
     * 转动曲柄后来获得糖果
     */
    @Override
    public void giveCandy() {
        System.out.println("success in giving candy now");
        candyMachineContext.decreaseCandyCount();
        if (candyMachineContext.getCandyCount() > 0) {
            candyMachineContext.setState(candyMachineContext.getNoCoinState());
        } else {
            candyMachineContext.setState(candyMachineContext.getSoldOutState());
        }
    }
}
