package org.example.services;

import org.example.Models.Cache;
import org.example.Models.CacheImpl;
import org.example.Models.Data;
import org.example.Models.EvictionStrategy;

public class CacheManagerImpl implements CacheManager {

    private Cache cache;

    @Override
    public void initializeCache(EvictionStrategy evictionStrategy,int capacity) {
        this.cache = new CacheImpl(evictionStrategy,capacity);
    }

    @Override
    public void changeEvictionStrategy(EvictionStrategy evictionStrategy) {
        cache.changeEvictionStrategy(evictionStrategy);
    }

    @Override
    public void put(Data data) {
        cache.putData(data);
    }

    @Override
    public char getData(int key) {
        return cache.getData(key);
    }
}
