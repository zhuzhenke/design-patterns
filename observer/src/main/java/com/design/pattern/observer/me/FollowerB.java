package com.design.pattern.observer.me;

/**
 * @author zhuzhenke
 * @date 2019/4/18
 */
public class FollowerB implements Follower {

    @Override
    public void noticeOnNewPush(StarOwner starOwner, Object object) {
        System.out.println("I am " + this.getClass().getSimpleName()
                + ". receive from " + starOwner.getClass().getSimpleName() + " ,pushContent : " + object);
    }
}
