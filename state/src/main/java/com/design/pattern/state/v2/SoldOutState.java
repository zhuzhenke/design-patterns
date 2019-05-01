package com.design.pattern.state.v2;

/**
 * @author zhuzhenke
 * @date 2019/5/1
 */
public class SoldOutState implements State {

    private CandyMachineContext candyMachineContext;

    public SoldOutState(CandyMachineContext candyMachineContext) {
        this.candyMachineContext = candyMachineContext;
    }

    /**
     * insert coin to candy machine
     * 投入硬币到糖果机中
     */
    @Override
    public void insertCoin() {
        System.out.println("sorry , candies has been sold out");
    }

    /**
     * you can give up turning crank and get your coin back
     * 如果你不想玩了，点击退币
     */
    @Override
    public void returnCoin() {
        System.out.println("sorry , no coin and candies has been sold out");
    }

    /**
     * turn crank if coin has been put into the candy machine
     * 可在投入硬币转动曲柄以获得糖果
     */
    @Override
    public void turnCrank() {
        System.out.println("sorry , candies has been sold out");
    }

    /**
     * get candy if you insert coin and turn crank successfully
     * 转动曲柄后来获得糖果
     */
    @Override
    public void giveCandy() {
        System.out.println("sorry , candies has been sold out");
    }
}
