package com.design.pattern.observer.me;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.apache.commons.collections.CollectionUtils;

import java.util.Collection;

/**
 * multiple
 *
 * @author zhuzhenke
 * @date 2019/4/18
 */
public class GithubServer {
    private Multimap<StarOwner, Follower> followerMultimap = ArrayListMultimap.create();

    public void addFollower(StarOwner starOwner, Follower follower) {
        if (starOwner != null && follower != null) {
            if (!followerMultimap.containsEntry(starOwner, follower)) {
                followerMultimap.put(starOwner, follower);
            }
        }
    }

    public void removeFollower(StarOwner starOwner, Follower follower) {
        if (starOwner != null && follower != null) {
            followerMultimap.remove(starOwner, follower);
        }
    }

    public Integer getFollowerQuantity(StarOwner starOwner) {
        Collection<Follower> followerCollection = followerMultimap.get(starOwner);
        if (followerCollection == null) {
            return 0;
        }
        return followerCollection.size();
    }

    public void notifyFollowers(StarOwner starOwner, Object object) {
        Collection<Follower> followerCollection = followerMultimap.get(starOwner);
        if (CollectionUtils.isNotEmpty(followerCollection)) {
            followerCollection.forEach(follower -> {
                follower.noticeOnNewPush(starOwner, object);
            });
        }
    }
}
