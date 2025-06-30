package org.example.Models;

public interface Cache {

    char getData(int key);

    void putData(Data data);

    public void changeEvictionStrategy(EvictionStrategy evictionStrategy);
}
