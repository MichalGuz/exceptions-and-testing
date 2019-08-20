package com.exceptions.index_out_of_bounds;

import java.util.List;

public class IndexExceptionMain {
    public static void main(String[] args) {
        YourVideoCollector videoCollector = new YourVideoCollector();
        List<String> collection = videoCollector.getCollectio();

        String video1 = collection.get(0);
        String video2 = collection.get(2);
        System.out.println(video1);
        System.out.println(video2);
    }
}
