package com.testing.forum.statistics;

import java.util.List;

public interface Statistics {
    // list of users names
    List<String> usersNames();

    // total quantity of forum posts
    int postsCount();

    // total quntity of forum comments
    int commentsCount();
}
