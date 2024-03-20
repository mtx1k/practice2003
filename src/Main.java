public class Main {
    public static void main(String[] args) {
        System.out.println(reverse("myself"));
    }
    private static String reverse(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i)).append("\n");
        }
        return result.toString();
    }
}
