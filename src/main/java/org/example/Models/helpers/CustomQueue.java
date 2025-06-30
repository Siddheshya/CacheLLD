package org.example.Models.helpers;

import org.example.Models.Data;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class CustomQueue {

    private final int cacheSize;

    private Map<Integer,Character> mp;

    Queue<Integer> queue;

    public CustomQueue(int cacheSize) {
        this.cacheSize = cacheSize;
        mp = new HashMap<>();
        queue = new LinkedList<>();
    }

    public void putData(Data data){
        if(mp.size()==cacheSize){
            int key = queue.poll();
            mp.remove(key);
        }
        mp.put(data.getKey(), data.getValue());
        queue.add(data.getKey());
    }

    public char getValue(int key){
        if(!mp.containsKey(key)){
            System.out.println("Key not found");
            throw new NullPointerException("Key not found");
        }
        return mp.get(key);
    }

}
