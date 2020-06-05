package ru.job4j.tracker;

public class EditAction implements UserAction {
    private final Output out;

    public EditAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("==== Edit item ====");
        String id = input.askString("Please enter Id");
        String name = input.askString("Please enter new Name of the item");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("Success");
        } else {
            out.println("Error");
        }
        return true;
    }
}
