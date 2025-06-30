package org.example.Models;

public class CacheImpl implements Cache {

    private EvictionStrategy evictionStrategy;

    private final int capacity;

    public CacheImpl(EvictionStrategy evictionStrategy,int capacity) {
        this.evictionStrategy = evictionStrategy;
        this.capacity = capacity;
    }

    @Override
    public char getData(int key) {
        return evictionStrategy.getData(key);
    }

    @Override
    public void putData(Data data) {
        evictionStrategy.putData(data);
    }

    public void changeEvictionStrategy(EvictionStrategy evictionStrategy) {
        this.evictionStrategy = evictionStrategy;
    }
}
