package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void  testDefaultSharingStrategies(){
        User user = new Millenials("Angie");
        User user2 = new YGeneration("yUser");

        String angieMedium = user.sharePost();
        String yUserMedium = user2.sharePost();
        Assert.assertEquals("FACEBOOK", angieMedium);
        Assert.assertEquals("TWITTER", yUserMedium);
    }

    @Test
    public void testIndividualSharingStrategy(){
        User user = new Millenials("Angie");
        User user2 = new YGeneration("yUser");

        user.setMedium(new SnapchatPublisher());
        user2.setMedium(new FacebookPublisher());
        String angieMedium = user.sharePost();
        String yUserMedium = user2.sharePost();
        Assert.assertEquals("SNAPCHAT", angieMedium);
        Assert.assertEquals("FACEBOOK", yUserMedium);



    }

}
