package ru.job4j.collections.map;

import java.util.Set;
import java.util.TreeSet;

/**
 * Экзаменционное задание
 * Метод принимает две строки: 1 - оригинальный текст, 2 - текст, созданный из слов или предложений текста 1;
 * Необходимо проверить, что текст 2 состоит из слов текста 1;
 * Пример смотри в тесте.
 */

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean rst = false;
        String withoutSymbolsOrigin = origin.replaceAll("[^A-Za-zА-Яа-я0-9-\\s]", ""); //убираем все символы кроме букв, цифр и пробела (\\s)
        String[] originArray = withoutSymbolsOrigin.split(" ");
        Set<String> originSet = new TreeSet<>();
        for (String o : originArray) {
            originSet.add(o);
        }
        String withoutSymbolsLine = line.replaceAll("[^A-Za-zА-Яа-я0-9-\\s]", ""); //убираем все символы кроме букв, цифр и пробела (\\s)
        String[] lineArray = withoutSymbolsLine.split(" ");
        Set<String> lineSet = new TreeSet<>();
        for (String l : lineArray) {
            lineSet.add(l);
        }
        for (String s : lineSet) {
            rst = originSet.contains(s);
            if (!rst) {
                break;
            }
        }
        return rst;
    }
}
