package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("==== Find item by Id ====");
        String id = input.askString("Please enter Id");
        Item findById = tracker.findById(id);
        if (findById != null) {
            System.out.println("Name: " + findById.getName() + "; " + "Id: " + findById.getId());
        } else {
            System.out.println("Object not found.");
        }
        return true;
    }
}
