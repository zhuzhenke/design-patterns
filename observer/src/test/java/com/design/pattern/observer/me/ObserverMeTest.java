package com.design.pattern.observer.me;

import com.design.pattern.observer.common.PushContent;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author zhuzhenke
 * @date 2019/4/18
 */
public class ObserverMeTest {

    @Test
    public void testManyFollowOneStarOwner() {
        GithubServer githubServer = new GithubServer();
        StarOwnerA starOwnerA = new StarOwnerA();

        //no follower
        PushContent pushContent = new PushContent("project-A-1", "fix bug-1");
        starOwnerA.pushNewCodes(githubServer, pushContent);
        Assert.assertEquals(0L, githubServer.getFollowerQuantity(starOwnerA).longValue());

        //add follower
        FollowerA followerA = new FollowerA();
        githubServer.addFollower(starOwnerA, followerA);

        //push
        pushContent = new PushContent("project-A-1", "fix bug-2");
        starOwnerA.pushNewCodes(githubServer, pushContent);
        Assert.assertEquals(1L, githubServer.getFollowerQuantity(starOwnerA).longValue());

        //continue to add follower
        FollowerB followerB = new FollowerB();
        githubServer.addFollower(starOwnerA, followerB);

        //push
        pushContent = new PushContent("project-A-1", "fix bug-3");
        starOwnerA.pushNewCodes(githubServer, pushContent);
        Assert.assertEquals(2L, githubServer.getFollowerQuantity(starOwnerA).longValue());

        //remove follower
        githubServer.removeFollower(starOwnerA, followerA);

        //push
        pushContent = new PushContent("project-A-1", "fix bug-4");
        starOwnerA.pushNewCodes(githubServer, pushContent);
        Assert.assertEquals(1L, githubServer.getFollowerQuantity(starOwnerA).longValue());
    }


    @Test
    public void testManyFollowManyStarOwner() {
        GithubServer githubServer = new GithubServer();
        StarOwnerA starOwnerA = new StarOwnerA();
        StarOwnerB starOwnerB = new StarOwnerB();

        //no follower
        PushContent pushContentA = new PushContent("project-A-1", "fix bug-1");
        starOwnerA.pushNewCodes(githubServer, pushContentA);
        Assert.assertEquals(0L, githubServer.getFollowerQuantity(starOwnerA).longValue());

        PushContent pushContentB = new PushContent("project-B-1", "optimize code-1");
        starOwnerB.pushNewCodes(githubServer, pushContentB);
        Assert.assertEquals(0L, githubServer.getFollowerQuantity(starOwnerB).longValue());

        //add follower
        FollowerA followerA = new FollowerA();
        githubServer.addFollower(starOwnerA, followerA);
        githubServer.addFollower(starOwnerB, followerA);

        //push
        pushContentA = new PushContent("project-A-1", "fix bug-2");
        starOwnerA.pushNewCodes(githubServer, pushContentA);
        Assert.assertEquals(1L, githubServer.getFollowerQuantity(starOwnerA).longValue());

        pushContentB = new PushContent("project-B-1", "optimize code-2");
        starOwnerB.pushNewCodes(githubServer, pushContentB);
        Assert.assertEquals(1L, githubServer.getFollowerQuantity(starOwnerB).longValue());

        //add follower
        FollowerB followerB = new FollowerB();
        githubServer.addFollower(starOwnerA, followerB);
        githubServer.addFollower(starOwnerB, followerB);

        //push
        pushContentA = new PushContent("project-A-1", "fix bug-3");
        starOwnerA.pushNewCodes(githubServer, pushContentA);
        Assert.assertEquals(2L, githubServer.getFollowerQuantity(starOwnerA).longValue());

        pushContentB = new PushContent("project-B-1", "optimize code-3");
        starOwnerB.pushNewCodes(githubServer, pushContentB);
        Assert.assertEquals(2L, githubServer.getFollowerQuantity(starOwnerB).longValue());


        //remove follower
        githubServer.removeFollower(starOwnerA, followerA);
        githubServer.removeFollower(starOwnerB, followerA);

        //push
        pushContentA = new PushContent("project-A-1", "fix bug-4");
        starOwnerA.pushNewCodes(githubServer, pushContentA);
        Assert.assertEquals(1L, githubServer.getFollowerQuantity(starOwnerA).longValue());

        pushContentB = new PushContent("project-B-1", "optimize code-4");
        starOwnerB.pushNewCodes(githubServer, pushContentB);
        Assert.assertEquals(1L, githubServer.getFollowerQuantity(starOwnerB).longValue());
    }
}