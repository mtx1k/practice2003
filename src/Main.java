import java.util.Random;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(passwordGenerator());
        }
    }
    private static String passwordGenerator() {
        String symbols = getSymbolsRate();
        StringBuilder password = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            password.append(symbols.charAt(random.nextInt(symbols.length())));
        }
        return password.toString();
    }
    private static String getSymbolsRate() {
        StringBuilder symbols = new StringBuilder();
        symbols.append("!$&@?");
        for (int i = 0; i < 10; i++) {
            symbols.append(i);
        }
        for (int i = 65; i <= 90; i++) {
            symbols.append((char)i);
        }
        for (int i = 97; i <= 122; i++) {
            symbols.append((char)i);
        }
        return symbols.toString();
    }
}
