package org.example.Models;

public interface EvictionStrategy {

    char getData(int key);

    void putData(Data data);
}
