package com.kodilla.stream.forum;

import org.junit.Assert;
import org.junit.Test;
import stream.Forum.ForumUser;

public class ForumUserTestSuite {

    @Test
    public void testGetLocationOfFriends(){

        ForumUser user1 = new ForumUser("alan01", "Alan Kosovsky", "Washington");
        ForumUser user2 = new ForumUser("ethanreard", "Ethan Reard", "Miami");
        ForumUser user3 = new ForumUser("eRiK", "Erik Hull", "Key West");
        ForumUser user4 = new ForumUser("booth", "Mya Booth", "Washington");
        ForumUser user5 = new ForumUser("nicole1987", "Nicole Lee", "Orlando");
        ForumUser user6 = new ForumUser("nobody", "Briana Williams", "Miami");
        ForumUser user7 = new ForumUser("bigmac", "Robert Macdonald", "Washington");
        ForumUser user8 = new ForumUser("thebigone", "Clay Small", "Orlando");
        ForumUser user9 = new ForumUser("user121212", "Marisa Frank", "Washington");
        ForumUser user10 = new ForumUser("lawyer", "Lexie John", "Miami");

        //user1
        user1.addFriend(user3);
        user1.addFriend(user7);
        user1.addFriend(user10);

        //user3
        user3.addFriend(user1);
        user3.addFriend(user2);
        user3.addFriend(user7);
        user3.addFriend(user9);

        //user7
        user7.addFriend(user1);
        user7.addFriend(user3);

        //user 10
        user10.addFriend(user1);

        //user9
        user9.addFriend(user3);

        //user2
        user7.addFriend(user3);

        Assert.assertEquals(3, user1.getLocationOfFriends().size());
        Assert.assertTrue(user1.getLocationOfFrienfsOfFriends().contains("Key West"));
        Assert.assertTrue(user1.getLocationOfFrienfsOfFriends().contains("Washington"));
        Assert.assertTrue(user1.getLocationOfFrienfsOfFriends().contains("Miami"));
        Assert.assertFalse(user1.getLocationOfFrienfsOfFriends().contains("Orlando"));

    }

}
