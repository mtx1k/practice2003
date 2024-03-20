public class Main {
    public static void main(String[] args) {
        String string = "something";
        char[] charsFromString = string.toCharArray();
        for (int i = 0; i < charsFromString.length; i += 2) {
            charsFromString[i] = (char) (charsFromString[i] - 32);
        }
        String resultString = new String(charsFromString);
        System.out.println(string + " -> " + resultString);
    }
}
