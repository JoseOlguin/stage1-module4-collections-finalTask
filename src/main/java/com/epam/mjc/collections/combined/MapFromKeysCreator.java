package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.List;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> outputMap = new HashMap<>();

        sourceMap.forEach(
            (key, value) -> {
                int length = key.length();
                HashSet<String> set = (HashSet<String>) outputMap.get(length);
                if (set == null) {
                    set = new HashSet<>(List.of(key));
                } else {
                    set.add(key);
                }
                outputMap.put(length, set);
            }
        );

        return outputMap;
    }
}
