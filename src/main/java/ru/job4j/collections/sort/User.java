package ru.job4j.collections.sort;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(User anotherUser) {
        int rsl = this.name.compareTo(anotherUser.name);        //сравниваем имена
        if (rsl == 0) {
            rsl = this.age - anotherUser.getAge();
        }
        return rsl;
//        if (rsl != 0) {         //если отличается от нуля, возвращем или -1 или 1
//            return rsl;
//        }
//        rsl = this.age - anotherUser.getAge();      //проверяем возраст
//        if (rsl != 0) {                     //если отличен от нуля, то сортируем по возрасту
//            rsl = rsl / Math.abs(this.age - anotherUser.getAge());      //соритируем в зависимоти от возраста
//            return rsl;
//        }
//        return 0;
    }
}
