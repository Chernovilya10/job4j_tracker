package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("==== Find item by Id ====");
        String id = input.askString("Please enter Id");
        Item findById = tracker.findById(id);
        if (findById != null) {
            out.println("Name: " + findById.getName() + "; " + "Id: " + findById.getId());
        } else {
            out.println("Object not found.");
        }
        return true;
    }
}
