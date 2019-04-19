package com.design.pattern.observer.jdk;


import java.util.Observable;

/**
 * @author zhuzhenke
 * @date 2019/4/19
 */
public class GithubServer extends Observable {
    public void addFollower(Follower follower) {
        addObserver(follower);
    }

    public void removeFollower(Follower follower) {
        deleteObserver(follower);
    }

    public Integer getFollowerQuantity() {
        return countObservers();
    }

    public void pushNewCodes(Object object) {
        this.setChanged();
        this.notifyObservers(object);
    }
}
