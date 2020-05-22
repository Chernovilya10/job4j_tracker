package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenAddNewArrayOfItemThenTrackerHasName() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test");
        Item item2 = new Item("test");
        Item item3 = new Item("t");
        Item item4 = new Item("test");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        Item[] result = tracker.findName("test");
        Item[] expect = {item1, item2, item4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenAddNewArrayOfItemThenTrackerHasAllWithOutNull() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test");
        Item item2 = new Item("tst");
        Item item3 = new Item("tt");
        Item item4 = new Item("tet");
        Item item5 = new Item("tet");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);
        tracker.add(item5);
        Item[] result = tracker.findAll();
        Item[] expect = {item1, item2, item3, item4, item5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        Item bigBug = new Item("Big bug");
        String id = bug.getId();
        tracker.replace(id, bigBug);
        assertThat(tracker.findById(id).getName(), is("Big bug"));
    }
}