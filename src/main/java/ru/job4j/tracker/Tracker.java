package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;

    /**
     * add - Метод добавляет в массив this.items модель с новым случайно сгенерированным уник. ключом.
     *
     * @param item - передаваемый параметр, в данном случае модель.
     * @return - возвращаем модель уже с новым уник. ключом.
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
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
     * @return - возвращает копию массива this.itemsбез элементов null
     */
    public Item[] findAll() {
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
    return Arrays.copyOf(items, position);
    }

    /**
     * findName - метод используется для возврата копии массива this.items c совпадающим заданным именем.
     * Item[] itemsWithEqualsName = new Item[items.length]; - создали новый массив, у которого будет такая же длина, как и у this.items
     * Далее перебираем эл-ты массива items с одинаковым заданным именем key и записываем по очереди в новый массив.
     * Arrays.copyOf(itemsWithEqualsName, size) - обрезаем новый массив до того количества эл-ов, которые были переданы, чтобы избавиться от null элементов.
     *
     * @return - возвращает копию массива this.items c заданным именем.
     */

    public Item[] findName(String key) {
        Item[] itemsWithEqualsName = new Item[position];
        int size = 0;
        for (int i = 0; i < position; i++) {    //использую position, т.к. макс кол-во эл-ов в массиве items будет равно position
            Item it = items[i];
            if (it.getName().equals(key)) {
                itemsWithEqualsName[size] = it;
                size++;
            }
        }
        return Arrays.copyOf(itemsWithEqualsName, size);
    }

    /**
     * findById - метод используется для поиска модели по номеру Id.
     *
     * @return - возвращает модель с найденным Id.
     */
    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    /**
     * indexOf - метод используется для поиска индекса эл-та массива с заданным Id.
     *
     * @return - индекс эл-та массива.
     */
    private int indexOf(String id) {
        int rst = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
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
            items[index] = item;  //заменяем модель c указанным id моделью, которую передаем вторым параметром (у передаваемой модели нет id, т.к. для нее мы не генерировали Id)
            item.setId(id);             //передаем Id от замененной модели, т.е. Id у эл-та, который заменили, остался
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
//            items[index] = null;              //присваиваем ячейке значение null
            int startPos = index + 1;            //значение индекса, с которого необх. копировать массив
            int distPos = index;               //значение индекса куда нужно вставлять массив
            int size = position - startPos;      //количесво эл-ов массива нужно скопировать, начиная от startPos
            System.arraycopy(items, startPos, items, distPos, size);
            items[position - 1] = null;       //здесь мы присваиваем последнему элементу значение null, т.к. его переместили влево
            position--;
        }
        return rst;
    }
}