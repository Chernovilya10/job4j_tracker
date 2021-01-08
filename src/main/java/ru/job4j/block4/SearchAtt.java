package ru.job4j.block4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Использование функциональных интерфейсов для решения задачи по сортировке коллекций
 */
public class SearchAtt {

    public List<Attachment> loop(Function<List<Attachment>, List<Attachment>> func, List<Attachment> list) {
        return func.apply(list);
    }

    public List<Attachment> filterSize(List<Attachment> list) {
        Function<List<Attachment>, List<Attachment>> func = new Function<List<Attachment>, List<Attachment>>() {
            @Override
            public List<Attachment> apply(List<Attachment> list) {
                List<Attachment> rsl = new ArrayList<>();
                for (Attachment att : list) {
                    if (att.getSize() > 100) {
                        rsl.add(att);
                    }
                }
                return rsl;
            }
        };
        return loop(func, list);
    }

    public List<Attachment> filterName(List<Attachment> list) {
        Function<List<Attachment>, List<Attachment>> func = new Function<List<Attachment>, List<Attachment>>() {
            @Override
            public List<Attachment> apply(List<Attachment> list) {
                List<Attachment> rsl = new ArrayList<>();
                for (Attachment att : list) {
                    if (att.getName().contains("bug")) {
                        rsl.add(att);
                    }
                }
                return rsl;
            }
        };
        return loop(func, list);
    }

    public static void main(String[] args) {
        List<Attachment> ex = Arrays.asList(
                new Attachment("New bug", 120),
                new Attachment("Old bug", 90),
                new Attachment("No", 0)
        );
        SearchAtt a = new SearchAtt();
        a.filterSize(ex);
        System.out.println(ex);
    }
}
