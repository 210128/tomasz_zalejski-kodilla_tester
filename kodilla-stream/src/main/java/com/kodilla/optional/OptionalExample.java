package com.kodilla.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("user1", 30, 100, "Test");
        Optional<User> optionalUser = Optional.ofNullable(user);
        optionalUser.ifPresent(u -> System.out.println(u.getUsername()));

        User user1 = new User("user2", 23, 2, "Diver");
        String group = optionalUser.orElse(new User("", 0, 0, "")).getGroup();
        System.out.println(user1.getGroup());
    }
}
