import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserGenerator {
    public static void main(String[] args) {
        // Generate random usernames and passwords
        List<String> usernames = generateUsernames(5);
        List<String> passwords = generatePasswords(5);

        // Print the generated usernames and passwords
        System.out.println("Generated Usernames and Passwords:");
        for (int i = 0; i < usernames.size(); i++) {
            String username = usernames.get(i);
            String password = passwords.get(i);
            System.out.println("Username: " + username + " | Password: " + password);
        }

        // Store the usernames and passwords in a file
        storeUsernamesAndPasswords(usernames, passwords);
    }

    private static List<String> generateUsernames(int count) {
        List<String> usernames = new ArrayList<>();
        Random random = new Random();

        String[] names = { "John", "Jane", "Robert", "Alice", "Michael", "Emily", "William", "Olivia", "James", "Sophia" };
        String[] lastNames = { "Smith", "Johnson", "Brown", "Davis", "Wilson", "Taylor", "Anderson", "Thomas", "Jackson", "White" };

        for (int i = 0; i < count; i++) {
            String username = names[random.nextInt(names.length)] + lastNames[random.nextInt(lastNames.length)];
            usernames.add(username.toLowerCase());
        }

        return usernames;
    }

    private static List<String> generatePasswords(int count) {
        List<String> passwords = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            String password = "";
            for (int j = 0; j < 8; j++) {
                password += (char) (random.nextInt(26) + 'a'); // Generate a lowercase letter
            }
            passwords.add(password);
        }

        return passwords;
    }

    private static void storeUsernamesAndPasswords(List<String> usernames, List<String> passwords) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("users.txt"))) {
            for (int i = 0; i < usernames.size(); i++) {
                writer.println(usernames.get(i) + "," + passwords.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
