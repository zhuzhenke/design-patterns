package com.design.pattern.observer.me;

/**
 * @author zhuzhenke
 * @date 2019/4/18
 */
public interface Follower {

    /**
     * notice new push events to follower
     *
     * @param starOwner star owner
     * @param object    receive object
     */
    void noticeOnNewPush(StarOwner starOwner, Object object);
}
