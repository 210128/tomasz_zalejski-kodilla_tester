package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {

      double avg = UsersRepository.getUserList()
                .stream()
                .map(u -> u.getAge())
                .mapToInt(age -> age)
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}
