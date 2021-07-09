package ru.job4j.collection;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = Arrays.asList("k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void sort1() {
        List<String> input = Arrays.asList("k1","k1/sk1/ssk1" ,"k1/sk1");
        List<String> expect = Arrays.asList("k1", "k1/sk1","k1/sk1/ssk1");
        Departments.sortAsc(input);
        assertThat(input, is(expect));
    }

    @Test
    public void sort2() {
        List<String> input = Arrays.asList("k1","k1/sk1/ssk1" ,"k2/sk1","k1/sk1", "k2");
        List<String> expect = Arrays.asList("k1", "k1/sk1","k1/sk1/ssk1", "k2", "k2/sk1");
        Departments.sortAsc(input);
        assertThat(input, is(expect));
    }

    @Test
    public void whenDepartmentsSortDesc() {
        List<String> deps = Arrays.asList(
                "K1",
                "K2",
                "K1/SK1/SSK2",
                "K1/SK2",
                "K2/SK1"
        );
        List<String> expected = Arrays.asList(
                "K2",
                "K2/SK1",
                "K1",
                "K1/SK1/SSK2",
                "K1/SK2"
        );
        Departments.sortDesc(deps);
        assertThat(deps, is(expected));
    }

}