package GoRestTest;

import java.util.Random;

public class RandomNameandEmail {
    public static String generateRandomName() {
        return "Rahul" + new Random().nextInt(1000);
    }

    public static String generateDynamicEmail() {
        return "Rahul" + new Random().nextInt(1000) + "@gmail.com";
    }
}
