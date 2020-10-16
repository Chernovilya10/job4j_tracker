package ru.job4j.tracker;

import java.util.List;

public class ShowAction implements UserAction {
    private final Output out;

    public ShowAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("==== Show all Items without null elements ====");
        List<Item> findAll = tracker.findAll();
        if (findAll.size() == 0) {
        out.println("Please crate new Item!");        //Если не добавили модель
        } else {
                for (int i = 0; i < findAll.size(); i++) {
                    out.println("Name: " + findAll.get(i).getName() + "; " + "Id: " + findAll.get(i).getId());
                }
        }
        return true;
    }
}
