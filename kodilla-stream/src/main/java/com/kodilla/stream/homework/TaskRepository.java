package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("do homework 5.4", LocalDate.of(2020, 02, 04), LocalDate.of(2020, 02, 11)));
        tasks.add(new Task("do homework 6.1", LocalDate.of(2020, 02, 12), LocalDate.of(2020, 02, 13)));
        tasks.add(new Task("do homework 6.2", LocalDate.of(2020, 02, 13), LocalDate.of(2020, 02, 14)));
        return tasks;
    }
}
