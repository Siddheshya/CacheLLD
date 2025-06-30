package org.example.Models;

import org.example.Models.helpers.CustomQueue;

public class FIFO implements EvictionStrategy {

    private final int cacheSize;

    private final CustomQueue queue;

    public FIFO(int cacheSize) {
        this.cacheSize = cacheSize;
        this.queue = new CustomQueue(cacheSize);
    }

    @Override
    public char getData(int key) {
        return queue.getValue(key);
    }

    @Override
    public void putData(Data data) {
        queue.putData(data);
    }


}

