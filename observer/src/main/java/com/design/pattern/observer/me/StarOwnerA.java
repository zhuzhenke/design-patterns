package com.design.pattern.observer.me;

/**
 * @author zhuzhenke
 * @date 2019/4/19
 */
public class StarOwnerA implements StarOwner {

    @Override
    public void pushNewCodes(GithubServer githubServer,Object object) {
        System.out.println("I am " + this.getClass().getSimpleName()
                + ". pushContent : " + object);
        githubServer.notifyFollowers(this, object);
    }
}
