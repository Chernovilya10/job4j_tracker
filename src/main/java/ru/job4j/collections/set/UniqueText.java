package ru.job4j.collections.set;

import java.util.HashSet;
import java.util.Set;

public class UniqueText {
    public static boolean isEquals(String originalText, String duplicateText) {
        boolean rst = true;
        String[] origin = originalText.split(" ");
        String[] text = duplicateText.split(" ");
        Set<String> check = new HashSet<>();
        for (String orig : origin) {
            check.add(orig);
        }
        for (String dublic : text) {
            rst = check.contains(dublic);
            if (!rst) {
                break;
            }
        }
        return rst;
    }
}
