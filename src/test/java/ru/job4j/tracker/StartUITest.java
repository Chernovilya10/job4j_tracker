package ru.job4j.tracker;

import org.hamcrest.text.StringContainsInOrder;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenCreateAction() {
        Output output = new StubOutput();
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
        Output output = new StubOutput();
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
        Output output = new StubOutput();
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

    @Test
    public void whenShowAction() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("Name");
        tracker.add(item);
        UserAction[] actions = {
                new ShowAction(output),
                new ExitAction(output)
        };
        String[] answers = {
                "0",
                "1"
        };
        Input input = new StubInput(answers);
        StartUI startUI = new StartUI(output);
        startUI.init(input, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator()
                + "0. Show all items" + System.lineSeparator()
                + "1. Exit Program" + System.lineSeparator()
                + "==== Show all Items without null elements ====" + System.lineSeparator()
                + "Name: " + item.getName() + "; " + "Id: " + item.getId() + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. Show all items" + System.lineSeparator()
                + "1. Exit Program" + System.lineSeparator()
                + "Bye bye." + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindIdAction() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("Name");
        tracker.add(item);
        UserAction[] actions = {
                new FindByIdAction(output),
                new ExitAction(output)
        };
        String[] answers = {
                "0",
                item.getId(),
                "1"
        };
        Input input = new StubInput(answers);
        StartUI startUI = new StartUI(output);
        startUI.init(input, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator()
                + "0. Find item by Id" + System.lineSeparator()
                + "1. Exit Program" + System.lineSeparator()
                + "==== Find item by Id ====" + System.lineSeparator()
                + "Name: " + item.getName() + "; " + "Id: " + item.getId() + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. Find item by Id" + System.lineSeparator()
                + "1. Exit Program" + System.lineSeparator()
                + "Bye bye." + System.lineSeparator()
        ));
    }

    @Test
    public void whenNotFindIdAction() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("Name");
        tracker.add(item);
        UserAction[] actions = {
                new FindByIdAction(output),
                new ExitAction(output)
        };
        String[] answers = {
                "0",
                "11112222333",      //false ID
                "1"
        };
        Input input = new StubInput(answers);
        StartUI startUI = new StartUI(output);
        startUI.init(input, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator()
                + "0. Find item by Id" + System.lineSeparator()
                + "1. Exit Program" + System.lineSeparator()
                + "==== Find item by Id ====" + System.lineSeparator()
                + "Object not found." + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. Find item by Id" + System.lineSeparator()
                + "1. Exit Program" + System.lineSeparator()
                + "Bye bye." + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindNameAction() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("Name");
        tracker.add(item);
        UserAction[] actions = {
                new FindByNameAction(output),
                new ExitAction(output)
        };
        String[] answers = {
                "0",
                item.getName(),
                "1"
        };
        Input input = new StubInput(answers);
        StartUI startUI = new StartUI(output);
        startUI.init(input, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator()
                + "0. Find items by name" + System.lineSeparator()
                + "1. Exit Program" + System.lineSeparator()
                + "==== Find items by name ====" + System.lineSeparator()
                + "Name: " + item.getName() + "; " + "Id: " + item.getId() + System.lineSeparator()
                + "Menu." + System.lineSeparator()
                + "0. Find items by name" + System.lineSeparator()
                + "1. Exit Program" + System.lineSeparator()
                + "Bye bye." + System.lineSeparator()
        ));
    }

    @Test
    public void whenExitAction() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(output)
        };
        String[] answers = {
                "0"
        };
        Input input = new StubInput(answers);
        StartUI startUI = new StartUI(output);
        startUI.init(input, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator()
                + "0. Exit Program" + System.lineSeparator()
                + "Bye bye." + System.lineSeparator()
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output output = new StubOutput();
        Input input = new StubInput(new String[] {
                "7",
                "qwe",
                "0"
                }
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(output)
        };
        StartUI startUI = new StartUI(output);
        startUI.init(input, tracker, actions);
        assertThat(output.toString(), is(
                String.format(
                        "Menu.%n"
                        + "0. Exit Program%n"
                        + "Wrong input, you can select: 0 .. 0%n"
                        + "Menu.%n"
                        + "0. Exit Program%n"
                        + "Bye bye.%n"
                )
        ));
    }

    @Test (expected = NumberFormatException.class)
    public void whenSelectTextThenInvalidExit() {
        Output output = new StubOutput();
        Input input = new StubInput(new String[] {
                "uuu"
        }
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(output)
        };
        StartUI startUI = new StartUI(output);
        startUI.init(input, tracker, actions);
    }
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