package com.design.pattern.state.v1;

/**
 * @author zhuzhenke
 * @date 2019/5/1
 */
public class CandyMachine {
    private static final int NO_COIN = 0;
    private static final int HAS_COIN = 1;
    private static final int SOLD = 2;
    private static final int SOLD_OUT = 3;

    private int state = SOLD_OUT;

    private int candyCount = 0;

    public CandyMachine(int candyCount) {
        this.candyCount = candyCount;
        if (candyCount > 0) {
            state = NO_COIN;
        }
    }

    /**
     * insert coin to candy machine
     * 投入硬币到糖果机中
     */
    public void insertCoin() {
        switch (state) {
            case NO_COIN:
                System.out.println("success in inserting coin");
                state = HAS_COIN;
                break;
            case HAS_COIN:
                System.out.println("sorry , has coin now");
                break;
            case SOLD:
                System.out.println("sorry , waiting for giving candy");
                break;
            case SOLD_OUT:
                System.out.println("sorry , candies has been sold out");
                break;
            default:
                break;
        }
    }

    /**
     * you can give up turning crank and get your coin back
     * 如果你不想玩了，点击退币
     */
    public void returnCoin() {
        switch (state) {
            case NO_COIN:
                System.out.println("sorry , no coin");
                break;
            case HAS_COIN:
                System.out.println("success in returning coin");
                state = NO_COIN;
                break;
            case SOLD:
                System.out.println("sorry , you have using the coin for candy");
                break;
            case SOLD_OUT:
                System.out.println("sorry , no coin and candies has been sold out");
                break;
            default:
                break;
        }
    }

    /**
     * turn crank if coin has been put into the candy machine
     * 可在投入硬币转动曲柄以获得糖果
     */
    public void turnCrank() {
        switch (state) {
            case NO_COIN:
                System.out.println("sorry , no coin");
                break;
            case HAS_COIN:
                System.out.println("success in turning crank");
                state = SOLD;
                giveCandy();
                break;
            case SOLD:
                System.out.println("sorry , turning twice is not allowed");
                break;
            case SOLD_OUT:
                System.out.println("sorry , candies has been sold out");
                break;
            default:
                break;
        }
    }

    /**
     * get candy if you insert coin and turn crank successfully
     * 转动曲柄后来获得糖果
     */
    private void giveCandy() {
        switch (state) {
            case NO_COIN:
                System.out.println("sorry , no coin");
                break;
            case HAS_COIN:
                System.out.println("sorry , please turn crank");
                break;
            case SOLD:
                System.out.println("success in giving candy now");
                candyCount--;
                if (candyCount > 0) {
                    state = NO_COIN;
                } else {
                    state = SOLD_OUT;
                }
                break;
            case SOLD_OUT:
                System.out.println("sorry , candies has been sold out");
                break;
            default:
                break;
        }
    }

    public void printStateAndCandyCount() {
        System.out.println("CandyMachine{" +
                "state=" + state +
                ", candyCount=" + candyCount +
                '}');
    }
}

