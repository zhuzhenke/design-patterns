package com.design.pattern.state.v2;

/**
 * @author zhuzhenke
 * @date 2019/5/1
 */
public interface State {
    /**
     * insert coin to candy machine
     * 投入硬币到糖果机中
     */
    void insertCoin();

    /**
     * you can give up turning crank and get your coin back
     * 如果你不想玩了，点击退币
     */
    void returnCoin();

    /**
     * turn crank if coin has been put into the candy machine
     * 可在投入硬币转动曲柄以获得糖果
     */
    void turnCrank();

    /**
     * get candy if you insert coin and turn crank successfully
     * 转动曲柄后来获得糖果
     */
    void giveCandy();
}
