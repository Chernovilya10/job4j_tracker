package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenCreateAction() {
        Output output = new ConsoleOutput();
        String[] answers = {
                "0",
                "Name",
                "1"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new ExitAction(output)
        };
        StartUI startUI = new StartUI(output);
        startUI.init(input, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Name"));
    }
    @Test
    public void whenEditAction() {
        Output output = new ConsoleOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("Name");
        tracker.add(item);
        String[] answers = {
                "0",
                item.getId(),
                "New Name",
                "1"};
        Input input = new StubInput(answers);
        UserAction[] actions = {
                new EditAction(output),
                new ExitAction(output)
        };
        StartUI startUI = new StartUI(output);
        startUI.init(input, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is("New Name"));
    }

    @Test
    public void whenDeleteAction() {
        Output output = new ConsoleOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("Name");
        tracker.add(item);
        String[] answers = {
                "0",
                item.getId(),
                "1"};
        Input input = new StubInput(answers);
        UserAction[] actions = {
                new DeleteAction(output),
                new ExitAction(output)
        };
        StartUI startUI = new StartUI(output);
        startUI.init(input, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }




//    @Test
//    public void whenAddItem() {
//        String[] answers = {"Fix PC"};
//        Input input = new StubInput(answers);
//        Tracker tracker = new Tracker();
//        StartUI.createItem(input, tracker);
//        Item created = tracker.findAll()[0];
//        Item expect = new Item("Fix PC");
//        assertThat(created.getName(), is(expect.getName()));
//    }
//
//    @Test
//    public void whenEditItem() {
//        Tracker tracker = new Tracker();
//        Item item = new Item("New Item");
//        tracker.add(item);
//        String[] answer = {
//                item.getId(),
//                "New edition name"
//        };
//        Input input = new StubInput(answer);
//        StartUI.editItem(input, tracker);
//        Item editItem = tracker.findById(item.getId());
//        assertEquals(editItem.getName(), "New edition name");
//    }
//
//    @Test
//    public void whenDeleteItem() {
//        Tracker tracker = new Tracker();
//        Item item = new Item("New name");
//        tracker.add(item);
//        String[] answer = {item.getId()};
//        Input input = new StubInput(answer);
//        StartUI.deleteItem(input, tracker);
//        Item deleteItem = tracker.findById(item.getId());
//        assertThat(deleteItem, is(nullValue()));
//    }
}