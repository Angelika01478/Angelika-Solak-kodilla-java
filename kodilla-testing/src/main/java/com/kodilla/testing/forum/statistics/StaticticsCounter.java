package com.kodilla.testing.forum.statistics;

public class StaticticsCounter {


    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double avgNumberOfCommentsPerUser;
    private double avgNumberOfPostsPerUser;
    private double avgNumberOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        numberOfUsers=statistics.userNames().size();
        numberOfPosts=statistics.postCount();
        numberOfComments=statistics.commentsCount();
        if (numberOfUsers==0){
            avgNumberOfCommentsPerUser=-1;
        }else {
            avgNumberOfCommentsPerUser=(double)numberOfComments/(double) numberOfUsers;
        }
        if (numberOfUsers==0){
            avgNumberOfPostsPerUser=-1;
        }else{
            avgNumberOfPostsPerUser=(double)numberOfPosts/(double)numberOfUsers;
        }
        if(numberOfPosts==0){
            avgNumberOfCommentsPerPost=-1;
        }else {
            avgNumberOfCommentsPerPost=(double)numberOfComments/(double)numberOfPosts;
        }


    }

    public void showStatistics(){
        System.out.println("[number of user]=" + numberOfUsers);
        System.out.println("[number of posts]=" + numberOfPosts);
        System.out.println("[number of comments]=" + numberOfComments);
        System.out.println("[average number of posts per user]=" + avgNumberOfPostsPerUser);
        System.out.println("[number of comments per user]=" + avgNumberOfCommentsPerUser);
        System.out.println("[number of comments per post]=" + avgNumberOfCommentsPerPost);
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvgNumberOfCommentsPerUser() {
        return avgNumberOfCommentsPerUser;
    }

    public double getAvgNumberOfPostsPerUser() {
        return avgNumberOfPostsPerUser;
    }

    public double getAvgNumberOfCommentsPerPost() {
        return avgNumberOfCommentsPerPost;
    }
}
