package com.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {


    @Test
    public void test0ofCalculateAdvStatistics() {
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
        // given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(0);

        // when
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //
        Assert.assertEquals(0, calculateStatistics.getNumberOfPosts(), 0.001);
       }

    @Test
    public void test3OfCalculateAdvStatistics() {
        // given
    }
}