package com.testing.forum.statistics;

public class CalculateStatistics {
    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;


    int calculateNumberOfUsers(){
        return numberOfUsers;
    }

    int calculateNumberOfPosts(){
        return numberOfPosts;
    }

    int calculateNumberOfComments(){
        return numberOfComments;
    }

    double calculateAveragePostsPerUser(){
        return averagePostsPerUser;
    }

    double calculateAverageCommentsPerUser(){
        return averageCommentsPerUser;
    }

    double calculateAverageCommentsPerPost(){
        return averageCommentsPerPost;
    }
}

