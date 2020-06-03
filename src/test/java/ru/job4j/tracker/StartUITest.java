package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class StartUITest {

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