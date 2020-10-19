package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("==== Find items by name ====");
        String name = input.askString("Please enter Name");
        List<Item> findName = tracker.findName(name);
        if (findName.size() == 0) {
            out.println("Error. This name not found or didn't create item.");        //Если не добавили модель или нет такого имени
        } else {
            for (int i = 0; i < findName.size(); i++) {
                out.println("Name: " + findName.get(i).getName() + "; " + "Id: " + findName.get(i).getId());
            }
        }
        return true;
    }
}
