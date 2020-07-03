package com.zipcodewilmington.assessment2.part2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Router {

    Map<String, String> newMap = new LinkedHashMap<>();

    public void add(String path, String controller) {
        newMap.put(path,controller);
    }

    public Integer size() {
        return newMap.size();
    }

    public String getController(String path) {
        return newMap.get(path);
    }

    public void update(String path, String studentController) {
        newMap.replace(path, studentController);
    }

    public void remove(String path) {
        newMap.remove(path);
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Map.Entry<String, String> entry: newMap.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
