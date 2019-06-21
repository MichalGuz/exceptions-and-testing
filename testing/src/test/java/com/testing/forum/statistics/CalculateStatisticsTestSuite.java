package com.testing.forum.statistics;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {
    private static int testCounter;
    private static int finishedTestCounter;

    @Before
    public void beforeEveryTest() {
        ArrayList<String> conditions = new ArrayList<>();
        conditions.add("when number of posts equals 0, number of comments equals 10 and numbers of users equals 10");
        conditions.add("when number of posts equals 1000, number of comments equals 10000 and numbers of users equals 100");
        conditions.add("when number of posts equals 0 and we don't know numbers of users and comments");
        conditions.add("when number of posts equals 1000 and we don't know numbers of users and comments");
        conditions.add("when number of comments equals 0 and we don't know numbers of users and posts");
        conditions.add("when number of comments is less than number of posts and we don't know the numbers of users, comments and posts");
        conditions.add("when number of comments is more than number of posts and we don't know the numbers of users, comments and posts");
        conditions.add("when number of users equals 0 and we don't know numbers of posts and comments");
        conditions.add("when number of users equals 100 and we don't know numbers of posts and comments");
        System.out.println("Test #" + testCounter + " is starting.");
        System.out.println("Test executing the method calculateAdvStatistics " + conditions.get(testCounter));
        testCounter++;
    }

    @After
    public void afterEveryTest() {
        System.out.println("Test #" + finishedTestCounter + " is finished.\n");
        finishedTestCounter++;
    }

    @Test
    public void test0ofCalculateAdvStatistics() {
        // condition of test is described in collection 'conditions' - index 0
        // given
        Statistics statisticsMock = mock(Statistics.class);
        int postsNumber = 0;
        int commentsNumber = 10;
        List<String> listOfUsers = new ArrayList<String>();
        String user = "user";
        for (int i = 0; i < 10; i++) {
            user = user + i;
            listOfUsers.add(user);
        }
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        // when
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        // then
        Assert.assertTrue(calculateStatistics.getNumberOfPosts() == 0);
        Assert.assertTrue(calculateStatistics.getNumberOfUsers() == 10);
    }

    @Test
    public void test1OfCalculateAdvStatistics() {
        // condition of test is described in collection 'conditions' - index 1
        // given
        Statistics statisticsMock = mock(Statistics.class);
        int postsNumber = 1000;
        int commentsNumber = 10000;
        List<String> listOfUsers = new ArrayList<String>();
        String user = "user";
        for (int i = 0; i < 100; i++) {
            user = user + i;
            listOfUsers.add(user);
        }
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        // when
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        // then
        Assert.assertTrue(calculateStatistics.getNumberOfPosts() == 1000);
        Assert.assertTrue(calculateStatistics.getNumberOfUsers() == 100);
        Assert.assertTrue(calculateStatistics.getNumberOfComments() == 10000);
        Assert.assertTrue(calculateStatistics.getAverageCommentsPerPost() == 10);
    }

    @Test
    public void test2OfCalculateAdvStatistics() {
        // condition of test is described in collection 'conditions' - index 2
        // given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(0);

        // when
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        // then
        Assert.assertEquals(0, calculateStatistics.getNumberOfPosts(), 0.001);
        Assert.assertEquals(0, calculateStatistics.getAveragePostsPerUser(), 0.001);
        Assert.assertEquals(0, calculateStatistics.getAverageCommentsPerUser(), 0.001);
        Assert.assertEquals(0, calculateStatistics.getAverageCommentsPerPost(), 0.001);
    }

    @Test
    public void test3OfCalculateAdvStatistics() {
        // condition of test is described in collection 'conditions' - index 3
        // given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        // when
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        // then
        Assert.assertEquals(1000, calculateStatistics.getNumberOfComments(), 0.001);
        Assert.assertEquals(0, calculateStatistics.getAveragePostsPerUser(), 0.001);
        Assert.assertEquals(0, calculateStatistics.getAverageCommentsPerUser(), 0.001);
        Assert.assertEquals(0, calculateStatistics.getAverageCommentsPerPost(), 0.001);
    }

    @Test
    public void test4OfCalculateAdvStatistics() {
        // condition of test is described in collection 'conditions' - index 4
        // given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(0);

        // when
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        // then
        Assert.assertEquals(0, calculateStatistics.getNumberOfComments(), 0.001);
        Assert.assertEquals(0, calculateStatistics.getAverageCommentsPerUser(), 0.001);
        Assert.assertEquals(0, calculateStatistics.getAverageCommentsPerPost(), 0.001);
    }

    @Test
    public void test5ofCalculateAdvStatistics() {
        // condition of test is described in collection 'conditions' - index 5
        // given
        Statistics statisticsMock = mock(Statistics.class);
        int numbersOfPosts = statisticsMock.postsCount();
        int numbersOfComments = numbersOfPosts - 1;
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(numbersOfComments);

        // when
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        // then
        Assert.assertEquals(0, calculateStatistics.getAverageCommentsPerPost(), 0.001);
        Assert.assertEquals(0, calculateStatistics.getAverageCommentsPerUser(), 0.001);
        Assert.assertEquals(0, calculateStatistics.getAveragePostsPerUser(), 0.001);
    }

    @Test
    public void test6ofCalculateAdvStatistics() {
        // condition of test is described in collection 'conditions' - index 6
        // given
        Statistics statisticsMock = mock(Statistics.class);
        int numbersOfPosts = statisticsMock.postsCount();
        int numbersOfComments = numbersOfPosts + 1;
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(numbersOfComments);

        // when
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        // then
        Assert.assertEquals(0, calculateStatistics.getAverageCommentsPerPost(), 0.001);
        Assert.assertEquals(0, calculateStatistics.getAverageCommentsPerUser(), 0.001);
        Assert.assertEquals(0, calculateStatistics.getAveragePostsPerUser(), 0.001);
    }

    @Test
    public void test7OfCalculateAdvStatistics() {
        // condition of test is described in collection 'conditions' - index 7
        // given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        ArrayList<String> users = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);

        // when
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        // then
        Assert.assertEquals(0, calculateStatistics.getNumberOfComments(), 0.001);
        Assert.assertEquals(0, calculateStatistics.getAverageCommentsPerUser(), 0.001);
        Assert.assertEquals(0, calculateStatistics.getAverageCommentsPerPost(), 0.001);
    }

    @Test
    public void test8OfCalculateAdvStatistics() {
        // condition of test is described in collection 'conditions' - index 8
        // given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        ArrayList<String> users = new ArrayList<>();
        for(int k = 0; k < 99; k++){
            String userName = "user" + k;
            users.add(userName);
        }
        when(statisticsMock.usersNames()).thenReturn(users);

        // when
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        // then
        Assert.assertEquals(0, calculateStatistics.getNumberOfComments(), 0.001);
        Assert.assertEquals(0, calculateStatistics.getAverageCommentsPerUser(), 0.001);
        Assert.assertEquals(0, calculateStatistics.getAverageCommentsPerPost(), 0.001);
    }
}