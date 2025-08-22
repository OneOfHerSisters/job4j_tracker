package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import java.util.Comparator;
import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByAscPriority() {
        Comparator<Job> cmp = new JobAscByPriority();
        int rsl = cmp.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 2)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorByDescPriority() {
        Comparator<Job> cmp = new JobDescByPriority();
        int rsl = cmp.compare(
                new Job("Fix bug", 2),
                new Job("Impl task", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorByAscNameLength() {
        Comparator<Job> cmp = new JobAscByNameLength();
        int rsl = cmp.compare(
                new Job("Bug", 1),
                new Job("Implement task", 2)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorByDescNameLength() {
        Comparator<Job> cmp = new JobDescByNameLength();
        int rsl = cmp.compare(
                new Job("Bug", 1),
                new Job("Implement task", 2)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenComparatorByDescName() {
        Comparator<Job> cmp = new JobDescByName();
        int rsl = cmp.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorByAscName() {
        Comparator<Job> cmp = Comparator.comparing(Job::getName);
        int rsl = cmp.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 2)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorByNameAscLengthThenPriorityAsc() {
        Comparator<Job> cmp = new JobAscByNameLength().thenComparing(new JobAscByPriority());
        int rsl = cmp.compare(
                new Job("Bug", 1),
                new Job("Bug", 2)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorByPriorityAscThenNameDesc() {
        Comparator<Job> cmp = new JobAscByPriority().thenComparing(new JobDescByName());
        int rsl = cmp.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }
}