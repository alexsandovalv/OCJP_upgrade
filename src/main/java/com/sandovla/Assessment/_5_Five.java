package com.sandovla.Assessment;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class _5_Five {

    public static void main(String ... args){
        List<Integer> source = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> fish = new CopyOnWriteArrayList<>(source);
        List<Integer> mammals = Collections.synchronizedList(source);
        Set<Integer> bird = new ConcurrentSkipListSet<>();
        bird.addAll(source);

        synchronized (new Integer(10)){
            for(Integer f:fish) fish.add(4);
            for(Integer m:mammals) mammals.add(4);
            for(Integer b:bird) bird.add(5);

            System.out.println(fish.size()+" "+mammals.size()+" "+bird.size());
        }
    }


}
