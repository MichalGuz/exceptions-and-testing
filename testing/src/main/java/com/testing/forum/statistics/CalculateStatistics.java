package com.testing.forum.statistics;

public class CalculateStatistics {
    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        numberOfUsers = statistics.usersNames().size();

        numberOfPosts = statistics.postsCount();

        numberOfComments  = statistics.commentsCount();

        averagePostsPerUser = numberOfPosts / numberOfUsers;

        averageCommentsPerUser = numberOfComments / numberOfUsers;

        averageCommentsPerPost = numberOfComments / numberOfPosts;

    }


//    int calculateNumberOfUsers(){
//        return numberOfUsers;
//    }
//
//    int calculateNumberOfPosts(){
//        return numberOfPosts;
//    }
//
//    int calculateNumberOfComments(){
//        return numberOfComments;
//    }
//
//    double calculateAveragePostsPerUser(){
//        return averagePostsPerUser;
//    }
//
//    double calculateAverageCommentsPerUser(){
//        return averageCommentsPerUser;
//    }
//
//    double calculateAverageCommentsPerPost(){
//        return averageCommentsPerPost;
//    }
}

