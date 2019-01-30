package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.internal.configuration.injection.MockInjection;

import java.util.ArrayList;
import java.util.List;

public class TestStaticsticsCounterWithMock {
    Statistics statisticsMock;
    StaticticsCounter staticticsCounter;
    int postCountTest;
    int commentsCountTest;
    List<String> userNamesTest;


    @Before
    public void beforeEveryTest() {
        statisticsMock = Mockito.mock(Statistics.class);
        staticticsCounter = new StaticticsCounter();


    }

    @Test
    public void testNumberOfPostsEqualZero(){
        postCountTest=0;
        userNamesTest=new ArrayList<>();
        userNamesTest.add("test");
        commentsCountTest=10;
        Mockito.when(statisticsMock.postCount()).thenReturn(postCountTest);
        Mockito.when(statisticsMock.userNames()).thenReturn(userNamesTest);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(commentsCountTest);
        staticticsCounter.calculateAdvStatistics(statisticsMock);
        int numberOfPosts=staticticsCounter.getNumberOfPosts();
        double avgPostPerUserTest=staticticsCounter.getAvgNumberOfPostsPerUser();
        double avgCommentsPerPostTest=staticticsCounter.getAvgNumberOfCommentsPerPost();
        Assert.assertEquals(0,numberOfPosts);
        Assert.assertEquals(0.0, avgPostPerUserTest,0);
        Assert.assertEquals(-1,avgCommentsPerPostTest,0);
    }


    @Test
    public void testNumberOfPosts(){
        postCountTest=1000;
        userNamesTest=new ArrayList<>();
        userNamesTest.add("test");
        commentsCountTest=10000;
        Mockito.when(statisticsMock.postCount()).thenReturn(postCountTest);
        Mockito.when(statisticsMock.userNames()).thenReturn(userNamesTest);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(commentsCountTest);
        staticticsCounter.calculateAdvStatistics(statisticsMock);
        int numberOfPosts=staticticsCounter.getNumberOfPosts();
        double avgPostPerUserTest=staticticsCounter.getAvgNumberOfPostsPerUser();
        double avgCommentsPerPostTest=staticticsCounter.getAvgNumberOfCommentsPerPost();
        Assert.assertEquals(1000, numberOfPosts);
        Assert.assertEquals(1000.0, avgPostPerUserTest,0);
        Assert.assertEquals(10, avgCommentsPerPostTest,0);
    }


    @Test
    public void testNumberOfCommentEqualZero(){
        commentsCountTest=0;
        postCountTest=0;
        userNamesTest=new ArrayList<>();
        userNamesTest.add("test");
        Mockito.when(statisticsMock.postCount()).thenReturn(postCountTest);
        Mockito.when(statisticsMock.userNames()).thenReturn(userNamesTest);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(commentsCountTest);
        staticticsCounter.calculateAdvStatistics(statisticsMock);
        int numberOfComments=staticticsCounter.getNumberOfComments();
        double avgCommentsPerPostTest=staticticsCounter.getAvgNumberOfCommentsPerPost();
        double avgCommentsPerUserTest=staticticsCounter.getAvgNumberOfCommentsPerUser();
        Assert.assertEquals(0, numberOfComments);
        Assert.assertEquals(-1, avgCommentsPerPostTest,0);
        Assert.assertEquals(0, avgCommentsPerUserTest,0);
    }

    @Test
    public void testNumberOfCommentsLessThenNumberOfPosts(){
        commentsCountTest=10;
        postCountTest=100;
        Mockito.when(statisticsMock.postCount()).thenReturn(postCountTest);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(commentsCountTest);
        staticticsCounter.calculateAdvStatistics(statisticsMock);
        double avgCommentsPerPostTest=staticticsCounter.getAvgNumberOfCommentsPerPost();
        Assert.assertEquals(0.1, avgCommentsPerPostTest,0);
    }


    @Test
    public void testNumberOfCommentsGreaterThenNumberOfPosts(){
        commentsCountTest=125;
        postCountTest=10;
        Mockito.when(statisticsMock.postCount()).thenReturn(postCountTest);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(commentsCountTest);
        staticticsCounter.calculateAdvStatistics(statisticsMock);
        double avgCommentsPerPostTest=staticticsCounter.getAvgNumberOfCommentsPerPost();
        Assert.assertEquals(12.5, avgCommentsPerPostTest,0);
    }



    @Test
    public void testNumberOfUsersEqualZero(){
        userNamesTest = new ArrayList<>();
        postCountTest=10;
        commentsCountTest=15;
        Mockito.when(statisticsMock.postCount()).thenReturn(postCountTest);
        Mockito.when(statisticsMock.userNames()).thenReturn(userNamesTest);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(commentsCountTest);
        staticticsCounter.calculateAdvStatistics(statisticsMock);
        int numberOfUsers=staticticsCounter.getNumberOfUsers();
        double avgPostPerUserTest=staticticsCounter.getAvgNumberOfPostsPerUser();
        double avgCommentsPerUserTest=staticticsCounter.getAvgNumberOfCommentsPerUser();
        Assert.assertEquals(0,numberOfUsers);
        Assert.assertEquals(-1, avgCommentsPerUserTest,0);
        Assert.assertEquals(-1, avgPostPerUserTest,0);
    }



    @Test
    public void testNumberOfUsers(){
        userNamesTest=new ArrayList<>();
        postCountTest=10;
        commentsCountTest=15;
        Mockito.when(statisticsMock.postCount()).thenReturn(postCountTest);
        Mockito.when(statisticsMock.userNames()).thenReturn(userNamesTest);
        Mockito.when(statisticsMock.commentsCount()).thenReturn(commentsCountTest);
        for(int i=0; i<100;i++){
            userNamesTest.add("i");
        }
        staticticsCounter.calculateAdvStatistics(statisticsMock);
        int numberOfUsers=staticticsCounter.getNumberOfUsers();
        double avgPostPerUserTest=staticticsCounter.getAvgNumberOfPostsPerUser();
        double avgCommentsPerUserTest=staticticsCounter.getAvgNumberOfCommentsPerUser();
        Assert.assertEquals(100,numberOfUsers);
        Assert.assertEquals(0.15, avgCommentsPerUserTest,0);
        Assert.assertEquals(0.1, avgPostPerUserTest,0);
    }




}
