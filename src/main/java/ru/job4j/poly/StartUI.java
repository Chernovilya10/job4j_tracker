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

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("==== Create a new Item ====");
        String name = input.askString("Enter Name");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showAllItems(Tracker tracker) {
        System.out.println("==== Show all Items without null elements ====");
        Item[] findAll = tracker.findAll();
        if (findAll.length == 0) {
            System.out.println("Please crate new Item!");        //Если не добавили модель
        } else {
            for (int i = 0; i < findAll.length; i++) {
                System.out.println("Name: " + findAll[i].getName() + "; " + "Id: " + findAll[i].getId());
            }
        }
    }

    public static void editItem(Input input, Tracker tracker) {
        System.out.println("==== Edit item ====");
        String id = input.askString("Please enter Id");
        String name = input.askString("Please enter new Name of the item");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("==== Delete item ====");
        String id = input.askString("Please enter Id");
        if (tracker.delete(id)) {
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }
    }

    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("==== Find item by Id ====");
        String id = input.askString("Please enter Id");
        Item findById = tracker.findById(id);
        System.out.println("Name: " + findById.getName() + "; " + "Id: " + findById.getId());
    }

    public static void findItemsByName(Input input, Tracker tracker) {
        System.out.println("==== Find items by name ====");
        String name = input.askString("Please enter Name");
        Item[] findName = tracker.findName(name);
        if (findName.length == 0) {
            System.out.println("Error. This name not found or didn't create item.");        //Если не добавили модель или нет такого имени
        } else {
            for (int i = 0; i < findName.length; i++) {
                System.out.println("Name: " + findName[i].getName() + "; " + "Id: " + findName[i].getId());
            }
        }
    }

    public static boolean exit() {
        System.out.println("Bye bye.");
        return false;
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select:");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllItems(tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemsByName(input, tracker);
            } else if (select == 6) {
                run = StartUI.exit();
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