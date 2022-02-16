package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void whenSortAscByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Meeting", 4),
                new Job("Backup", 2),
                new Job("Programming", 3),
                new Job("Reading tasks", 1)
        );
        List<Job> expected = Arrays.asList(
                new Job("Backup", 2),
                new Job("Meeting", 4),
                new Job("Programming", 3),
                new Job("Reading tasks", 1)
        );
        Collections.sort(jobs, new JobAscByName());
        assertEquals(expected, jobs);
    }

    @Test
    public void whenSortDescByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Meeting", 4),
                new Job("Backup", 2),
                new Job("Programming", 3),
                new Job("Reading tasks", 1)
        );
        List<Job> expected = Arrays.asList(
                new Job("Reading tasks", 1),
                new Job("Programming", 3),
                new Job("Meeting", 4),
                new Job("Backup", 2)
        );
        Collections.sort(jobs, new JobDescByName());
        assertEquals(expected, jobs);
    }

    @Test
    public void whenSortAscByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Meeting", 4),
                new Job("Backup", 2),
                new Job("Programming", 3),
                new Job("Reading tasks", 1)
        );
        List<Job> expected = Arrays.asList(
                new Job("Reading tasks", 1),
                new Job("Backup", 2),
                new Job("Programming", 3),
                new Job("Meeting", 4)
        );
        Collections.sort(jobs, new JobAscByPriority());
        assertEquals(expected, jobs);
    }

    @Test
    public void whenSortDescByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Meeting", 4),
                new Job("Backup", 2),
                new Job("Programming", 3),
                new Job("Reading tasks", 1)
        );
        List<Job> expected = Arrays.asList(
                new Job("Meeting", 4),
                new Job("Programming", 3),
                new Job("Backup", 2),
                new Job("Reading tasks", 1)
        );
        Collections.sort(jobs, new JobDescByPriority());
        assertEquals(expected, jobs);
    }

    @Test
    public void whenSortAscByPriorityThenAscByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Meeting", 4),
                new Job("Backup", 2),
                new Job("Programming", 3),
                new Job("Reading tasks", 1),
                new Job("Planning", 1),
                new Job("Checking mail", 1)
        );
        List<Job> expected = Arrays.asList(
                new Job("Checking mail", 1),
                new Job("Planning", 1),
                new Job("Reading tasks", 1),
                new Job("Backup", 2),
                new Job("Programming", 3),
                new Job("Meeting", 4)
        );
        Collections.sort(jobs, new JobAscByPriority().thenComparing(new JobAscByName()));
        assertEquals(expected, jobs);
    }

    @Test
    public void whenSortDescByPriorityThenAscByName() {
        Comparator<Job> comparator = new JobDescByPriority().thenComparing(new JobAscByName());
        int rsl = comparator.compare(
                new Job("Planning", 1),
                new Job("Checking mail", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}
