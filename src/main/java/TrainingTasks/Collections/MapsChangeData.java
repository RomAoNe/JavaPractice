package TrainingTasks.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapsChangeData {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.put("admin", "1234");
        users.put("user1", "pass");
        users.put("guest", "guest");
        users.put("tester", "qa123");

        /*
        Замени пароль "guest" на "guest123".
        Удали пользователя "user1".
        Проверь, есть ли пользователь "admin".
        Выведи всех пользователей и пароли.
         */

        String userToDeleteKey = "user1";
        boolean isUserExist = false;

        for (Map.Entry<String, String> entry : users.entrySet()) {
            if (entry.getValue() == "guest"){
                users.put(entry.getKey(), "guest123");

                if (entry.getKey() == "admin"){
                    isUserExist = true;
                }

                if (entry.getKey() == "user1"){
                    users.remove(entry.getKey(), entry.getValue());
                }
            }
        }

        System.out.println(users);
    }
}
