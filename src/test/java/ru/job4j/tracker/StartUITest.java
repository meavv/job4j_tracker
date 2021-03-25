package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

public class StartUITest {

    @Test
    public void whenAddItem() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "Item name", "1"});
        Tracker tracker = new Tracker();
        Output output = new ConsoleOutput();
        UserAction[] actions = {
                new CreateAction(out),
                new ExitProgram(out)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(new String[] {"0", String.valueOf(item.getId()),replacedName, "1"});
        UserAction[] actions = {
                new ReplaceActions(out),
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        Input in = new StubInput(new String[] {"0", String.valueOf(item.getId()), "1"});
        UserAction[] actions = {
                new DeleteActions(out),
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void findAllActions() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0","1"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Qwe"));
        UserAction[] actions = {
                new FindAllActions(out), new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                        "Menu." + System.lineSeparator() +
                        "0. Find all Item" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        item + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Find all Item" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void findByName() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Qww"));
        Input in = new StubInput(
                new String[] {"0",item.getName(), "1"}
        );

        UserAction[] actions = {
               new FindByNameActions(out), new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Find by name" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        item + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Find by name" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void findById() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Qqqq"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );

        UserAction[] actions = {
                new FindByIdActions(out), new ExitProgram(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Find by id" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator() +
                        item + System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Find by id" + System.lineSeparator() +
                        "1. Exit" + System.lineSeparator()
        ));
    }
}