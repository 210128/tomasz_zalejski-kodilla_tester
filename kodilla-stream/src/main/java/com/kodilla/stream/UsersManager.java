package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> usernames = UsersRepository.getUserList()
                .stream()
                .filter(u -> u.getGroup().equals("Chemists")) /*  Review: If 'u' or 'u.getGroup()' is null this
                would cause NullPointerException
                It's better to use "Chemists".equals(u.getGroup()) -- Ano wywali, ale to przykład przepisany ze skryptu,
                jak zamienie miejscami "Chemists" to już wywala się na linijce 15, nie bardzo wiem jak to przerobić żeby działało
                */
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        System.out.println(usernames);
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}
