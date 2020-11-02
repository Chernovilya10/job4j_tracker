package ru.job4j.tracker;

public class SortByNameDecreaseAction implements UserAction {
    private final Output out;

    public SortByNameDecreaseAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Sort by Decrease";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("Sorted.");
        tracker.sortByNameDecrease();
        return true;
    }
}