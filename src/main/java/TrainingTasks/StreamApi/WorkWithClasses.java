package TrainingTasks.StreamApi;

import java.util.Comparator;
import java.util.List;

public class WorkWithClasses {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Alex", 25),
                new User("Bob", 34),
                new User("Kate", 28),
                new User("Mike", 40)
        );

        String result = users.stream()
                .filter(u -> u.getAge() > 30)   // находим всех, старше 30
                .findFirst()                         // берем первого
                .map(User::getName)                 // получаем его имя
                .orElse(null);

//        System.out.println(result);

        Integer age = users.stream()
                .mapToInt(User::getAge) //get age
                .max()  // find max
                .orElse(0); // if list is empty

        int age1 = users.stream()
                .max(Comparator.comparing(User::getAge))
                .map(User::getAge)
                .orElse(0);

        int maxAge = users.stream()
                .mapToInt(User::getAge)
                .max()
                .orElse(0);
    }
}
