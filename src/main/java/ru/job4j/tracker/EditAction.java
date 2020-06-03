package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("==== Edit item ====");
        String id = input.askString("Please enter Id");
        String name = input.askString("Please enter new Name of the item");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }
        return true;
    }
}
