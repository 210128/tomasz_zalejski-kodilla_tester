package tomasz;

public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        User tomasz = new User("Tomasz", 42);
        User justyna = new User("Justyna", 35);
        User bartosz = new User("Bartosz", 14);
        User agnieszka = new User("Agnieszka", 20);
        User joanna = new User("Joanna", 46);

        User[] users = new User[]{tomasz, justyna, bartosz, agnieszka, joanna};

        double suma = 0;
        for (User user : users) {
            suma += user.getAge();
        }

        double srednia = suma / users.length;

        for (User user : users) {
            if (srednia > user.getAge()) {
                System.out.println(user.getName());
            }
        }
    }
}
