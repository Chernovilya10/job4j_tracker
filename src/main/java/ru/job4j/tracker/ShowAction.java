package ru.job4j.tracker;

public class ShowAction implements UserAction {
    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("==== Show all Items without null elements ====");
        Item[] findAll = tracker.findAll();
        if (findAll.length == 0) {
            System.out.println("Please crate new Item!");        //Если не добавили модель
        } else {
            for (int i = 0; i < findAll.length; i++) {
                System.out.println("Name: " + findAll[i].getName() + "; " + "Id: " + findAll[i].getId());
            }
        }
        return true;
    }
}
