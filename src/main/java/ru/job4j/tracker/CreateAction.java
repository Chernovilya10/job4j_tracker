package ru.job4j.tracker;

public class CreateAction implements UserAction {
    private final Output out;

    public CreateAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Add new Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("==== Create a new Item ====");
        String name = input.askString("Enter Name");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }
}
