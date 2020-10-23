package ru.job4j.collections.map;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> newMap = new HashMap<>();
        newMap.put("i.chernov93@yandex.ru", "Ilia Chernov");
        newMap.put("ivanovii@ya.ru", "Ivanov Ivan");
        for (String key : newMap.keySet()) {
            String value = newMap.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println("Use method 'enrtySet()': ");
        for (Map.Entry<String, String> entry : newMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}