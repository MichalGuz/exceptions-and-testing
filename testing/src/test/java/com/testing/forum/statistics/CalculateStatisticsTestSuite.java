package com.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatistics(){
        // given
        Statistics statisticsMock = mock(Statistics.class);
        int postsNumber = 10;
        int commentsNumber = 10;
        List<String> listOfUsers = new ArrayList<String>();
        String user = "user";
        for(int i = 10; i<10; i++){
            user = user + i;
            listOfUsers.add(user);
        }
        int usersNumber = 10;
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.usersNames()).thenReturn(listOfUsers);
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        // when
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        // then
        Assert.assertTrue(10 == calculateStatistics.getNumberOfPosts());

    }

}
