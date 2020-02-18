package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        /*Dates were changed to some future dates, so that anything could be displayed*/
        tasks.add(new Task("do homework 5.4", LocalDate.of(2020, 02, 04), LocalDate.of(2020, 02, 11)));
        tasks.add(new Task("do homework 6.1", LocalDate.of(2020, 02, 12), LocalDate.of(2020, 03, 13)));
        tasks.add(new Task("do homework 6.2", LocalDate.of(2020, 02, 13), LocalDate.of(2020, 04, 14)));
        return tasks;
    }
}
