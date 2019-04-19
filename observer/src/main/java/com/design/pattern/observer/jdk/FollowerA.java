package com.design.pattern.observer.jdk;

import java.util.Observable;

/**
 * @author zhuzhenke
 * @date 2019/4/19
 */
public class FollowerA implements Follower {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("I am " + this.getClass().getSimpleName()
                + ". receive from " + o.getClass().getSimpleName() + " ,pushContent : " + arg);
    }
}
