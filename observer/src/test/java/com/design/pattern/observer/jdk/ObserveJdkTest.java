package com.design.pattern.observer.jdk;

import com.design.pattern.observer.common.PushContent;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhuzhenke
 * @date 2019/4/19
 */
public class ObserveJdkTest {
    @Test
    public void testManyFollowOneStarOwner() {
        GithubServer githubServer = new GithubServer();

        //no follower
        PushContent pushContent = new PushContent("project-A-1", "fix bug-1");
        githubServer.pushNewCodes(pushContent);
        Assert.assertEquals(0L, githubServer.getFollowerQuantity().longValue());

        //add follower
        FollowerA followerA = new FollowerA();
        githubServer.addFollower(followerA);

        //push
        pushContent = new PushContent("project-A-1", "fix bug-2");
        githubServer.pushNewCodes(pushContent);
        Assert.assertEquals(1L, githubServer.getFollowerQuantity().longValue());

        //continue to add follower
        FollowerB followerB = new FollowerB();
        githubServer.addFollower(followerB);

        //push
        pushContent = new PushContent("project-A-1", "fix bug-3");
        githubServer.pushNewCodes(pushContent);
        Assert.assertEquals(2L, githubServer.getFollowerQuantity().longValue());

        //remove follower
        githubServer.removeFollower(followerA);

        //push
        pushContent = new PushContent("project-A-1", "fix bug-4");
        githubServer.pushNewCodes(pushContent);
        Assert.assertEquals(1L, githubServer.getFollowerQuantity().longValue());
    }
}
