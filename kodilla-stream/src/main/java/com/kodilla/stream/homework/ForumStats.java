package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {

        double averageNumOfPostsForUsersAgeUp40 = UsersRepository.getUserList()
                .stream()
                .filter(ag -> ag.getAge() >= 40 && ag.getNumberOfPosts() != 0)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts for users whose age is greater than or equal to 40: " + averageNumOfPostsForUsersAgeUp40);

        double averageNumOfPostsForUsersAgeLess40 = UsersRepository.getUserList()
                .stream()
                .filter(ag -> ag.getAge() < 40 && ag.getNumberOfPosts() != 0)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts for users whose age is less than 40: " + averageNumOfPostsForUsersAgeLess40);

    }
}
