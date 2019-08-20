package com.exceptions.index_out_of_bounds;

import java.util.List;

public class IndexExceptionMain {
    public static void main(String[] args) {
        YourVideoCollector videoCollector = new YourVideoCollector();
        List<String> collection = videoCollector.getCollectio();

        if(collection.size() > 0) {
            String video1 = collection.get(0);
            System.out.println(video1);
            if (collection.size() > 2) {
                String video2 = collection.get(2);
                System.out.println(video2);
            }
        }
    }
}
