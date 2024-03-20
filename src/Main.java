import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(repeatItem("cool", 3)));
    }
    private static String[] repeatItem(String str, int count) {
        if (count == 0) {
            return null;
        }
        String[] result = new String[count];
        Arrays.fill(result, str);
        return result;
    }
}
