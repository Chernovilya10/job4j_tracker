package ru.job4j.tracker;

public class SortByNameIncreaseAction implements UserAction {
    private final Output out;

    public SortByNameIncreaseAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Sort by Increase";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("Sorted.");
        tracker.sortByNameIncrease();
        return true;
    }
}