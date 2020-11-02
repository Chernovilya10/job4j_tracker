package ru.job4j.tracker;

import java.util.*;

public class Tracker {
    private final List<Item> items = new ArrayList<>();

    /**
     * add - Метод добавляет в массив this.items модель с новым случайно сгенерированным уник. ключом.
     *
     * @param item - передаваемый параметр, в данном случае модель.
     * @return - возвращаем модель уже с новым уник. ключом.
     */
    public Item add(Item item) {
        item.setId(generateId());
        items.add(item);
        return item;
    }

    /**
     * Для генерации уник. ключа необход. исп-ть кл. Random, у кот. есть метод nextLong() - он возвращает произвольное число
     * Метод System.currentTimeMillis() возвращает число типа Long - кол-во миллисеккунд прошло с 1 янв 1970 года
     * Для преобразования переменной в тип String исп-ем метод String.valueOf
     *
     * @return - возвращает стринговый уник. ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * findAll - метод используется для возврата копии массива this.items без элементов null
     * Item[] itemsWithOutNull = new Item[items.length]; - создали новый массив, у которого будет такая же длина, как и у this.items
     * Далее перебираем не null эл-ты массива items и записываем по очереди в новый массив.
     * Arrays.copyOf(itemsWithOutNull, size) - обрезаем новый массив до того количества эл-ов, которые были переданы, чтобы избавиться от null элементов.
     *
     * @return - возвращает копию массива this.items без элементов null
     */
        public List<Item> findAll() {
//        Item[] itemsWithOutNull = new Item[position];
//        int size = 0;
//        for (int i = 0; i < position; i++) {    //использую position, т.к. макс кол-во эл-ов в массиве items будет равно position
//            Item it = items[i];
//            if (it != null) {
//                itemsWithOutNull[size] = it;
//                size++;
//            }
//        }
//        return Arrays.copyOf(itemsWithOutNull, size);
        return this.items;
        }

    /**
     * findName - метод используется для возврата копии массива this.items c совпадающим заданным именем.
     * Item[] itemsWithEqualsName = new Item[items.length]; - создали новый массив, у которого будет такая же длина, как и у this.items
     * Далее перебираем эл-ты массива items с одинаковым заданным именем key и записываем по очереди в новый массив.
     * Arrays.copyOf(itemsWithEqualsName, size) - обрезаем новый массив до того количества эл-ов, которые были переданы, чтобы избавиться от null элементов.
     *
     * @return - возвращает копию массива this.items c заданным именем.
     */

    public List<Item> findName(String key) {
        List<Item> itemsWithEqualsName = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equals(key)) {
                itemsWithEqualsName.add(items.get(i));
            }
        }
        return itemsWithEqualsName;
    }

    /**
     * findById - метод используется для поиска модели по номеру Id.
     *
     * @return - возвращает модель с найденным Id.
     */
    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    /**
     * indexOf - метод используется для поиска индекса эл-та массива с заданным Id.
     *
     * @return - индекс эл-та массива.
     */
    private int indexOf(String id) {
        int rst = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * replace - метод используется для замены эл-та с заданным Id новой моделью с сохранением Id.
     *
     * @return - булево значение от сравнения Id новой модели и заменнной.
     */
    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        boolean rst = index != -1;        //производим валидацию, индекс не должен быть равен -1.
        if (rst) {
        item.setId(id);                //передаем Id от замененной модели, т.е. Id у эл-та, который заменили, остался
        items.set(index, item);      //метод set позволяет заменить ячейку в коллекции. Далее мы передаем уже новому эл-ту старый Id

        }
        return rst;
    }

    /**
     * delete - метод используется для удаления эл-та с заданным Id со сдвигом массива влево, заменяя образовавшуюся дырку.
     * System.arraycopy(source, startPos, dist, distPos, size); - метод в Java, который позволяет скопировать блоки массива целиком.
     * source - массив откуда нужно скопировать элементы начиная с позиции startPos и до позиции startPos + size.
     * size - сколько элементов взять начиная от startPos.
     * dist - массив, куда вставить скопированные элементы от source. Этот метод может работать с одним массивом для source и dist.
     * distPos - начиная с какого элемента вставлять скопированные ячейки
     */
    public boolean delete(String id) {
        int index = indexOf(id);
        boolean rst = index != -1;        //производим валидацию, индекс не должен быть равен -1.
        if (rst) {
            items.remove(index);
        }
        return rst;
    }

    /**
     * сортировака по возрастанию
     */
    public void sortByNameIncrease() {
        Collections.sort(this.items, new SortByNameComparator());
    }

    /**
     * сортировка по убыванию
     */
    public void sortByNameDecrease() {
        Collections.sort(this.items, Collections.reverseOrder(new SortByNameComparator()));
    }
}