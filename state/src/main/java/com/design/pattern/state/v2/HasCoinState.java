package com.design.pattern.state.v2;

import java.util.Random;

/**
 * @author zhuzhenke
 * @date 2019/5/1
 */
public class HasCoinState implements State {

    private CandyMachineContext candyMachineContext;

    private Random random = new Random();

    public HasCoinState(CandyMachineContext candyMachineContext) {
        this.candyMachineContext = candyMachineContext;
    }

    /**
     * insert coin to candy machine
     * 投入硬币到糖果机中
     */
    @Override
    public void insertCoin() {
        System.out.println("sorry , has coin now");
    }

    /**
     * you can give up turning crank and get your coin back
     * 如果你不想玩了，点击退币
     */
    @Override
    public void returnCoin() {
        System.out.println("success in returning coin");
        candyMachineContext.setState(candyMachineContext.getNoCoinState());
    }

    /**
     * turn crank if coin has been put into the candy machine
     * 可在投入硬币转动曲柄以获得糖果
     */
    @Override
    public void turnCrank() {
        System.out.println("success in turning crank");
        int winner = random.nextInt(2);
        System.out.println("winner random : " + winner);
        if (winner == 1 && candyMachineContext.getCandyCount() >= 2) {
            candyMachineContext.setState(candyMachineContext.getWinnerState());
        } else {
            candyMachineContext.setState(candyMachineContext.getSoldState());
        }
    }

    /**
     * get candy if you insert coin and turn crank successfully
     * 转动曲柄后来获得糖果
     */
    @Override
    public void giveCandy() {
        System.out.println("sorry , please turn crank");
    }
}
