package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("==== Find items by name ====");
        String name = input.askString("Please enter Name");
        Item[] findName = tracker.findName(name);
        if (findName.length == 0) {
            System.out.println("Error. This name not found or didn't create item.");        //Если не добавили модель или нет такого имени
        } else {
            for (int i = 0; i < findName.length; i++) {
                System.out.println("Name: " + findName[i].getName() + "; " + "Id: " + findName[i].getId());
            }
        }
        return true;
    }
}
