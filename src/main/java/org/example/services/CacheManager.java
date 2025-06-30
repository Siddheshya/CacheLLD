package org.example.services;

import org.example.Models.Data;
import org.example.Models.EvictionStrategy;

public interface CacheManager {

    public void initializeCache(EvictionStrategy evictionStrategy,int size);

    public void changeEvictionStrategy(EvictionStrategy evictionStrategy);

    public void put(Data data);

    public char getData(int key);
}
