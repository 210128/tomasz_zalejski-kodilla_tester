package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {

        double avg = UsersRepository.getUserList()
                .stream()
                .map(n -> n.getAge())
                .filter(ag -> ag >= 40)
                .map(ForumStats::getUserNumberOfPosts)
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avg);


    }

    private  int getUserNumberOfPosts(User user) {
        return user.getNumberOfPosts();
    }
}
