package ru.job4j.poly;

import ru.job4j.tracker.ConsoleInput;
import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;


/**
 * Данный класс позволяет нам работать с классом Scanner, через интрефейс Input, для выполнения методов класса Tracker
 * с помощью обращения пользователя через консоль.
 */
public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
//            System.out.println("Select:");
            int select = input.askInt("Select:");
            if (select == 0) {
                System.out.println("==== Create a new Item ====");
//                System.out.println("Enter Name");
                String name = input.askString("Enter Name");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("==== Show all Items without null elements ====");
                Item[] findAll = tracker.findAll();
                if (findAll.length == 0) {
                    System.out.println("Please crate new Item!");        //Если не добавили модель
                } else {
                    for (int i = 0; i < findAll.length; i++) {
                        System.out.println("Name: " + findAll[i].getName() + "; " + "Id: " + findAll[i].getId());
                    }
                }
            } else if (select == 2) {
                System.out.println("==== Edit item ====");
//                System.out.println("Please enter Id");
                String id = input.askString("Please enter Id");
//                System.out.println("Please enter new Name of the item");
                String name = input.askString("Please enter new Name of the item");
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Success");
                } else {
                    System.out.println("Error");
                }
            } else if (select == 3) {
                System.out.println("==== Delete item ====");
//                System.out.println("Please enter Id");
                String id = input.askString("Please enter Id");
                if (tracker.delete(id)) {
                    System.out.println("Success");
                } else {
                    System.out.println("Error");
                }
            } else if (select == 4) {
                System.out.println("==== Find item by Id ====");
//                System.out.println("Please enter Id");
                String id = input.askString("Please enter Id");
                Item findById = tracker.findById(id);
                System.out.println("Name: " + findById.getName() + "; " + "Id: " + findById.getId());
            } else if (select == 5) {
                System.out.println("==== Find items by name ====");
//                System.out.println("Please enter Name");
                String name = input.askString("Please enter Name");
                Item[] findName = tracker.findName(name);
                if (findName.length == 0) {
                    System.out.println("Error. This name not found or didn't create item.");        //Если не добавили модель или нет такого имени
                } else {
                    for (int i = 0; i < findName.length; i++) {
                        System.out.println("Name: " + findName[i].getName() + "; " + "Id: " + findName[i].getId());
                    }
                }
            } else if (select == 6) {
                System.out.println("Bye bye.");
                run = false;
            } else if (select < 0 && select > 6) {
                System.out.println("Repeat again.");
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        StartUI startUI = new StartUI();
        startUI.init(input, tracker);
    }
}