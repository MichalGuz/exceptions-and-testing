package com.testing.forum.statistics;

public class CalculateStatistics {
    Statistics statistics;
    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    public Statistics getStatistics() {
        return statistics;
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

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        numberOfUsers = statistics.usersNames().size();

        numberOfPosts = statistics.postsCount();

        numberOfComments  = statistics.commentsCount();

        if(numberOfPosts > 0 && numberOfUsers >0){
            averagePostsPerUser = numberOfPosts / numberOfUsers;
        } else {
            averagePostsPerUser = 0;
        }

        if(numberOfComments > 0 && numberOfUsers > 0) {
            averageCommentsPerUser = numberOfComments / numberOfUsers;
        } else {
            averageCommentsPerUser = 0;
        }

        if(numberOfComments > 0 && numberOfPosts > 0){
            averageCommentsPerPost = numberOfComments / numberOfPosts;
        } else {
            averageCommentsPerPost = 0;
        }

    }
}

