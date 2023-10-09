package Utilities;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Wednesday June 2023
 * @Time: 5:18 PM
 */
import java.security.SecureRandom;
import java.util.Random;

public class PasswordGenerator {
    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String NUMBER = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()_+~`|}{[]:;?><,./-=";
    private static final String PASSWORD_CHARS = CHAR_LOWER + CHAR_UPPER + NUMBER + SPECIAL_CHARS;
    private static final int PASSWORD_LENGTH = 12;

    public static void main(String[] args) {
        String password = generateRandomPassword();
        System.out.println("Generated Password: " + password);
    }

    public static String generateRandomPassword() {
        StringBuilder sb = new StringBuilder(PASSWORD_LENGTH);
        Random random = new SecureRandom();

        // Generate at least one character from each character category
        sb.append(getRandomChar(CHAR_LOWER, random));
        sb.append(getRandomChar(CHAR_UPPER, random));
        sb.append(getRandomChar(NUMBER, random));
        sb.append(getRandomChar(SPECIAL_CHARS, random));

        // Generate remaining characters randomly
        for (int i = 0; i < PASSWORD_LENGTH - 4; i++) {
            sb.append(getRandomChar(PASSWORD_CHARS, random));
        }

        // Shuffle the characters to mix up the order
        char[] passwordArray = sb.toString().toCharArray();
        for (int i = 0; i < PASSWORD_LENGTH; i++) {
            int randomIndex = random.nextInt(PASSWORD_LENGTH);
            char temp = passwordArray[i];
            passwordArray[i] = passwordArray[randomIndex];
            passwordArray[randomIndex] = temp;
        }

        return new String(passwordArray);
    }

    private static char getRandomChar(String characters, Random random) {
        int index = random.nextInt(characters.length());
        return characters.charAt(index);
    }
}
